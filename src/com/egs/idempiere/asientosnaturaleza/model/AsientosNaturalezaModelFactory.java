package com.egs.idempiere.asientosnaturaleza.model;

import java.sql.ResultSet;

import org.adempiere.base.IModelFactory;
import org.compiere.model.PO;
import org.compiere.util.Env;

public class AsientosNaturalezaModelFactory implements IModelFactory {

	@Override
	public Class<?> getClass(String tableName) {

		if(tableName.equals(MAsientoNaturaleza.Table_Name))
			return MAsientoNaturaleza.class;
		return null;
	}

	@Override
	public PO getPO(String tableName, int Record_ID, String trxName) {

		if(tableName.equals(MAsientoNaturaleza.Table_Name))
			return new MAsientoNaturaleza(Env.getCtx(), Record_ID, trxName);
		return null;
	}

	@Override
	public PO getPO(String tableName, ResultSet rs, String trxName) {

		if(tableName.equals(MAsientoNaturaleza.Table_Name))
			return new MAsientoNaturaleza(Env.getCtx(), rs, trxName);
		return null;
	}

}
