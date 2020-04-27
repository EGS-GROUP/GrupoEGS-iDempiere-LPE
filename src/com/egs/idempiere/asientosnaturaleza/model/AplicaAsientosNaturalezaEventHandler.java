package com.egs.idempiere.asientosnaturaleza.model;

import java.util.ArrayList;

import org.adempiere.base.event.AbstractEventHandler;
import org.adempiere.base.event.IEventTopics;
import org.compiere.acct.Doc;
import org.compiere.acct.Fact;
import org.compiere.acct.FactLine;
import org.compiere.model.MInvoice;
import org.compiere.model.PO;
import org.compiere.util.CLogger;
import org.osgi.service.event.Event;

public class AplicaAsientosNaturalezaEventHandler extends AbstractEventHandler {

	private static CLogger log = CLogger.getCLogger(AplicaAsientosNaturalezaEventHandler.class);
	
	@Override
	protected void initialize() {

		registerTableEvent(IEventTopics.DOC_AFTER_POST, MInvoice.Table_Name);
	}

	@Override
	protected void doHandleEvent(Event event) {
		
		log.info("================= ************* EVENTO DE ASIENTO NATURALEZA ************* ===============");
		PO po = getPO(event);
		String type = event.getTopic();
		
		if(po.get_TableName().equals(MInvoice.Table_Name)&& type.equals(IEventTopics.DOC_AFTER_POST)) {
			// Es una factura despues de aplicar la contabilidad.
			MInvoice factura = (MInvoice)po;
			Doc doc = factura.getDoc();
			
			ArrayList<Fact> facts = doc.getFacts();
			
			for(int i =0; i<facts.size(); ++i) {
				Fact asiento = facts.get(i);
				FactLine lineas[] = asiento.getLines();
				
				for (FactLine flinea:lineas) {
					// Se debe obtener los asientos destino para esta linea, si es la tiene
					MAsientoNaturaleza cuentasNat[] = MAsientoNaturaleza.get(flinea.getCtx(), flinea.getC_AcctSchema_ID(), flinea.getAD_Client_ID(), flinea.getAD_Org_ID(), flinea.getAccount_ID(),flinea.getC_AcctSchema_ID());
					// Verifico si tiene asientos destino
					if (cuentasNat != null && cuentasNat.length > 0) {
						// Se trabajo sobre un unico par de cuentas destino.
						MAsientoNaturaleza destino = cuentasNat[0];
						// creo el primer asiento destino
						FactLine lineaUno = asiento.createLine(flinea.getDocLine(), destino.get_MAccountDestinoDebe(),
																flinea.getC_Currency_ID(), flinea.getAmtSourceCr(), null);
						
						if(lineaUno != null)
							lineaUno.setAD_Org_ID(flinea.getAD_Org_ID());
						lineaUno.saveEx();
						log.info(lineaUno.toString());
						
						FactLine lineaDos = asiento.createLine(flinea.getDocLine(), destino.get_MAccountDestinoHaber(),
																flinea.getC_Currency_ID(), null, flinea.getAmtSourceCr());
						
						if(lineaDos != null)
							lineaDos.setAD_Org_ID(flinea.getAD_Org_ID());
						lineaDos.saveEx();
						log.info(lineaDos.toString());
					}
				}
			}
		}
	}

}
