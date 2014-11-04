/**
 * @author Derek Wider
This Program prints:
-The day 100 days from today
-the weekday of this particular date
-my birthday (10/27/1997)
-The weekday of my birthday
-The day 10000 days from my birthday
 */
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarClass {
	public static void main(String[] args) {
		GregorianCalendar cal = new GregorianCalendar(); //create a new Gregorian Calendar called cal, uses system date and time
		cal.add(Calendar.DAY_OF_MONTH, 100); //add 100 days to the current date
		
		int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH); //create a new int that gets the day of the month
		int month = (cal.get(Calendar.MONTH)) + 1; //create a new int that gets the month of the year, adds 1 to it (starts at 0)
		int year = cal.get(Calendar.YEAR); //creates a new int that gets the year
		int weekday = cal.get(Calendar.DAY_OF_WEEK); //creates a new int that gets the weekday
		String weekdayWordString = getWeekday(4); //creates a string to hold the value of getWeekday(), which returns a day of the week in words
		
		System.out.println("The day 100 days from today would be: " + month + "/" + dayOfMonth + "/" + year); //prints the day in month/day/year format
		System.out.println("The Weekday of this day would be: " + weekdayWordString); //prints the day of the week
		
		GregorianCalendar birthday = new GregorianCalendar(1997, Calendar.OCTOBER, 27); //create a new Gregorian Calendar called birthday, pass it the parameters of my birthday
		weekday = birthday.get(Calendar.DAY_OF_WEEK); //set the int for weekday to the new value from this calendar
		month = (birthday.get(Calendar.MONTH)) + 1; //sets the int for month to the new value from this calendar
		year = birthday.get(Calendar.YEAR); //sets the int for year to the new value from this calendar
		dayOfMonth = birthday.get(Calendar.DAY_OF_MONTH); //sets the int for day of month to the new value from this calendar 
		weekdayWordString = getWeekday(weekday); //weekdayWordString is given the value of the new weekday, from the getWeekday() method 
		
		System.out.println("\nMy birthday is: " + month + "/" + dayOfMonth + "/" + year); //prints my birthday
		System.out.println("The day of the week of my birthday is: " + weekdayWordString); //prints the day of the week of my birthday (Monday)
		
		birthday.add(Calendar.DAY_OF_YEAR, 10000); //adds 10000 days to my birthday date
		month = (birthday.get(Calendar.MONTH)) + 1; //sets the month equal to this new date
		year = birthday.get(Calendar.YEAR); //sets the year equal to this new date
		dayOfMonth = birthday.get(Calendar.DAY_OF_MONTH); //sets the day of the month equal to this new date
		
		System.out.println("\nThe day 10000 days from my birthday is: " + month + "/" + dayOfMonth + "/" + year); //prints the date for my birthday + 10000 days
		
	}
	/**
	 * 
	 * @param weekday is a int between 1 and 7, where 1 is Sunday and 7 is Saturday
	 * @return Returns the corresponding weekday, in words as a string, depending on the input of weekday
	 */
	private static String getWeekday(int weekday){ //creates a new method that takes an int as an argument
		String weekdayWord = null; 
		if(weekday == 1){
			weekdayWord = "Sunday";
		}
		else if(weekday == 2){
			weekdayWord = "Monday";
		}
		else if(weekday == 3){
			weekdayWord = "Tuesday";
		}
		else if(weekday == 4){
			weekdayWord = "Wednesday";
		}
		else if(weekday == 5){
			weekdayWord = "Thursday";
		}
		else if(weekday == 6){
			weekdayWord = "Friday";
		}
		else if(weekday == 7){
			weekdayWord = "Saturday"; //case statement, if weekday is equal to one of the above values, it sets a string equal to the corresponding day 
		}
		else if(weekday <= 0 || weekday > 7){
			throw new IllegalArgumentException("Must be an int between 1 and 7");
		}
		return weekdayWord; //returns the string containing the corresponding weekday
	}


}
