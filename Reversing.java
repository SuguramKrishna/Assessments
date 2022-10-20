import java.util.*;
public class Reversing {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String a = scan.next();
        int i=0;
        String b="";
        do {
           char ch = a.charAt(i) ;
           b= ch +b;
           i++;
        } 
        while (i<a.length());
        System.out.println(b);
        if(a==b){
            System.out.println("Palindrom");
        }
        else {
            System.out.println("No");
        }
        scan.close();
    }





}
