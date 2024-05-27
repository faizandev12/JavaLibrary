/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.jabri.point;

/**
 *
 * @author Jabri
 */
public class Point {

    private double x;
    private double y;
    
    public double getX(){
        
        return this.x;
    }
    public double getY()
    {
        return this.y;
    }
    public void setX(double x)
    {
        this.x = x;
    }
    public void setY(double y)
    {
        this.y = y;
    }
    @Override
    public String toString()
    {
      return "(" + x + "," + y + ")";  
    }
    public Point(double x, double  y)
    {
        this.x = x;
        this.y = y;
    }
    public Point()
    {
        this.x = 0.0;
        this.y = 0.0;
    }
    public Point(Point p)
    {
        this.x = p.x;
        this.y = p.y;
    }
    public double calculerDistance(Point p)
    {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }
    public Point calculerMilieu(Point p)
    {
        
        Point p2 = new Point( (this.x + p.x) / 2, (this.y + p.y ) / 2 );
        return p2;
    }
    public void translate(double x, double y)
    {
        this.x += x;
        this.y += y;
    }
    public void homothetie(int k)
    {
        this.x *= k;
        this.y *= k;
    }
    public void symetrie()
    {
        double temp = this.x;
         this.x = y;
         this.y = temp;
    }
    public void rotation()
    {
     double temp = this.x;
     this.x = - this.y;
     this.y = temp;
    }

}
