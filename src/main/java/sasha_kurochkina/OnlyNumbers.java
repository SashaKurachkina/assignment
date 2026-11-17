package sasha_kurochkina;

public class OnlyNumbers {
    static void main() {
        String str = "234789008768756900867893420986534987462344890580";
        boolean onlyDigits = str != null && str.matches("\\d+");

        System.out.println("Строка содержит только цифры: " + onlyDigits);

    }

}
