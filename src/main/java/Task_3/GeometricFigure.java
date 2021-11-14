/**
 * Написать пример кода, который реализует принцип полиморфизма, на примере фигур — круг, квадрат, треугольник.
 */

package Task_3;

public abstract class GeometricFigure {
    private String numberOfSides;

    abstract void calculateArea();
}
