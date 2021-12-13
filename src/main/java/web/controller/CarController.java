package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImp;

import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int numberOfCars, Model model) {
        List<Car> list = new CarServiceImp().getListCar();
        list = CarServiceImp.carsCount(list, numberOfCars);
        model.addAttribute("tableCars", list);
        return "cars";
    }
}
