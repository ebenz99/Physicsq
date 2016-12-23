package physics;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ethan.bensman
 */

public class Main{
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
        String doThey = "Yes";

        ArrayList<Particle> start = new ArrayList<Particle>();
        ArrayList<Particle> end = new ArrayList<Particle>();
        
        System.out.println("How many particles do you start with?");
        Scanner sci = new Scanner(System.in);
        int startNum=sci.nextInt();
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<startNum; i++){
        System.out.println("Do you know particle's name?");     
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
                start.add(new Particle(name, charge, spin, regular, mass));
            }        
        }

        System.out.println("How many particles do you end with?");
        Scanner sci2 = new Scanner(System.in);
        int endNum=sci.nextInt();
        Scanner sc2 = new Scanner(System.in);
        
        for(int i=0; i<endNum; i++){
        System.out.println("Do you know particle's name?");     
        doThey = sc2.nextLine();
            if ((doThey.equals("yes"))){
                System.out.println("What's particle's name?");
                name = sc2.nextLine();
                end.add(new Particle(name));
            }        
            if (doThey.equals("no")){
                name = "?";
                System.out.println("Is the particle light, medium, or heavy? (put ? if unknown)");
                mass = sc2.nextLine();
                System.out.println("What is the particle's charge (put ? if unknown)");
                charge = sc2.nextLine();
                System.out.println("What is the particle's spin (put ? if unknown)");
                spin = sc2.nextLine(); 
                System.out.println("What is the particle anti or regular (put ? if unknown)");
                regular = sc2.nextLine(); 
                end.add(new Particle(name, charge, spin, regular, mass));
            }        
        } 
    }
}
