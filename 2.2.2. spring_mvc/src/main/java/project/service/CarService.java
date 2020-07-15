package project.service;

import project.model.Car;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class CarService implements Service<Car> {
    private List<Car> list = new ArrayList<>();

    @Override
    public void add(Car object) {
        list.add(object);
    }

    @Override
    public List<Car> getList() {
        if(list.size()==0) {
            list.add(new Car("e564aa23", "renault", "megan"));
            list.add(new Car("e123pc13", "renault", "koleos"));
            list.add(new Car("e123oo123", "renault", "logan"));
            list.add(new Car("e908op93", "ford", "mondeo"));
            list.add(new Car("e333oo543", "lada", "vesta"));
        }
        return list;
    }
}
