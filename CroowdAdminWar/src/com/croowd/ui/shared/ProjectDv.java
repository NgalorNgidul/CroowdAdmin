package com.croowd.ui.shared;

import com.google.gwt.user.client.rpc.IsSerializable;

public class ProjectDv implements IsSerializable{

	private String nasabah;
	private String cif;
	private String pob;
	private String dob;
	private String address;
	private String address1;
	private String phone;
	
	private String projectName;
	private String nominalProject;
	private String dateAssign;
	private String status;
	
	
	
	public String getPob() {
		return pob;
	}
	public void setPob(String pob) {
		this.pob = pob;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getNasabah() {
		return nasabah;
	}
	public void setNasabah(String nasabah) {
		this.nasabah = nasabah;
	}
	public String getCif() {
		return cif;
	}
	public void setCif(String cif) {
		this.cif = cif;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getNominalProject() {
		return nominalProject;
	}
	public void setNominalProject(String nominalProject) {
		this.nominalProject = nominalProject;
	}
	public String getDateAssign() {
		return dateAssign;
	}
	public void setDateAssign(String dateAssign) {
		this.dateAssign = dateAssign;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
}
