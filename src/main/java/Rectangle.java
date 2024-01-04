public class Rectangle extends Shape {
    Rectangle(String colourBackground, String borderColor, double height, double width) {
        super("Прямоугольник", colourBackground, borderColor, GeometricCalculations.squareRectangle(height, width), GeometricCalculations.perimeterRectangle(height, width));
    }
}