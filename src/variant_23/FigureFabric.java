package variant_23;

public class FigureFabric {
    public static Figure fabricMethod(String nameClass) {
        switch (nameClass) {
            case "Circle" -> {
                return new Circle();
            }
            case "Rectangle" -> {
                return new Rectangle();
            }
        }
        return null;
    }
}
