package EntreprisePackage;

public class Production_emp extends Employe{
    private int number_of_sales;
    private final static double bonus_vendeur = 8000;

    public Production_emp(String prenom, String nom, int age, String date,int number_of_sales)
    {
     super(nom, prenom, age, date);
     this.number_of_sales = number_of_sales;
    }
    public double calculerSalaire()
    {
        return number_of_sales * 5;
    }
    public String getTitre()
    {
        return "Le Producteur";
    }
}
