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
package com.egs.idempiere.asientosnaturaleza.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for XX_Asiento_Naturaleza
 *  @author iDempiere (generated) 
 *  @version Release 1.0c
 */
@SuppressWarnings("all")
public interface I_XX_Asiento_Naturaleza 
{

    /** TableName=XX_Asiento_Naturaleza */
    public static final String Table_Name = "XX_Asiento_Naturaleza";

    /** AD_Table_ID=1000000 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 7 - System - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name C_AcctSchema_ID */
    public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";

	/** Set Accounting Schema.
	  * Rules for accounting
	  */
	public void setC_AcctSchema_ID (int C_AcctSchema_ID);

	/** Get Accounting Schema.
	  * Rules for accounting
	  */
	public int getC_AcctSchema_ID();

	public org.compiere.model.I_C_AcctSchema getC_AcctSchema() throws RuntimeException;

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name cta_creditfate_ID */
    public static final String COLUMNNAME_cta_creditfate_ID = "cta_creditfate_ID";

	/** Set cta_creditfate_id	  */
	public void setcta_creditfate_ID (int cta_creditfate_ID);

	/** Get cta_creditfate_id	  */
	public int getcta_creditfate_ID();

	public org.compiere.model.I_C_ElementValue getcta_creditfate() throws RuntimeException;

    /** Column name cta_debitfate_ID */
    public static final String COLUMNNAME_cta_debitfate_ID = "cta_debitfate_ID";

	/** Set cta_debitfate_id	  */
	public void setcta_debitfate_ID (int cta_debitfate_ID);

	/** Get cta_debitfate_id	  */
	public int getcta_debitfate_ID();

	public org.compiere.model.I_C_ElementValue getcta_debitfate() throws RuntimeException;

    /** Column name cta_naturaleza_ID */
    public static final String COLUMNNAME_cta_naturaleza_ID = "cta_naturaleza_ID";

	/** Set Cuenta de Naturaleza	  */
	public void setcta_naturaleza_ID (int cta_naturaleza_ID);

	/** Get Cuenta de Naturaleza	  */
	public int getcta_naturaleza_ID();

	public org.compiere.model.I_C_ElementValue getcta_naturaleza() throws RuntimeException;

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();

    /** Column name XX_Asiento_Naturaleza_ID */
    public static final String COLUMNNAME_XX_Asiento_Naturaleza_ID = "XX_Asiento_Naturaleza_ID";

	/** Set Asientos de Naturaleza	  */
	public void setXX_Asiento_Naturaleza_ID (int XX_Asiento_Naturaleza_ID);

	/** Get Asientos de Naturaleza	  */
	public int getXX_Asiento_Naturaleza_ID();

    /** Column name XX_Asiento_Naturaleza_UU */
    public static final String COLUMNNAME_XX_Asiento_Naturaleza_UU = "XX_Asiento_Naturaleza_UU";

	/** Set XX_Asiento_Naturaleza_UU	  */
	public void setXX_Asiento_Naturaleza_UU (String XX_Asiento_Naturaleza_UU);

	/** Get XX_Asiento_Naturaleza_UU	  */
	public String getXX_Asiento_Naturaleza_UU();
}
