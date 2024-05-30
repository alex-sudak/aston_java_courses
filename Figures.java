import java.util.Scanner;

interface Figures {
    double square();
    double perimeter();
}

class Circle implements Figures{
    private double radius;
    private String fill;
    private String border;

    public Circle(double radius, String fill, String border){
        this.radius = radius;
        this.fill = fill;
        this.border = border;
    }

    public double square(){
        return Math.PI*radius*radius;
    }

    public double perimeter(){
        return 2*Math.PI*radius;
    }

    public void setFill(String color){
        this.fill = color;
    }

    public void setBorder(String color){
        this.border = color;
    }

    public void draw(){
        System.out.println("Фигура типа Круг: ");
        System.out.println("Площадь фигуры Круг равна: " + square());
        System.out.println("Периметр фигуры Круг равен: " + perimeter());
        System.out.println("Цвет которым нарисована фигура Круг: " + fill);
        System.out.println("Цвет которым нарисована граница фигуры Круг: " + border);
    }
}

class Rectangle implements Figures{
    private double length;
    private double height;
    private String fill;
    private String border;

    public Rectangle(double length, double height, String fill, String border) {
        this.length = length;
        this.height = height;
        this.fill = fill;
        this.border = border;
    }

    public double square() {
        return length * height;
    }

    public double perimeter() {
        return 2 * length + 2 * height;
    }

    public void setFill(String color) {
        this.fill = color;
    }

    public void setBorder(String color) {
        this.border = color;
    }

    public void draw() {
        System.out.println("Фигура типа Прямоугольник: ");
        System.out.println("Площадь фигуры равна: " + square());
        System.out.println("Периметр фигуры равен: " + perimeter());
        System.out.println("Цвет которым нарисована фигура: " + fill);
        System.out.println("Цвет которым нарисована граница фигуры: " + border);
    }
}

class Triangle implements Figures{
    private double leg1;
    private double leg2;
    private double hypotenuse;
    private String fill;
    private String border;

    public Triangle(double leg1, double leg2, double hypotenuse, String fill, String border) {
        this.leg1 = leg1;
        this.leg2 = leg2;
        this.hypotenuse = hypotenuse;
        this.fill = fill;
        this.border = border;
    }

    public double square() {
        double pp = (leg1 + leg2 + hypotenuse) / 2.0;
        return Math.sqrt(pp * (pp - leg1) * (pp - leg2) * (pp - hypotenuse));
    }

    public double perimeter() {
        return leg1 + leg2 + hypotenuse;
    }

    public void setFill(String color) {
        this.fill = color;
    }

    public void setBorder(String color) {
        this.border = color;
    }

    public void draw() {
        System.out.println("Фигура типа Треугольник: ");
        System.out.println("Площадь фигуры равна: " + square());
        System.out.println("Периметр фигуры равен: " + perimeter());
        System.out.println("Цвет которым нарисована фигура: " + fill);
        System.out.println("Цвет которым нарисована граница фигуры: " + border);
    }
}
class Mainnew {
    public static void main(String[] args){
        Circle circle = new Circle(10, "Белый", "Черный");
        circle.draw();

        Rectangle rectangle = new Rectangle(10, 20, "Красный", "Зеленый");
        rectangle.draw();

        Triangle triangle = new Triangle(2, 3, 4, "Голубой", "Коричневый");
        triangle.draw();
    }
}





