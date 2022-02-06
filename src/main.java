public class main {
    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        System.out.println("Общая сумма зароботка: " + earningsCount(text));
    }

    public static int earningsCount(String text) {
        String[] textDelim = text.split(",+");
        String rubles = "руб";
        int totalearnings = 0;

        for (int i = 0; i < textDelim.length; i++) {
            int end = textDelim[i].lastIndexOf(rubles);
            int start = 0;
            for (int c = 0; c < textDelim[i].length(); c++) {
                char symbol = textDelim[i].charAt(c);
                if (Character.isDigit(symbol)) {
                    start = c;
                    break;
                }
            }
            String result = textDelim[i].substring(start, end).trim();
            //System.out.println(result);
            totalearnings += Integer.parseInt(result);
        }
        return totalearnings;
    }
}
