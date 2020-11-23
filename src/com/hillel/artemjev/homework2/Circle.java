package com.hillel.artemjev.homework2;


public class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    boolean containsPoint(Point p) {
        return p.distanceTo(center) < radius;
    }

    @Override
    public String toString() {
        return "{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
