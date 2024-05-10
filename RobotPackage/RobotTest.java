package tdjava.RobotPackage;

import RobotPackage.Robot;

public class RobotTest {

    public static void main(String[] args) {

    Robot[] robots = new Robot[3];

    System.out.println("Position et direction des robots avant l'exécution :");
 try {
       robots[0] = new RobotBissectrice(Danel, 7, 7, "NE");
       robots[0].afficher();
    } catch (DirectionException e)
    {
        System.out.println(e.getMessage());
    }
    finally
    {
     robots[0].rotation();

      robots[0].avance();
      robots[0].avance();
     
    }
    robots[1] = new RobotExtraNG("Bonbon", 6, -10, "Nord");
    robots[2] = new RobotExtraNG("Sinsodine", 15, -15, "SO");
    
    ((RobotExtraNG) robots[1]).rotationGauche();
    ((RobotExtraNG) robots[1]).demiTour();
    ((RobotExtraNG) robots[1]).avance(7);

    ((RobotExtraNG) robots[2]).setTurbo(true);
    ((RobotExtraNG) robots[2]).rotationGauche();
    ((RobotExtraNG) robots[3]).avance(3);   
   

    System.out.println("\nPosition et direction des robots après l'exécution  :");    
   for(Robot robot : robots)
   {
    robot.afficher();
   }
    // robots[0].afficher();
   // robots[1].afficher();
   // robots[2].afficher();
}
}
