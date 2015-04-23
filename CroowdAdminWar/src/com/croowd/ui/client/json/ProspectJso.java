package com.croowd.ui.client.json;

import com.google.gwt.core.client.JavaScriptObject;

public class ProspectJso extends JavaScriptObject {
	protected ProspectJso() {
	}

	public final native String getTitle() /*-{
		return this.title;
	}-*/;

	public final native void setTitle(String title) /*-{
		this.title = title;
	}-*/;

	public final native String getDescription() /*-{
		return this.description;
	}-*/;

	public final native void setDescription(String description) /*-{
		this.description = description;
	}-*/;

	public final native String getShortDescription() /*-{
		return this.shortDescription;
	}-*/;

	public final native void setShortDescription(String shortDescription) /*-{
		this.shortDescription = shortDescription;
	}-*/;

	public final native String getLocation() /*-{
		return this.location;
	}-*/;

	public final native void setLocation(String location) /*-{
		this.location = location;
	}-*/;

	public final native String getPrincipal() /*-{
		return this.principal;
	}-*/;

	public final native void setPrincipal(String principal) /*-{
		this.principal = principal;
	}-*/;

	public final native String getTenor() /*-{
		return this.tenor;
	}-*/;

	public final native void setTenor(String tenor) /*-{
		this.tenor = tenor;
	}-*/;

	public final native String getOwnerName() /*-{
		return this.ownerName;
	}-*/;

	public final native void setOwnerName(String ownerName) /*-{
		this.ownerName = ownerName;
	}-*/;

	public final native String getEmail() /*-{
		return this.email;
	}-*/;

	public final native void setEmail(String email) /*-{
		this.email = email;
	}-*/;

	public final native String getAddress() /*-{
		return this.address;
	}-*/;

	public final native void setAddress(String address) /*-{
		this.address = address;
	}-*/;

	public final native String getCity() /*-{
		return this.city;
	}-*/;

	public final native void setCity(String city) /*-{
		this.city = city;
	}-*/;

	public final native String getZipCode() /*-{
		return this.zipCode;
	}-*/;

	public final native void setZipCode(String zipCode) /*-{
		this.zipCode = zipCode;
	}-*/;

	public final native String getProvince() /*-{
		return this.province;
	}-*/;

	public final native void setProvince(String province) /*-{
		this.province = province;
	}-*/;

	public final native String getPhone() /*-{
		return this.phone;
	}-*/;

	public final native void setPhone(String phone) /*-{
		this.phone = phone;
	}-*/;

	public final native String getPassword() /*-{
		return this.password;
	}-*/;

	public final native void setPassword(String password) /*-{
		this.password = password;
	}-*/;

	public final native String getPasswordconf() /*-{
		return this.passwordconf;
	}-*/;

	public final native void setPasswordconf(String passwordconf) /*-{
		this.passwordconf = passwordconf;
	}-*/;

}
