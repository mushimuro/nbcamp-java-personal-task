package calculator;

import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Calculator {
//    private ArrayList<Integer> answerList = new ArrayList<>();
//    private int firstNum;
//    private int secondNum;
//    private char operatorUsing;
    private int result;
//    private static final String OPERATION_REG = "[+\\-*/]";
//    private static final String NUMBER_REG = "^[0-9]*$";
//    Scanner sc = new Scanner(System.in);

    public Calculator() {
    }

    public Integer calculate(int firstNum, int secondNum, char operatorUsing) throws Exception{
        try {
            if (operatorUsing == '+') {
                result = firstNum + secondNum;
            } else if (operatorUsing == '-') {
                result = firstNum - secondNum;
            } else if (operatorUsing == '*') {
                result = firstNum * secondNum;
            } else if (operatorUsing == '/') {
                // 0 으로 나눌시 예외 처리
                if (secondNum == 0) {
                    throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                } else {
                    result = firstNum / secondNum;
                }
            } else{
                throw new ArithmeticException("operator 를 잘못 입력했습니다.");
            }
            System.out.println("결과: " + firstNum + " " + operatorUsing + " " + secondNum + " = " + result);
//            answerList.add(result);
//            System.out.println(answerList);
        } catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        return result;
    }
}
