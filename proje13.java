
package algoritmaprojeleri;
//klavyeden girilen iki pozitif tam sayıyı çarpma oporatörü kullanmadan çarpan program

import java.util.Scanner;

public class proje13 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        
        int i,sayi1,sayi2;
        int toplam =0;
        System.out.println("Lütfen ilk sayıyı giriniz:");
        sayi1= scan.nextInt();
        
        System.out.println("Lütfen ikinci sayıyı giriniz.");
        sayi2= scan.nextInt();
        
        for(i=0;i<sayi2;i++){
            toplam+=sayi1;                        
        }
        System.out.println("sonuç: "+toplam);
    }
            
    
}
