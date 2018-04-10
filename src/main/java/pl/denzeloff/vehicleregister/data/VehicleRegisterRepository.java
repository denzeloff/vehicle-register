package pl.denzeloff.vehicleregister.data;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.denzeloff.vehicleregister.model.Vehicle;


@Repository
public interface VehicleRegisterRepository extends JpaRepository<Vehicle,Long> {
}
