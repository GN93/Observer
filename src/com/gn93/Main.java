package com.gn93;

import Meal.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Nowy posiłek: ");
        Meal riceMeal = new RiceMeal();
        riceMeal.prepareMeal();
        System.out.println("\nNowy posiłek: ");
        Meal riceMealWithShrimp = new ShrimpMealDecorator(new RiceMeal());
        riceMealWithShrimp.prepareMeal();
        System.out.println("\nNowy posiłek: ");
        Meal potatoMealWithAllIngredients = new SauceMealDecorator(new ChickenMealDecorator(new ShrimpMealDecorator(new PotatoMeal())));
        potatoMealWithAllIngredients.prepareMeal();

    }
}
