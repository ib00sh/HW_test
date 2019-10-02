import java.util.Random;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
//        Random rand = new Random();
//        ArrayProcessor arrayProcessor = new ArrayProcessor();
//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = rand.nextInt(30 + 10) - 10;
//        }
//        display(array);
//        System.out.println("Your sum is: "+ arrayProcessor.countSumOfElementsOnEvenPositions(array));
//        arrayProcessor.multiplyByThreeEachPositiveElementStandingBeforeNegative(array);
//        display(array);
//        System.out.println (arrayProcessor.calculateDifferenceBetweenAverageAndMinElement(array));
//        display(array);
//        arrayProcessor.findSameElementsStandingOnOddPositions(array);
//        display(array);
//        arrayProcessor.swapMaxNegativeAndMinPositiveElements(array);
//        display(array);
//        arrayProcessor.replaceEachNegativeElementsWithZero(array);
//        display(array);

        StringProcessor stringProcessor = new StringProcessor();
        System.out.print("Specify amount of lines: ");

        Scanner sc1 = new Scanner(System.in);
        String str = sc1.nextLine();
        String[] arrayStr = new String[Integer.parseInt(str)];
        System.out.println("----------");
        for (int i = 0; i < arrayStr.length; i++) {
            System.out.print("Input line " + (i+1) + ") ");
             arrayStr[i] = sc1.nextLine();
        }
        sc1.close();
        display(arrayStr);
        System.out.println("----------");

        System.out.println("1) Shortest Line is - " + stringProcessor.findShortestLine(arrayStr));
        System.out.println("2) Longest Line is - " + stringProcessor.findLongestLine(arrayStr));
        System.out.print("3) Lines shorter than average length: - ");
        stringProcessor.findLinesShorterThanAverageLength(arrayStr);
        System.out.print("4) Lines longer than average length: - ");
        stringProcessor.findLinesLongerThanAverageLength(arrayStr);
        System.out.print("5) Word with minimum various characters: - ");
        System.out.println(stringProcessor.findWordWithMinimumVariousCharacters(arrayStr));
        System.out.print("6) Word contains only various characters: - ");
        System.out.println(stringProcessor.findWordConsistingOfVariousCharacters(arrayStr));
        System.out.print("7) Word contains only digits: - ");
        System.out.println(stringProcessor.findWordConsistingOfDigits(arrayStr));

}

    public static void display(String[] array){
        System.out.println("----------");
        System.out.print("Yours array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


}
