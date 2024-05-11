package EntreprisePackage;

public abstract class Employe 
{
      private String nom;
      private String prenom;
      private int age;
     // private int[] date_entree = {10,10,2004};
          private String date_entree;

      public Employe(String nom,String prenom,int age, String dt_et)
      {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.date_entree = dt_et;
      }
      public String getNom() {
          return getTitre() + nom + prenom;
      }
      public abstract double calculerSalaire();
      public String getTitre()
      {
          return "L'Employé";
      }
      
}