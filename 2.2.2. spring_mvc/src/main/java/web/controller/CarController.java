package web.controller;

import Model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/car")
    public String printList(ModelMap model) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("e123oo123", "renault", "logan"));
        list.add(new Car("e564aa23", "renault", "megan"));
        list.add(new Car("e123pc13", "renault", "koleos"));
        model.addAttribute("list", list);
        return "carList";
    }
}
