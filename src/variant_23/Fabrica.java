package variant_23;

public class Fabrica {
    public static Figure fabricMetod(String name){
        switch (name) {
            case "Circle" -> {
                return (new Circle());
            }
            case "Rectangle" -> {
                return (new Rectangle());
            }
        }
        return (new Figure());
    }
}
