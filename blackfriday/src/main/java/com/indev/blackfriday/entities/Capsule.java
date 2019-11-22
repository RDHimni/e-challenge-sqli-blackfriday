package com.indev.blackfriday.entities;

/**
 * @author rida_dhimni
 *
 * Nov 22, 2019
 *
 * @project blackfriday
 */

public class Capsule implements Product{
	
		
	private int prix;

	public Capsule(int prix) {
		// TODO Auto-generated constructor stub
		this.prix = prix;

	}

	public int getprix() {
		return prix;
	}

	public void setprix(int prix) {
		this.prix = prix;
	}
	

	
	
}
