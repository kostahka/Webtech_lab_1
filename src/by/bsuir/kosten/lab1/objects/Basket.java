package by.bsuir.kosten.lab1.objects;

import java.util.List;

public class Basket {
    public List<Ball> balls;
    public double getBallsWeight() {
        double weight = 0;
        for (Ball ball : balls) {
            weight+=ball.getWeight();
        }
        return weight;
    }

    public Basket(List<Ball> balls) {
        this.balls = balls;
    }

    public long getBlueBallsCount() {
        return balls.stream().filter(ball -> ball.getColor()== Color.BLUE).count();
    }
}
