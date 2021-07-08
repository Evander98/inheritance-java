package inheritance;

public class Segitiga {
  public double getTinggi(int alas, int sisi1){
    double tinggi = Math.sqrt(Math.pow(sisi1, 2) - Math.pow(0.5 * alas, 2));
    return tinggi;
  }

  public double getLuas(int alas, int sisi1) {
    double luas = 0.5 * alas * getTinggi(alas, sisi1);
    return luas;
  }

  public double getKeliling(int alas, int sisi1, int sisi2){
    double keliling = alas + sisi1 + sisi2;
    return keliling;
  }

}
