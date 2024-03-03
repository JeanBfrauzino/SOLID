package SOLID.L.Correto;

import java.util.ArrayList;
import java.util.List;

public interface Animal {

    void fazerBarulho();

}

public class Cachorro implements Animal {

    @Override
    public void fazerBarulho() {
        System.out.println("Au au!");
    }

}

public class Gato implements Animal {

    @Override
    public void fazerBarulho() {
        System.out.println("Miau!");
    }

}

public class Main {

    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro());
        animais.add(new Gato());

        for (Animal animal : animais) {
            animal.fazerBarulho();
        }
    }

}