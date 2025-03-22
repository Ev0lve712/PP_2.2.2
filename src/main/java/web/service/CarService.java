package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    void addCar(String name, int year, String color);
    List<Car> getCars(int Count);
}
