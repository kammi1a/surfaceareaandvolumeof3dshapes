# Surface Area and Volume of 3D Shapes

This Java project demonstrates polymorphism in Java by creating an interface for 3D shapes and implementing it in different classes.
- **Sphere**
- **Cylinder**
- **Cube**

It randomly generates instances of these shapes, calculates their surface areas and volumes, and displays the results.


## Features
- **Polymorphism**: Demonstrates polymorphic behavior with an interface that is implemented by different shape classes.
- **Random Shape Generation**: Randomly creates 3D shapes and calculates their surface area and volume.

## Project Structure
The project consists of the following components:
- **`Shape3DInterface.java`**: Interface with methods to calculate surface area and volume.
- **`Sphere.java`, `Cylinder.java`, `Cube.java`**: Implementations of 3D shapes that calculate surface area and volume.
- **`RandomShapeGenerator.java`**: Main class that generates random shapes, calculates their surface area and volume, and displays the results.

## Project Details
- **Sphere**:
Formula for Surface Area: 4 * π * r^2
Formula for Volume: (4/3) * π * r^3
- **Cylinder**:
Formula for Surface Area: 2 * π * r * (r + h)
Formula for Volume: π * r^2 * h
- **Cube**:
Formula for Surface Area: 6 * a^2
Formula for Volume: a^3
