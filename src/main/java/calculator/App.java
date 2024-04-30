package calculator;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loopingCheck = true;
        ArrayList<Integer> answerList = new ArrayList<>(10);
        int count = 0;  //answer 갯수 확인용

        while(loopingCheck) {
            System.out.println("type first num");
            int num1 = sc.nextInt();
            System.out.println("type second num");
            int num2 = sc.nextInt();
            // Scanner 를 사용하여 양의 정수를 입력 받고 적합한 타입의 변수에 저장

            System.out.println("typ in operator");
            char operator = sc.next().charAt(0);
            int result = 0;
            // 다음 입력값을 받기 위해 사용
            String removingEmptySpace = sc.nextLine();

            // 사칙연산에 따른 연산
            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else if (operator == '/') {
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    result = -1;
                } else {
                    result = num1 / num2;
                }
            }

            System.out.println("결과: " + num1 + " " + operator + " " + num2 + " = " + result);
            // answer을 리스트에 저장 및 확인
            if(count == 10){
                answerList.remove(0);
                answerList.add(result);
            }else{
                answerList.add(result);
            }
            count += 1;
            System.out.println(answerList);

            // 루프를 종료할지 선택
            System.out.println("continue? (type \"exit\" to quit)");
            String continueQuit = sc.nextLine();
            if (continueQuit.equals("exit")) {
                loopingCheck = false;
            }
        }
    }
}
