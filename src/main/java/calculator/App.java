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

//        System.out.println("num1, num2 = " + num1 + " , " + num2);
        System.out.println("typ in operator");
        char operator= sc.next().charAt(0);
        int result = 0;

        if (operator == '+') {
            result = num1 + num2;
        } else if(operator == '-') {
            result = num1 - num2;
        } else if(operator == '*') {
            result = num1 * num2;
        } else if(operator == '/') {
            if(num2 == 0){
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                result = -1;
            }else{
                result = num1 / num2;
            }
        }
        System.out.println("결과: " + num1 + " " + operator + " " + num2 + " = " + result);
    }
}
