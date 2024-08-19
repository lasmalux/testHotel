package Models;

public class Chambre {
    private  int numeroChambre;
    private Enum<ChambreType> chambreType;
    private boolean reserver;

    public Chambre(int numeroChambre, Enum<ChambreType> chambreType, boolean reserver) {
        this.numeroChambre = numeroChambre;
        this.chambreType = chambreType;
        this.reserver = reserver;
    }

    //region setter/getter
    public int getNumeroChambre() {
        return numeroChambre;
    }
    public void setNumeroChambre(int numeroChambre) {
        this.numeroChambre = numeroChambre;
    }
    public Enum<ChambreType> getChambreType() {
        return chambreType;
    }
    public void setChambreType(Enum<ChambreType> chambreType) {
        this.chambreType = chambreType;
    }
    public boolean isReserver() {
        return reserver;
    }
    public void setReserver(boolean reserver) {
        this.reserver = reserver;
    }
    //endregion

    //region Procedure/fonction

    //endregion

}
