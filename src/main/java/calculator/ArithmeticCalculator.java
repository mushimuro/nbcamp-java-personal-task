package calculator;

import java.util.List;

public class ArithmeticCalculator extends Calculator {

    public ArithmeticCalculator(List<Double> results) {
        super(results);
    }

    public double calculate(int num1, int num2, char operator) throws ArithmeticException{
        int result = 0;
        try {
            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else if (operator == '/') {
                // 0 으로 나눌시 예외 처리
                if (num2 == 0) {
                    throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                } else {
                    result = num1 / num2;
                }
            } else {
                throw new ArithmeticException("operator 를 잘못 입력했습니다.");
            }
            System.out.println("결과: " + num1 + " " + operator + " " + num2 + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    @Override
    public void showResult(){
        for (Double result : super.getResults()) {
            System.out.println("arith result: " + result);
        }
    }
}
