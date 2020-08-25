package model.box;

import model.fruit.Apple;
import model.fruit.Fruit;
import model.fruit.Orange;

import java.util.ArrayList;
import java.util.List;


class BoxTest {
//
//    @ParameterizedTest
//    @MethodSource("data")
//    void compare(Box<Fruit>box1, Box<Fruit>box2, boolean passed) {
//
//        boolean actual = box1.compare(box2);
//
//    }
//
//    public static Stream<Arguments> data() {
//        Box<Apple> appleBox = new Box<>();
//        Box<Orange> orangeBox = new Box<>();
//
//        return Stream.of(
//
//                Arguments.of(appleBox,orangeBox,false)
//
//        );
//
//
//
//    }

    public static void main(String[] args) {


        Apple apples = new Apple();

        Box<Apple> appleBox = new Box<Apple>();
        appleBox.add("apple",5);

        Box<Apple> appleBox2 = new Box<Apple>();
        appleBox2.add("apple",5);




        System.out.println(appleBox.getWeight());

    }

}