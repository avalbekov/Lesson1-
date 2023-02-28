public class Main {
    public static void main(String[] args) {
        // 1.
        String  NumAndWord;
        // 2.
        final int NUM = 2023;
        // 3.
        String word = "year";
        // 4.
        NumAndWord = NUM + word;
        // 5.
        System.out.println(NumAndWord);
        // 6.
        if (NUM < 0){
            System.out.printf("Вы сохранили отрицательное число ");
        } else if (NUM > 0){
            System.out.printf("Вы сохранили положительное число ");
        }else {
            System.out.printf("Вы сохранили ноль");
        }
    }
}