import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.sum;

public class getDigitsSum {
    public static void main(String[] args) {
        System.out.println(getDigitsSum(12345));
    }
     public static int getDigitsSum(int num) {
         String numString = Integer.toString(num);
         String [] numArray = numString.split("");
         int sum = 0;
         for (int i = 0; i < numArray.length; i++) {
             sum = sum + Integer.parseInt(numArray[i] );
         }
         return sum;
     }
        }

