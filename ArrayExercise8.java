public class ArrayExercise8 {

    /*
     * Takes an array of integers and two indexes, lowIndex and highIndex,
     * and finds the maximum value in the array, but only considering the
     * elements between lowIndex and highIndex, including both.
     */
    public static int maxInRange(int[] integers, int lowIndex, int highIndex) {
        int max = integers[0];
        if (lowIndex == highIndex) {
            max = maxInRange(integers, 0, integers.length);
        }
        for (int i = lowIndex; i <= highIndex; i++) {
            if (integers[i] > max) {
                max = integers[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {197, 8, 3, 24, 17, 198, 200, 150, 120, 140};
        int a = maxInRange(arr, 5, 6);
        System.out.println("max = " + a);
    }
}
