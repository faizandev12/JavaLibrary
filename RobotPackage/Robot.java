package RobotPackage;

import java.lang.constant.DirectMethodHandleDesc;

public abstract class Robot {
    protected String nom;
    protected int x,y;
    protected String direction;

      public Robot(String nom)
      {
        this.nom = nom;
        this.x = 0;
        this.y = 0;
        direction = "Est";

      }
     public Robot(String name, int x, int y, String direction)
     {
       this.nom = name;
       this.x = x;
       this.y = y;
       if (direction == "Nord" || direction == "Est" || direction == "Ouest" || direction == "NO" 
       || direction == "NE" || direction == "SO" || direction == "SE") {
        this.direction = direction;
       }
     }
   /*   public  void avance()
     {
     
        if (this.direction == "Est")
         {
            this.x++; 
         }
         else if (this.direction == "Ouest") {
            this.x--;
         }
         else if (this.direction == "Sud")
         {
            this.y--;
         }
         else //if (this.direction == "Nord") 
         {
            this.y++;   
         }
         
     }
     */

          public void rotationDroite90()
     {
        if (this.direction == "Est")
        {
           this.direction = "Sud"; 
        }
        else if (this.direction == "Ouest") 
        {
            this.direction = "Nord"; 
        }
        else if (this.direction == "Sud")
        {
            this.direction = "Ouest"; 
        }
        else //if (this.direction == "Nord") 
        {
            this.direction = "Est"; 
        }
     }
     public void afficher() {
        System.out.println("nom : " + nom);
        System.out.println("position : (" + x + "," + y +")");
        System.out.println("direction : " + direction);
        }
        public abstract void avance();
        public abstract void rotation();
 
      }
        
