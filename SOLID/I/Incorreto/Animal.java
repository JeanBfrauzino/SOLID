package SOLID.I.Incorreto;

public interface Animal {

    void comer();

    void dormir();

    void cacar();

    void fugir();

}

public class Cachorro implements Animal {

    @Override
    public void comer() {
        System.out.println("O cachorro está comendo!");
    }

    @Override
    public void dormir() {
        System.out.println("O cachorro está dormindo!");
    }

    @Override
    public void cacar() {
        // O cachorro não caça
    }

    @Override
    public void fugir() {
        // O cachorro não foge
    }

}
