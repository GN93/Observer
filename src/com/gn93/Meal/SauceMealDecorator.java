package Meal;

public class SauceMealDecorator extends MealDecorator {

    public SauceMealDecorator(Meal decoratedMeal) {
        super(decoratedMeal);
    }

    @Override
    public void prepareMeal() {
        super.prepareMeal();
        addSauce();
    }

    public void addSauce(){
        System.out.println("Do dania dodaję sos.");
    }

}
