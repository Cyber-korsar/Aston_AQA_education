public class Shape {
    String colourBackground;
    String figure;
    String borderColor;
    double square;
    double perimeter;

    Shape(String figure, String colourBackground, String borderColor, double square, double perimeter) {
        this.figure = figure;
        this.colourBackground = colourBackground;
        this.borderColor = borderColor;
        this.perimeter = perimeter;
        this.square = square;
    }

    public String printFigure() {
        StringBuffer print = new StringBuffer();
        print.append("\n").append(this.figure).append("\nПериметр: ").append(this.perimeter)
                .append("\nПлощадь: ").append(this.square)
                .append("\nЦвет фона: ").append(this.colourBackground)
                .append("\nЦвет границ: ").append(this.borderColor);
        return print.toString();
    }
}