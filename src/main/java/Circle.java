public class Circle extends Shape {
    Circle(String colourBackground, String borderColor, double radius) {
        super("Круг", colourBackground, borderColor, GeometricCalculations.squareCircle(radius), GeometricCalculations.perimeterCircle(radius));
    }
}