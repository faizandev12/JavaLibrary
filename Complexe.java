package tdjava;
import java.util.Scanner;

public class Complexe {
    private final double re;
    private final double im;


    public Complexe()
    {
       this.re = 1.0;
       this.im = 1.0;
    }
    public Complexe(double r, double i)
    {
           this.re = r;
           this.im = i;
    }
    //par recopie
    public Complexe(Complexe other)
    {
        this.re = other.re;
        this.im = other.im;
    }

        // Getters pour les parties réelle et imaginaire
        public double getRe() {
            return re; // Retourne la partie réelle
        }
    
        public double getIm() {
            return im; // Retourne la partie imaginaire
        }
    @Override
    public String toString()
    {
        if (im == 0) return re + "";
        if (re == 0) return im + "i";
         if(im < 0)
         {
            return re + " - " + Math.abs(im) + "i";
         }
        else
        {
            return re + " + " + Math.abs(im) + "i";
        }
    }
    public Complexe addition(Complexe z)
    {
           return new Complexe(this.re + z.re, this.im + z.im);
    }
    public Complexe multiplication(Complexe z)
    {
        return new Complexe((this.re * z.re) - (this.im * z.im) , (this.re * z.im) + (this.im * z.re)); 
    }
    public Complexe soustraction(Complexe z)
    {
        return new Complexe(this.re - z.re, this.im - z.im);
    }
    //méthode 1 de division
    public Complexe division(Complexe c)
    {
        float reelD = (float)(((re * c.re) + (im * c.im)) / (Math.pow(c.re,2) + (Math.pow(c.im,2))));
        float imD = (float)((c.re * im - re * c.im) / (Math.pow(c.re,2) + (Math.pow(c.im,2))));
        return new Complexe(reelD, imD);
    }
    //méthode 2 de division
    /*public Complexe division2(Complexe z){
    return new Complexe(this.multiplier(z.inverse()));
    }*/
    public static Complexe additioner(Complexe a, Complexe b)
    {
          //Complexe c = a.addition(b);
        Complexe c = new Complexe(a.re + b.re, a.im + b.im);
          return c;
    }
    public double module()
    {
        return Math.sqrt(Math.pow(re, 2) + Math.pow(im, 2));
    }
    public double argument()
    {
        return Math.atan(im/re);
    }
    public Complexe mtp_scalaire(double sc)
    {
       return new Complexe(re * sc, im * sc);
    }
    // la méthode Inverse 
    public  Complexe inverse()
    {
        return new Complexe(re / (re*re+im*im), -im / (re*re+im*im));
    }
    public Complexe conjugue()
    {
        return new Complexe(re, -im);
    }
    public Complexe division2(Complexe a, Complexe b)
    {
      Complexe c = new Complexe(a.re, a.im);
      c.division(b);
      return c;
    }
    public Complexe exponentielle() {
        return new Complexe(Math.exp(re)*Math.cos(im),Math.exp(re)*Math.sin(im));
    }

    @Override
    public boolean equals(Object z)
    {
        if(z == null) return false;
        if (this.getClass() != z.getClass()) return false;
        Complexe autre = (Complexe) z;
        return (this.re == autre.re) && (this.im == autre.im);
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Donner le nombre reel");
        double ar = scan.nextDouble();
        System.out.println("Donner le nombre imaginaire");
        double ai = scan.nextDouble();
        Complexe a = new Complexe(ar, ai);
        Complexe b = new Complexe(5, 10);
        Complexe c = new Complexe(2,4);

        

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        Complexe sum = a.addition(b);
        System.out.println("Addition: " + a + " + " + b + " = " + sum);
        
        System.out.println("(("+c+") + ("+b+"))="+Complexe.additioner(c,b));
        System.out.println("(("+c+") - ("+b+"))="+c.soustraction(b));
        System.out.println("(("+c+") x ("+b+"))="+c.multiplication(b));
        System.out.println("(("+c+") / ("+b+"))="+c.division(b));
        System.out.println("Argument de "+b+"="+b.argument());
        System.out.println("Module "+b+"="+ b.module());
        System.out.println("Exponentielle " +b+"="+ b.exponentielle());
        System.out.println(b+" égualité "+c+" : "+b.equals(c));
      
        scan.close();
    }


}
