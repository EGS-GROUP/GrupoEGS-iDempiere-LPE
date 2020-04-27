/**
 * 
 */
package com.egs.idempiere.asientosnaturaleza.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;

import org.compiere.model.MAccount;
import org.compiere.util.CCache;
import org.compiere.util.CLogger;
import org.compiere.util.DB;

/**
 * @author dante
 * 
 */
public class MAsientoNaturaleza extends X_XX_Asiento_Naturaleza {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4290019084670899537L;
	/** Static Logger */
	private static CLogger s_log = CLogger.getCLogger(MAsientoNaturaleza.class);
	/** Distributions by Account */
	private static CCache<Integer, MAsientoNaturaleza[]> s_accounts = new CCache<Integer, MAsientoNaturaleza[]>(
			"X_XX_Asiento_Naturaleza", 100);

	
	/**
	 * 
	 * Load Constructor
	 * 
	 * @param ctx
	 *            context
	 * @param rs
	 *            result set
	 * @param trxName
	 *            transaction
	 */
	public MAsientoNaturaleza(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		
	
	} // MDistribution

	public MAsientoNaturaleza(Properties ctx, int XX_Seats_Nature_ID, String trxName) {
		super(ctx, XX_Seats_Nature_ID, trxName);
		/*this.setcta_naturaleza_ID(0);
		this.setcta_debitfate_ID(0);
		this.setcta_creditfate_ID(0);*/
	}
	
	// EGS Solutions 
	public static MAsientoNaturaleza[] get(Properties ctx, int Account_ID,int c_acctSchema_id) {
		Integer key = new Integer(Account_ID);
		MAsientoNaturaleza[] retValue = (MAsientoNaturaleza[]) s_accounts.get(key);
		if (retValue != null)
			return retValue;
		// EGS Solutions 
		//:: mostrar la lista de las cuentas por naturaleza asociadas a un 
		//:: determinado esquema contable por medio de : c_acctschema_id
		String sql = "SELECT * FROM XX_Asiento_Naturaleza " + "WHERE cta_naturaleza_id=? and c_acctschema_id=?";
		
		ArrayList<MAsientoNaturaleza> list = new ArrayList<MAsientoNaturaleza>();
		PreparedStatement pstmt = null;
		try {
			pstmt = DB.prepareStatement(sql, null);
			pstmt.setInt(1, Account_ID);
			// EGS Solutions 
			pstmt.setInt(2, c_acctSchema_id);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
				list.add(new MAsientoNaturaleza(ctx, rs, null));
			rs.close();
			pstmt.close();
			pstmt = null;
		} catch (Exception e) {
			
			s_log.log(Level.SEVERE, sql, e);
		}
		try {
			if (pstmt != null)
				pstmt.close();
			pstmt = null;
		} catch (Exception e) {
			pstmt = null;
		}
		//
		retValue = new MAsientoNaturaleza[list.size()];
		list.toArray(retValue);
		s_accounts.put(key, retValue);
		return retValue;
	} // get

	public static MAsientoNaturaleza[] get(Properties ctx, int c_esquemaContable_id,
			int ad_client_id, int ad_org_id, int Cta_Seats_Nature_ID, int c_acctSchema_id) {
		MAsientoNaturaleza[] naturales = get(ctx, Cta_Seats_Nature_ID,c_acctSchema_id);
		
		if (naturales == null || naturales.length == 0)
			return null;
		//
		ArrayList<MAsientoNaturaleza> lista = new ArrayList<MAsientoNaturaleza>();
		
		for (int i = 0; i < naturales.length; i++) {
			MAsientoNaturaleza natural = naturales[i];
			if (!natural.isActive())
				continue;
			// Verificando el esquema contable
			if (natural.getC_AcctSchema_ID() != c_esquemaContable_id)
				continue;
			// Varificando la organizacion
			if (natural.getAD_Org_ID() != ad_org_id)
				continue;
			if (natural.getcta_naturaleza_ID() != Cta_Seats_Nature_ID)
				continue;
			if (natural.getAD_Client_ID() != ad_client_id)
				continue;

			//
			lista.add(natural);
		} // for all distributions with acct
		//
		MAsientoNaturaleza[] asientos = new MAsientoNaturaleza[lista.size()];
		lista.toArray(asientos);

		return asientos;
	}
	
	public MAccount get_MAccountNaturaleza() {
		MAccount cuenta = MAccount.get(getCtx(), getAD_Client_ID(), getAD_Org_ID(), getC_AcctSchema_ID(), getcta_naturaleza_ID(), 0, 0, 0, 0, 0, 0,0, 0, 0, 0, 0, 0, 0, 0);
		return cuenta;
	}
	
	public MAccount get_MAccountDestinoHaber() {
		MAccount cuenta = MAccount.get(getCtx(), getAD_Client_ID(), getAD_Org_ID(), getC_AcctSchema_ID(), getcta_creditfate_ID(), 0, 0, 0, 0, 0, 0,0, 0, 0, 0, 0, 0, 0, 0);
		return cuenta;
	}
	
	public MAccount get_MAccountDestinoDebe() {
		MAccount cuenta = MAccount.get(getCtx(), getAD_Client_ID(), getAD_Org_ID(), getC_AcctSchema_ID(), getcta_debitfate_ID(), 0, 0, 0, 0, 0, 0,0, 0, 0, 0, 0, 0, 0, 0);
		return cuenta;
	}
}
