package padroesestruturais.decorator;

public class Stage2 extends CarroDecorator {

    public Stage2(Carro carro) {
        super(carro);
    }

    public float getPercentualGanhoPotencia() {
        return 20.0f;
    }

    public String getNomeUpgrade() {
        return "Downpipe";
    }
}
