package EntreprisePackage;

public class Representation_emp extends Commercial {
    private final static double prc_vendeur = 0.2;
    private final static double bonus_vendeur = 8000;

    public Representation_emp(String prenom, String nom, int age, String date,double chiffreAffaire)
    {
     super(nom, prenom, age, date, chiffreAffaire);
    }
    public double calculerSalaire()
    {
        return (prc_vendeur * getChiffreAffaire()) + bonus_vendeur;
    }
    public String getTitre()
    {
        return "Le représentant";
    }
}
