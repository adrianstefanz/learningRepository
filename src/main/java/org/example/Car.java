package org.example;

public abstract class Car implements Vehicle {
    protected final double fuelTankSize;
    protected final String fuelType;
    protected int maxGears;
    protected final double consumptionPer100Km;
    protected double availableFuel;
    protected int tireSize;
    protected String chasisNumber;
    protected double averageFuelConsumptionPerTrip;
    protected int currentGear = 0;
    protected double totalkm;
    protected double totalFuelConsumed;

    protected Car(double fuelTankSize, String fuelType, int maxgGears, double consumptionPer100Km) {
        this.fuelTankSize = fuelTankSize;
        this.fuelType = fuelType;
        this.maxGears = maxgGears;
        this.consumptionPer100Km = consumptionPer100Km;

    }

    @Override
    public void start() {
        System.out.println("Stoping car");
        averageFuelConsumptionPerTrip = 0;

    }

    @Override
    public void stop() {
        System.out.println("Starting car");
        System.out.println("Available fuel " + availableFuel);
        System.out.println("Fuel consumed " + totalFuelConsumed);
        averageFuelConsumptionPerTrip = 0;
    }


    protected void shiftGear(int gears) {
        if ((gears > maxGears) || (gears < 0)) {
            System.out.println("Invalid gear ");
            return;
        }
    }

    public void calculateAverageFuelConsumption(int gear) {
        if (this.currentGear < gear) {
            averageFuelConsumptionPerTrip *= (1 + (gear - currentGear) / 10);
        } else {
            averageFuelConsumptionPerTrip /= (1 + (currentGear - gear) / 10);
        }
        currentGear = gear;

    }


    @Override
    public void drive(double km) {

        double fuelConsumed = km * consumptionPer100Km / 100;
        availableFuel -= fuelConsumed;
        System.out.println("Remaining fuel " + availableFuel);
        averageFuelConsumptionPerTrip = fuelConsumed * 100 / km;
        totalkm += km;
        totalFuelConsumed += fuelConsumed;
    }

    protected double getAverageFuelConsumption() {
        averageFuelConsumptionPerTrip = (totalFuelConsumed * 100) / totalkm;
        return averageFuelConsumptionPerTrip;
    }


}

