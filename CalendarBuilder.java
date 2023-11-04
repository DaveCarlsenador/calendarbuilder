package javaapplication149;
import java.util.Calendar;

public class CalendarBuilder {

    public static void main(String[] args) {
  // Set the year and month for the calendar
        int year = 2023;
        //Change to the desired year
        int month = Calendar.OCTOBER;
        // Change to the desired month (0 = January,1 = Febuary,...,11 = December)
        
        // Create a calendar instance and set the year and month
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        
        // Print the header with the month and year
        System.out.println("Calendar for " + calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, java.util.Locale.getDefault()) + " " + year); 
       System.out.println("Sun Mon Tue Wed Thu Fri Sat");
       
       // Set the calendar to the first day of the month
       calendar.set(Calendar.DAY_OF_MONTH, 1);
       
       // Get the day of the week for the first day of the month
       int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
       
       // Print leading spaces to align the first day properly
       for (int i = 1; i < dayOfWeek; i++) {
       System.out.print("  ");
        }
       // Get the maximum day of the month
       int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
       
       //Print the days of the month
       for (int day = 1; day <= maxDay; day++){
    System.out.printf("%3d ", day);
    if (dayOfWeek == Calendar.SATURDAY){
    System.out.println();
    }
    calendar.add(Calendar.DAY_OF_MONTH, 1);
    dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
      
  // Print a newline if the last row isn't complete
    if (dayOfWeek != Calendar.SUNDAY){
    System.out.println();   
        }
      }
    }
}