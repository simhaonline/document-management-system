/**
 * OpenKM, Open Document Management System (http://www.openkm.com)
 * Copyright (c) 2006-2017  Paco Avila & Josep Llort
 * <p>
 * No bytes were intentionally harmed during the development of this application.
 * <p>
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * GWTProfileFileBrowser
 *
 * @author jllort
 *
 */
public class GWTProfileFileBrowser implements IsSerializable {
	private boolean statusVisible;
	private boolean massiveVisible;
	private boolean iconVisible;
	private boolean nameVisible;
	private boolean sizeVisible;
	private boolean lastModifiedVisible;
	private boolean authorVisible;
	private boolean versionVisible;
	private boolean extraColumns = false;

	// Additional columns
	private GWTFilebrowseExtraColumn column0;
	private GWTFilebrowseExtraColumn column1;
	private GWTFilebrowseExtraColumn column2;
	private GWTFilebrowseExtraColumn column3;
	private GWTFilebrowseExtraColumn column4;
	private GWTFilebrowseExtraColumn column5;
	private GWTFilebrowseExtraColumn column6;
	private GWTFilebrowseExtraColumn column7;
	private GWTFilebrowseExtraColumn column8;
	private GWTFilebrowseExtraColumn column9;

	// width
	private String statusWidth;
	private String massiveWidth;
	private String iconWidth;
	private String nameWidth;
	private String sizeWidth;
	private String lastModifiedWidth;
	private String authorWidth;
	private String versionWidth;
	private String column0Width;
	private String column1Width;
	private String column2Width;
	private String column3Width;
	private String column4Width;
	private String column5Width;
	private String column6Width;
	private String column7Width;
	private String column8Width;
	private String column9Width;

	public boolean isStatusVisible() {
		return statusVisible;
	}

	public void setStatusVisible(boolean statusVisible) {
		this.statusVisible = statusVisible;
	}

	public boolean isMassiveVisible() {
		return massiveVisible;
	}

	public void setMassiveVisible(boolean massiveVisible) {
		this.massiveVisible = massiveVisible;
	}

	public boolean isIconVisible() {
		return iconVisible;
	}

	public void setIconVisible(boolean iconVisible) {
		this.iconVisible = iconVisible;
	}

	public boolean isNameVisible() {
		return nameVisible;
	}

	public void setNameVisible(boolean nameVisible) {
		this.nameVisible = nameVisible;
	}

	public boolean isSizeVisible() {
		return sizeVisible;
	}

	public void setSizeVisible(boolean sizeVisible) {
		this.sizeVisible = sizeVisible;
	}

	public boolean isLastModifiedVisible() {
		return lastModifiedVisible;
	}

	public void setLastModifiedVisible(boolean lastModifiedVisible) {
		this.lastModifiedVisible = lastModifiedVisible;
	}

	public boolean isAuthorVisible() {
		return authorVisible;
	}

	public void setAuthorVisible(boolean authorVisible) {
		this.authorVisible = authorVisible;
	}

	public boolean isVersionVisible() {
		return versionVisible;
	}

	public void setVersionVisible(boolean versionVisible) {
		this.versionVisible = versionVisible;
	}

	public boolean isExtraColumns() {
		return extraColumns;
	}

	public void setExtraColumns(boolean extraColumns) {
		this.extraColumns = extraColumns;
	}

	public GWTFilebrowseExtraColumn getColumn0() {
		return column0;
	}

	public void setColumn0(GWTFilebrowseExtraColumn column0) {
		this.column0 = column0;
	}

	public GWTFilebrowseExtraColumn getColumn1() {
		return column1;
	}

	public void setColumn1(GWTFilebrowseExtraColumn column1) {
		this.column1 = column1;
	}

	public GWTFilebrowseExtraColumn getColumn2() {
		return column2;
	}

	public void setColumn2(GWTFilebrowseExtraColumn column2) {
		this.column2 = column2;
	}

	public GWTFilebrowseExtraColumn getColumn3() {
		return column3;
	}

	public void setColumn3(GWTFilebrowseExtraColumn column3) {
		this.column3 = column3;
	}

	public GWTFilebrowseExtraColumn getColumn4() {
		return column4;
	}

	public void setColumn4(GWTFilebrowseExtraColumn column4) {
		this.column4 = column4;
	}

	public GWTFilebrowseExtraColumn getColumn5() {
		return column5;
	}

	public void setColumn5(GWTFilebrowseExtraColumn column5) {
		this.column5 = column5;
	}

	public GWTFilebrowseExtraColumn getColumn6() {
		return column6;
	}

	public void setColumn6(GWTFilebrowseExtraColumn column6) {
		this.column6 = column6;
	}

	public GWTFilebrowseExtraColumn getColumn7() {
		return column7;
	}

	public void setColumn7(GWTFilebrowseExtraColumn column7) {
		this.column7 = column7;
	}

	public GWTFilebrowseExtraColumn getColumn8() {
		return column8;
	}

	public void setColumn8(GWTFilebrowseExtraColumn column8) {
		this.column8 = column8;
	}

	public GWTFilebrowseExtraColumn getColumn9() {
		return column9;
	}

	public void setColumn9(GWTFilebrowseExtraColumn column9) {
		this.column9 = column9;
	}

	public String getStatusWidth() {
		return statusWidth;
	}

	public void setStatusWidth(String statusWidth) {
		this.statusWidth = statusWidth;
	}

	public String getMassiveWidth() {
		return massiveWidth;
	}

	public void setMassiveWidth(String massiveWidth) {
		this.massiveWidth = massiveWidth;
	}

	public String getIconWidth() {
		return iconWidth;
	}

	public void setIconWidth(String iconWidth) {
		this.iconWidth = iconWidth;
	}

	public String getNameWidth() {
		return nameWidth;
	}

	public void setNameWidth(String nameWidth) {
		this.nameWidth = nameWidth;
	}

	public String getSizeWidth() {
		return sizeWidth;
	}

	public void setSizeWidth(String sizeWidth) {
		this.sizeWidth = sizeWidth;
	}

	public String getLastModifiedWidth() {
		return lastModifiedWidth;
	}

	public void setLastModifiedWidth(String lastModifiedWidth) {
		this.lastModifiedWidth = lastModifiedWidth;
	}

	public String getAuthorWidth() {
		return authorWidth;
	}

	public void setAuthorWidth(String authorWidth) {
		this.authorWidth = authorWidth;
	}

	public String getVersionWidth() {
		return versionWidth;
	}

	public void setVersionWidth(String versionWidth) {
		this.versionWidth = versionWidth;
	}

	public String getColumn0Width() {
		return column0Width;
	}

	public void setColumn0Width(String column0Width) {
		this.column0Width = column0Width;
	}

	public String getColumn1Width() {
		return column1Width;
	}

	public void setColumn1Width(String column1Width) {
		this.column1Width = column1Width;
	}

	public String getColumn2Width() {
		return column2Width;
	}

	public void setColumn2Width(String column2Width) {
		this.column2Width = column2Width;
	}

	public String getColumn3Width() {
		return column3Width;
	}

	public void setColumn3Width(String column3Width) {
		this.column3Width = column3Width;
	}

	public String getColumn4Width() {
		return column4Width;
	}

	public void setColumn4Width(String column4Width) {
		this.column4Width = column4Width;
	}

	public String getColumn5Width() {
		return column5Width;
	}

	public void setColumn5Width(String column5Width) {
		this.column5Width = column5Width;
	}

	public String getColumn6Width() {
		return column6Width;
	}

	public void setColumn6Width(String column6Width) {
		this.column6Width = column6Width;
	}

	public String getColumn7Width() {
		return column7Width;
	}

	public void setColumn7Width(String column7Width) {
		this.column7Width = column7Width;
	}

	public String getColumn8Width() {
		return column8Width;
	}

	public void setColumn8Width(String column8Width) {
		this.column8Width = column8Width;
	}

	public String getColumn9Width() {
		return column9Width;
	}

	public void setColumn9Width(String column9Width) {
		this.column9Width = column9Width;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		sb.append("statusVisible=");
		sb.append(statusVisible);
		sb.append(", massiveVisible=");
		sb.append(massiveVisible);
		sb.append(", iconVisible=");
		sb.append(iconVisible);
		sb.append(", nameVisible=");
		sb.append(nameVisible);
		sb.append(", sizeVisible=");
		sb.append(sizeVisible);
		sb.append(", lastModifiedVisible=");
		sb.append(lastModifiedVisible);
		sb.append(", authorVisible=");
		sb.append(authorVisible);
		sb.append(", versionVisible=");
		sb.append(versionVisible);
		sb.append("}");
		return sb.toString();
	}
}
