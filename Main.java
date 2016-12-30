package physics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {
        ArrayList<Particle> start = listParticles("start");
        double startChargeSum = chargeSum(chargeList(start));
        System.out.println("this is the end net charge: " + startChargeSum);        
    
        ArrayList<Particle> end = listParticles("end");
        double endChargeSum = chargeSum(chargeList(end));
        System.out.println("this is the end net charge: " + endChargeSum);
    }
///////////END OF MAIN METHOD/////////////END OF MAIN METHOD///////////////////////////////////////


//////////LIST INPUT PARTICLES/////////////////LIST INPUT PARTICLES////////////////    
    public static ArrayList<Particle> listParticles(String where){
        ArrayList<Particle> particles = new ArrayList<Particle>();    
        if(where.equals("start"))
            System.out.println("How many particles do you start with?");
        if(where.equals("end"))
            System.out.println("How many particles do you end with?");
        Scanner scin = new Scanner(System.in);
        int particlesNum=scin.nextInt();
        Scanner scn = new Scanner(System.in);
        String doThey = "";
        String name = "";
        String mass = "";
        String spin = "";
        String charge = "";
        String regular = "";
        String type = ""; 
        for(int i=0; i<particlesNum; i++){
        System.out.println("Do you know particle's name? (yes or no)");     
        doThey = scn.nextLine();
            if ((doThey.equals("yes"))){
                System.out.println("What's particle's name?");
                name = scn.nextLine();
                particles.add(new Particle(name));
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
                type = scn.nextLine(); 
                particles.add(new Particle(name, charge, spin, regular, mass, type));
            }        
        }  
        return particles;
    }
    
    
////////LIST CHARGES////////////////////LIST CHARGES///////////////////////    
    public static List<String> chargeList(ArrayList<Particle> startOrEnd){
       double startOrEndNetCharge = 0;
       int num = startOrEnd.size();
        List<String> startOrEndChargeItems = new ArrayList<String>();
        String[] intermediaryStartOrEnd = new String[2];
        String compartmentOneStartOrEnd = "";
        String compartmentTwoStartOrEnd = "";
        for(int i=0;i<num; i++){
            if((!(((startOrEnd.get(i)).getCharge().indexOf("/"))==-1))){
                intermediaryStartOrEnd=(((startOrEnd.get(i)).getCharge()).split("/"));
                compartmentOneStartOrEnd = intermediaryStartOrEnd[0];
                compartmentTwoStartOrEnd = intermediaryStartOrEnd[1];
                startOrEndChargeItems.add(compartmentOneStartOrEnd);
                startOrEndChargeItems.add(compartmentTwoStartOrEnd);
            }
            else{
                startOrEndChargeItems.add((startOrEnd.get(i)).getCharge());
            }
        }
        return startOrEndChargeItems;
    }
    
    
///////////SUM CHARGES//////////////////SUM CHARGES////////////////////////////////
    public static double chargeSum(List<String> startOrEndCharges){        
        double startOrEndChargeSum = 0;
        for(int j=0; j<(startOrEndCharges.size()); j++){
            if((Double.parseDouble(startOrEndCharges.get(j))==3)){
                startOrEndChargeSum+=((Double.parseDouble(startOrEndCharges.get(j-1)))/3);
                startOrEndChargeSum-=(Double.parseDouble(startOrEndCharges.get(j-1)));
            }
            else
                startOrEndChargeSum+=(Double.parseDouble(startOrEndCharges.get(j)));
        }
        return startOrEndChargeSum;
    }
    
    ////////LIST PARTICLE TYPES/////////////LIST PARTICLE TYPES/////////////
    public static List<String> typeList(ArrayList<Particle> startOrEnd){
        int num = startOrEnd.size();
        List<String> startOrEndTypeItems = new ArrayList<String>();
        for(int i=0;i<num; i++){
                startOrEndTypeItems.add(((startOrEnd.get(i)).getType()));
        }
        return startOrEndTypeItems;
    }
    
    //////////CHECK FOR QUARKS////////////CHECK FOR QUARKS////////////////////
    public static boolean areTheyLeptons(List<String> TypeItems){
        int n = 0;
        for(int j=0; j<TypeItems.size(); j++){
            if(((TypeItems.get(j)).equals("lepton"))){
                n++;
            }
        }
        if(n>0)
            return false;
        else
            return true;
    }
    
//////////////LIST MASSES/////////////////LIST MASSES//////////////////////////
    public static List<String> massList(ArrayList<Particle> startOrEnd){
        int num = startOrEnd.size();
        List<String> startOrEndMassItems = new ArrayList<String>();
        for(int i=0; i<num; i++){
                startOrEndMassItems.add(((startOrEnd.get(i)).getMass()));
        }
        return startOrEndMassItems;
    }
    
////////ARRANGE MASSES/////////////////////ARRANGE MASSES///////////////////////
    public static List<String> arrangeMassList(List<String> massList){
        int num = massList.size();
        List<String> startOrEndArrangedMassItems = new ArrayList<String>();
        for(int i=0; i<num; i++){
            if((massList.get(i)).equals("light")){
                startOrEndArrangedMassItems.add(massList.get(i));
            }
        }
        for(int j=0; j<num; j++){
            if((massList.get(j)).equals("medium")){
                startOrEndArrangedMassItems.add(massList.get(j));
            }
        }
        for(int k=0; k<num; k++){
            if((massList.get(k)).equals("heavy")){
                startOrEndArrangedMassItems.add(massList.get(k));
            }
        }        
        return startOrEndArrangedMassItems;
    }
    
////////MAKE ANTI/REGULAR VERSION//////////////MAKE ANTI/REGULAR VERSION////////////////    
    public static void makeAnti(Particle initialParticle){
        if(((initialParticle.getName()).substring(0,4)).equals("anti")){
            initialParticle.setName((initialParticle.makeNameRegular()));
        }
        else{
            initialParticle.setName((initialParticle.makeNameAnti()));
        }
    }
    
    public static boolean findOpposites(ArrayList<Particle> one){
    
    }

////////////////FULL FIT////////////////////FULL FIT//////////////////////////////////////
    public ArrayList<String> Fit(ArrayList<Particle> startParticles, ArrayList<Particle> endParticles){
        boolean gluon = areTheyLeptons(typeList(startParticles));
        double chargeDifference = ((chargeSum(chargeList(endParticles)))-(chargeSum(chargeList(endParticles))));
        if (((areTheyLeptons(typeList(startParticles))==false)&&((chargeDifference > .9) && (chargeDifference < 1.1))||((chargeDifference > -.9) && (chargeDifference < -1.1)))){
            gluon=true;
        }
        if((!((typeList(startParticles)).contains("lepton")))&&(((typeList(endParticles)).contains("lepton"))))// and pair==true{    
    
        }
        ///put in boson to account for side change
        //see if particle type is same between start and end, account for differences in name
    }


    
//////////PRESET PARTICLES/////////////////PRESET PARTICLES///////////////////////
    public static final Particle up = new Particle("up quark");
    public static final Particle down = new Particle("down quark");
    public static final Particle charmed = new Particle("charmed quark");
    public static final Particle strange = new Particle("strange quark");
    public static final Particle top = new Particle("top quark");
    public static final Particle bottom = new Particle("bottom quark");
    public static final Particle electron = new Particle("electron");
    public static final Particle muon = new Particle("muon");
    public static final Particle tauon = new Particle("tauon");
    public static final Particle electronNeutrino = new Particle("electron neutrino");
    public static final Particle muonNeutrino = new Particle("muon neutrino");
    public static final Particle tauNeutrino = new Particle("tau neutrino");
    public static final Particle antiUp = new Particle("anti up quark");
    public static final Particle antiDown = new Particle("anti down quark");
    public static final Particle antiCharmed = new Particle("anti charmed quark");
    public static final Particle antiStrange = new Particle("anti strange quark");
    public static final Particle antiTop = new Particle("anti top quark");
    public static final Particle antiBottom = new Particle("anti bottom quark");
    public static final Particle antiElectron = new Particle("anti electron");
    public static final Particle antiMuon = new Particle("anti muon");
    public static final Particle antiTauon = new Particle("anti tauon");
    public static final Particle antiElectronNeutrino = new Particle("anti electron neutrino");
    public static final Particle antiMuonNeutrino = new Particle("anti muon neutrino");
    public static final Particle antiTauNeutrino = new Particle("anti tau neutrino");
}
