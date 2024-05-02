package calculator;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception{
        ArithmeticCalculator arithmeticCalc = new ArithmeticCalculator(new ArrayList<>());
        CircleCalculator circleCalc = new CircleCalculator(new ArrayList<>());
        Scanner sc = new Scanner(System.in);
//        boolean loopingCheck = true;

        do {
            System.out.println("Calculation type : \"basic\" or \"circle\"");
            String chooseCalc = sc.next();

            // arithmetic calc
            if (chooseCalc.equals("basic")) {
                System.out.println("enter first number: ");
                int num1 = sc.nextInt();
                System.out.println("enter second number: ");
                int num2 = sc.nextInt();
                System.out.println("enter operator: ");
                char operator = sc.next().charAt(0);

                double result = arithmeticCalc.calculate(num1, num2, operator);
                arithmeticCalc.getResults().add(result);

                System.out.println("enter \"remove\" to delete first result");
                if (sc.next().equals("remove")) {
                    arithmeticCalc.getResults().remove(0);
                    System.out.println("first element removed!");
                }

                System.out.println("enter \"inquiry\" to view all results");
                if (sc.next().equals("inquiry")) {
                    arithmeticCalc.showResult();
                }
            }
            // circle area calc
            else if (chooseCalc.equals("circle")) {
                System.out.println("enter radius");
                int radius = sc.nextInt();

                double area = circleCalc.circleCalculate(radius);
                circleCalc.getResults().add(area);

                System.out.println("enter \"remove\" to delete first result");
                if (sc.next().equals("remove")) {
                    circleCalc.getResults().remove(0);
                    System.out.println("first element removed!");
                }

                System.out.println("enter \"inquiry\" to view all results");
                if (sc.next().equals("inquiry")) {
                    circleCalc.showResult();
                }
            } else{
                System.out.println("choose between \"basic\" and \"circle\"");
            }

            // 루프를 종료할지 선택
            System.out.println("continue? (type \"exit\" to quit)");
        } while(!sc.next().equals("exit"));
    }
}
