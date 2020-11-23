package com.hillel.artemjev.homework2;


public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point p){
        //чтобы в возможных будущих сложных расчетах метода случайно не испортить значения полей (хз оправданно ли).
        double x1 = this.x;
        double y1 = this.y;

        double x2 = p.getX();
        double y2 = p.getY();

        return Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
    }

    @Override
    public String toString() {
        return "{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
