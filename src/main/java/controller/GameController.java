package controller;

import View.GameConsoleView;
import domain.EvaluatedResult;
import domain.GeneratedNumbers;
import domain.InputNumbers;

public class GameController {

    private final GeneratedNumbers generatedNumbers;

    public GameController() {
        this.generatedNumbers = new GeneratedNumbers();
    }

    public void startGame() {
        while(true) {
            if(!playGame()) break;
        }
    }

    private boolean playGame() {
        String input = requestInput();
        InputNumbers inputNumbers = new InputNumbers(input);
        EvaluatedResult evaluatedResult = new EvaluatedResult(generatedNumbers, inputNumbers);
        GameConsoleView.printHint(evaluatedResult);
        if(evaluatedResult.getResult().getStrike() == 3) {
            return GameConsoleView.requestRestart();
        }
        return true;
    }

    private String requestInput() {
        GameConsoleView.printInputInstruction();
        return GameConsoleView.getInput();
    }
}
