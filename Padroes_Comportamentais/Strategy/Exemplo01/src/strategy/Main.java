package strategy;

public class Main {

    public static void main(String[] args) {
        double peso = 10;
        Entrega novaEntrega = new Entrega(new Sedex());
        System.out.println(novaEntrega.calcular(peso));
        novaEntrega.mudarFrete(new Correios());
        System.out.println(novaEntrega.calcular(peso));
    }
    
}
