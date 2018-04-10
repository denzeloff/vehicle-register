package pl.denzeloff.vehicleregister.model;

import javax.persistence.*;

@Entity
@Table(name = "Vehicles")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="vehicle_id",nullable = false,unique = true)
    private Long id;
    @Column(name="vehicle_type",nullable = false)
    private String vehicleType;
    @Column(name="vehicle_brand",nullable = false)
    private String brand;
    @Column(name="vehicle_model",nullable = false)
    private String model;
    @Column(name="vehicle_production_date",nullable = false)
    private int productionDate;
    @Column(name="vehicle_mileage",nullable = false)
    private double mileage;
    @Column(name="vehicle_registration_number",nullable = false,unique = true)
    private String registrationNumber;
    @Column(name="vehicle_vin_number",nullable = false,unique = true)
    private String vinNumber;

    public Vehicle() {
    }

    public Vehicle(Long id,String vehicleType, String brand, String model, int productionDate, double mileage, String registrationNumber, String vinNumber) {
        this.id = id;
        this.vehicleType = vehicleType;
        this.brand = brand;
        this.model = model;
        this.productionDate = productionDate;
        this.mileage = mileage;
        this.registrationNumber = registrationNumber;
        this.vinNumber = vinNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand.toUpperCase();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String carModel) {
        this.model = carModel.toUpperCase();
    }

    public int getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(int productionDate) {
        this.productionDate = productionDate;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber.toUpperCase();
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber.toUpperCase();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehicle vehicle = (Vehicle) o;

        if (id != null ? !id.equals(vehicle.id) : vehicle.id != null) return false;
        if (registrationNumber != null ? !registrationNumber.equals(vehicle.registrationNumber) : vehicle.registrationNumber != null)
            return false;
        return vinNumber != null ? vinNumber.equals(vehicle.vinNumber) : vehicle.vinNumber == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (registrationNumber != null ? registrationNumber.hashCode() : 0);
        result = 31 * result + (vinNumber != null ? vinNumber.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", vehicleType=" + vehicleType +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionDate=" + productionDate +
                ", mileage=" + mileage +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", vinNumber='" + vinNumber + '\'' +
                '}';
    }
}
