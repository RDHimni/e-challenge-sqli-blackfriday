package com.indev.blackfriday.entities;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.indev.blackfriday.factory.CapsuleFcatory;
import com.indev.blackfriday.factory.MachineFactory;

/**
 * @author rida_dhimni
 *
 * Nov 22, 2019
 *
 * @project blackfriday
 */

public class Company {
	
   private	Map<Product, Integer> products;
  
   
   private int quantSaltcapsule ;
   private int quantSaltmachine ;
   
   private float salscapsule ;
   private float salsmachine;
   
   private int profiporsent;
   private int Quantite;
	
	public Company() {
		// TODO Auto-generated constructor stub
		products = new HashMap<>();
		profiporsent = 20;
		Quantite = 5;
		

	}

	public void stock(int quant, String p, int prix) {
		// TODO Auto-generated method stub
		
		if (p.equalsIgnoreCase("capsule")) {
			Product capsule = new CapsuleFcatory().getInstance(prix);
			this.products.put(capsule, quant);
			
		}
		if (p.equalsIgnoreCase("machine")) {

			Product machin = new MachineFactory().getInstance(prix);
			this.products.put(machin, quant);
			
		}
		
		
	}



	public int totalAssets() {
      
		int totalasssets = 0;
		  
		
		
		
		Capsule  c = (Capsule) this.products.keySet().stream()
				  .filter(p -> p instanceof Capsule).findAny().orElse(null);
		
		if(c !=null) {
		  	int prixc = c.getprix();
			totalasssets += (quantSaltcapsule/Quantite)*salscapsule  + this.products.get(c)*prixc;
			

		}
		
			Machine m =  (Machine) this.products.keySet().stream()
					  .filter(p -> p instanceof Machine).findAny().orElse(null);
			
	   if(m !=null) {
			int prixm = m.getprix();
			totalasssets +=(quantSaltmachine/Quantite)*salsmachine + this.products.get(m)*prixm;
		
		}
		return totalasssets;
	}

//////////////////////////////////////////////////////////////////////////////////	
	public float sells(String pr) {
		// TODO Auto-generated method stub
		int Capprix = 0 ;
		int Machprix = 0;
		
		float sellsC = 0;
		float sellsM = 0;
		
		if (pr.equalsIgnoreCase("capsule")) {
			
			
			Capsule  c = (Capsule) this.products.keySet().stream()
					  .filter(p -> p instanceof Capsule).findAny().orElse(null);
			
			if(c !=null) {
				
				if (products.get(c) >=Quantite) {
							
					this.products.replace(c, products.get(c)-Quantite);
                    
					Capprix = c.getprix();
					this.quantSaltcapsule += Quantite;
					
				}
				else throw new RuntimeException();
				}
			sellsC = Quantite*Capprix + ( Quantite*Capprix*profiporsent)/100;

			this.salscapsule =sellsC;

		}
			
		
		if (pr.equalsIgnoreCase("machine")) {

			
			Machine m =  (Machine) this.products.keySet().stream()
					  .filter(p -> p instanceof Machine).findAny().orElse(null);
			
			if(m !=null) {
				if (products.get(m) >=Quantite) {
				this.products.replace(m, products.get(m)-Quantite);
                Machprix = m.getprix();
				this.quantSaltmachine += Quantite;
			}
			}
			else throw new RuntimeException();
			
			sellsM = Quantite*Machprix + (Quantite*Machprix*profiporsent)/100;
			
			
			this.salsmachine = sellsM;
		}

		
		return sellsC + sellsM;
	}

	public Company blackFriday() {
		// TODO Auto-generated method stub
		this.profiporsent = 10;
		this.Quantite = 10;
		
		return this;
	}


}
