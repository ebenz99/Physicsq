/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
//import java.io.PrintStream;

/**
 *
 * @author ethan.bensman
 */
public class Main{

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Particle up = new Particle("up quark");
        Particle down = new Particle("down quark");
        Particle charmed = new Particle("charmed quark");
        Particle strange = new Particle("strange quark");
        Particle top = new Particle("top quark");
        Particle bottom = new Particle("bottom quark");
        Particle electron = new Particle("electron");
        Particle muon = new Particle("muon");
        Particle tauon = new Particle("tauon");
        Particle electronNeutrino = new Particle("electron neutrino");
        Particle muonNeutrino = new Particle("muon neutrino");
        Particle tauNeutrino = new Particle("tau neutrino");
        Particle antiUp = new Particle("anti up quark");
        Particle antiDown = new Particle("anti down quark");
        Particle antiCharmed = new Particle("anti charmed quark");
        Particle antiStrange = new Particle("anti strange quark");
        Particle antiTop = new Particle("anti top quark");
        Particle antiBottom = new Particle("anti bottom quark");
        Particle antiElectron = new Particle("anti electron");
        Particle antiMuon = new Particle("anti muon");
        Particle antiTauon = new Particle("anti tauon");
        Particle antiElectronNeutrino = new Particle("anti electron neutrino");
        Particle antiMuonNeutrino = new Particle("anti muon neutrino");
        Particle antiTauNeutrino = new Particle("anti tau neutrino");
     
        String name = "";
        String mass = "";
        String charge = "";
        String spin = "";
        String regular = "";
        String group = "";
        String doThey = "Yes";

        ArrayList<Particle> start = new ArrayList<Particle>();
        ArrayList<Particle> end = new ArrayList<Particle>();
        
        System.out.println("How many particles do you start with?");
        Scanner sci = new Scanner(System.in);
        int startNum=sci.nextInt();
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<startNum; i++){
        System.out.println("Do you know particle's name? (yes or no)");     
        doThey = sc.nextLine();
            if ((doThey.equals("yes"))){
                System.out.println("What's particle's name?");
                name = sc.nextLine();
                start.add(new Particle(name));
            }        
            if (doThey.equals("no")){
                name = "?";
                System.out.println("Is the particle light, medium, or heavy? (put ? if unknown)");
                mass = sc.nextLine();
                System.out.println("What is the particle's charge (put ? if unknown)");
                charge = sc.nextLine();
                System.out.println("What is the particle's spin (put ? if unknown)");
                spin = sc.nextLine(); 
                System.out.println("What is the particle anti or regular (put ? if unknown)");
                regular = sc.nextLine(); 
                System.out.println("Is the particle a lepton or a quark (put ? if unknown)");
                group = sc.nextLine(); 
                start.add(new Particle(name, charge, spin, regular, mass, group));
            }        
        }

        System.out.println("How many particles do you end with?");
        Scanner scin = new Scanner(System.in);
        int endNum=sci.nextInt();
        Scanner scn = new Scanner(System.in);
        
        for(int i=0; i<endNum; i++){
        System.out.println("Do you know particle's name? (yes or no)");     
        doThey = sc .nextLine();
            if ((doThey.equals("yes"))){
                System.out.println("What's particle's name?");
                name = scn.nextLine();
                end.add(new Particle(name));
            }        
            if (doThey.equals("no")){
                name = "?";
                System.out.println("Is the particle light, medium, or heavy? (put ? if unknown)");
                mass = scn.nextLine();
                System.out.println("What is the particle's charge (put ? if unknown)");
                charge = scn.nextLine();
                System.out.println("What is the particle's spin (put ? if unknown)");
                spin = scn.nextLine(); 
                System.out.println("What is the particle anti or regular (put ? if unknown)");
                regular = scn.nextLine(); 
                System.out.println("Is the particle a lepton or a quark (put ? if unknown)");
                group = scn.nextLine(); 
                end.add(new Particle(name, charge, spin, regular, mass, group));
            }        
        } 
        
        ArrayList<String> startCharges = new ArrayList<String>();
        double startNetCharge = 0;
        ArrayList<String> parts = new ArrayList<String>();
        List<String> startChargeItems = new ArrayList<String>();
        String[] intermediaryStart = new String[2];
        String compartmentOneStart = "";
        String compartmentTwoStart = "";
        for(int i=0;i<startNum; i++){
            if((!(((start.get(i)).getCharge().indexOf("/"))==-1))){
                intermediaryStart=(((start.get(i)).getCharge()).split("/"));
                compartmentOneStart = intermediaryStart[0];
                compartmentTwoStart = intermediaryStart[1];
                startChargeItems.add(compartmentOneStart);
                startChargeItems.add(compartmentTwoStart);
                //startChargeItems=(Arrays.asList(((start.get(i)).getCharge()).split("/")));
            }
            else{
                startChargeItems.add((start.get(i)).getCharge());
            }
        }
        double startChargeSum = 0;
        for(int j=0; j<(startChargeItems.size()); j++){
            if((Double.parseDouble(startChargeItems.get(j))==3)){
                startChargeSum+=((Double.parseDouble(startChargeItems.get(j-1)))/3);
                startChargeSum-=(Double.parseDouble(startChargeItems.get(j-1)));
            }
            else
                startChargeSum+=(Double.parseDouble(startChargeItems.get(j)));
        }
        System.out.println("these are the initial particle charges: " + Arrays.toString(startChargeItems.toArray()));
        System.out.println("this is the initial net charge: " + startChargeSum);
        
        ////////////////////////////////////////////////////////////////////////////
        
        ArrayList<String> endCharges = new ArrayList<String>();
        double endNetCharge = 0;
        List<String> endChargeItems = new ArrayList<String>();
        String[] intermediaryEnd = new String[2];
        String compartmentOneEnd = "";
        String compartmentTwoEnd = "";
        for(int i=0;i<endNum; i++){
            if((!(((end.get(i)).getCharge().indexOf("/"))==-1))){
                intermediaryEnd=(((end.get(i)).getCharge()).split("/"));
                compartmentOneEnd = intermediaryEnd[0];
                compartmentTwoEnd = intermediaryEnd[1];
                endChargeItems.add(compartmentOneEnd);
                endChargeItems.add(compartmentTwoEnd);
            }
            else{
                endChargeItems.add((end.get(i)).getCharge());
            }
        }
        double endChargeSum = 0;
        for(int j=0; j<(endChargeItems.size()); j++){
            if((Double.parseDouble(endChargeItems.get(j))==3)){
                endChargeSum+=((Double.parseDouble(endChargeItems.get(j-1)))/3);
                endChargeSum-=(Double.parseDouble(endChargeItems.get(j-1)));
            }
            else
                endChargeSum+=(Double.parseDouble(endChargeItems.get(j)));
        }
        System.out.println("these are the end particle charges: " + Arrays.toString(endChargeItems.toArray()));
        System.out.println("this is the end net charge: " + endChargeSum);
        
    }
}
