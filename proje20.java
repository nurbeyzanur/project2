//klavyeden eleman sayısı girilen bir kümenin belirtilen  kombinasyonlarının sayısını hesaplayan program
package algoritmaprojeleri;

import java.util.Scanner;

public class proje20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,r;
        int n1=1,r1=1,a=1,k,c;
        
        System.out.println("Lütfen n değerini giriniz: ");
        n = scan.nextInt();
        
        System.out.println("Lütfen r değerini giriniz: ");
        r = scan.nextInt();
        
    
        for(int i=1;i<=n;i++){            
        n1*=i;
        
        if (i <=r) 
         r1*=i ;                
        c=n-r;
       if (i<=c)
           a*=i;           
        }
            k =n1/(r1*a);
        System.out.println(k);
    }
}
    
     
    

