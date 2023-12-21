package com.example.Lab2.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Systems {
    ERP("Enterprise Resource Planning"),
    CRM("Customer Relationship Management"),
    WMS("Warehouse Management System"),
    SER_1("Service 1"),
    SER_2("Service 2");


    private final String system;

    Systems(String system) {
        this.system = system;
    }

    @JsonValue
    public String getSystem() {
        return system;
    }

    @Override
    public String toString() {
        return system;
    }
}
