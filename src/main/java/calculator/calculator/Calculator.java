package calculator.calculator;

import calculator.numstring.NumStringService;
import calculator.view.ViewService;

import java.util.List;


public class Calculator {
    private CalculateService calculateService;
    private NumStringService numStringService;
    private ViewService viewService;

    public Calculator(CalculateService calculateService, NumStringService numStringService, ViewService viewService) {
        this.calculateService = calculateService;
        this.numStringService = numStringService;
        this.viewService = viewService;
    }

    public void run() {
        String input = viewService.viewInput();

        Integer singleResult = numStringService.checkSingleOrEmpty(input);
        if (singleResult != null) {
            viewService.viewOutput(singleResult);
            return;
        }

        List<Integer> numbers = numStringService.numString(input);
        int result = calculateService.calculateNum(numbers);
        viewService.viewOutput(result);
    }
}
