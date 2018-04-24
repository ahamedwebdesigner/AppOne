package com.appOne;

import java.util.Arrays;

public class Basket {

   private String[] cart = {"Apple", "Banana", "oranges"};

   
   
   
   
		public Basket(String[] cart) {
			super();
			this.cart = cart;
		}

/*   public void addItem(String fruit) {
	   this.cart[cart.length+1]=fruit;
	   
   }*/
   
	public String[] getCart() {
		return cart;
	}
	
	public void setCart(String[] cart) {
		this.cart = cart;
	}



	@Override
	public boolean equals(Object obj) {
		
		System.out.println("equals method has been excuited");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Basket other = (Basket) obj;
	/*	if (!Arrays.equals(cart, other.cart))
			return false;*/
		if (this.cart.length == other.cart.length)
			return true;
		else
			return false;
	
	}
   
	
    
}
