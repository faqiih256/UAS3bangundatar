
package uass;
import java.util.Scanner;

/**
  * Nama         : Ahmad Nurfaqih
 * Nim          : 22205015
 * prodi        : Teknik Informatia
 * Deskripsi    : Bangun Datar
 */

public class uass {
    
}


class Shape {

    private final String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return 0;
    }
}

class Circle extends Shape {

    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {

    private final double length;
    private final double width;
    private final  String color;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    public double getArea() {
        return length * width;
    }
    
    public static void main(String[] args) {

        // Mendeklarasikan scanner
        Scanner scanner = new Scanner(System.in);

        // Mencetak judul program
        System.out.println("Perhitungan Luas Lingkaran");
        System.out.println("");

        // Meminta pengguna untuk memasukkan warna lingkaran
        System.out.print("Masukkan warna lingkaran: ");
        String colorCircle = scanner.nextLine();

        // Meminta pengguna untuk memasukkan radius lingkaran
        System.out.print("Masukkan radius lingkaran: ");
        double radius = scanner.nextDouble();

        // Membuat objek Circle baru
        Circle circle = new Circle(colorCircle, radius);

        // Mencetak luas lingkaran
        System.out.println("Luas Lingkaran: " + circle.getArea());

        // Mencetak judul program
        System.out.println("");
        System.out.println("Perhitungan Luas Persegi Panjang");
        System.out.println("");

        // Meminta pengguna untuk memasukkan warna persegi panjang
        System.out.print("Masukkan warna persegi panjang: ");
        String colorRectangle = scanner.nextLine();
        scanner.nextLine();

        // Meminta pengguna untuk memasukkan panjang persegi panjang
        System.out.print("Masukkan panjang persegi panjang: ");
        double length = scanner.nextDouble();

        // Meminta pengguna untuk memasukkan lebar persegi panjang
        System.out.print("Masukkan lebar persegi panjang: ");
        double width = scanner.nextDouble();

        // Membuat objek Rectangle baru
        Rectangle rectangle = new Rectangle(colorRectangle, length, width);

        // Mencetak luas persegi panjang
        System.out.println("Luas Persegi Panjang: " + rectangle.getArea());

        // Menutup scanner
        scanner.close();
    }

}


