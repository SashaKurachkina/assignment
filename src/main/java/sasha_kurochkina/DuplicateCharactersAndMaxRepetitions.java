package sasha_kurochkina;

public class DuplicateCharactersAndMaxRepetitions {
    public static void main(String[] args) {
        String str = "Extraordinarily-energetic, hyper-intelligent researchers persistently## investigate electroencephalography, neurophysiology, and telecommunications-related discoveries                                                                                         .";
        char[] chars = str.toLowerCase().toCharArray();
        boolean[] checked = new boolean[chars.length];
        int duplicateSymbolsCount = 0;
        int maxCount = 0;
        char maxChar = ' ';
        for (int i = 0; i < chars.length; i++) {
            if (checked[i]) {
                continue;
            }
            int count = 1;

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                    checked[j] = true;
                }
            }
            if (count > 1) {
                System.out.println(chars[i] + " - встречается " + count + " раз");
                duplicateSymbolsCount++;
            }
            if (count > maxCount) {
                maxCount = count;
                maxChar = chars[i];
            }

        }
        if (maxChar == ' ') {
            System.out.println("Символ с максимальным числом повторений 'пробел'" + maxChar);
        } else {
            System.out.println("Символ с максимальным числом повторений " + maxChar);
        }
        System.out.println("Всего повторяющихся символов " + duplicateSymbolsCount);
    }
}
