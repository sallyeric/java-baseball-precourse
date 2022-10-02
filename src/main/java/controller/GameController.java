package controller;

import View.GameConsoleView;
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
    }

    private String requestInput() {
        GameConsoleView.printInputInstruction();
        return GameConsoleView.getInput();
    }
}
