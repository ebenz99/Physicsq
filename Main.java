package physics;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main{

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

/////////////MAIN METHOD////////////////////MAIN METHOD/////////////////////////    
    public static void main(String[] args) {
        ArrayList<Particle> baseParticles = new ArrayList<Particle>();
        baseParticles = createBaseParticleList(up, charmed, top, down, strange, bottom, electron, muon, tauon, electronNeutrino, muonNeutrino, tauNeutrino);
        
        ArrayList<Particle> start = convert(listParticles("start"), baseParticles);
        double startChargeSum = chargeSum(chargeList(start));
        System.out.println("this is the end net charge: " + startChargeSum);        
    
        ArrayList<Particle> end = convert(listParticles("end"), baseParticles);
        double endChargeSum = chargeSum(chargeList(end));
        System.out.println("this is the end net charge: " + endChargeSum);
        System.out.println("ID: " + (end.get(0)).getID());
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
        int ID  = 0;
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
                Particle forSetting = new Particle(name, charge, spin, regular, mass, type);
                forSetting.setParticle(name, charge, spin, regular, mass, type);
                particles.add(forSetting);
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
    

///////////LOOKS FOR ANTIPARTICLE PAIRS IN SAME ARRAYLIST///////////////////
    public static ArrayList<Particle> findOpposites(ArrayList<Particle> one){
        ArrayList <Particle> accumulator = new ArrayList <Particle>();
        int n = 0;
        ArrayList <Integer> IDs = new ArrayList <Integer>();
        for(int i = 0; i < one.size(); i++){
            IDs.add(one.get(i).getID());
        }
        for(int j = 0; j<IDs.size(); j++){
            n=(one.get(j).getID());
            if((IDs.get(j))==n){
                accumulator.add((one.get(j)));
            }
            
        }
        return accumulator;
    }

///////////LOOKS FOR SAME PARTICLES IN START TO FINISH///////////////////
    public static ArrayList<Particle> findSames(ArrayList<Particle> start, ArrayList<Particle> end){
        ArrayList <Particle> accumulator = new ArrayList <Particle>();
        int n = 0;
        for (int i = 0; i < start.size(); i++) {
            n = ((start.get(i)).getID());
            for (int j = 0; j < end.size(); j++) {               
                if ((end.get(j).getID()) == n) {
                    accumulator.add((start.get(i)));
                }
            }
        }
        return accumulator;
    }
    
////////////////////////////LOOK FOR ELECTRON ANTI NEUTRINO PAIRS/////////////////////////

    public static ArrayList<Particle> findChargeLeptonAntiUnchargedpairs(ArrayList<Particle> one) {
        ArrayList<Particle> accumulator = new ArrayList<Particle>();
        int n = 0;
        ArrayList<Integer> IDs = new ArrayList<Integer>();
        for (int i = 0; i < one.size(); i++) {
            IDs.add(one.get(i).getID());
        }
        for (int j = 0; j < IDs.size(); j++) {
            n = (one.get(j).getID());

            if (n < 0) {
                if ((IDs.get(j)) == (-n) + 3) {
                    accumulator.add((one.get(j)));
                }
            } else {
                if ((IDs.get(j)) == (-n) - 3) {
                    accumulator.add((one.get(j)));
                }
            }
        }
        return accumulator;
    }
  
    
    

///////CREATE BASELINE////////////////////CREATE BASELINE//////////////////////////////////
public static ArrayList<Particle> createBaseParticleList(Particle one, Particle two, Particle three, Particle four, Particle five, Particle six, Particle seven, Particle eight, Particle nine, Particle ten, Particle eleven, Particle twelve){
    ArrayList<Particle> BaseParticles = new ArrayList<Particle>();
    BaseParticles.add(one);
    BaseParticles.add(two);
    BaseParticles.add(three);
    BaseParticles.add(four);
    BaseParticles.add(five);
    BaseParticles.add(six);
    BaseParticles.add(seven);
    BaseParticles.add(eight);
    BaseParticles.add(nine);
    BaseParticles.add(ten);
    BaseParticles.add(eleven);
    BaseParticles.add(twelve);
    return BaseParticles;
}


    
 ///CONVERT INPUTS TO PRESET PARTICLES////////////////////
public static ArrayList<Particle> convert(ArrayList<Particle> inputs, ArrayList <Particle> baseline){
   for (int i =0; i<inputs.size(); i++){
       if(baseline.contains(inputs.get(i))){
           int location = baseline.indexOf(inputs.get(i));
           inputs.set(i, baseline.get(location));
       }
    }
   return inputs;
}
    
////MAKE WEIGHTS INTS///
    public ArrayList<Integer> particlesToInts(ArrayList<Particle> particles){
        ArrayList<Integer> intMass = new ArrayList <Integer>();
        for (int i=0; i<particles.size(); i++){
            if(particles.get(i).getMass().equals("heavy")){
                intMass.add(3);
            }
            if(particles.get(i).getMass().equals("medium")){
                intMass.add(2);
            }
            if(particles.get(i).getMass().equals("light")){
                intMass.add(1);
            }
        }
        return intMass;
    }
    
    
///////////////FULL FIT////////////////////FULL FIT//////////////////////////////////////
    public ArrayList<String> Fit(ArrayList<Particle> startParticles, ArrayList<Particle> endParticles) {
        boolean gluon = areTheyLeptons(typeList(startParticles));
        ArrayList <Particle> sameAcross = new ArrayList <Particle>();
        sameAcross = findSames(startParticles, endParticles);
        int count = 0;
        for(int i = 0; i<sameAcross.size(); i++){
            startParticles.remove(startParticles.indexOf((sameAcross.get(i))));//used to have +count at end
            endParticles.remove(endParticles.indexOf(sameAcross.get(i)));//used to have +count at end
            count++;
        }
        double chargeDifference = ((chargeSum(chargeList(endParticles))) - (chargeSum(chargeList(endParticles))));
        
        //
        String typeTest = "";
        ArrayList<Particle> howdy = new ArrayList();
        for(int j=0; j<startParticles.size(); j++){
            typeTest = (startParticles.get(j).getType());
            for(int k=0; k<endParticles.size(); k++){//used to be startParticle.size
                if(((endParticles.get(k)).getType()).equals(typeTest)){
                    howdy.add((startParticles.get(j)));
                    howdy.add((endParticles.get(k)));
                }
            }
        }
        
        
        //if (((areTheyLeptons(typeList(startParticles))==false)&&((chargeDifference > .9) && (chargeDifference < 1.1))||((chargeDifference > -.9) && (chargeDifference < -1.1)))){
        //    gluon=true;
        //}
        //if((!((typeList(startParticles)).contains("lepton")))&&(((typeList(endParticles)).contains("lepton"))))// and pair==true{    
        //}
        ///put in boson to account for side change
        //see if particle type is same between start and end, account for differences in name
    }

}

/*
////////MAKE ANTI/REGULAR VERSION//////////////MAKE ANTI/REGULAR VERSION////////////////    
    public static void makeAnti(Particle initialParticle){
        if(((initialParticle.getName()).substring(0,4)).equals("anti")){
            initialParticle.setName((initialParticle.makeNameRegular()));
        }
        else{
            initialParticle.setName((initialParticle.makeNameAnti()));
        }
    }
*/

///////////LOOKS FOR ANTIPARTICLE PAIRS IN SAME ARRAYLIST//////////////////
    /*
    public static ArrayList<String> findOpposites(ArrayList<Particle> one){
        ArrayList <String> accumulator = new ArrayList <String>();
        for(int i = 0; i < one.size(); i++){
            if((typeList(one).contains(one.get(i).getName()))&&(typeList(one).contains(one.get(i).makeNameAnti()))){
                accumulator.add(typeList(one).get(i));
            }
        }
        return accumulator;
    }
*/
