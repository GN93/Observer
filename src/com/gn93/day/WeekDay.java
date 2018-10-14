package day;

public abstract class WeekDay {

    public final void dayStartingSequence(TypeOfTransport typeOfTransport){
        wakeUp();
        getReady();
        int time = goToWork(typeOfTransport);
        comeBackHome(time);
        drinkBeer();
        watchFootballGame();
    }

    private void watchFootballGame() {
        System.out.println("Watching football game...");
    }

    private void drinkBeer() {
        System.out.println("Drinking beer...");
    }

    protected abstract void comeBackHome(int time);

    protected abstract int goToWork(TypeOfTransport typeOfTransport);

    private void getReady() {
        System.out.println("Getting ready for a work...");
    }

    private void wakeUp() {
        System.out.println("Time to get up...");
    }
}
