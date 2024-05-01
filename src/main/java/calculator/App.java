package calculator;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        boolean loopingCheck = true;
        ArrayList<Integer> answerList = new ArrayList<>();
//        int count = 0;  //answer 갯수 확인용

        while(loopingCheck) {
            System.out.println("type first num");
            int num1 = sc.nextInt();
            System.out.println("type second num");
            int num2 = sc.nextInt();
            // Scanner 를 사용하여 양의 정수를 입력 받고 적합한 타입의 변수에 저장

            System.out.println("type in operator");
            char operator = sc.next().charAt(0);
            int result = 0;
            // 다음 입력값을 받기 위해 사용
            String removingEmptySpace = sc.nextLine();

            // 사칙연산에 따른 연산
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
                        throw new Exception("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    } else {
                        result = num1 / num2;
                    }
                }
                System.out.println("결과: " + num1 + " " + operator + " " + num2 + " = " + result);
                answerList.add(result);
            } catch(Exception e){
                System.out.println(e.getMessage());
            }

//            System.out.println(answerList);

            // 첫번째값 삭제할지 선택
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String removeFirst = sc.nextLine();
            if (removeFirst.equals("remove")) {
                answerList.remove(0);
                System.out.println("first answer removed");
//                System.out.println(answerList);
            }

            // answerList 프린트할지 선택
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String inquiry = sc.nextLine();
            if (inquiry.equals("inquiry")) {
                for(Integer answerData : answerList) {
                    System.out.println(answerData);
                }
            }

            // 루프를 종료할지 선택
            System.out.println("continue? (type \"exit\" to quit)");
            String continueQuit = sc.nextLine();
            if (continueQuit.equals("exit")) {
                loopingCheck = false;
            }
        }
    }
}
