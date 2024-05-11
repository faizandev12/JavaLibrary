package EntreprisePackage;

public class Personnel {

    private Employe[] employes;
    private int nbreEmploye;
    private final static int MAXEMPLOYE = 200;

    public Personnel()
    {
        employes = new Employe[200];
        nbreEmploye = 0;
    }
    public void ajouterEmploye(Employe e)
    {
        ++nbreEmploye;
        if (nbreEmploye <= MAXEMPLOYE) {
            employes[nbreEmploye] = e;
        }
    }
    public void afficheSalaires()
    {
        for(int i = 1;i <= nbreEmploye; i++)
        {
              System.out.println(employes[i].getNom() + "Salaire: " + employes[i].calculerSalaire());
        }
    }
    public double SalaireMoyen()
    {
        double somme = 0.0;
        for(int i = 1;i <= nbreEmploye; i++)
        {
             somme += employes[i].calculerSalaire();
        }
        double moyen = somme / nbreEmploye;
        return moyen;
    }
    public static void main(String[] args) {

       Personnel p = new Personnel();

        p.ajouterEmploye(new Vente_emp("Mohammed", "Kamil", 45, "1995", 300000));
        p.ajouterEmploye(new Representation_emp("Tayeb", "Amrani", 25, "2001", 200000));
        p.ajouterEmploye(new Production_emp("Sara", "Kamili", 28, "1998", 1000));
        p.ajouterEmploye(new Manutention__emp("Amine", "Moukhtari", 32, "1998", 45));
        p.ajouterEmploye(new Product_emp_a_risque("Anas", "Alaoui", 28, "2000", 1000));
        p.ajouterEmploye(new Manutent_emp_a_risque("Kamal", "Sabir", 30, "2001", 45));
        p.afficheSalaires();
                System.out.println("Le salaire moyen dans l'entreprise est de " + p.SalaireMoyen()+" Dhs.");
        
    }
    
}
