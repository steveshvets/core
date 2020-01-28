package com.ss.javaIntermediateInterviewQuestions.Puzzles.computrade.puzzle.array;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;

public class StockMaxMinProfit {


    public static void main(String[] args) {
        OptionalDouble max = getMaxProfit();
        if (max.isPresent()){
            System.out.println(max.getAsDouble());
        }
    }

    public static OptionalDouble getMaxProfit() {

       double[] prices = { 100.5, 120.3, 110.7, 135.1, 115.9, 112.4, 105.6};


       OptionalDouble max=
        Arrays.stream(prices)
//                .sorted()
                .max();

        return max;


    }


}