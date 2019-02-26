/*
 * Cody Boullt
 * 02/06/2019
 */

import java.util.Scanner;

public class TwelveDays
{
	public static void main(String[] args)
	{
		// new scanner for user input
		Scanner input = new Scanner( System.in );
		
		// declarations
		int userDay = 0;
		String messageDay = "";
		String messageSong = "";
		
		// header
		System.out.print( "\n--------Twelve Days of Christmas Lyrics--------\n" );
		
		// while-loop until user quits
		while ( userDay != -1)
		{			
			// prompt for input and store as userDay
			System.out.print( "\nEnter a day from 1-12 (12 to see the entire song, -1 to quit)\n" );
			userDay = input.nextInt();
			
			// validate input
			if ( userDay > 0 && userDay < 13 )
			{
				// switch for day of Christmas
				switch (userDay) {
	            case 1:  messageDay = "first";
	            	break;
	            case 2:  messageDay = "second";
	        		break;
	            case 3:  messageDay = "third";
	            	break;
	            case 4:  messageDay = "fourth";
	            	break;
	            case 5:  messageDay = "fifth";
	            	break;
	            case 6:  messageDay = "sixth";
	            	break;
	            case 7:  messageDay = "seventh";
	            	break;
	            case 8:  messageDay = "eighth";
	            	break;
	            case 9:  messageDay = "ninth";
	            	break;
	            case 10: messageDay = "tenth";
	            	break;
	            case 11: messageDay = "eleventh";
	            	break;
	            case 12: messageDay = "twelfth";
	            	break;
	            default: break;
	        } // end switch
				
				// print day of Christmas
				System.out.printf( "\nOn the %s day of Christmas, my true love gave to me:\n", messageDay );
				
				// switch to print lyrics for that day and falls through to previous days
				switch (userDay) {
	            case 12:  messageSong = "Twelve drummers drumming,\n";
	            	System.out.print( messageSong );
	            case 11:  messageSong = "Eleven pipers piping,\n";
            		System.out.print( messageSong );
	            case 10:  messageSong = "Ten lords-a-leaping,\n";
            		System.out.print( messageSong );
	            case 9:  messageSong = "Nine ladies dancing,\n";
	            	System.out.print( messageSong );
	            case 8:  messageSong = "Eight maids-a-milking,\n";
            		System.out.print( messageSong );
	            case 7:  messageSong = "Seven swans-a-swimming,\n";
            		System.out.print( messageSong );
	            case 6:  messageSong = "Six geese-a-laying,\n";
            		System.out.print( messageSong );
	            case 5:  messageSong = "Five golden rings.\n";
            		System.out.print( messageSong );
	            case 4:  messageSong = "Four calling birds,\n";
            		System.out.print( messageSong );
	            case 3:  messageSong = "Three French hens,\n";
            		System.out.print( messageSong );
	            case 2:  messageSong = "Two turtle doves, and\n";
            		System.out.print( messageSong );
	            case 1:  messageSong = "a Partridge in a pear tree.\n";
            		System.out.print( messageSong );
	            default: break;
              
	        } // end switch
          
			} // end if
      
		} // end while
    
	} // end main
  
} // end class TwelveDays
