import java.util.ArrayList;
import java.util.List;

/*Given an integer array, find all distinct combinations of a given length k, where the repetition of elements is allowed.
        For example,
        Input:  {1, 2, 3}, k = 2
        Output: {1, 1}, {1, 2}, {1, 3}, {2, 2}, {2, 3}, {3, 3}

        Input:  {1, 2, 3, 4}, k = 2
        Output: {1, 1}, {1, 2}, {1, 3}, {1, 4}, {2, 2}, {2, 3}, {2, 4}, {3, 3}, {3, 4}, {4, 4}

        Input:  {1, 2, 1}, k = 2
        Output: {1, 1}, {1, 2}, {2, 2}*/
public class makeAllTheCombinations {
    public static void main(String[] args) {
        List<Integer[]> list = new ArrayList<Integer[]>();
        Integer[] arr = {1, 2, 3, 4};
        int k = 2;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                Integer[] used = new Integer[k];
                used[0] = arr[i];
                for (int k2 = 1; k2 <= used.length - 1; k2++) {
                    used[k2] = arr[j];
                }
                list.add(used);

            }
        }
            for (Integer[] array :
                    list) {
                for (int a :
                        array) {
                    System.out.print(a);
                }
                System.out.println();
            }

    }
}