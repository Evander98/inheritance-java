package inheritance;

public class Lingkaran {
  private double r;
  private double phi = r % 7 == 0 ? (22.0/7.0) : 3.14;

  public void setR(double r){
    this.r = r;
  }

  public double getPhi(){
    return phi;
  }

  public double getR(){
    return r;
  }

  public double luasLingkaran(){
    return phi * r * r;
  }
  
  public double kelilingLingkaran(){
    return 2 * phi * r;
  }
}
