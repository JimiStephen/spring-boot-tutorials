package com.jimi.spring.boot.testing.beans;

/**
 * @author jimi
 * @version 1.0
 * @date 2020/7/21 15:11
 */
public class VehicleDetails {
    private String make;
    private String model;

    public VehicleDetails(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }
}
