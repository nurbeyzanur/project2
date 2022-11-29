
package algoritmaprojeleri;
//klavyeden girilen n sayısına göre girilen 1 den n e kadar olan sayıların karelerini toplamı hesaplayan program

import java.util.Scanner;

public class proje14 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n,sonuc;
        
        System.out.println("Lütfen bir n değeri giriniz.");
        n =scan.nextInt();
        
        sonuc=n*(n+1)*(2*n+1)/6;
        System.out.println("İşlemin sonucu: "+sonuc);
    }
}
