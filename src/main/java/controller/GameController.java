package controller;

import View.GameConsoleView;
import domain.EvaluatedResult;
import domain.GeneratedNumbers;
import domain.InputNumbers;

import java.util.List;

public class GameController {

    private final GeneratedNumbers generatedNumbers;

    public GameController() {
        this.generatedNumbers = new GeneratedNumbers();
    }

    public void startGame() {
        String input = requestInput();
        InputNumbers inputNumbers = new InputNumbers(input);
        EvaluatedResult evaluatedResult = new EvaluatedResult(generatedNumbers, inputNumbers);
        //todo: Hint 만들기
    }

    private String requestInput() {
        GameConsoleView.printInputInstruction();
        return GameConsoleView.getInput();
    }
}
