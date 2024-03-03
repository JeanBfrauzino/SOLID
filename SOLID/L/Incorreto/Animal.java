package SOLID.L.Incorreto;

public interface Animal {

    void fazerBarulho();

    void voar();

}

public class Cachorro implements Animal {

    @Override
    public void fazerBarulho() {
        System.out.println("Au au!");
    }

