package calculator;

import java.util.List;
import java.util.Scanner;

public class CircleCalculator extends Calculator {
    public CircleCalculator(List<Double> results) {
        super(results);
    }

    public double circleCalculate(int rad){
        double circleArea = rad * rad * Math.PI;
        System.out.println("결과: "+circleArea);
        return circleArea;
    }

    @Override
    public void showResult(){
        for(Double circArea : super.getResults()) {
            System.out.println("circle area: " + circArea);
        }
    }

//    public static void removeFirst(){
//        this.getResults().remove(0);
//        System.out.println("removed first element!");
//    }


}
