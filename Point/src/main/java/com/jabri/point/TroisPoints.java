/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jabri.point;
import java.util.Scanner;

/**
 *
 * @author Jabri
 */
public class TroisPoints {
   private Point A;
   private Point B;
   private Point C;
   private double d_AB,d_AC,d_BC;

    public Point getA() {
        return A;
    }

    public Point getB() {
        return B;
    }

    public Point getC() {
        return C;
    }

    public void setA(Point A) {
        this.A = A;
    }

    public void setB(Point B) {
        this.B = B;
    }

    public void setC(Point C) {
        this.C = C;
    }
   
   public TroisPoints(Point A, Point B, Point C)
   {
       //this(A,B,C);
       this.A = A;
       this.B = B;
       this.C = C;
       
       this.d_AB = A.calculerDistance(B);
       this.d_BC = B.calculerDistance(C);
       this.d_AC = C.calculerDistance(B);
   }
   public boolean sontAlignes()
   {
       if(d_AB == d_BC + d_AC || d_BC == d_AB + d_AC || d_AC == d_AB + d_BC)
       {
           return true;
       }
       return false;
   }
   
           
   public boolean estTriangle()
   {
          return !sontAlignes();              
   }
   public boolean estIsocele()
   {
       if(estTriangle())
       {
           if(d_AB == d_BC || d_AC == d_BC || d_AB == d_AC)
           {
               return true;
           }
           return false;
       }
       return false;
   }
   public boolean estEquilateral()
   {
                  if(d_AB == d_BC && d_AC == d_BC &&d_AB == d_AC)
                  {
                      return true;
                  }
                  return false;
   }
   public boolean estRectangle()
   {
       if( Math.pow(d_AB, 2) == Math.pow(d_BC, 2) + Math.pow(d_AC, 2))
       {
           return true;
       }
       else if( Math.pow(d_BC, 2) == Math.pow(d_AB, 2) + Math.pow(d_AC, 2))
       {
           return true;
       }
       else if( Math.pow(d_AC, 2) == Math.pow(d_AB, 2) + Math.pow(d_BC, 2))
       {
           return true;
       }
       return false;
   }
   
   public static void main(String[] args)
   {
       Scanner scan = new Scanner(System.in);
       
       Point p1 = new Point();
       
       System.out.println("Donner moi x de Point 1 :");
       p1.setX(scan.nextDouble());
       System.out.println("Donner moi y de Point 1 :");
       p1.setY(scan.nextDouble());

      System.out.println( p1.toString());
       
   }
   
}
