package DAO;

import DAO.Car;

import java.util.List;

public interface CarDAO {


        List<Car> findAll();
        List<Car> findById();
        List<Car> findByName();
        boolean insertCar(Car car);
        boolean updateCar(Car car);
        boolean deleteCar(Car car);

    }

