package org.example;

/**
 * All Vehicles (e.g Car, Bike, Horse, Boat, Plane) have the following behavior:
 * they can be started, stopped and driven for a number of kilometers
 * <p>
 * Implement a hierarchy of Car classes where:
 * Car is a type of Vehicle
 * properties of a Car model which cannot change:
 * //fuelTankSize,
 * //fuelType (PETROL, DIESEL, etc...),
 * //gears (max 6),
 * //consumptionPer100Km (e.g 4.7)
 * properties that are configurable: availableFuel, tireSize (15, 16, 17, etc...)
 * properties that are instance specific: chassisNumber
 * consumptionPer100Km is the consumption of the car per 100 KM with the smallest tire setting (15) in first gear
 * Behavior
 * <p>
 * during a start() and a stop() the car keeps track of the how much it has consumed
 * // keep track of the fuel - trackFuel, updateFuel
 * on every start() the consumption stats are reset
 * //resetAverageFuelConsumption / resetFuelStats / resetConsumptionStats
 * a car can be driven for N kms in different gears
 */
public class App {
    public static void main(String[] args) {
        // Car car = new Car(); // this should not compile.

        //  Car car = new Dacia(27, "oiqe0934hkkadsn"); // this should not compile! If I want to create a Dacia car, I will need to create an instance of a Dacia model.

        Car car = new Logan(50, "Petrol", 5, 5.7); // Logan can extend from Dacia, while Dacia extends from Car
        car.availableFuel = 30.5;

        car.start();

        car.shiftGear(1);

        car.drive(0.01); // drives 0.01 KMs

        car.shiftGear(2);

        car.drive(0.02);

        car.shiftGear(3);

        car.drive(0.5);

        car.shiftGear(4);

        car.drive(0.5);

        car.shiftGear(4);

        car.drive(0.5);

        car.shiftGear(5);

        car.drive(10);

        car.shiftGear(4);

        car.drive(0.5);

        car.shiftGear(3);

        car.drive(0.1);

        car.stop();

        double availableFuel = car.availableFuel;

        double fuelConsumedPer100Km = car.getAverageFuelConsumption();


        Vehicle vehicle = new Logan(30, "1987ddkshik289", 6, 4.8); // available fuel and chassis number

        vehicle.start();

        vehicle.drive(1);

        vehicle.stop();

        Car car2 = (Car) vehicle;

        double availableFuel2 = car2.availableFuel;

        double fuelConsumedPer100Km2 = car.getAverageFuelConsumption();
    }
}
