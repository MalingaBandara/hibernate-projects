package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity ( name = "laptop_table")
public class Laptop {

    @Id
    @GeneratedValue
    private long laptopId;

    private String brand;



}
