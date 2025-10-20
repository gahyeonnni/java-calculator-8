package calculator.view;

import camp.nextstep.edu.missionutils.Console;

public class ViewService {
    public String viewInput() {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String input = Console.readLine();
        Console.close();

        return input;
    }

    public void viewOutput(int result) {
        System.out.print("결과 : " + result);
    }
}

