package com.example.task13;

public class Task13 {

    public static char toUpperCase(char c) {

        // TODO привести букву к верхнему регистру

        c -= 32;
        return  c;
//        return Character.toUpperCase(c);
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        char result = toUpperCase('b');
        System.out.println(result);
    }

}
