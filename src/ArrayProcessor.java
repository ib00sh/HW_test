public class ArrayProcessor {
    public int[] swapMaxNegativeAndMinPositiveElements(int[] input) {
        int max = input[0], min = input[0];
        int maxPos = 0, minPos = 0;
        for (int i = 1; i < input.length; i++) {
            if (max > input[i]) {
                max = input[i];
                maxPos = i;
            }
            if (min < input[i]) {
                min = input[i];
                minPos = i;
            }
        }

        int swap = input[maxPos];
        input[maxPos] = input[minPos];
        input[minPos] = swap;
        return input;
    }

    public int countSumOfElementsOnEvenPositions(int[] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 0) {
                sum += input[i];
            }
        }
        return sum;
    }
    public int[] replaceEachNegativeElementsWithZero(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] < 0) {
                input[i] = 0;
            }
        }
        return input;
    }
    public int[] multiplyByThreeEachPositiveElementStandingBeforeNegative(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] < 0) {
                if(i ==0){
                    input[i]*=3;
                }
                else {
                    input[i - 1] *= 3;
                }
            }
        }
        return input;
    }

    public float calculateDifferenceBetweenAverageAndMinElement(int[] input) {
            int min = input[0];
            for (int i = 0; i < input.length; i++) {
                if (input[i] < min) {
                    min = input[i];
                }
            }
            return min;
    }

    public int[] findSameElementsStandingOnOddPositions(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (i % 2 == 0){
                System.out.print(" " + input[i] + " ,");
            }
        }
        System.out.println();
        return input;
    }
}
