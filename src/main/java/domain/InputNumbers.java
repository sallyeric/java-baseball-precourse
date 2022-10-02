package domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputNumbers {
    private final List<Integer> numbers;

    public InputNumbers(String input) {
        List<Integer> inputNumbers = getDistinctNumbers(input);
        this.numbers = inputNumbers;
    }

    private List<Integer> getDistinctNumbers(String input) {
        return Arrays.stream(input.split(""))
                        .map(Integer::new)
                        .collect(Collectors.toList());
    }
}
