package lab04;

public class SimpleArrayMethods {
    public static void main(String[] args){
        int[] data1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(countEven(data1));
        System.out.println(countAboveAverage(data1));
        System.out.println(countNegativeNumbers(data1));
        System.out.println(countPositiveNumbers(data1));
        System.out.println(findLargest(data1));
        System.out.println(findSmallest(data1));
    }

        private static int countEven(int[] array1){
            int evenCount = 0;
            for(int i : array1) {
                if(i%2 == 0){
                    evenCount++;
                }
            }
            return evenCount;
    }

    /**
     * <p>
     *     This method counts the total number of integers in
     *     an array that is greater than its average.
     * </p>
     *
     * @param array1 an array of integers.
     * @return the count of integers greater than the average.
     */
    private static int countAboveAverage(int[] array1) {
        int total = 0;
        double average = 0;
        int aboveAverage = 0;
        for(int i : array1) {
            total += i;
        }
        average = total / array1.length;
//        System.out.println("Average: " + average);

        for(int i : array1){
            if( i > average) {
                aboveAverage++;
            }
        }
        return aboveAverage;
    }

    /**
     * This method finds any negative numbers in the array and returns them
     * @param array1 an array of numbers
     * @return a count of the negative numbers
     */
    private static int countNegativeNumbers(int[] array1){
        int negativeCount = 0;
        for (int i: array1) {
            if (i < 0) {
                negativeCount++;
            }
        }
        return negativeCount;
    }

    /**
     * This method counts the total number of positive numbers in the array
     * @param array1 an array of numbers
     * @return the count of positive numbers
     */
    private static int countPositiveNumbers(int[] array1) {
        int positiveCount = 0;
        for (int i : array1) {
            if (i >= 0) {
                positiveCount++;
            }
        }
        return positiveCount;
    }

    /**
     * This method finds the largest number in an array
     * @param array1 an array of numbers
     * @return the largest number in the array
     */
    private static int findLargest(int[] array1) {
        int largest = array1[0];
        for(int i : array1){
            if(i > largest){
                largest = i;
            }
        }
        return largest;
    }


    /**
     * This method finds the smallest number in an array
     * @param array1 an array of numbers
     * @return the smallest number in the array
     */
    private static int findSmallest(int[] array1) {
        int smallest = array1[0];
        for(int i : array1){
            if(i < smallest){
                smallest = 1;
            }
        }
        return smallest;
    }
}
