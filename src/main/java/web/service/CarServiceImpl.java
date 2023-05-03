package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;
@Component
public class CarServiceImpl implements CarService {

    private final CarDao daoCar;

    CarServiceImpl(CarDaoImpl daoCar) {
        this.daoCar = daoCar;
    }

    @Override
    public List<Car> getSomeCars(int countOfCars) {
        return daoCar.getSomeCars(countOfCars);
    }

}
