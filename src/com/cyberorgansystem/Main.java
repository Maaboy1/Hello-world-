package com.cyberorgansystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        OrganInventory inventory = new OrganInventory();
        Patient patient = new Patient("Peter");

        System.out.println("Adding organs to inventory...");
        CyberneticOrgan heart = new CyberneticOrgan("CyberHeartX1", "Pumps blood", "Type O");
        CyberneticOrgan eye = new CyberneticOrgan("CyberEyeV2", "Enhanced vision", "Type A");
        inventory.addOrgan(heart);
        inventory.addOrgan(eye);

        System.out.println("Adding organs to patient Peter...");
        System.out.println(patient.addOrgan(heart));

        patient.listOrgans();

        System.out.println("Searching for organs with functionality 'Enhanced vision'...");
        ArrayList<CyberneticOrgan> searchResults = inventory.searchOrganByFunctionality("Enhanced vision");
        System.out.println("Found " + searchResults.size() + " organ(s):");
        for (CyberneticOrgan organ : searchResults) {
            System.out.println("- " + organ.getModel() + ": " + organ.getFunctionality());
        }

        System.out.println("Sorting organs by model name in inventory...");
        ArrayList<CyberneticOrgan> sortedOrgans = inventory.sortOrgansByModel();
        System.out.println("Sorted organs:");
        for (CyberneticOrgan organ : sortedOrgans) {
            System.out.println("- " + organ.getModel());
        }
    }
}

