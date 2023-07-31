/*Find Majority element (Boyer-Moore Majority vote Algorithm)
        Given an integer array containing duplicates, return the majority element if present. A majority element appears more than n/2 times, where n is the array size.
        For example, the majority element is 2 in array {2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2}.
        output: {2, 2, 2, 2, 2, 2}*/
//Solution
public class Find_Majority_Element {
    public static void main(String[] args) {
        int[] arr = {2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2};
        int sum = 0;
        int p = 0;
        boolean flag = false;
        for (int value : arr) {
            int c = 0;
            for (int i : arr) {
                if (value == i) {
                    c++;
                }

            }
            if (c >= (arr.length / 2)) {
                flag = true;
                for (int i : arr) {
                    if (i == value) {
                        sum++;
                    }

                }
                p = value;
                break;
            }
        }
        if (flag) {
            System.out.print("{");
            for (int l = 0; l < sum; l++) {
                System.out.print(p + ",");
            }
            System.out.print("}");
        }
    }
}