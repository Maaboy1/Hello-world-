package com.cyberorgansystem;

import java.util.ArrayList;
import java.util.List;

public class OrganInventory {
    private List<CyberneticOrgan> inventory;

    public OrganInventory() {
        this.inventory = new ArrayList<>();
    }

    public void addOrgan(CyberneticOrgan organ) {
        inventory.add(organ);
        System.out.println("Organ added to inventory: " + organ.getDetails());
    }

    public CyberneticOrgan getOrgan(String model) {
        for (CyberneticOrgan organ : inventory) {
            if (organ.getModel().equals(model)) {
                return organ;
            }
        }
        System.out.println("Organ not found: " + model);
        return null;
    }
}
