package com.cyberorgansystem;

import java.util.ArrayList;
import java.util.List;

public class OrganInventory {
    private ArrayList<CyberneticOrgan> organInventory;

    public OrganInventory() {
        this.organInventory = new ArrayList<>();
    }

    public void addOrgan(CyberneticOrgan organ) {
        organInventory.add(organ);
        System.out.println("Added " + organ.getModel() + " to inventory.");
    }

    public ArrayList<CyberneticOrgan> getOrganList() {
        return organInventory;
    }

    public String removeOrgan(String model) {
        for (CyberneticOrgan organ : organInventory) {
            if (organ.getModel().equals(model)) {
                organInventory.remove(organ);
                return "Successfully removed " + model + " from inventory.";
            }
        }
        return "Organ with model " + model + " not found.";
    }

    public ArrayList<CyberneticOrgan> searchOrganByFunctionality(String functionality) {
        ArrayList<CyberneticOrgan> result = new ArrayList<>();
        for (CyberneticOrgan organ : organInventory) {
            if (organ.getFunctionality().equals(functionality)) {
                result.add(organ);
            }
        }
        return result;
    }

    public ArrayList<CyberneticOrgan> sortOrgansByModel() {
        organInventory.sort((o1, o2) -> o1.getModel().compareTo(o2.getModel()));
        return organInventory;
    }
}

