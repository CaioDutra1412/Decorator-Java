package padroesestruturais.decorator;

public class Stage1 extends CarroDecorator {

    public Stage1(Carro carro) {
        super(carro);
    }

    public float getPercentualGanhoPotencia() {
        return 5.0f;
    }

    public String getNomeUpgrade() {
        return "Remap";
    }
}
