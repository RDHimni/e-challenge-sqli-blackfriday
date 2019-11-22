package com.indev.blackfriday.factory;

import com.indev.blackfriday.entities.Machine;
import com.indev.blackfriday.entities.Product;

/**
 * @author rida_dhimni
 *
 * Nov 22, 2019
 *
 * @project blackfriday
 */

public class MachineFactory {

	public Product getInstance(int prix) {
		return new Machine(prix);
		
	}
	
}
