package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Lada", 1000, 50));
        cars.add(new Car("Kia", 2000, 54));
        cars.add(new Car("Lada",1500, 36));
        cars.add(new Car("Citroen", 2000, 40));
        cars.add(new Car("BMW", 0, 55));
    }

    @Override
    public List<Car> getSomeCars(int count) {
        if(count <= 0) {
            System.out.println("Выведено некорректное или нулевое число автомобилей");
            return null;
        }
        if (count>5) {
            count = 5;
        }
        return cars.subList(0, count);
    }
}
