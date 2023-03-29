package ru.netology;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println(bins.sum("101", "101")); // 5 + 5 = 10 (1010)
        System.out.println(bins.mult("101", "101")); // 5 * 5 = 25  (11001)
    }
}