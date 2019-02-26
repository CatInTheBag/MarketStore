package com.company;

public class GoldCard extends Card
{
   public GoldCard(String name,double turnoverPreviousMonth)
   {
      super(name,turnoverPreviousMonth);
   }

   @Override
   public double getDiscountRate()
   {
      double additionalDiscount = (getTurnoverPreviousMonth()/100)/100;

      if((0.02+additionalDiscount) > 0.10)
      {
         return 0.10;
      }
      else
      {
         return 0.02+additionalDiscount;
      }
   }
}
