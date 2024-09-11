package com.cyberorgansystem;

public class CyberneticOrgan {
    private String id;
    private String model;
    private String functionality;
    private String compatibility;

    public CyberneticOrgan(String model, String functionality, String compatibility) {
        this.model = model;
        this.functionality = functionality;
        this.compatibility = compatibility;
    }

    public String getModel() {
        return model;
    }

    public String getFunctionality() {
        return functionality;
    }

    public String getCompatibility() {
        return compatibility;
    }

    @Override
    public String toString() {
        return model + ": " + functionality + " (Compatible with " + compatibility + ")";
    }
}