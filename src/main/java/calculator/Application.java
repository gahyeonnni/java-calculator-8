package calculator;

import calculator.calculator.CalculateService;
import calculator.calculator.Calculator;
import calculator.numstring.NumStringService;
import calculator.view.ViewService;


public class Application {
    public static void main(String[] args){
        CalculateService calculateService = new CalculateService();
        NumStringService numStringService = new NumStringService();
        ViewService viewService = new ViewService();

        Calculator calculator = new Calculator(calculateService, numStringService, viewService);
        calculator.run();
    }
}
