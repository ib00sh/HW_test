public class StringProcessor {
    /**
     *  Useful methods for string processing
     */
        public String findShortestLine(String[] lines) {
            String shorestLine = lines[0];
            for(int i = 0; i < lines.length ; i++)
            {
                if (lines[i].length() < shorestLine.length())
                {
                    shorestLine = lines[i];
                }
            }
            return shorestLine + " (length is " + shorestLine.length() + ")";
        }

        public String findLongestLine(String[] lines) {
            String longestLine = lines[0];
            for (int i = 0; i < lines.length; i++) {
                if(lines[i].length() > longestLine.length()){
                    longestLine = lines[i];
                }
            }
            return longestLine + " (length is " + longestLine.length() + ")";
        }

        public String[] findLinesShorterThanAverageLength(String[] lines) {
            int averageLength = getAverageLength(lines);
            for (int i = 0; i < lines.length ; i++) {
                if (lines[i].length() < averageLength){
                    System.out.print(lines[i] + " (length is " + lines[i].length() + ") \n");
                }
            }
            return  lines;
        }

    public int getAverageLength(String[] lines) {
        int sum = 0;
        int averageLength;
        for (int i = 0; i < lines.length; i++) {
            sum += lines[i].length();
        }
        averageLength = sum / lines.length;
        return averageLength;
    }

    public String[] findLinesLongerThanAverageLength(String[] lines) {
        int averageLength = getAverageLength(lines);
        for (int i = 0; i < lines.length ; i++) {
                if (lines[i].length() > averageLength){
                    System.out.print(lines[i] + " (length is " + lines[i].length() + ") \n");
                }
            }
            return  lines;
        }

        /**
         * Find word with minimum various characters. Return first word if there are a few of such words.
         * @param words Input array of words
         * @return First word that consist of minimum amount of various characters
         */
        public String findWordWithMinimumVariousCharacters(String[] words) {
            String minVariousCh = null;
            for (int i = 1; i < words.length; i++) {
                if (words[i-1].length() > words[i].chars().distinct().count() ) {
                    minVariousCh = words[i-1];
                    break;
                }
            }
            return minVariousCh;
        }

        /**
         * Find word containing only of various characters. Return first word if there are a few of such words.
         * @param words Input array of words
         * @return First word that containing only of various characters
         */
        public String findWordConsistingOfVariousCharacters(String[] words) {
            String onlyVariousCh = null;
            for (int i = 0; i < words.length; i++) {
                if (words[i].length() == words[i].chars().distinct().count() ) {
                    onlyVariousCh = words[i];
                    break;
                }
            }
            return onlyVariousCh;
        }

        /**
         * Find word containing only of digits. Return second word if there are a few of such words.
         * @param words Input array of words
         * @return Second word that containing only of digits
         */
        public String findWordConsistingOfDigits(String[] words) {
            int position = 2;
            String digitalValueStr = null;
            for (int i = 0; i < words.length; i++) {
                try {
                    int tryInt = Integer.parseInt(words[i]);
                    if(--position > 0){
                        continue;
                    }
                    digitalValueStr = String.valueOf(tryInt);
                }
                catch (NumberFormatException ex){
                }
            }
            return digitalValueStr;
        }

}
