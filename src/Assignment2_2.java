import java.util.Scanner;

public class Assignment2_2 {
    public static void main(String[] args) {
        String[] monthNames = {"January", "February", "March", "April", "May", 
            "June", "July", "August", "September", "October", "November", 
            "December"};
        
        System.out.println("Given a year and a month in that year, this " 
            + "program will tell you the number of days in that month.");
        
        // get input year
        System.out.println("Enter a year:");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        
        // get input month
        System.out.println("Enter a value for the month(1 = Jan, 2 = Feb, " 
            + "etc):");
        int month = input.nextInt();
        input.close();

        // check if month is valid
        if (month < 1 || month > 12) {
            System.out.println(month + " is invalid. Month values must be " 
                + "between 1 and 12, inclusive.");
        } else {
            // determine number of days in that month and output results
            int days;

            // first check leap year
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) 
                || (year % 400 == 0);
            
            if(isLeapYear && month == 2) {
                days = 29;
            } else {
                switch(month) {
                    case 4: case 6: case 9: case 11:
                        days = 30;
                        break;
                    case 2:
                        days = 28;
                        break;
                    default:
                        days = 31;
                        break;
                }
            }

            // display results
            System.out.println(monthNames[month - 1] + " of " + year + " has " 
                + days + " days in it.");
        }

        System.out.println("Goodbye...");
    }
}