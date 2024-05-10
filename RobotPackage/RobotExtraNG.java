package tdjava.RobotPackage;

import RobotPackage.RobotExtra;

public class RobotExtraNG extends RobotExtra {
    private boolean turbo;

    public RobotExtraNG(String name, int x, int y, String Direction)
    {
        super(name, x, y, Direction);
        turbo = false; // turbo désactivé par défaut
    }
    public RobotExtraNG(String name)
    {
        super(name);
        turbo = false;
    }
   public boolean isTurbo()
   {
    return turbo;
   }
   public void setTurbo(boolean option)
   {
    this.turbo = option;
   }
   @Override
   public void avance()
   {
    //si turbo est activé
    if (turbo) {
        super.avance();
        super.rotation();
        super.avance();
    }
    else
    {
        super.avance();
    }
   } 
    public void avance(int n)
    {
        for(int i = 0; i < n; i++)
        {
           avance();     
        }
    }
    public void rotationGauche()
    {
        /*
         for(int i=1;i<=7;i++)
         {
            rotation(); // super.rotation();
           }
         */
        switch (direction) {
            case "NE":
            direction = "Nord";
            break;
            case "SE":
            direction = "Est";
            break;
             case "SO":
             direction = "Sud";
             break;
             case "NO":
             direction = "Ouest";
             break;
             case "Nord":
             direction = "NO";
             break;
             case "Est":
             direction = "NE";
             break;
             case "Ouest":
             direction = "SO";
             break;
             case "Sud":
             direction = "SE";
             break;  
             default:
              System.out.println("Direction invalide !");
            break;
        }
    }
    public void demiTour()
    {
        for(int i=1;i<=4;i++)
        {
        super.rotation();
         }
    }
    @Override
     public void afficher(){
        System.out.println("Robot ExtraNG:");
        super.afficher();
        System.out.println("turbo : " + (turbo?"ON":"OFF"));
    }

    
}
