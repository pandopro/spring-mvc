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
        carService.add(new Car("e123oo123", "renault", "logan"));
        carService.add(new Car("e564aa23", "renault", "megan"));
        carService.add(new Car("e123pc13", "renault", "koleos"));
        model.addAttribute("list", carService.getList());
        return "carList";
    }
}
