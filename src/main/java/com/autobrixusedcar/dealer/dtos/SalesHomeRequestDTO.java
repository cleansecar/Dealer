package com.autobrixusedcar.dealer.dtos;

public class SalesHomeRequestDTO {
	private String salesname;
	private String salesmobileno;
	private String salesimage;
	public String getSalesimage() {
		return salesimage;
	}
	public void setSalesimage(String salesimage) {
		this.salesimage = salesimage;
	}
	public String getSalesname() {
		return salesname;
	}
	public void setSalesname(String salesname) {
		this.salesname = salesname;
	}
	public String getSalesmobileno() {
		return salesmobileno;
	}
	public void setSalesmobileno(String salesmobileno) {
		this.salesmobileno = salesmobileno;
	}
}
