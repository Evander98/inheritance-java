package inheritance;

public class Bola extends Lingkaran {

  public double volumeBola(){
    return (4.0/3.0) * getPhi() * Math.pow(getR(), 3);
  }
}
