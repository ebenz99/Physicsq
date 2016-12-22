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
        //do you know charge?
        //knowCharge=true
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
     
        String known="";
        System.out.println("What's the particles name?");
        Scanner sc = new Scanner(System.in);
        known += sc.nextLine() + ",";
        System.out.println("What's the charge?");
        known += sc.nextLine() + ",";
        System.out.println("What's the spin?");
        known += sc.nextLine() + ",";
        System.out.println(known);System.out.println("Is it regular or anti?");
        known += sc.nextLine() + ",";
        System.out.println(known);System.out.println("What's the mass? (light, medium, heavy, or ?)");
        known += sc.nextLine() + ",";
        
    }
    
    public static void H(String str){
        int count = 0;
        String name = "";
        String charge="";
        String spin="";
        String regular="";
        String mass="";
        int i=0;
        int j=0;
        int k=0;
        int l=0;
        int m=0;
        int n=0;
        for(i=0; i<str.length(); i++){
            if(str.charAt(i)==','){
                name=str.substring(0,i);
                break;
            }
        }
        for(j=i+1; j<str.length(); j++){
            if(str.charAt(j)==','){
                charge=str.substring(i+1,j);
                break;
            }
        }
        for(k=j+1; k<str.length(); k++){
            if(str.charAt(k)==','){
                spin=str.substring(j+1,k);
                break;
            }
        }
        for(l=k+1; l<str.length(); l++){
            if(str.charAt(l)==','){
                regular=str.substring(k+1,l);
                break;
            }
        }
        for(m=l+1; m<str.length(); m++){
            if(str.charAt(m)==','){
                mass=str.substring(l+1,m);
                break;
            }
        }
        //for(n=m+1; n<str.length(); n++){
        //    if(str.charAt(n)==','){
        //        charge=str.substring(m+1,n);
        //        break;
        //    }
        //}
    }
    
}

