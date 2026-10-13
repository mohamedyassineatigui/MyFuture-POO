public class CompteBancaire {
    private String numeroCompte;
    private double solde;
    private Client titulaire;
    private static int nombreComptes = 0;

    public CompteBancaire(String numeroCompte, double soldeInitial, Client titulaire) {
        this.numeroCompte = numeroCompte;
        this.solde = soldeInitial;
        this.titulaire = titulaire;
        nombreComptes++;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    public Client getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(Client titulaire) {
        this.titulaire = titulaire;
    }

    public static int getNombreComptes() {
        return nombreComptes;
    }

    public void deposer(double montant) {
        if (montant > 0) {
            this.solde += montant;
            System.out.println("Dépôt de " + montant + " TND effectué sur le compte " + numeroCompte + ".");
        } else {
            System.out.println("Erreur: Le montant du dépôt doit être supérieur à 0 !");
        }
    }

    public void retirer(double montant) {
        if (montant > 0 && montant <= solde) {
            this.solde -= montant;
            System.out.println("Retrait de " + montant + " TND effectué sur le compte " + numeroCompte + ".");
        } else {
            System.out.println("Échec Solde insuffisant sur le compte " + numeroCompte + " (Solde actuel: " + solde + " TND).");
        }
    }

    public void virement(CompteBancaire destination, double montant) {
        System.out.println("Tentative de virement de " + montant + " TND vers le compte " + destination.getNumeroCompte() + "...");
        if (this.solde >= montant && montant > 0) {
            this.solde -= montant;
            System.out.println("Retrait de " + montant + " TND effectué sur le compte " + this.numeroCompte + ".");
            destination.solde += montant;
            System.out.println("Dépôt de " + montant + " TND effectué sur le compte " + destination.getNumeroCompte() + ".");
            System.out.println("Virement réussi !");
        } else {
            System.out.println("Échec du virement !");
        }
    }

    public void afficherDetails() {
        System.out.println("Compte N°: " + numeroCompte);
        System.out.print("Titulaire: ");
        titulaire.afficherClient();
        System.out.println("Solde Actuel " + solde + " TND");
    }
}