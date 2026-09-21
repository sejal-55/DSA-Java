public class FindSecondLargest {
    public static void main(String[] args) {

        int[] arr = {10, 25, 7, 40, 18};

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num > second && num != largest) {
                second = num;
            }
        }

        System.out.println("Second largest = " + second);
    }
}
