public class Voiture {
    private String marque;
    private double vitesse;
    private String couleur;

    public Voiture(String marque, double vitesse, String couleur) {
        this.marque = marque;
        this.vitesse = vitesse;
        this.couleur = couleur;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getVitesse() {
        return vitesse;
    }

    public void setVitesse(double vitesse) {
        this.vitesse = vitesse;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void afficherDetails() {
        System.out.println("\n--- DÉTAILS DE LA VOITURE ---");
        System.out.println("Marque  : " + marque);
        System.out.println("Vitesse : " + vitesse + " km/h");
        System.out.println("Couleur : " + couleur);
        System.out.println("-----------------------------\n");
    }
}