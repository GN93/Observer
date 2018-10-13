package Children;

import Requests.MotherRequest;
import Subjects.Shelf;

public class Ania extends Child {



    @Override
    public void processRequest(MotherRequest motherRequest) {
        if(motherRequest.getShelf().equals(Shelf.LOW)){
            System.out.println("Ania zdejmuje słoik z niskiej półki.");
        }
        else{
            getTallerChild().processRequest(motherRequest);
        }
    }

}
