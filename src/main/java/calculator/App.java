package calculator;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("type first num");
        int num1 = sc.nextInt();
        System.out.println("type second num");
        int num2 = sc.nextInt();
        // Scanner 를 사용하여 양의 정수를 입력 받고 적합한 타입의 변수에 저장

        System.out.println("num1, num2 = " + num1 + " , " + num2);
    }
}
