package com.cyberorgansystem;

import java.util.ArrayList;
import java.util.List;

public class Patient {
    private String name;
    private CyberneticOrgan[] installedOrgans;
    private int organCount;

    public Patient(String name) {
        this.name = name;
        this.installedOrgans = new CyberneticOrgan[5]; // Fixed capacity
        this.organCount = 0;
    }

    public String addOrgan(CyberneticOrgan organ) {
        if (organCount < 5) {
            installedOrgans[organCount] = organ;
            organCount++;
            return "Added " + organ.getModel() + " to " + name + "'s installed organs.";
        } else {
            return "No space available to add another organ.";
        }
    }

    public ArrayList<CyberneticOrgan> getOrganList() {
        ArrayList<CyberneticOrgan> organList = new ArrayList<>();
        for (int i = 0; i < organCount; i++) {
            organList.add(installedOrgans[i]);
        }
        return organList;
    }

    public void listOrgans() {
        if (organCount == 0) {
            System.out.println(name + " has no installed organs.");
        } else {
            System.out.println("Listing installed organs for " + name + ":");
            for (int i = 0; i < organCount; i++) {
                System.out.println("- " + installedOrgans[i].getModel() + ": " + installedOrgans[i].getFunctionality());
            }
        }
    }
}


