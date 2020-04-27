/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package com.egs.idempiere.asientosnaturaleza.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for XX_Asiento_Naturaleza
 *  @author iDempiere (generated) 
 *  @version Release 1.0c - $Id$ */
public class X_XX_Asiento_Naturaleza extends PO implements I_XX_Asiento_Naturaleza, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20130920L;

    /** Standard Constructor */
    public X_XX_Asiento_Naturaleza (Properties ctx, int XX_Asiento_Naturaleza_ID, String trxName)
    {
      super (ctx, XX_Asiento_Naturaleza_ID, trxName);
      /** if (XX_Asiento_Naturaleza_ID == 0)
        {
			setC_AcctSchema_ID (0);
			setcta_creditfate_ID (0);
			setcta_debitfate_ID (0);
			setcta_naturaleza_ID (0);
			setXX_Asiento_Naturaleza_ID (0);
        } */
    }

    /** Load Constructor */
    public X_XX_Asiento_Naturaleza (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 7 - System - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_XX_Asiento_Naturaleza[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_C_AcctSchema getC_AcctSchema() throws RuntimeException
    {
		return (org.compiere.model.I_C_AcctSchema)MTable.get(getCtx(), org.compiere.model.I_C_AcctSchema.Table_Name)
			.getPO(getC_AcctSchema_ID(), get_TrxName());	}

	/** Set Accounting Schema.
		@param C_AcctSchema_ID 
		Rules for accounting
	  */
	public void setC_AcctSchema_ID (int C_AcctSchema_ID)
	{
		if (C_AcctSchema_ID < 1) 
			set_Value (COLUMNNAME_C_AcctSchema_ID, null);
		else 
			set_Value (COLUMNNAME_C_AcctSchema_ID, Integer.valueOf(C_AcctSchema_ID));
	}

	/** Get Accounting Schema.
		@return Rules for accounting
	  */
	public int getC_AcctSchema_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_AcctSchema_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_ElementValue getcta_creditfate() throws RuntimeException
    {
		return (org.compiere.model.I_C_ElementValue)MTable.get(getCtx(), org.compiere.model.I_C_ElementValue.Table_Name)
			.getPO(getcta_creditfate_ID(), get_TrxName());	}

	/** Set cta_creditfate_id.
		@param cta_creditfate_ID cta_creditfate_id	  */
	public void setcta_creditfate_ID (int cta_creditfate_ID)
	{
		if (cta_creditfate_ID < 1) 
			set_Value (COLUMNNAME_cta_creditfate_ID, null);
		else 
			set_Value (COLUMNNAME_cta_creditfate_ID, Integer.valueOf(cta_creditfate_ID));
	}

	/** Get cta_creditfate_id.
		@return cta_creditfate_id	  */
	public int getcta_creditfate_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_cta_creditfate_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_ElementValue getcta_debitfate() throws RuntimeException
    {
		return (org.compiere.model.I_C_ElementValue)MTable.get(getCtx(), org.compiere.model.I_C_ElementValue.Table_Name)
			.getPO(getcta_debitfate_ID(), get_TrxName());	}

	/** Set cta_debitfate_id.
		@param cta_debitfate_ID cta_debitfate_id	  */
	public void setcta_debitfate_ID (int cta_debitfate_ID)
	{
		if (cta_debitfate_ID < 1) 
			set_Value (COLUMNNAME_cta_debitfate_ID, null);
		else 
			set_Value (COLUMNNAME_cta_debitfate_ID, Integer.valueOf(cta_debitfate_ID));
	}

	/** Get cta_debitfate_id.
		@return cta_debitfate_id	  */
	public int getcta_debitfate_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_cta_debitfate_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_ElementValue getcta_naturaleza() throws RuntimeException
    {
		return (org.compiere.model.I_C_ElementValue)MTable.get(getCtx(), org.compiere.model.I_C_ElementValue.Table_Name)
			.getPO(getcta_naturaleza_ID(), get_TrxName());	}

	/** Set Cuenta de Naturaleza.
		@param cta_naturaleza_ID Cuenta de Naturaleza	  */
	public void setcta_naturaleza_ID (int cta_naturaleza_ID)
	{
		if (cta_naturaleza_ID < 1) 
			set_Value (COLUMNNAME_cta_naturaleza_ID, null);
		else 
			set_Value (COLUMNNAME_cta_naturaleza_ID, Integer.valueOf(cta_naturaleza_ID));
	}

	/** Get Cuenta de Naturaleza.
		@return Cuenta de Naturaleza	  */
	public int getcta_naturaleza_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_cta_naturaleza_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription () 
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set Asientos de Naturaleza.
		@param XX_Asiento_Naturaleza_ID Asientos de Naturaleza	  */
	public void setXX_Asiento_Naturaleza_ID (int XX_Asiento_Naturaleza_ID)
	{
		if (XX_Asiento_Naturaleza_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_XX_Asiento_Naturaleza_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_XX_Asiento_Naturaleza_ID, Integer.valueOf(XX_Asiento_Naturaleza_ID));
	}

	/** Get Asientos de Naturaleza.
		@return Asientos de Naturaleza	  */
	public int getXX_Asiento_Naturaleza_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_XX_Asiento_Naturaleza_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set XX_Asiento_Naturaleza_UU.
		@param XX_Asiento_Naturaleza_UU XX_Asiento_Naturaleza_UU	  */
	public void setXX_Asiento_Naturaleza_UU (String XX_Asiento_Naturaleza_UU)
	{
		set_ValueNoCheck (COLUMNNAME_XX_Asiento_Naturaleza_UU, XX_Asiento_Naturaleza_UU);
	}

	/** Get XX_Asiento_Naturaleza_UU.
		@return XX_Asiento_Naturaleza_UU	  */
	public String getXX_Asiento_Naturaleza_UU () 
	{
		return (String)get_Value(COLUMNNAME_XX_Asiento_Naturaleza_UU);
	}
}