public class Runner {
    public static void main(String[] args) {

       StringProcessor stringProcessor = new StringProcessor();
       ViewStringPorcessor viewStringPorcessor = new ViewStringPorcessor();
       viewStringPorcessor.inputArray();
       viewStringPorcessor.getResult(stringProcessor);




//        ArrayProcessor arrayProcessor = new ArrayProcessor();
//        int[] array = new int[]{-4,4,8,0,-5,1,8,5,2,7,5,5,6,0,7,-1,-7,-6,-2,9};
//        int[] arrayCopy = new int[array.length];
//        int[] arrayCopy2 = new int[array.length];
//        int[] arrayCopy3 = new int[array.length];
//        int[] arrayCopy4 = new int[array.length];
//
//
//        System.out.println("Original array: ");
//        display(array);
//        System.arraycopy(array,0,arrayCopy,0,array.length);
//        System.arraycopy(array,0,arrayCopy2,0,array.length);
//        System.arraycopy(array,0,arrayCopy3,0,array.length);
//        System.arraycopy(array,0,arrayCopy4,0,array.length);
//        System.out.println("1) Exchange max negative and min positive elements: ");
//        arrayProcessor.swapMaxNegativeAndMinPositiveElements(array);
//        display(array);
//        System.out.println("2) Sum of elements on even positions: " +
//        arrayProcessor.countSumOfElementsOnEvenPositions(array));
//        System.out.println("3) Replace negative values with 0");
//        arrayProcessor.replaceEachNegativeElementsWithZero(arrayCopy);
//        display(arrayCopy);
//        System.out.println("4) Multiply by 3 each positive element standing before negative one");
//        arrayProcessor.multiplyByThreeEachPositiveElementStandingBeforeNegative(arrayCopy2);
//        display(arrayCopy2);
//        System.out.println("5) Difference between average and min element in array:");
//        System.out.println (arrayProcessor.calculateDifferenceBetweenAverageAndMinElement(arrayCopy3));
//        System.out.println("6) Elements which present more than one time and stay on odd index");
//        arrayProcessor.findSameElementsStandingOnOddPositions(arrayCopy4);


//        StringProcessor stringProcessor = new StringProcessor();
//        System.out.print("Specify amount of lines: ");
//
//        Scanner sc1 = new Scanner(System.in);
//        String str = sc1.nextLine();
//        String[] arrayStr = new String[Integer.parseInt(str)];
//        System.out.println("----------");
//        for (int i = 0; i < arrayStr.length; i++) {
//            System.out.print("Input line " + (i+1) + ") ");
//             arrayStr[i] = sc1.nextLine();
//        }
//        sc1.close();
//        display(arrayStr);
//        System.out.println("----------");
//
//        System.out.println("1) Shortest Line is - " + stringProcessor.findShortestLine(arrayStr));
//        System.out.println("2) Longest Line is - " + stringProcessor.findLongestLine(arrayStr));
//        System.out.print("3) Lines shorter than average length: - ");
//        stringProcessor.findLinesShorterThanAverageLength(arrayStr);
//        System.out.print("4) Lines longer than average length: - ");
//        stringProcessor.findLinesLongerThanAverageLength(arrayStr);
//        System.out.print("5) Word with minimum various characters: - ");
//        System.out.println(stringProcessor.findWordWithMinimumVariousCharacters(arrayStr));
//        System.out.print("6) Word contains only various characters: - ");
//        System.out.println(stringProcessor.findWordConsistingOfVariousCharacters(arrayStr));
//        System.out.print("7) Word contains only digits: - ");
//        System.out.println(stringProcessor.findWordConsistingOfDigits(arrayStr));

//        Calculator calculator = new Calculator();
//        Scanner sc1 = new Scanner(System.in);
//        String str;
//        Double a;
//        Double b;
//        Boolean flag = true;
//        while (flag == true) {
//        System.out.println("Enter the first number: ");
//        str = sc1.nextLine();
//        a = Double.parseDouble(str);
//        System.out.println("Enter the second number: ");
//        str = sc1.nextLine();
//        b = Double.parseDouble(str);
//        System.out.println("Enter operator (+, -, *, /):");
//        str = sc1.nextLine();
//            switch (str) {
//                case "+":
//                    System.out.println("Result:\t" + calculator.add(a, b));
//                    break;
//                case "-":
//                    System.out.println("Result:\t" + calculator.subtract(a, b));
//                    break;
//                case "*":
//                    System.out.println("Result:\t" + calculator.multiply(a, b));
//                    break;
//                case "/":
//                    System.out.println("Result:\t" + calculator.div(a, b));
//                    break;
//                default:
//                    //Если человек не ввел операции
//            }
//            System.out.println("Do you want to continue? (Y/N)");
//            str = sc1.nextLine();
//            if (str.equalsIgnoreCase("Y")){
//                flag = true;
//            } else if ((str.equalsIgnoreCase("N"))) {
//                flag = false;
//                System.out.println("Bye");
//            } else {
//                System.out.println("Wrong character!");
//            }
//        }


//}
////
//    public static void display(int[] array){
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("\t" + array[i] + " ");
//        }
//        System.out.println();
//    }
//public static void display(String[] array){
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + "\t");
//        }
//        System.out.println();
//    }
    }
}
