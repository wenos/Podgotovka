package variant_24;

public class NumberFabric {
    public static Number fabricMethod(String name) {
        switch (name) {
            case "ComplexNumber" -> {
                return new ComplexNumber();
            }
            case "RationalNumber" -> {
                return new RationalNumber();
            }
        }
        return null;
    }
}
