package pl.denzeloff.vehicleregister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.denzeloff.vehicleregister.model.Vehicle;
import pl.denzeloff.vehicleregister.service.VehicleService;

@SpringBootApplication
public class VehicleRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehicleRegisterApplication.class, args);
    }
}
