package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;
@Component
public class CarServiceImpl implements CarService {

    CarDao daoCar = new CarDaoImpl();

    @Override
    public List<Car> getSomeCars(int countOfCars) {
        return daoCar.getSomeCars(countOfCars);
    }

}
