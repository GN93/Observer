package Children;

import Requests.MotherRequest;
import Subjects.Shelf;

public class Tomek extends Child {

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if(motherRequest.getShelf().equals(Shelf.MEDIUM)){
            System.out.println("Tomek zdejmuje słoik ze średniej półki.");
        }
        else{
            getTallerChild().processRequest(motherRequest);
        }
    }

}
