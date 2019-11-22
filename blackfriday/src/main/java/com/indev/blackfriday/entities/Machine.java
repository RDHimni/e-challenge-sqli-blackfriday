package com.indev.blackfriday.entities;

/**
 * @author rida_dhimni
 *
 * Nov 22, 2019
 *
 * @project blackfriday
 */

public class Machine implements Product{
	
	private int prix;

	public Machine(int q) {
		// TODO Auto-generated constructor stub
		this.prix = q;
	}

	public int getprix() {
		return prix;
	}

	public void setprix(int prix) {
		this.prix = prix;
	}
	

	
	
	
}
