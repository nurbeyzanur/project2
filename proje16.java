package algoritmaprojeleri; 
    //klavyeden girilen x sayısına göre x*2-5x+3 hesaplayan program
import java.util.Scanner;

      public class proje16 {
        public static void main(String[] args) {
             Scanner scan = new Scanner(System.in);
             int x,cevap;
                   
             System.out.println("Lütfen bir x değeri giriniz");
              x = scan.nextInt();                    
                cevap = x*x-5*x+3;                    
               
                if (cevap<0){
                    System.out.println("-1");
                  }
                else if(cevap>0){
                    System.out.println("1");                    
                  }
                else 
                    System.out.println("0");
                    
        }
        
}
