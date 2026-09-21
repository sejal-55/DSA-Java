import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 20, 40};

        int n = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean found = false;

            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    found = true;
                    break;
                }
            }

            if (!found)
                arr[n++] = arr[i];
        }

        System.out.println(Arrays.toString(Arrays.copyOf(arr, n)));
    }
}
