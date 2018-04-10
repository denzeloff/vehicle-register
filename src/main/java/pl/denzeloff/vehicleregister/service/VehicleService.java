package pl.denzeloff.vehicleregister.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.denzeloff.vehicleregister.data.VehicleRegisterRepository;
import pl.denzeloff.vehicleregister.model.Vehicle;

import java.util.List;


@Service
public class VehicleService {
    private VehicleRegisterRepository vehicleRepository;

    @Autowired
    public VehicleService(VehicleRegisterRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public Vehicle save(Vehicle vehicle) {
        return this.vehicleRepository.save(vehicle);
    }

    public List<Vehicle> getAll(){
        return this.vehicleRepository.findAll();
    }

}
