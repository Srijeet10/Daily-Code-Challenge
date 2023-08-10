import java.util.Arrays;

/*Given an integer array, trim it such that its maximum element becomes less than twice the minimum, return the minimum number of removals required for the conversion.
        For example,
        Input:  [4, 6, 1, 7, 5, 9, 2]
        Output: The minimum number of removals is 4
        The trimmed array is [7, 5, 9] where 9 < 2 × 5.


        Input:  [4, 2, 6, 4, 9]
        Output: The minimum number of removals is 3
        The trimmed array is [6, 4] where 6 < 2 × 4.*/
//Solution Set
public class Dated_08_08_2023_Question_Set {
    public static void main(String[] args)  {
        Integer[] array =  {4, 6, 1, 7, 5, 9, 2};
      Arrays.sort(array);

    }
}
