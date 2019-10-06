import java.util.Scanner;



public class ViewStringPorcessor {
    private String[] arrayStr;

    public String[] inputArray(){
        System.out.print("Specify amount of lines: ");
        Scanner sc1 = new Scanner(System.in);
        String str = sc1.nextLine();
        arrayStr = new String[Integer.parseInt(str)];
        System.out.println("----------");
        for (int i = 0; i < arrayStr.length; i++) {
            System.out.print("Input line " + (i+1) + ") ");
            arrayStr[i] = sc1.nextLine();
       }
        sc1.close();
        display(arrayStr);
        System.out.println("----------");
        return arrayStr;
    }


    public String[] getResult(StringProcessor stringProcessor){
        System.out.println("1) Shortest Line is - " + stringProcessor.findShortestLine(arrayStr)
         +" (length is " + stringProcessor.findShortestLine(arrayStr).length() + ") ");
        System.out.println("2) Longest Line is - " + stringProcessor.findLongestLine(arrayStr)
        +" (length is " + stringProcessor.findLongestLine(arrayStr).length() + ") ");
        System.out.print("3) Lines longer than average length: - ");
        stringProcessor.findLinesLongerThanAverageLength(arrayStr);
        System.out.print("4) Lines shorter than average length: - ");
        stringProcessor.findLinesShorterThanAverageLength(arrayStr);
        System.out.print("5) Word with minimum various characters: - ");
        System.out.println(stringProcessor.findWordWithMinimumVariousCharacters(arrayStr));
        System.out.print("6) Word contains only various characters: - ");
        System.out.println(stringProcessor.findWordConsistingOfVariousCharacters(arrayStr));
        System.out.print("7) Word contains only digits: - ");
        System.out.println(stringProcessor.findWordConsistingOfDigits(arrayStr));
        return arrayStr;

    }

    private static void display(String[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }
}

