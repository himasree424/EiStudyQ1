package creational2;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        
        Shape circle = shapeFactory.createShape("CIRCLE");
        circle.draw();
        
        Shape square = shapeFactory.createShape("SQUARE");
        square.draw();
    }
}