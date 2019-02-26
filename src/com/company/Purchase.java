package com.company;

public class Purchase
{
  private Card cardType;
  private double purchaseValue;

  public Purchase(Card cardType, double purchaseValue)
  {
     setCardType(cardType);
     setPurchaseValue(purchaseValue);
  }

   public void setCardType(Card cardType)
   {
      this.cardType = cardType;
   }

   public double getPurchaseValue()
   {
      return purchaseValue;
   }

    public double getDiscountSum()
   {
      return getPurchaseValue()* cardType.getDiscountRate();
   }

   public double getSumToPay()
   {
      return getPurchaseValue() - getPurchaseValue()* cardType.getDiscountRate();
   }

   public void setPurchaseValue(double purchaseValue)
   {
      if (purchaseValue < 0)
         throw new IllegalArgumentException("Purchase must be bigger than 0");

      this.purchaseValue = purchaseValue;
   }

   @Override
   public String toString()
   {
      return String.format("Purchase value:$%.2f%nDiscount rate:%.1f%%%nDiscount:$%.2f%nTotal:$%.2f%n"
              ,getPurchaseValue(), cardType.getDiscountRate()*100,getDiscountSum(),getSumToPay());
   }
}
