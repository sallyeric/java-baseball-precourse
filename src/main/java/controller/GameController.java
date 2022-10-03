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
        String input = requestInput();
        InputNumbers inputNumbers = new InputNumbers(input);
        EvaluatedResult evaluatedResult = new EvaluatedResult(generatedNumbers, inputNumbers);
        GameConsoleView.printHint(evaluatedResult);
    }

    private String requestInput() {
        GameConsoleView.printInputInstruction();
        return GameConsoleView.getInput();
    }
}
