public class Triangle extends Shape {
    Triangle(String colourBackground, String borderColor, double sideA, double sideB, double sideC) {
        super("Треугольник", colourBackground, borderColor, GeometricCalculations.squareTriangle(sideA, sideB, sideC), GeometricCalculations.perimeterTriangle(sideA, sideB, sideC));
    }
}