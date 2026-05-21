package strategy;

public class Sedex implements Frete{
    public double calcular(double peso){
        return peso*1.8;
    }
}
