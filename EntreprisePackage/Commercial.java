package EntreprisePackage;

public abstract class Commercial extends Employe 
{
   private double chiffreAffaire;
   
   public Commercial(String nom,String prenom,int age, String dt_et, double cA)
   {
     super(nom, prenom, age, dt_et);
     this.chiffreAffaire = cA;
   }
    public double getChiffreAffaire()
    {
        return this.chiffreAffaire;
    }

    
    
}
