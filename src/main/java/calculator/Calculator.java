package calculator;

import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Calculator {
    private ArrayList<Integer> answerList = new ArrayList<>();
    private int result;
    Scanner sc = new Scanner(System.in);

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
            answerList.add(result);
        } catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        return result;
    }

    // 첫번째값 삭제할지 선택
    public void removeFirstAnswer(){
        System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
        String removeFirst = sc.nextLine();
        if (removeFirst.equals("remove")) {
            answerList.remove(0);
            System.out.println("first answer removed");
        }
    }

    // 전체 결과값들 확인
    public void showResults(){
        System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
        String inquiry = sc.nextLine();
        if (inquiry.equals("inquiry")) {
            for (Integer answerData : answerList) {
                System.out.println(answerData);
            }
        }
    }

}
