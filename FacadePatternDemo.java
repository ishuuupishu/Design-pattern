interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("It's a Circle");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("It's a Square");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("It's a Rectangle");
    }
}

class Shapemaker {
    private Shape circle;
    private Shape square;
    private Shape rectangle;

    public void ShapeMaker() {
        circle = new Circle();
        square = new Square();
        rectangle = new Rectangle();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawSquare() {
        square.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }
}

public class FacadePatternDemo {
    public static void main(String[] args) {
        Shapemaker shapeMaker = new Shapemaker();
        shapeMaker.drawCircle();
        shapeMaker.drawSquare();
        shapeMaker.drawRectangle();
    }
}