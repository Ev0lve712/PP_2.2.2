package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

    private List<Car> cars = new ArrayList<>();

    public ServiceImpl() {
        startCar();
    }

    @Override
    public void addCar(String name, int year, String color) {
        Car car = new Car(name, year, color);
        cars.add(car);
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }

    public void startCar(){
        addCar("Model_1", 1990, "Red");
        addCar("Model_2", 2000, "Yellow");
        addCar("Model_3", 1990, "Yellow");
        addCar("Model_4", 2000, "Yellow");
        addCar("Model_5", 1990, "Yellow");
    }
}
