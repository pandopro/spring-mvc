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
        return list;
    }
}
