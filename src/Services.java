/*
title: COSC 1200
author: Luke Saldanha
Date 2024-02-23
name: Assingment 1
 */

// importing


public class Services {

    // Properties
    private String serviceCode;
    private String serviceName;
    private String description;
    private double basePrice;
    private double timeRequired;
    private boolean isActive;

    // Default Constructor
    public Services() {
    }

    // Parameterized Constructor
    public Services(String serviceCode, String serviceName, String description,
                    double basePrice, double timeRequired, boolean isActive) {
        setServiceCode(serviceCode);
        setServiceName(serviceName);
        setDescription(description);
        setBasePrice(basePrice);
        setTimeRequired(timeRequired);
        setIsActive(isActive);
    }

    // Secondary Parameterized Constructor
    public Services(String serviceCode, String serviceName) {
        setServiceCode(serviceCode);
        setServiceName(serviceName);
        setDefaults();
    }

    // Getters
    public String getServiceCode() {
        return serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getDescription() {
        return description;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getTimeRequired() {
        return timeRequired;
    }

    public boolean getIsActive() {
        return isActive;
    }

    // Setters
    public void setServiceCode(String serviceCode) {
        if (serviceCode.length() == 4) {
            this.serviceCode = serviceCode;
        } else {
            System.out.println("Service Code must be 4 characters long.");
        }
    }

    public void setServiceName(String serviceName) {
        if (serviceName.length() <= 50 && !serviceName.isEmpty()) {
            this.serviceName = serviceName;
        } else {
            System.out.println("Service Name must not exceed 50 characters.");
        }
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBasePrice(double basePrice) {
        if (basePrice >= 0.00 && basePrice <= 5000.00) {
            this.basePrice = basePrice;
        } else {
            System.out.println("Base Price must be between 0.00 and 5000.00.");
        }
    }

    public void setTimeRequired(double timeRequired) {
        if (timeRequired >= 0.00 && timeRequired <= 100.00) {
            this.timeRequired = timeRequired;
        } else {
            System.out.println("Time Required must be between 0.00 and 100.00.");
        }
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    // Instance Method
    public String toString() {
        return String.format("""
                        -------------------------------
                        Service Code: %s
                        Service Name: %s
                        Description: %s
                        Base Price: %.2f
                        Time Required: %.2f
                        Is Active: %b
                        -------------------------------
                        """, getServiceCode(), getServiceName(), getDescription(),
                getBasePrice(), getTimeRequired(), getIsActive());
    }

    public void flipActive() {
        isActive = !isActive;
    }

    // Private method for setting default values
    private void setDefaults() {

    }
}

