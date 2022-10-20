import java.util.Scanner;

public class StringInteger {

    public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            for(int i=0; i<3; i++){
                String str = scan.next();
                int intgr = scan.nextInt();
                System.out.printf("%-15s %03d %n",str,intgr);
            }

            scan.close();
    }
}





















