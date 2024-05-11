package EntreprisePackage;

public class Product_emp_a_risque extends Production_emp implements Employe_a_risque {
   
    public Product_emp_a_risque(String prenom,String nom, int age, String date, int number_of_sales)
    {
        super(prenom, nom, age, date, number_of_sales);
    }
    @Override
    public double calculerSalaire()
    {
        return super.calculerSalaire() + Prime;
    }
    
    
}
