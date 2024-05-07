import java.util.Scanner;

abstract class Shape {
    double length;
    double breadth;
    double height;

    public Shape(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public abstract double volume();
    public abstract double surfaceArea();
}

class Cube extends Shape {
    public Cube(double side) {
        super(side, side, side);
    }

    public double volume() {
        return length * length * length;
    }

    public double surfaceArea() {
        return 6 * length * length;
    }
}

class Cylinder extends Shape {
    public Cylinder(double radius, double height) {
        super(radius, height, 0); // Here, length is considered as radius and height is considered as cylinder height
    }

    public double volume() {
        return Math.PI * length * length * height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * length * (length + height);
    }
}

class Cuboid extends Shape {
    public Cuboid(double length, double breadth, double height) {
        super(length, breadth, height);
    }

    public double volume() {
        return length * breadth * height;
    }

    public double surfaceArea() {
        return 2 * (length * breadth + length * height + breadth * height);
    }
}

public class Assign13_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the dimensions of the cube (side length):");
        double cubeSide = scanner.nextDouble();
        Cube cube = new Cube(cubeSide);
        System.out.println("Cube Volume: " + cube.volume());
        System.out.println("Cube Surface Area: " + cube.surfaceArea());

        System.out.println("\nEnter the dimensions of the cylinder (radius and height):");
        double cylinderRadius = scanner.nextDouble();
        double cylinderHeight = scanner.nextDouble();
        Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight);
        System.out.println("Cylinder Volume: " + cylinder.volume());
        System.out.println("Cylinder Surface Area: " + cylinder.surfaceArea());

        System.out.println("\nEnter the dimensions of the cuboid (length, breadth, and height):");
        double cuboidLength = scanner.nextDouble();
        double cuboidBreadth = scanner.nextDouble();
        double cuboidHeight = scanner.nextDouble();
        Cuboid cuboid = new Cuboid(cuboidLength, cuboidBreadth, cuboidHeight);
        System.out.println("Cuboid Volume: " + cuboid.volume());
        System.out.println("Cuboid Surface Area: " + cuboid.surfaceArea());

        scanner.close();
    }
}
