
package algoritmaprojeleri;
 //klavyeden metre cinsinden girilen uzunluğu ,seçilen birime dönüştüren program
import java.util.Scanner;

   public class proje15 {
       public static void main(String[] args) {               
       Scanner scan=new Scanner(System.in);
         float a,b;
             int sec;
             
           System.out.println("Lütfen metre cinsinden bir sayı giriniz:");
           a =  scan.nextFloat();
           
           System.out.println("\ndönüştürme\n1-mm\n2-cm\n3-dm\n4-km\n");
           System.out.println("\nSeçiminiz");
           sec=scan.nextInt();
           switch(sec){
           case 1:{b=1000*a;break;}
           case 2:{b=100*a;break;}
           case 3:{b=10*a;break;}
           case 4:{b=a /1000*a;break;}
           default:{b=0;break;}
           }
           System.out.print(b);
       }
       
 }              