package padroesestruturais.decorator;

public class Stage3 extends CarroDecorator {

    public Stage3(Carro carro) {
        super(carro);
    }

    public float getPercentualGanhoPotencia() {return 50.0f;}

    public String getNomeUpgrade() {
        return "Troca de Turbina";
    }
}

