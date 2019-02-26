package com.company;

public abstract class Card
{
   private double turnoverPreviousMonth;
   private Owner ownerName;

   public Card(String name,double turnoverPreviousMonth)
   {
      new Owner(name);
      setTurnoverPreviousMonth(turnoverPreviousMonth);
   }

   public double getTurnoverPreviousMonth()
   {
      return turnoverPreviousMonth;
   }

   public void setTurnoverPreviousMonth(double turnoverPreviousMonth)
   {
      if(turnoverPreviousMonth < 0)
         throw new IllegalArgumentException("Turnover must be bigger or equal to 0");

      this.turnoverPreviousMonth = turnoverPreviousMonth;
   }

   public abstract double getDiscountRate();

   @Override
   public String toString()
   {
      return String.format("Discount :%.2f",getDiscountRate());
   }
}
