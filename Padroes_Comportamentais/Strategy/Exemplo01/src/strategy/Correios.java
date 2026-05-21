package strategy;
 
public class Correios implements Frete{
    public double calcular(double peso){
        return peso*1.5;
    }
}
