/*A byte is an 8-bit signed integer.
    A short is a 16-bit signed integer.
    An int is a 32-bit signed integer.
    A long is a 64-bit signed integer.
Given an input integer, you must determine which primitive data types are capable of properly storing that input

-150 can be fitted in:
        * short
        * int
        * long
        150000 can be fitted in:
        * int
        * long
*/

package CodingPractice;

import java.util.*;

public class PrimitiveDataTypes {
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {

            try
            {
                long number=sc.nextLong();
                System.out.println(number+" can be fitted in:");
                if(number >=Byte.MIN_VALUE && number<=Byte.MAX_VALUE)
                    System.out.println("* byte\n"+"* short\n"+"* int\n"+"* long");
                else if(number >=Short.MIN_VALUE && number<=Short.MAX_VALUE)
                    System.out.println("* short\n"+"* int\n"+"* long");
                else if(number >=Integer.MIN_VALUE && number<=Integer.MAX_VALUE)
                    System.out.println("* int\n"+"* long");
                else if(number >=Long.MIN_VALUE && number<=Long.MAX_VALUE)
                    System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }

}
