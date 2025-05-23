package gpb.adminka.repository;

import gpb.adminka.model.Carr;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class CarrRepository {
    private HashMap<Integer, Carr> cars;

    public CarrRepository() {
        this.cars = new HashMap<>();
    }

    public HashMap<Integer, Carr> getCarrs() {
        return cars;
    }

    public Carr getCarr(int id) {
        return cars.get(id);
    }

    public void put(Carr carr) {
        cars.put(carr.getId(), carr);
    }
}
