package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDaoImpl;


@Controller
public class CarsController {
    private final CarDaoImpl carDaoImlp;

    @Autowired
    public CarsController(CarDaoImpl carDaoImlp) {
        this.carDaoImlp = carDaoImlp;
    }

    @GetMapping("/cars")
    public String getSomeCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("cars", carDaoImlp.getSomeCars(count));
        return "someCars";
    }
}
