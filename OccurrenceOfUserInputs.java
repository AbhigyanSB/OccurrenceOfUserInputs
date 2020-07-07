/* This program will display the number of occurrence
 * of the integers provided by the user. */	

import java.util.Scanner; //importing the Scanner in Java

public class OccurrenceOfUserInputs {
	//Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //asking for the user input for the numbers
        int[] values = new int[100]; //creating an array with an index of 100
        int i=0; //initializing the variable "i"
        int count = 0; //initializing the variable "count"
        
        System.out.print("Please enter integers under 1 to 100 and please enter 0 when finished: "); //asking for the user input with the numbers under 1 and 100 and ending that with a "0"
        
        do { //creating a loop to store the numbers provided by the user
        	i = input.nextInt(); //storing the value of the numbers provided by the user in the integer "i"
            values[count] = i; //storing the numbers provided by the user as elements in the array "values"
            count++; //increasing the count by 1, each time
        }
        while  (i != 0); //the "do" loop will continue until and unless the user gives "0" as an input

        getAfterCount(values); //calling the method "getAfterCount(values)"
        input.close(); //closing the input
    }

    public static void getAfterCount(int[] list) { //creating the method "getAfterCount(int[] list)"
        for (int i = 1; i <= 100; i++) { //creating a loop for all the numbers stored in the array "values"
            int count = 0; //initializing the variable "count"
            for (int j = 0; j < list.length - 1; j++) { //creating a loop to detect a repeating number throughout the array "list"
                if (list[j] == i) { //creating a loop to find the repeated numbers
                    count++; //increasing the count of the repeated number by 1, each time
                }
            }
            if (count != 0) {
                System.out.printf("%d occurs %d %s \n", i, count, count > 1 ? "times" : "time");
            }
        }
    }
}