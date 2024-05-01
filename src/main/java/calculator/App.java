package calculator;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception{
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        boolean loopingCheck = true;

        while(loopingCheck) {
            System.out.println("Calculation type : \"basic\" or \"circle\"");
            String chooseCalc = sc.nextLine();

            if (chooseCalc.equals("basic")) {
                calculator.calculate();
                // 첫번째 결과 삭제
                calculator.removeBasicFirstAnswer();
                // 전체 결과 확인
                calculator.showResults();
            } else if (chooseCalc.equals("circle")) {
                calculator.calculateCircleArea();
                calculator.removeCircleFirstAnswer();
                calculator.showCircleAreaResults();
            } else{
                System.out.println("choose between \"basic\" and \"circle\"");
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
