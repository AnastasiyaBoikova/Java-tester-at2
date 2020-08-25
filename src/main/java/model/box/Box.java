package model.box;

import model.fruit.Apple;
import model.fruit.Fruit;
import model.fruit.Orange;


import java.util.ArrayList;
import java.util.List;

public class Box<F extends Fruit> {


    private List<Apple> appleBox = new ArrayList<>();
    private List<Orange> orangeBox = new ArrayList<>();
    private List<Fruit> box = new ArrayList<>();


    public boolean compare(List<?> box2) {


        return box.equals(box2);

    }

    public float getWeight() {

        float sum = 0;
        for (Fruit fruit : box)  {
            sum += fruit.getWeight();
            return fruit.getWeight();
        }

        return sum;
    }

    public List<?> add(String nameFruit, int number) {

        if (nameFruit == "apple") {

            for (int i = 0; i < number; i++) {
                appleBox.add(new Apple());
            }
            return appleBox;

        } else if (nameFruit == "orange") {
            for (int i = 0; i < number; i++) {
                orangeBox.add(new Orange());
            }
            return orangeBox;

        }

        throw new RuntimeException ("неизвестный фрукт");
    }
}


