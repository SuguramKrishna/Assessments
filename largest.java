import javax.annotation.processing.SupportedOptions;

public class largest {
    public static void main(String[] args) {
        
        int a = 4;
        int b = 5;
        int c = 2;

        if(a>b && a>c){
            System.out.println("Is the largest number amoung the three " +a);
        }

        else if(b>c){
            System.out.println("Is the largest number amoung the three "+b);
        }

        else{
            System.out.println("Is the largest number amoung the three "+c);
        }
        

    }
}
