package padroesestruturais.decorator;

public abstract class CarroDecorator implements Carro {

    private Carro carro;
    public String upgrade;

    public CarroDecorator(Carro carro) {
        this.carro = carro;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public abstract float getPercentualGanhoPotencia();

    public float getGanhoPotencia() {
        return this.carro.getGanhoPotencia() * (1 + (this.getPercentualGanhoPotencia() / 100));
    }

    public abstract String getNomeUpgrade();

    public String getUpgrade() {
        return this.carro.getUpgrade() + "/" + this.getNomeUpgrade();
    }

    public void setUpgrade(String upgrade) {
        this.upgrade = upgrade;
    }
}


