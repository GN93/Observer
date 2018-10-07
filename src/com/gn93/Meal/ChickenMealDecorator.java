package Meal;

public class ChickenMealDecorator extends MealDecorator {

    public ChickenMealDecorator(Meal decoratedMeal) {
        super(decoratedMeal);
    }

    @Override
    public void prepareMeal() {
        super.prepareMeal();
        addChicken();
    }

    public void addChicken(){
        System.out.println("Do dania dodaję kurczaka.");
    }
}
