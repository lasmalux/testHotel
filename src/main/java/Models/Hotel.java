package Models;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Chambre> listChambre;

    public Hotel(ArrayList<Chambre> listChambre) {
        this.listChambre = listChambre;
    }

    //region Getter/Setter
    public ArrayList<Chambre> getListChambre() {
        return listChambre;
    }
    //endregion

    //region Method/function
    @Override
    public String toString() {
        return getListChambre().toString();
    }
    //endregion
}
