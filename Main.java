/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physics;

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
     
        System.out.println("Do you know particle's name?");
        Scanner sc = new Scanner(System.in);
        String doThey = sc.nextLine();
        if ((doThey.equals("yes"))){
            System.out.println("What's particle's name?");
            String name = sc.nextLine();
            Particle begin = new Particle(name);
            System.out.println("Particle Summary: " + begin.toString());
        }        
        if (doThey.equals("no")){
            String name = "?";
            System.out.println("Is the particle light, medium, or heavy? (put ? if unknown)");
            String mass = sc.nextLine();
            System.out.println("What is the particle's charge (put ? if unknown)");
            String charge = sc.nextLine();
            System.out.println("What is the particle's spin (put ? if unknown)");
            String spin = sc.nextLine(); 
            System.out.println("What is the particle anti or regular (put ? if unknown)");
            String regular = sc.nextLine();     
            Particle begin = new Particle(name, charge, spin, regular, mass);
            System.out.println("Particle Summary: " + begin.toString());
        }

    }
    
}
