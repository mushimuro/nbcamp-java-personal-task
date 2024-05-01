package calculator;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception{
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        boolean loopingCheck = true;

        while(loopingCheck) {
            System.out.println("type first num");
            String num1 = sc.nextLine();
            System.out.println("type second num");
            String num2 = sc.nextLine();
            System.out.println("type in operator");
            String operator = sc.nextLine();

            int firstNum = Integer.parseInt(num1);
            int secondNum = Integer.parseInt(num2);
            char operatorChar = operator.charAt(0);
            calculator.calculate(firstNum, secondNum, operatorChar);

            // 첫번째 결과 삭제
            calculator.removeFirstAnswer();

            // 전체 결과 확인
            calculator.showResults();

            // 루프를 종료할지 선택
            System.out.println("continue? (type \"exit\" to quit)");
            String continueQuit = sc.nextLine();
            if (continueQuit.equals("exit")) {
                loopingCheck = false;
            }
        }
    }
}
