package by.bsuir.kosten.lab1.implementations;

import java.util.HashMap;
import java.util.Map;

public class MathTasks {
    static public double firstTask(double x, double y) {
        double numerator = (1 + Math.sin(x+y)*Math.sin(x+y));
        double denominator = 2+Math.abs(x-(2*x/(1+Math.pow(x,2)*Math.pow(y,2))));
        return numerator/denominator + x;
    }

    static public boolean secondTask(double x, double y) {
        return ((y<=5 && y>=-3) && ((y>=0 && Math.abs(x)<=4) || (y < 0 && Math.abs(x) <= 6)));
    }

    static public Map<Double, Double> thirdTask(double a, double b, double h) {
        HashMap<Double, Double> funcMap = new HashMap<>();
        for (double i = a; i <= b; i+=h) {
            funcMap.put(i,Math.tan(i));
        }
        return funcMap;
    }
}
