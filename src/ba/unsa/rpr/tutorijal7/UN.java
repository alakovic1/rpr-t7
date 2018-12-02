package ba.unsa.rpr.tutorijal7;

import java.util.ArrayList;

public class UN {
    private ArrayList<Drzava> drzave;

    public UN() {
        setDrzave(new ArrayList<>());
    }

    public ArrayList<Drzava> getDrzave() {
        return drzave;
    }

    public void setDrzave(ArrayList<Drzava> drzave) {
        this.drzave = drzave;
    }
}
