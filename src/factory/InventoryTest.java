package factory;

import factory.bases.Goods;
import factory.bases.Property;
import factory.movable.*;
import factory.nonMovable.*;

import java.util.ArrayList;

public class InventoryTest {
    public static void main(String[] args){

        Car car = new Car(200);
        Truck truck = new Truck(500);
        Bicycle bicycle = new Bicycle(20);
        QuadBikes quadBikes = new QuadBikes(100);
        ElectricCar electricCar = new ElectricCar(150);
        RoboticTrolley roboticTrolley = new RoboticTrolley(300);

        SmallMachine smallMachine = new SmallMachine(300);
        smallMachine.setStuff(3);
        Lathe lathe = new Lathe(600);
        lathe.setStuff(9);

        ArrayList<Property> movable = new ArrayList<>();
        movable.add(car);
        movable.add(truck);
        movable.add(bicycle);
        movable.add(quadBikes);
        movable.add(electricCar);
        movable.add(roboticTrolley);

        ArrayList<Property> nonMovable = new ArrayList<>();
        nonMovable.add(smallMachine);
        nonMovable.add(lathe);

        Goods goods = new Car();

        System.out.println("Prise of movable: " + goods.sumPrice(movable));
        System.out.println("Prise of non movable: " + goods.sumPrice(nonMovable));
        System.out.println("Stuff: " + goods.stuffNumber(nonMovable));
    }
}
