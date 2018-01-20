package ru.job4j.condition;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {

        this.x = x;
        this.y = y;
    }


    public double distance(Point b) {



        return Math.sqrt(Math.pow((b.x - this.x), 2) + Math.pow((b.y - this.y), 2));
    }

    public static void main(String[] args) {

        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 2);

        double result = p1.distance(p2);

        System.out.println("Distance between points is " + result);
    }
}
