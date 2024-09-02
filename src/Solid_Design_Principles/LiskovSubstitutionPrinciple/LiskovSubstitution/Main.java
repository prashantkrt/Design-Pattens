package Solid_Design_Principles.LiskovSubstitutionPrinciple.LiskovSubstitution;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println(rectangle.computeArea());

        Square square = new Square(10);
        System.out.println(square.computeArea());

        useRectangle(rectangle);
    }

    // now we cannot use a Square object here
    private static void useRectangle(Rectangle rectangle) {
        rectangle.setHeight(20);
        rectangle.setWidth(30);
        assert rectangle.getHeight() == 20 : "Height not equal to 20";
        assert rectangle.getWidth() == 30 : "Width not equal to 30";
    }
}
