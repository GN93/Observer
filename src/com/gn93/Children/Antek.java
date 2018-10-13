package Children;

import Requests.MotherRequest;
import Subjects.Shelf;

public class Antek extends Child {

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if(motherRequest.getShelf().equals(Shelf.HIGH)){
            System.out.println("Antek - Zdejmuje słoik z wysokiej półki.");
        }
        else{
            throw new UnsupportedOperationException("Operacja niedozwolona, Antek nie jest w stanie zdjąć przedmiotu z półki");
        }
    }

}
