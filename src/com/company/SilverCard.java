package com.company;

public class SilverCard extends Card
{
   public SilverCard(String name, double turnoverPreviousMonth)
   {
      super(name,turnoverPreviousMonth);
   }

   @Override
   public double getDiscountRate()
   {
      if(getTurnoverPreviousMonth()>300)
      {
         return 0.035;
      }
      else
      {
         return 0.02;
      }
   }
}
