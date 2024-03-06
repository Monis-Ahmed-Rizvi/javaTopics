package Composition;

public class House {
   private double lenght;
   private double width;
   
   private Kitchen kitchen;
   
   public House(double lenght,double width)
   {
	   this.lenght = lenght;
	   this.width = width;
   }
   
   public void setKitchen(Kitchen kitchen)
   {
	   this.kitchen = kitchen;
   }
   
   
   public double getLenght()
   {
	   return this.lenght;
   }
   
   public double getWidth()
   {
	   return this.width;
   }
   
   
   public Kitchen getKitchen()
   {
	   return this.kitchen;
   }
     
   
}
