/*

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		2013/12/01 , Created by dennis
}}IS_NOTE

Copyright (C) 2013 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
}}IS_RIGHT
*/
package org.zkoss.zss.ngmodel.impl;

import org.zkoss.zss.ngmodel.sys.dependency.NameRef;
/**
 * 
 * @author dennis
 * @since 3.5.0
 */
public class NameRefImpl extends RefImpl implements NameRef{

	private static final long serialVersionUID = 1L;
	 
	
	private final String nameName;
	
	public NameRefImpl(NameAdv name){
		this(name.getBook().getBookName(),name.getApplyToSheetName(),name.getName());
	}
	public NameRefImpl(String bookName, String sheetName, String nameName){
		super(RefType.OBJECT,bookName,sheetName, null, -1,-1,-1,-1);
		this.nameName = nameName;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((bookName == null) ? 0 : bookName.hashCode());
		result = prime * result
				+ ((sheetName == null) ? 0 : sheetName.hashCode());
		result = prime * result
				+ ((nameName == null) ? 0 : nameName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (getClass() != obj.getClass())
			return false;
		NameRefImpl other = (NameRefImpl) obj;
		if (bookName == null) {
			if (other.bookName != null)
				return false;
		} else if (!bookName.equals(other.bookName))
			return false;
		if (sheetName == null) {
			if (other.sheetName != null)
				return false;
		} else if (!sheetName.equals(other.sheetName))
			return false;
		if (nameName == null) {
			if (other.nameName != null)
				return false;
		} else if (!nameName.equals(other.nameName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		if(sheetName!=null){
			sb.append(sheetName).append(":");
		}
		sb.append(nameName);
		return sb.toString();
	}
	
	@Override
	public String getNameName() {
		return nameName;
	}

}
