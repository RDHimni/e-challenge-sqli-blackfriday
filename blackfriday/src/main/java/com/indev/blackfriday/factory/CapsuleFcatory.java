package com.indev.blackfriday.factory;

import com.indev.blackfriday.entities.Capsule;
import com.indev.blackfriday.entities.Product;

/**
 * @author rida_dhimni
 *
 * Nov 22, 2019
 *
 * @project blackfriday
 */

public class CapsuleFcatory {


	public Product getInstance(int prix) {
		return new Capsule(prix);
		
	}
}
