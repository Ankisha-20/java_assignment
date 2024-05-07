abstract class Fruit {
    String color;
    String taste;

    public Fruit(String color, String taste) {
        this.color = color;
        this.taste = taste;
    }

    // Abstract method
    abstract void display();
}

class Apple extends Fruit {
    public Apple(String color, String taste) {
        super(color, taste);
    }

    void display() {
        System.out.println("Apple - Color: " + color + ", Taste: " + taste);
    }
}

class Banana extends Fruit {
    public Banana(String color, String taste) {
        super(color, taste);
    }

    void display() {
        System.out.println("Banana - Color: " + color + ", Taste: " + taste);
    }
}

class Orange extends Fruit {
    public Orange(String color, String taste) {
        super(color, taste);
    }

    void display() {
        System.out.println("Orange - Color: " + color + ", Taste: " + taste);
    }
}

class Strawberry extends Fruit {
    public Strawberry(String color, String taste) {
        super(color, taste);
    }

    void display() {
        System.out.println("Strawberry - Color: " + color + ", Taste: " + taste);
    }
}

public class Assign13_2 {
    public static void main(String[] args) {
        Apple apple = new Apple("Red", "Sweet");
        Banana banana = new Banana("Yellow", "Sweet");
        Orange orange = new Orange("Orange", "Tangy");
        Strawberry strawberry = new Strawberry("Red", "Sweet and Tangy");

        apple.display();
        banana.display();
        orange.display();
        strawberry.display();
    }
}
