public class ArrayProcessor {
    public int[] swapMaxNegativeAndMinPositiveElements(int[] input) {
        int maxNegative = Integer.MIN_VALUE;
        int minPositive = Integer.MAX_VALUE;
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < input.length; i++) {
            if ((input[i] < 0) && (maxNegative < input[i])) {
                maxNegative = input[i];
                positive = i;
            }
            if ((input[i] > 0) && (minPositive > input[i])) {
                minPositive = input[i];
                negative = i;
            }
        }
        int swap = input[negative];
        input[negative] = input[positive];
        input[positive] = swap;
        return input;
    }

    public int countSumOfElementsOnEvenPositions(int[] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            if (i % 2 == 0) {
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
        for (int i = 0; i < input.length-1; i++) {
            if (input[i] > 0 && input[i+1] < 0) {
                //перпроверить if
                if(i ==0){
                    input[i]*=3;
                }
                else {
                    input[i] *= 3;
                }
            }
        }
        return input;
    }

    public float calculateDifferenceBetweenAverageAndMinElement(int[] input) {
        int sum = 0;
        float average;
        int min = input[0];
        for (int i = 0; i < input.length; i++) {
           sum += input[i];
        }
        average = (float) sum / input.length;
        for (int i = 0; i < input.length; i++) {
         if (input[i] < min) {
             min = input[i];
         }
    }
    float difference = average - min;
    return difference;
    }



    public int[] findSameElementsStandingOnOddPositions(int[] input) {
        int temp;
        for (int i = 0; i < input.length; i++) {
            temp = input[i];
            for (int j = i + 1; j < input.length ; j++) {
                if (((i % 2 != 0) && (j % 2 != 0) && (input[j] == temp)) ||
                      ((i % 2 == 0) && (j % 2 != 0) && (input[j] == temp)) ||
                      ((i % 2 != 0) && (j % 2 == 0) && (input[j] == temp))) {
                    System.out.print("\t" + temp);
                    j++;
                    i++;
                }
            }
        }
        System.out.println();
        return input;
    }
}
