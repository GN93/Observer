package com.gn93.strategy;

public class SalePrice implements PricingStrategy {

    @Override
    public void calulcatePrice(int initialPrice, boolean isSignedUpForNewsletter) {
        if(isSignedUpForNewsletter){
            System.out.println("Przecena: " + initialPrice/2 + "zł");
        }
        else{
            System.out.println("Użytkownik nie jest zapisany do newslettera, należy wybrać inną strategię cenową!");
        }
    }
}
