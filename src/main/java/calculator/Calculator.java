package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    private ArrayList<Integer> answerList = new ArrayList<>();
    private ArrayList<Double> circleAreaList = new ArrayList<>();
    private int result;
    private double circleArea;

    Scanner sc = new Scanner(System.in);

    public Calculator() {
    }

    // 사칙연산
    public void calculate() throws Exception {
        System.out.println("type first num");
        String num1 = sc.nextLine();
        System.out.println("type second num");
        String num2 = sc.nextLine();
        System.out.println("type in operator");
        String operator = sc.nextLine();
        char operatorUsing = operator.charAt(0);
        int firstNum = Integer.parseInt(num1);
        int secondNum = Integer.parseInt(num2);

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
            } else {
                throw new ArithmeticException("operator 를 잘못 입력했습니다.");
            }
            System.out.println("결과: " + firstNum + " " + operatorUsing + " " + secondNum + " = " + result);
            answerList.add(result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    // 원 넓이 구하기
    public void calculateCircleArea() {
        System.out.println("type radius of circle");
        String rad = sc.nextLine();
        double radius = Double.parseDouble(rad);
        circleArea = radius * radius * Math.PI;
        System.out.println("결과: "+circleArea);
        circleAreaList.add(circleArea);
    }

    public void showCircleAreaResults(){
        System.out.println("저장된 원의 넓이 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
        String inquiry = sc.nextLine();
        if (inquiry.equals("inquiry")) {
            for(double circArea : circleAreaList) {
                System.out.println(circArea);
            }
        }
    }

    public void removeCircleFirstAnswer(){
        System.out.println("가장 먼저 저장된 원 넓이 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
        String removeFirst = sc.nextLine();
        if (removeFirst.equals("remove")) {
            circleAreaList.remove(0);
            System.out.println("원 넓이 first answer removed");
        }
    }

    // 첫번째값 삭제할지 선택
    public void removeBasicFirstAnswer(){
        System.out.println("가장 먼저 저장된 사칙 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
        String removeFirst = sc.nextLine();
        if (removeFirst.equals("remove")) {
            answerList.remove(0);
            System.out.println("사칙연산 first answer removed");
        }
    }

    // 전체 결과값들 확인
    public void showResults(){
        System.out.println("저장된 사칙연산 결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
        String inquiry = sc.nextLine();
        if (inquiry.equals("inquiry")) {
            for (Integer answerData : answerList) {
                System.out.println(answerData);
            }
        }
    }

}
