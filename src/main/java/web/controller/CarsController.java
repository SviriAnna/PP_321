package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDaoImpl;
import web.service.CarServiceImpl;


@Controller
public class CarsController {
    private final CarServiceImpl carSericeImpl;
    @Autowired
    public CarsController(CarServiceImpl carSericeImpl) {
        this.carSericeImpl = carSericeImpl;
    }

    @GetMapping("/cars")
    public String getSomeCars(@RequestParam(defaultValue = "5") int count, Model model) {
        model.addAttribute("cars", carSericeImpl.getSomeCars(count));
        return "someCars";
    }
}
