package project.controller;
import org.springframework.beans.factory.annotation.Autowired;
import project.model.*;
import project.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class CarController {
    @Autowired
    Service<Car> carService;

    @GetMapping(value = "/cars")
    public String printList(ModelMap model) {
        model.addAttribute("list", carService.getList());
        return "carList";
    }
}
