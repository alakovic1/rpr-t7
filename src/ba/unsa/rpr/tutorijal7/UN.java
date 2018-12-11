package ba.unsa.rpr.tutorijal7;

import java.io.Serializable;
import java.util.ArrayList;

public class UN implements Serializable {
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

    @Override
    public String toString() {
        String ispis = "";
        ispis+= "UN{" + "drzave=" + getDrzave() + '}';
        return ispis;
    }
}
