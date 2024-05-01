package calculator;

import java.util.List;

public abstract class Calculator {
    private final List<Double> results;

    public Calculator(List<Double> results) {
        this.results = results;
    }

    abstract void showResult();

    public List<Double> getResults() {
        return results;
    }
}
