package core.basesyntax;

public class MainApplication {
    public static final int figureAmount = 6;
    public static void main(String[] args) {
        Shape[] figures = new Shape[figureAmount];
        for (int index = 0; index < figures.length; index++) {
            if (index < figures.length / 2) {
                figures[index] = new FigureSupplier().getRandomFigure();
            } else {
                figures[index] = new FigureSupplier().getDefaultFigure();
            }
        }
        // displaying the entire list of shapes
        for (Shape figure : figures) {
            figure.draw();
        }
    }
}
