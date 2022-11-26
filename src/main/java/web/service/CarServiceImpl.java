package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService{

    List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("Model1", 1, "red"));
        cars.add(new Car("Model2", 11, "orange"));
        cars.add(new Car("Model3", 111, "yellow"));
        cars.add(new Car("Model4", 1111, "green"));
        cars.add(new Car("Model5", 11111, "blue"));
    }

    @Override
    public List<Car> listCars(int count) {
        return cars.stream().limit(count).toList();
    }
}