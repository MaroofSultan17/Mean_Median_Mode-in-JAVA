/*
Find Mean, Median and mode in Java. Using Multi_level Inheritance.
*/
import java.util.Arrays;
import java.util.Scanner;

public class Mean_Solution {
    public static void main(String[] args) {

        // Scanner for parsing
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of Array : ");

        // input and paring
        int size = input.nextInt();

        // defining and declaring array
        double [] array = new double[size];

        /*
        Note:  we can access parent class members or methods using child class object
               but we can't access child class members or methods using parent class object.
         */
        // Calling the Constructor of Mode Class and defining the object
        Mode s = new Mode();
        // it is the method of Input Class which takes input in arrays by user
        s.input(array);
        // s.mode(array) is the method of mode Class which find the mode
        double mode = s.mode(array);
        if(mode>1)
        {
            System.out.println("Mode is : " + mode);
        }
        else
        {
            System.out.println("NO mode : " + Arrays.toString(array));
        }
        //  s.mean(array) is the method of Mean Class which find the means val
        System.out.println("Mean of Array : " + s.mean(array));
        //  s.median(array) is the method of median Class which find the median
        System.out.println("Median of Array : " + s.median(array));
    }
}
