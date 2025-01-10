import java.util.*;

public class Vector3D {
    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        String newX = String.format("%.2f", x);
        String newY = String.format("%.2f", y);
        String newZ = String.format("%.2f", z);

        return ("the x value is: " + newX + " the y value is: " + newY + " the z value is: " + newZ);
    }

    public double getMagnitude() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    public Vector3D normalize() {
        double m = getMagnitude();
        if (m == 0) {
            throw new IllegalStateException("Operation cannot be completed");
        }

        double newX = x / m;
        double newY = y / m;
        double newZ = z / m;
        return new Vector3D(newX, newY, newZ);

    }

    public Vector3D add(Vector3D j) {
        double x1 = j.getX();
        double y1 = j.getY();
        double z1 = j.getZ();


        return new Vector3D(x + x1, y + y1, z + z1);
    }

    public Vector3D multiply(double c) {
        double newX = x * c;
        double newY = y * c;
        double newZ = z * c;

        return new Vector3D(newX, newY, newZ);
    }

    public Vector3D dotProduct(Vector3D j) {
        double x1 = j.getX();
        double y1 = j.getY();
        double z1 = j.getZ();


        return new Vector3D(x * x1, y * y1, z * z1);
    }
}
