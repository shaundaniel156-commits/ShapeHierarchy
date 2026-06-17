public class Circle extends Shape {

private double radius;

public Circle(double radius,
              String color,
              boolean filled)
              throws InvalidShapeException {

    super(color, filled);

    if (radius <= 0) {
        throw new InvalidShapeException(
            "Radius must be positive."
        );
    }

    this.radius = radius;
}

@Override
public double getArea() {
    return Math.PI * radius * radius;
}

@Override
public double getPerimeter() {
    return 2 * Math.PI * radius;
}

@Override
public void resize(double factor) {

    if (factor <= 0) {
        throw new RuntimeException(
            "Resize factor must be positive."
        );
    }

    radius *= factor;
}

}