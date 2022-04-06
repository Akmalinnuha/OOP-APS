import java.util.Scanner;

interface hitung {
    public void hitungLuas();
}
class persegi implements hitung {
    double sisi;

    persegi(double sisi) {
        this.sisi = sisi;
    }

    public void hitungLuas() {
        double luas = sisi*sisi;
        System.out.println("Luasnya yaitu : "+ luas);
    }
}

class persegiPanjang implements hitung{
    double panjang;
    double lebar;

    persegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void hitungLuas() {
        double luas = panjang*lebar;
        System.out.println("Luasnya yaitu : "+luas);
    }
}

class segitiga implements hitung{
    double alas;
    double tinggi;

    segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public void hitungLuas() {
        double luas = (alas*tinggi)/2;
        System.out.println("Luasnya yaitu : "+luas);
    }
}

class lingkaran {
    double radius;
    lingkaran(double radius) {
         this.radius = radius;
    }

    public void hitungLuas() {
        double luas = Math.PI*Math.pow(radius, 2);
        System.out.println("Luasnya yaitu : "+luas);
    }
}

public class hitungBangunDatar {
    static Scanner sin = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("""
            Selamat datang di program hitung bangun datar
            Dalam program ini Anda dapat menghitung luas 
            dari beberapa bangun datar, yaitu : 
            1. Persegi
            2. Persegi Panjang
            3. Segitiga
            4. Lingkaran
        """);
        System.out.print("Silakan pilih bangun datar yang ingin dihitung luasnya : ");
        String bangun = sin.nextLine();
        
        execute(bangun);
    }

    public static void execute(String exc) {
        switch (exc) {
            case "Persegi":
                System.out.print("Silakan masukkan panjang sisi : ");
                double sisi = sin.nextDouble();
                persegi square = new persegi(sisi);
                square.hitungLuas();
                break;
            case "Persegi Panjang":
                System.out.print("Silakan masukkan Panjang : ");
                double panjang = sin.nextDouble();
                System.out.print("Silakan masukkan Lebar : ");
                double lebar = sin.nextDouble();
                persegiPanjang rect = new persegiPanjang(panjang, lebar);
                rect.hitungLuas();
                break;
            case "Segitiga":
                System.out.print("Silakan masukkan Alas : ");
                double alas = sin.nextDouble();
                System.out.print("Silakan masukkan Tinggi : ");
                double tinggi = sin.nextDouble();
                segitiga tri = new segitiga(alas, tinggi);
                tri.hitungLuas();
                break;
            case "Lingkaran":
                System.out.print("Silakan masukkan radius : ");
                double radius = sin.nextDouble();
                lingkaran circ = new lingkaran(radius);
                circ.hitungLuas();
                break;
            default:
                break;
        }
    }
}