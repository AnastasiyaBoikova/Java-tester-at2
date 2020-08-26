package model.box;

import model.fruit.Apple;

import model.fruit.Fruit;
import model.fruit.Orange;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class BoxTest {

//    @ParameterizedTest
//    @MethodSource("data")
//    void compare(Box<Fruit>box1, Box<Fruit>box2, boolean passed) {
//
//        boolean actual = box1.compare(box2);

//    }
//
//    public static Stream<Arguments> data() {
//        Box<Apple> appleBox = new Box<>();
//        Box<Orange> orangeBox = new Box<>();
//
//        return Stream.of(
//
//                Arguments.of(appleBox,orangeBox,false)
//        );
//
//    }


    @Test
    void BoxTest() {

        Box<Apple> appleBox1 = new Box<Apple>(new Apple(), new Apple());
        Box<Apple> appleBox2 = new Box<Apple>(new Apple(), new Apple());
        Box<Apple> appleBox3 = new Box<Apple>(new Apple(), new Apple(), new Apple(), new Apple(), new Apple());
        Box<Apple> appleBox4 = new Box<Apple>();
        Box<Orange> orangeBox2 = new Box<Orange>(new Orange(), new Orange(), new Orange());



        System.out.println(appleBox3.getCount());
        System.out.println(appleBox3.sprinkle(appleBox4));
        System.out.println(appleBox3.getCount());
        System.out.println(appleBox4.getCount());


    }

    @ParameterizedTest
    @MethodSource("data")
    void compare(Box<?> box1, Box<?> box2, boolean passed) {

        boolean actual = box1.compare(box2);

        Assertions.assertEquals(passed, actual);


    }

    public static Stream<Arguments> data() {
        Box<Apple> appleBox1 = new Box<Apple>(new Apple(), new Apple());
        Box<Apple> appleBox2 = new Box<Apple>(new Apple(), new Apple());
        Box<Apple> appleBox3 = new Box<Apple>(new Apple(), new Apple(), new Apple());
        Box<Orange> orangeBox1 = new Box<Orange>(new Orange(), new Orange(), new Orange());
        Box<Orange> orangeBox2 = new Box<Orange>(new Orange(), new Orange(), new Orange());


        return Stream.of(

                Arguments.of(appleBox1, appleBox2, true),
                Arguments.of(appleBox3, appleBox2, false),
                Arguments.of(appleBox3, orangeBox1, false),
                Arguments.of(orangeBox1, orangeBox2, false)

        );


    }


    @ParameterizedTest
    @MethodSource("data1")
    void sprinkle(Box<Fruit> box1, Box<Fruit> box2) {
        float countBox1 = box1.getCount();
        float countBox2 = box2.getCount();

        box1.sprinkle(box2);

        Assertions.assertEquals(box2.getCount(),countBox2 += countBox1);



    }

    public static Stream<Arguments> data1() {
        Box<Apple> appleBox3 = new Box<Apple>(new Apple(), new Apple(), new Apple(), new Apple(), new Apple());
        Box<Apple> appleBox1 = new Box<Apple>(new Apple(), new Apple());
        Box<Apple> appleBox2 = new Box<Apple>(new Apple(), new Apple());
        Box<Apple> appleBox4 = new Box<Apple>();
        Box<Orange> orangeBox2 = new Box<Orange>(new Orange(), new Orange(), new Orange());


        return Stream.of(

                Arguments.of(appleBox3, appleBox4),
                Arguments.of(appleBox2, appleBox1),
                Arguments.of(orangeBox2, appleBox1)

        );
    }
}