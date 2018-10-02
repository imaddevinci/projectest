package miqi;

public class Voiture {
    private String marque;
    private String couleur;
    private int place;

    public Voiture(String marque, String couleur, int place) {
        this.marque = marque;
        this.couleur = couleur;
        this.place = place;
    }

    public String getMarque() {
        return marque;
    }

    public String getCouleur() {
        return couleur;
    }

    public int getPlace() {
        return place;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "marque='" + marque + '\'' +
                ", couleur='" + couleur + '\'' +
                ", place=" + place +
                '}';
    }
}
