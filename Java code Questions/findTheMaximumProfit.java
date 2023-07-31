/*Find maximum profit earned by buying and selling shares any number of times
        Given a list containing future prediction of share prices, find the maximum profit earned by buying and selling shares any number of times with the constraint, a new transaction can only start after the previous transaction is complete, i.e., we can only hold at most one share at a time.
        For example:
        Stock Prices: {1, 5, 2, 3, 7, 6, 4, 5}

        Total profit earned is 10

        Buy on day 1 and sell on day 2
        Buy on day 3 and sell on day 5
        Buy on day 7 and sell on day 8


        Stock Prices: {10, 8, 6, 5, 4, 2}

        Total profit earned is 0*/

//Solution
public class findTheMaximumProfit {
    public static void main(String args[]){
        int sum =0;
        int arr[] = {1, 2, 25, 75, 100, 6,4,5};
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
              sum = sum+(arr[i+1]-arr[i]);
            }
        }
        System.out.println(sum);
    }
}
