
//Parent Class
import java.util.*;
public class Stats {
  //input method takes input in array from user
    void input(double [] array)
    {
        System.out.println("Please enter the arrays values : ");
        Scanner input = new Scanner(System.in);
        for(int i=0;i<array.length;i++)
        {
            array [i]= input.nextDouble();
        }
        // .sort is a built-in method which is used to sort an array in ascending order
        Arrays.sort(array);
    }
}
//child class of Stats Class
class Mean extends  Stats{
    //create a method which find the mean of the array
    double mean(double [] values)
    {
        double sum=0;
        int num = values.length;
        for(double a: values)
        {
            sum+=a;
        }
        double result = (sum/num);
        return result;
    }
}
// child class of Mean class
class Median extends Mean {
    // create a method which finds the median of the array
    double median(double[] values) {
        double result = 0;
        int num = (values.length);
        if(num%2 == 0)
        {
            double mid =(values[num/2] + values[num/2-1]);
             result = mid/2;
        }
        else
        {
            result = values[values.length/2];
        }
        return result;
    }
}
// Child class of median
class Mode extends Median {
    // create a method which finds the mode of the array
    double mode (double[] values){
        int count1=0;
        double maxvalue = 0;
        for (int i=0; i< values.length; i++)
        {
            int count = 0;
            for (int j =0; j< values.length; j++)
            {
                if (values[i] == values[j]) count++;
                if (count>count1){
                    count1= count;
                    maxvalue = values[i];
                }
            }
        }
        return maxvalue;
    }
}