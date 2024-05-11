package EntreprisePackage;

public class Manutention__emp extends Employe{
    private int number_of_hours;
    private final static double doubler = 650.0;

    public Manutention__emp(String prenom, String nom, int age, String date, int number_of_hours)
    {
     super(nom, prenom, age, date);
     this.number_of_hours = number_of_hours;
    }
    public double calculerSalaire()
    {
        return number_of_hours * doubler;
    }
    public String getTitre()
    {
        return "Le manutentionnaire";
    }
}
