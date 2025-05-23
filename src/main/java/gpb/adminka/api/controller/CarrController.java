package gpb.adminka.api.controller;

import gpb.adminka.model.Carr;
import gpb.adminka.model.Document;
import gpb.adminka.repository.CarrRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/carrs")
public class CarrController {

    private final CarrRepository carrRepository;

    public CarrController(CarrRepository carrRepository) {
        this.carrRepository = carrRepository;
    }

    @GetMapping
    public Map<Integer, Carr> getAllMechanics() {
        return carrRepository.getCarrs();
    }

    @GetMapping("/{id}")
    public Carr getCarrById(@PathVariable int id) {
        return carrRepository.getCarr(id);
    }
    @PostMapping
    public Carr createDocs(@RequestBody Carr carr) {
        carrRepository.put(carr);
        return carr;
    }
}