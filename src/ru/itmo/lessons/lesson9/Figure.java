package ru.itmo.lessons.lesson9;

import java.util.Arrays;

public final class Figure {
    private final Point[] points;

    // final означает что мы не  можем переопределить ссылку на points
    // Нельзя использовать сеттер
    public Figure(int pointCount) {
        if (pointCount < 2) {
            throw new IllegalArgumentException("Фигура должна состоять из двух точек");
        }
        this.points = new Point[pointCount];
    }

    public Point[] getPoints() {
        return points;
    }

    // Метод добавления точек в массив
    // Одинаковые точки в массив добавлять нельзя
    public void addPoint(Point point) {
        for (int i = 0; i < points.length; i++) {
            if (points[i] != null && points[i].equals(point)) {
                System.out.println("Точка не может быть добавлена");
                return;
            }
                if (points[i] == null) {
                    points[i] = point;
                    System.out.println("Точка была добавлена");
            }
        }
    }

    @Override
    public String toString() {
        return "Figure{" +
                "points=" + Arrays.toString(points) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Figure figure = (Figure) o;
        return Arrays.equals(points, figure.points);
    }

    public Figure clone () {
        Figure copy = new Figure(points.length);
        for (int i = 0; i < points.length; i++) {
            copy.points[i] = points[i].clone();
        }
        return copy;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(points);
    }
}
