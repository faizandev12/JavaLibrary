package EntreprisePackage;

public class Manutent_emp_a_risque extends Manutention__emp implements Employe_a_risque {
   
    public Manutent_emp_a_risque(String prenom,String nom, int age, String date, int number_of_hours)
    {
        super(prenom, nom, age, date, number_of_hours);
    }
    @Override
    public double calculerSalaire()
    {
        return super.calculerSalaire() + Prime;
    }
    
    
}
