
package algoritmaprojeleri;
//klavyeden üç kenarı girilen üçgenin eşkenar,ikizkenar veya çeşitkenar olduğunu bulduran program

import java.util.Scanner;

public class proje11 {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
         int a,b,c;
         System.out.println("Lütfen üçgenin 1.kenarını giriniz:");
         a= input.nextInt();
         
         System.out.println("Lütfen üçgenin 2. kenarını giriniz:");
         b =input.nextInt();
         
         System.out.println("Lütfen üçgenin 3. kenarını giriniz:");
         c =input.nextInt();
         if(a==b&&b==c){
             System.out.println("Girdiğiniz bilgier eşkenar üçgene aittir.");             
         }
         else if(a==b&&a!=c ||a==c&&a!=b ||b==c&&b!=a){
             System.out.println("Grdiğiniz bilgiler ikizkenar üçgene aittir.");
         }
         else {
             System.out.println("Girdiğiniz bilgile çeşitkenar üçgene aittir.");
         }
    }
    
}
