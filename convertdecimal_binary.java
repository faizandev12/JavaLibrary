package JavaLibrary;
import java.util.Scanner;



public class convertdecimal_binary{
     public static int minEnsemble(int a)
   {
    int n = 0;
     while (a > Math.pow(2, n)) {
        n++;
     }
     return n;
   }
   public static int[] decimalBinaire(int a)
   {
         int n = minEnsemble(a);
         int[] binaire = new int[n]; // tableau de la taille minimum
          // Convertir le nombre en binaire
        int i = n - 1;
        while (a > 0) {
            binaire[i] = a % 2;
            a = a / 2;
            i--;
        } 
        return binaire;
   }
    
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Entrez une nombre decimale : ");
    int a = scanner.nextInt();
    int[] binaire = decimalBinaire(a);

    System.out.print("Le binaire de " + a + " est : ");
    for(int bit : binaire)
    {
        System.out.print(bit);
    }
    System.out.println();
    scanner.close();
 }
}