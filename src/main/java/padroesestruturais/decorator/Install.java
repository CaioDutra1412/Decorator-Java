package padroesestruturais.decorator;

public class Install implements Carro {

    public float ganhopotencia;

    public Install() {
    }

    public Install(float Potencia) {
        this.ganhopotencia = Potencia;
    }

    public float getGanhoPotencia() {
        return ganhopotencia;
    }

    public String getUpgrade() {
        return "Carro Original";
    }

}
