public class Geometry {
    String colourBackground;
    String figure;
    String borderColor;
    double square;
    double perimeter;

    Geometry(String colourBackground, String borderColor, double radius) {
        this.figure = "круга";
        this.colourBackground = colourBackground;
        this.borderColor = borderColor;
        this.perimeter = GeometricСalculations.perimeterCircle(radius);
        this.square = GeometricСalculations.squareCircle(radius);
    }

    Geometry(String colourBackground, String borderColor, double height, double width) {
        this.figure = "прямоугольника";
        this.colourBackground = colourBackground;
        this.borderColor = borderColor;
        this.perimeter = GeometricСalculations.perimeterRectangle(height, width);
        this.square = GeometricСalculations.squareRectangle(height, width);
    }

    Geometry(String colourBackground, String borderColor, double sideA, double sideB, double sideC) {
        this.figure = "треугольника";
        this.colourBackground = colourBackground;
        this.borderColor = borderColor;
        this.perimeter = GeometricСalculations.perimeterTriangle(sideA, sideB, sideC);
        this.square = GeometricСalculations.squareTriangle(sideA, sideB, sideC);
    }

    public String printFigure() {
        StringBuffer print = new StringBuffer();
        print.append("Периметр ").append(this.figure).append(": ").append(this.perimeter)
                .append(" Площадь: ").append(this.square)
                .append(" Цвет фона: ").append(this.colourBackground)
                .append(" Цвет границ: ").append(this.borderColor);
        return print.toString();
    }
}