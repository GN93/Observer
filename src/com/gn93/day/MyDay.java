package day;

public class MyDay extends WeekDay {

    @Override
    protected void comeBackHome(int time) {

        System.out.println("I'm coming back home for " + time + " minutes");
    }

    @Override
    protected int goToWork(TypeOfTransport typeOfTransport) {
        switch (typeOfTransport) {
            case CAR:
                return 15;
            case TRAM:
                return 25;
            case BIKE:
                return 20;
            default:
                throw new UnsupportedOperationException("This type of transport is not supported");
        }
    }
}
