package calculator;

import java.util.List;

public class ArithmeticCalculator extends Calculator {

    private final AddOperator addOperator;
    private final SubtractOperator subtractOperator;
    private final MultiplyOperator multiplyOperator;
    private final DivideOperator divideOperator;

    public ArithmeticCalculator(List<Double> results, AddOperator addOperator, SubtractOperator subtractOperator,
                                MultiplyOperator multiplyOperator, DivideOperator divideOperator) {
        super(results);
        this.addOperator = addOperator;
        this.subtractOperator = subtractOperator;
        this.multiplyOperator = multiplyOperator;
        this.divideOperator = divideOperator;
    }

    public double calculate(int num1, int num2, char operator) throws ArithmeticException{
        int result = 0;
        try {
            if (operator == '+') {
                result = addOperator.operate(num1, num2);
            } else if (operator == '-') {
                result = subtractOperator.operate(num1, num2);
            } else if (operator == '*') {
                result = multiplyOperator.operate(num1, num2);
            } else if (operator == '/') {
                // 0 으로 나눌시 예외 처리
                if (num2 == 0) {
                    throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                } else {
                    result = divideOperator.operate(num1, num2);
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
