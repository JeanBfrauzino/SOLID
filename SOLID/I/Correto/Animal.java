package SOLID.I.Correto;

public interface AnimalDomestico {

    void comer();

    void dormir();

}

public interface AnimalSelvagem {

    void cacar();

    void fugir();

}

public class Cachorro implements AnimalDomestico {

    @Override
    public void comer() {
        System.out.println("O cachorro está comendo!");
    }

    @Override
    public void dormir() {
        System.out.println("O cachorro está dormindo!");
    }

}

public class Leao implements AnimalSelvagem {

    @Override
    public void cacar() {
        System.out.println("O leão está caçando!");
    }

    @Override
    public void fugir() {
        System.out.println("O leão está fugindo!");
    }

}
