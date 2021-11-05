package web.service;

import org.springframework.stereotype.Component;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> cars = new ArrayList<>();

    public CarServiceImpl() {
        cars.add(new Car(2007, "Germany", "BMW"));
        cars.add(new Car(2018, "Japan", "Toyota"));
        cars.add(new Car(1985, "USSR", "Volga"));
        cars.add(new Car(2021, "USA", "Tesla"));
        cars.add(new Car(2010, "UK", "Aston Martin"));
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count >= 5) {
            return cars;
        }

        return cars.stream().limit(count).collect(Collectors.toList());

    }

}
