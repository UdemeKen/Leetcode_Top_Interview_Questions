package org.example;

import org.example.solutions.MaxProfit;
import org.example.solutions.RemoveDuplicates;

public class Main {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        MaxProfit mp = new MaxProfit();
        int result = mp.maxProfit(prices);
        System.out.println(result);
    }
}
