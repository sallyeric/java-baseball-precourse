package View;

import camp.nextstep.edu.missionutils.Console;

public class GameConsoleView {
    public static void printInputInstruction() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public static String getInput() {
        return Console.readLine();
    }
}
