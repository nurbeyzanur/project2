
package algoritmaprojeleri;
//klavyeden girilen pozitif bir tam sayının tersten yazılmış sayısal değerini elde eden program

import java.util.Scanner;

public class proje17 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n;
        
        System.out.println("Lütfen bir tam sayı giriniz.");
        n=scan.nextInt();
        
           System.out.println("Girdiğiniz sayinin tersten yazılışı:");
        while(n>0) {            
            System.out.print(n % 10);
          n/= 10;
        }
    }
}
