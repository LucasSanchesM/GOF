package strategy;

public class Entrega {
    private Frete frete;
    
    public Entrega(Frete frete){
        this.frete = frete;
    }
    
    public double calcular (double peso){
        return frete.calcular(peso);
    }
    
    public void mudarFrete(Frete novoFrete){
        this.frete = novoFrete;
    }
}
