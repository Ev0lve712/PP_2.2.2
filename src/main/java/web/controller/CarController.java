package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.Service;
import web.service.ServiceImpl;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CarController {
    private final Service service;

    @Autowired
    public CarController(Service service) {
        this.service = service;
    }

    @GetMapping(value = "/cars")
    public String carsTable(@RequestParam(required = false, defaultValue = "5") int count, ModelMap model) {
        List<Car> cars = service.getCars();
        if(count < 5) {
            cars = cars.subList(0, count);
        }
        model.addAttribute("cars", cars);

        return "cars";
    }
}
