import java.util.Scanner;

/*Given a number N. Count the number of digits in N which evenly divides N.

        Note :- Evenly divides means whether N is divisible by a digit i.e. leaves a remainder 0 when divided.

        Example 1:

        Input:
        N = 12
        Output:
        2
        Explanation:
        1, 2 both divide 12 evenly
        Example 2:

        Input:
        N = 23
        Output
        0
        Explanation:
        2 and 3, none of them
        divide 23 evenly*/

//Solution
public class digitsEvenlyDivide {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a =  sc.nextInt();
        int b=a;
        int count = 0;
        int c;
        while(b>0){
            c=b%10;
            if(a%c==0){
                count++;
            }
            b=b/10;
        }
        System.out.println(count);
    }
}
