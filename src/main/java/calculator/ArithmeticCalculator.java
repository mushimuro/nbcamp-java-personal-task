package calculator;

import java.util.List;

public class ArithmeticCalculator extends Calculator {



    public ArithmeticCalculator(List<Double> results) {
        super(results);
    }

    public double calculate(int num1, int num2, char operator){
        return operatorFactory(operator).operate(num1, num2);
    }

    // 따로 class 만들어서 하면 좋음
    // 아래 코드는 메모리 측면에서는 비효울적으로 opertor 들이 계속 만들어 지고 있다(new AddOperator)
    private Operator operatorFactory(char operator){
        return switch(operator){
            case '+' -> new AddOperator();
            case '-' -> new SubtractOperator();
            case '*' -> new MultiplyOperator();
            case '/' -> new DivideOperator();
            case '%' -> new ModOperator();
            default -> throw new UnsupportedOperationException("operator 를 잘못 입력했습니다.");
        }
    }

    @Override
    public void showResult(){
        for (Double result : super.getResults()) {
            System.out.println("arith result: " + result);
        }
    }
}
