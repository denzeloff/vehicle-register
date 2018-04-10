package pl.denzeloff.vehicleregister.controller;

import org.springframework.web.bind.annotation.*;
import pl.denzeloff.vehicleregister.model.Vehicle;
import pl.denzeloff.vehicleregister.service.VehicleService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class VehicleRegisterController {

    private VehicleService vehicleService;
    public VehicleRegisterController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @PostMapping("/save")
    public Vehicle saveVehicle(@RequestBody Vehicle vehicle){
        return this.vehicleService.save(vehicle);
    }

    @GetMapping("/vehicles")
    public List<Vehicle> listOfRegisteredVehicles() {
        return this.vehicleService.getAll();
    }

}
