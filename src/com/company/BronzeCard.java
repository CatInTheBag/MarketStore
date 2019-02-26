package com.company;

public class BronzeCard extends Card
{

   public BronzeCard(String name,double turnoverPreviousMonth)
   {
      super(name,turnoverPreviousMonth);
   }

   @Override
   public double getDiscountRate()
   {
      if(getTurnoverPreviousMonth()>300)
      {
         return 0.025;
      }
      else if((getTurnoverPreviousMonth()>100)&&(getTurnoverPreviousMonth()<300))
      {
         return 0.001;
      }
      else
      {
         return 0.0;
      }
   }

}
