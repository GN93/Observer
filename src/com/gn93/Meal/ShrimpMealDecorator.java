package Meal;

public class ShrimpMealDecorator extends MealDecorator {

    public ShrimpMealDecorator(Meal decoratedMeal) {
        super(decoratedMeal);
    }

    @Override
    public void prepareMeal() {
        super.prepareMeal();
        addShrimp();
    }

    public void addShrimp(){
        System.out.println("Do dania dodaję krewetki.");
    }
}
