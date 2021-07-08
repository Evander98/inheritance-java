package inheritance;

public class Prisma extends Segitiga {
  public double getVolume(int alas, int sisi1, int tinggiPrisma) {
    double volume = getLuas(alas, sisi1) * tinggiPrisma;
    return volume;
  }
}
