package hr.ferit;

import hr.ferit.working_on.Car;
import hr.ferit.working_on.WorkNeededEnum;

public class Main {

    public static void main(String[] args) {

        Garage myGarage = new Garage();
        // TODO: 06/10/2017 make simple menu with options calculate sallary, calculate car cost, input new car and then make him input car data
        Car qlientCar = new Car("Ranko", "ranko@ranko.hr", WorkNeededEnum.MECHANIC);
        myGarage.fixCar(qlientCar);

    }
}
