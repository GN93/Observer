package com.gn93.strategy;

public class RegularPrice implements PricingStrategy {

    @Override
    public void calulcatePrice(int initialPrice, boolean isSignedUpForNewsletter) {
        if(isSignedUpForNewsletter){
            System.out.println("Użytkownik zapisany do newslettera, należy wybrać inną strategię cenową!");
        }
        else{
            System.out.println("Normalna cena: " + initialPrice + "zł");
        }
    }
}
