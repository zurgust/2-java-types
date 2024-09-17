package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        String inputX = Integer.toString(x);
        int length = inputX.length();
        while (length > 1) {
            if (x % 2 != 0) {
                return "FALSE";
            }
            length--;
        }
        return "TRUE";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        String result = solution(1234);
        System.out.println(result);
    }

}
