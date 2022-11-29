
package algoritmaprojeleri;
//klavyeden m den  n sayısı alınacak n sayısına göre tek sayıların toplamını bulduran program
import java.util.Scanner;

public class proje12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i,m,n,toplam;
        
        System.out.println("Lütfen başlangıç değeri giriniz");
        m=scan.nextInt();
        
        System.out.println("Lütfen bitiş değeri giriniz");
        n = scan.nextInt();
        toplam = 0;
        
        for ( i = m; i<=n; i++) {
            if(i%2==1){
              toplam=toplam +i;
             }
         
        }
         System.out.print("m-n tek sayılar toplamı: "+toplam);
    }
}
