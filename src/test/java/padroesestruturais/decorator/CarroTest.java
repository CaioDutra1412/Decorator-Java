package padroesestruturais.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarroTest {

    @Test
    void retornarPotenciaCarro() {
        Carro carro = new Install(200.0f);

        assertEquals(200.0f, carro.getGanhoPotencia());
    }

    @Test
    void retornarPotenciaCarroComStage1() {
        Carro carro = new Stage1(new Install(200.0f));

        assertEquals(209.99998f, carro.getGanhoPotencia());
    }

    @Test
    void retornarPotenciaCarroComStage2() {
        Carro carro = new Stage2(new Install(200.0f));

        assertEquals(240.00002f, carro.getGanhoPotencia());
    }

    @Test
    void retornarPotenciaCarroComStage3() {
        Carro carro = new Stage3(new Install(200.0f));

        assertEquals(300.0f, carro.getGanhoPotencia());
    }

    @Test
    void retornarPotenciaCarroComStage1EStage2() {
        Carro carro = new Stage1(new Stage2(new Install(200.0f)));

        assertEquals(252.0f, carro.getGanhoPotencia());
    }

    @Test
    void retornarPotenciaCarroComStage1EStage2EStage3() {
        Carro carro = new Stage1(new Stage2(new Stage3(new Install(200.0f))));

        assertEquals(377.99997f, carro.getGanhoPotencia());
    }

    @Test
    void retornaOriginal() {
        Carro carro = new Install();

        assertEquals("Carro Original", carro.getUpgrade());
    }

    @Test
    void retornaStage1() {
        Carro carro = new Stage1(new Install());

        assertEquals("Carro Original/Remap", carro.getUpgrade());
    }

    @Test
    void retornaStage2() {
        Carro carro = new Stage2(new Install());

        assertEquals("Carro Original/Downpipe", carro.getUpgrade());
    }

    @Test
    void retornaStage3() {
        Carro carro = new Stage3(new Install());

        assertEquals("Carro Original/Troca de Turbina", carro.getUpgrade());
    }

    @Test
    void retornaStage1EStage2() {
        Carro carro = new Stage2(new Stage1(new Install()));

        assertEquals("Carro Original/Remap/Downpipe", carro.getUpgrade());
    }

    @Test
    void retornaStage1EStage2EStage3() {
        Carro carro = new Stage3(new Stage2(new Stage1(new Install())));

        assertEquals("Carro Original/Remap/Downpipe/Troca de Turbina", carro.getUpgrade());
    }

}