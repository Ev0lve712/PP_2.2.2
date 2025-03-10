package web.service;

import web.model.Car;

import java.util.List;

public interface Service {
    void addCar(String name, int year, String color);
    List<Car> getCars();
}
