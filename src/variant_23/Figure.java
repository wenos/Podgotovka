package variant_23;

public abstract class Figure {
    public abstract void use();
}












//public abstract class Shape {
//    public abstract long getColor();
//    public abstract int getX();
//    public abstract int getY();
//    @Override
//    public String toString(){
//        return "X = " + this.getX() + "; Y = " + this.getY()
//                + "; Color = " + this.getColor();
//    }
//}
//------------------------------------—
//public class Rectangle extends Shape{
//    private long color;
//    private int x;
//    private int y;
//    public Rectangle(long color, int x, int y){
//        this.color = color;
//        this.x = x;
//        this.y = y;
//    }
//    @Override
//    public long getColor() {
//        return color;
//    }
//    @Override
//    public int getX() {
//        return x;
//    }
//    @Override
//    public int getY() {
//        return y;
//    }
//}
//------------------------------------------—
//public class Circle extends Shape{
//    private long color;
//    private int x;
//    private int y;
//    public Circle (long color, int x, int y){
//        this.color = color;
//        this.x = x;
//        this.y = y;
//    }
//    @Override
//    public long getColor() {
//        return color;
//    }
//    @Override
//    public int getX() {
//        return x;
//    }
//    @Override
//    public int getY() {
//        return y;
//    }
//}
//------------------------------—
//public class ShapeFactory {
//    public static Shape getShape(String type, long color, int
//            x, int y){
//        if("Rectangle".equalsIgnoreCase(type))
//            return new Rectangle(color, x, y);
//        else if("Circle".equalsIgnoreCase(type))
//            return new Circle(color, x, y);
//        return null;
//    }
//}
//-------------------------------------—
//public class Main {
//    public static void main(String[] args) {
//        Shape sp1 = ShapeFactory.getShape("rectangle", 00000,
//                34, 35);
//        Shape sp2 = ShapeFactory.getShape("circle", 00000, 34,
//                35);
//        System.out.println(sp1);
//        System.out.println(sp2);
//    }
//}
