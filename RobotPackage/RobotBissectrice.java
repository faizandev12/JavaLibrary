package tdjava.RobotPackage;

import RobotPackage.Robot;

public class RobotBissectrice extends Robot {

    public RobotBissectrice(String name, int x, int y, String direction) throws DirectionException {
        super(name, x, y, direction);
        //TODO Auto-generated constructor stub
        if (!direction.equals("NE") && direction != "SO" ) 
        {
            throw new DirectionException();
        }
    }
    public RobotBissectrice(String name) throws DirectionException {
      super(name);
    }
    @Override
    public void avance()
    {
        if (direction == "NE") {
            x++;
            y++;
        }
        else
        {
            x--;
            y--;
        }
    }

    @Override
    public void rotation()
    {
        //Rotation 180 degree a droite
        if (direction == "NE") {
            this.direction = "SO";
        }
        else  {
            this.direction = "NE";

        }
    }
    
    
}
