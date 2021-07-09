package inheritance;

import java.util.Scanner;

public class Main {
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    Segitiga segitiga = new Segitiga();
    Prisma prisma = new Prisma();

    Bola bola = new Bola();

    Persegi persegi = new Persegi();
    Kubus kubus = new Kubus();
    
    System.out.println("================================Segitiga & Prisma========================================");
    System.out.print("Masukkan alas segitiga: ");
    int alasSegitiga = sc.nextInt();

    System.out.print("Masukkan sisi kiri segitiga: ");
    int sisiKiri = sc.nextInt();

    System.out.print("Masukkan sisi kanan segitiga: ");
    int sisiKanan = sc.nextInt();


    System.out.print("Masukkan tinggi prisma: ");
    int tinggiPrisma = sc.nextInt();

    System.out.println();

    System.out.println("Luas Segitiga: " + segitiga.getLuas(alasSegitiga, sisiKanan));
    System.out.println("Keliling segitiga: " + segitiga.getKeliling(alasSegitiga, sisiKiri, sisiKanan));
    System.out.println("Volume prisma: " + prisma.getVolume(alasSegitiga, sisiKanan, tinggiPrisma));

    System.out.println();

    System.out.println("================================Lingkaran & Bola========================================");
    System.out.print("Masukkan jari-jari lingkaran: ");
    double r = sc.nextDouble();

    System.out.println();

    bola.setR(r);

    System.out.println("Luas Lingkaran: " + bola.luasLingkaran());
    System.out.println("Keliling Lingkaran: " + bola.kelilingLingkaran());
    System.out.println("Volume bola: " + bola.volumeBola());

    System.out.println();
    
    System.out.println("================================Persegi & Kubus========================================");
    
    System.out.print("Masukkan panjang persegi: ");
    int panjangPersegi = sc.nextInt();
    
    System.out.println();

    System.out.println("Luas Persegi: " + persegi.luasPersegi(panjangPersegi));
    System.out.println("Keliling Persegi: " + persegi.kelilingPersegi(panjangPersegi));
    System.out.println("Volume Kubus: " + kubus.volumeKubus(panjangPersegi));

    sc.close();
  }
  
}
