package com.skillstorm.training.week10.day3;

	public class Truck extends Automobile{
		   public void drive() {  System.out.println("Truck: drive");   }
		   public static void main (String args []){
		      Automobile  a = new Automobile();
		      Truck t  = new Truck();
		      a.drive(); //1
		      t.drive(); //2
		      a = t;     //3
		      a.drive(); //4
		      
		   }
		}

