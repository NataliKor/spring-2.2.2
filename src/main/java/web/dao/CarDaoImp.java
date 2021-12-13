package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao{

    @Override
    public List<Car> getListCar() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Audi", "Cabriolet", "Germany"));
        carList.add(new Car("BMW", "X5", "Germany"));
        carList.add(new Car("Ford", "Fiesta", "USA"));
        carList.add(new Car("Geely", "Coolray", "China"));
        carList.add(new Car("Toyota", "Alphard", "Japan"));
        return carList;
    }
}
