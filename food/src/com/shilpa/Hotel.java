package com.shilpa;

import java.util.ArrayList;
import java.util.List;

public class Hotel 
{

   private List<String> fooditems=new ArrayList<>();
   private int price=30;
   
   public Hotel()
   {
	   System.out.println("created :"+ this.getClass().getSimpleName());
	   fooditems.add("dosa");
	   fooditems.add("iddli vada");
	   fooditems.add("maggi");
	   fooditems.add("dosa");
	   
   }
   public int order(String item,int qty)
   {
	   if(fooditems.contains(item))
	   {
		   
	   System.out.println("item found");
	   int total=qty*price;
	   System.out.println("total price:"+total);
	   return total;
   }
	   
   return 0;
  }

}
   
	
	

