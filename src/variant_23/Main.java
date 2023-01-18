package variant_23;

public class Main {
    public static void main(String[] args) {
        Figure c = FigureFabric.fabricMethod("Circle");
        if (c != null) c.use();
    }
}
