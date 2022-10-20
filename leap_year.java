public class leap_year{
    public static void main(String[] args) {
        int year = 2002;

        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){
            System.out.println("The given year is the leap year");
        }
        else{
            System.out.println("The given year is not a leap year");
        }
    }
}