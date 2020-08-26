package model.box;

import model.fruit.Fruit;

import java.util.ArrayList;

public class Box<F extends Fruit> {


    private ArrayList<F> items = new ArrayList<F>();

    public Box(F... fruits) {
        for (F fruit : fruits) {
            this.items.add(fruit);
        }
    }

    public F getByIndex(int index) {
        return items.get(index);
    }

    public float getCount() {
        return items.size();
    }

    public boolean compare(Box<?> box) {
        float countThis = this.getCount();
        float countBox = box.getCount();
        float weightThis = this.getWeight();
        float weightBox = box.getWeight();
        if (countThis == countBox && weightThis == weightBox) {
            return true;
        }
        return false;
    }

    public float getWeight() {
        float sum = 0;
        for (Fruit fruit : items) {
            sum += fruit.getWeight();
        }
        return sum;
    }

    public float sprinkle(Box<F> next) {
        for (F aItem : items) {
            next.add(aItem);
        }

//        while (items.size() > 0) {
//            next.add(items.remove(0));
//        }

        items.clear();
        return next.getCount();
    }


    public void add(F fruit) {
        items.add(fruit);
    }
}


