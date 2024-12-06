package org.example.surfaceareaandvolumeof3dshapes;
import java.util.Random;

public class RandomShapeGenerator {
    public static void main(String[] args) {
        Shape3DInterface[] shapes = new Shape3DInterface[10];

        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int shapeType = rand.nextInt(3); // 0 for Sphere, 1 for Cylinder, 2 for Cube
            switch (shapeType) {
                case 0:
                    shapes[i] = new Sphere();
                    break;
                case 1:
                    shapes[i] = new Cylinder();
                    break;
                case 2:
                    shapes[i] = new Cube();
                    break;
            }
        }

        for (Shape3DInterface shape : shapes) {
            if (shape instanceof Sphere) {
                Sphere sphere = (Sphere) shape;
                System.out.println("Shape: " + sphere.getName());
                System.out.println("Surface Area: " + sphere.surfaceArea());
                System.out.println("Volume: " + sphere.volume());
            } else if (shape instanceof Cylinder) {
                Cylinder cylinder = (Cylinder) shape;
                System.out.println("Shape: " + cylinder.getName());
                System.out.println("Surface Area: " + cylinder.surfaceArea());
                System.out.println("Volume: " + cylinder.volume());
            } else if (shape instanceof Cube) {
                Cube cube = (Cube) shape;
                System.out.println("Shape: " + cube.getName());
                System.out.println("Surface Area: " + cube.surfaceArea());
                System.out.println("Volume: " + cube.volume());
            }
            System.out.println();
        }
    }
}
