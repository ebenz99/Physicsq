package physics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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

    ArrayList<Particle> start = listParticles("start");
    double startChargeSum = chargeSum(chargeList(start));
    System.out.println("this is the end net charge: " + startChargeSum);        
    
    ArrayList<Particle> end = listParticles("end");
    double endChargeSum = chargeSum(chargeList(end));
    System.out.println("this is the end net charge: " + endChargeSum);
}

///////////END OF MAIN METHOD/////////////END OF MAIN METHOD///////////////////////////////////////
    
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
        String group = ""; 
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
                group = scn.nextLine(); 
                particles.add(new Particle(name, charge, spin, regular, mass, group));
            }        
        }  
        return particles;
    }
    
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
}
//MAKE METHOD TO CHECK ARRAYLISTS FOR CERTAIN VALUES (i.e. are there any quarks)

/*public void Fit(ArrayList<String> start, ArrayList<String> end, ArrayList<String> startCharges, ArrayList<String> endCharges, int startNetCharge, int endNetCharge){

}

        ArrayList<String> startGroup = new ArrayList<String>();
        for(int q=0; q<startNum; q++){
            startGroup.add((((start.get(q)).getGroup())));
        }

*/
