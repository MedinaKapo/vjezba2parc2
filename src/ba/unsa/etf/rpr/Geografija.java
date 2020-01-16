package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Geografija {
    ArrayList<Grad> gradovi;
    ArrayList<Drzava> drzavae;

    public Geografija(ArrayList<Grad> gradovi, ArrayList<Drzava> drzavae) {
        this.gradovi = gradovi;
        this.drzavae = drzavae;
    }

    public ArrayList<Grad> getGradovi() {
        return gradovi;
    }

    public void setGradovi(ArrayList<Grad> gradovi) {
        this.gradovi = gradovi;
    }

    public ArrayList<Drzava> getDrzavae() {
        return drzavae;
    }

    public void setDrzavae(ArrayList<Drzava> drzavae) {
        this.drzavae = drzavae;
    }

    public Geografija() {
    }
}
