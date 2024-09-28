package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(4); // 4 different type of figures
        switch (figureType) {
            case 0:
                return new Rectangle(random.nextDouble(10),
                        random.nextDouble(10), colorSupplier.getRandomColor());
            case 1:
                return new IsoscelesTrapezoid(random.nextDouble(12),
                        random.nextDouble(11), random.nextDouble(10),
                        colorSupplier.getRandomColor());
            case 2:
                return new RightTriangle(random.nextDouble(10),
                        random.nextDouble(12), colorSupplier.getRandomColor());
            case 3:
                return new Square(random.nextDouble(10), colorSupplier.getRandomColor());

            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(RADIUS, Color.WHITE.name());
    }
}