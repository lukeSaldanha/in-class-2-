/*
title: COSC 1200
author: Luke Saldanha
Date 2024-02-23
name: Assingment 1
 */

// importing

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Services service1 = new Services();
        service1.setServiceCode("AAAA");
        service1.setServiceName("Name");
        service1.setDescription("Description");
        service1.setBasePrice(100.00);
        service1.setTimeRequired(100.00);
        service1.setIsActive(false);

        Services service2 = new Services("BBBB", "Hello",
                "", 10.00, 100.00, true);

        Services service3 = new Services("CCCC", "Hi");

        ArrayList<Services> services = new ArrayList<>();
        services.add(service1);
        services.add(service2);
        services.add(service3);

        for (Services service : services) System.out.println(service);
    }

}