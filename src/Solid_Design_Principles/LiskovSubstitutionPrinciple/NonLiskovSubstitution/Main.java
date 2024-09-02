package Solid_Design_Principles.LiskovSubstitutionPrinciple.NonLiskovSubstitution;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println(rectangle.computeArea());

        Square square = new Square(10);
        System.out.println(square.computeArea());

        useRectangle(rectangle);
        useRectangle(square);
    }

    private static void useRectangle(Rectangle rectangle) {
        rectangle.setHeight(20);
        rectangle.setWidth(30);
        // works well with a Rectangle object i.e., base class object
        // when child class object square passed then as per that it will update the side value both as 30.
        assert rectangle.getHeight() == 20 : "Height not equal to 20"; // square height will be set to 30
        assert rectangle.getWidth() == 30 : "Width not equal to 30";
        //behavior is changed
        //test will fail
        System.out.println(rectangle.getHeight()); // 20(rectangle) , 30(square)
        System.out.println(rectangle.getWidth()); // 30 (rectangle) , 30(rectangle)
    }
}
