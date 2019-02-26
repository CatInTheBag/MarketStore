package com.company;

import java.util.ArrayList;
import java.util.List;

public class PayDesk
{
    public static void main(String[] args)
    {
        Card bronzeCardBruce = new BronzeCard("Bruce",0);
        Card silverCardJan = new SilverCard("Jan",600);
        Card goldCardAlfred = new GoldCard("Alfred",1500);

        List<Purchase> purchases = new ArrayList<>();
        purchases.add(new Purchase(bronzeCardBruce,150));
        purchases.add(new Purchase(silverCardJan,850));
        purchases.add(new Purchase(goldCardAlfred,1300));

        printInformation(purchases);

    }

    public static void printInformation(List<Purchase> listPurchases)
    {
        for(Purchase el : listPurchases)
        {
            System.out.println(el);
        }
    }


}
