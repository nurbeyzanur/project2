//klavyeden girilen pozitif bir a tamsayısının tam bölenlerini hesaplayıp listeleyen program

package algoritmaprojeleri;

import java.util.Scanner;

public class proje19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         int n;
         
        System.out.println("Lütfen bir sayı giriniz:");
        n = scan.nextInt();
        
        for(int i=1; i<=n ; i++){
        if (n%i==0) {
            System.out.print(" "+i);            
           }        
        }
    }
    
}
