package Children;

import Requests.MotherRequest;

public abstract class Child {

    Child tallerChild;

    public void setTallerChild(Child tallerChild) {
        this.tallerChild = tallerChild;
    }

    public Child getTallerChild() {
        return tallerChild;
    }

    public void processRequest (MotherRequest motherRequest) {}


}
