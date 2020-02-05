package com.ss.designPatterns.behavioral.strategy.improved;


import com.ss.designPatterns.behavioral.strategy.*;

public class Chess {

    private ChessAlgorithm algorithm = new EasyChessAlgorithm();

    public int calculateNextStep(){
        return algorithm.calculateNextStep();
    }

    public void setAlgorithm(ChessAlgorithm algorithm) {
        this.algorithm = algorithm;
    }
}
