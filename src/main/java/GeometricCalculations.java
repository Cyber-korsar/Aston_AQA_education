public interface GeometricCalculations {
    double pi = 3.14;

    static double squareCircle(double r) {
        return pi * r * r;
    }

    static double perimeterCircle(double r) {
        return 2 * r * pi;
    }

    static double squareRectangle(double a, double b) {
        return a * b;
    }

    static double perimeterRectangle(double a, double b) {
        return (a + b) * 2;
    }

    static double perimeterTriangle(double sideA, double sideB, double sideC) {
        return (sideA + sideB + sideC) / 2;
    }

    static double squareTriangle(double sideA, double sideB, double sideC) {
        double perimeter = perimeterTriangle(sideA, sideB, sideC);
        return Math.sqrt((perimeter * (perimeter - sideA) * (perimeter - sideB) * (perimeter - sideC)));//Формула Герона
    }
}