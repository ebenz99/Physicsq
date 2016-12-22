/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physics;

/**
 *xczxczxcZXc
 * @author jeff.bensman
 */
public class Particle {
//fields
public static final String NAME_UP = "up quark";
public static final String NAME_DOWN = "down quark";
public static final String NAME_CHARMED = "charmed quark";
public static final String NAME_STRANGE = "strange quark";
public static final String NAME_TOP = "top quark";
public static final String NAME_BOTTOM = "bottom quark";

public static final String NAME_ELECTRON = "electron";
public static final String NAME_MUON = "muon";
public static final String NAME_TAUON = "tauon";
public static final String NAME_ELECTRON_NEUTRINO = "electron neutrino";
public static final String NAME_MUON_NEUTRINO = "muon neutrino";
public static final String NAME_TAU_NEUTRINO = "tau neutrino";

public static final String NAME_GLUON = "gluon";
public static final String NAME_PHOTON = "photon";
public static final String NAME_Z = "Z";
public static final String NAME_W = "W";

public static final String NAME_ANTI_UP = "anti up quark";
public static final String NAME_ANTI_DOWN = "anti down quark";
public static final String NAME_ANTI_CHARMED = "anti charmed quark";
public static final String NAME_ANTI_STRANGE = "anti strange quark";
public static final String NAME_ANTI_TOP = "anti top quark";
public static final String NAME_ANTI_BOTTOM = "anti bottom quark";

public static final String NAME_ANTI_ELECTRON = "anti electron";
public static final String NAME_ANTI_MUON = "anti muon";
public static final String NAME_ANTI_TAUON = "anti tauon";
public static final String NAME_ANTI_ELECTRON_NEUTRINO = "anti electron neutrino";
public static final String NAME_ANTI_MUON_NEUTRINO = "anti muon neutrino";
public static final String NAME_ANTI_TAU_NEUTRINO = "anti tau neutrino";
    
public static final String CHARGE_POS_TWO_THIRDS = "2/3";
public static final String CHARGE_NEG_TWO_THIRDS = "-2/3";
public static final String CHARGE_POS_ONE_THIRD = "1/3";
public static final String CHARGE_POS_ONE_THIRD = "-1/3";
public static final String CHARGE_ZERO = "0";
public static final String CHARGE_POS_ONE = "1";
public static final String CHARGE_NEG_ONE = "-1";
    
public static final String SPIN_POS_HALF = "1/2";
public static final String SPIN_NEG_HALF = "-1/2";
public static final String SPIN_ZERO = "0";
public static final String SPIN_ONE = "1";
    
public static final String MASS_HEAVY = "heavy";
public static final String MASS_MEDIUM = "medium";
public static final String MASS_LIGHT = "light";
    
public static final String TYPE_REGULAR = "regular";
public static final String TYPE_ANTI = "anti";    

private String mass;
private String charge;
private String spin;
private String regular;
private String name;

//all-args constructor
public Particle(String myName, String myCharge, String mySpin, String myRegular, String myMass){
    mass=myMass;
    charge=myCharge;
    spin=mySpin;
    regular=myRegular;
    name=myName;
}
//name constructor (not input based)
public Particle(String myName){
    if(myName=="up quark"){
     mass=MASS_LIGHT;
     name=NAME_UP_QUARK;
     charge=CHARGE_POS_TWO_THIRDS;
     spin=SPIN_POS_HALF;
     regular=TYPE_REGULAR;
    }
}
    
    
public static void setParticle(String myName, String myCharge, String mySpin, String myRegular, String myMass){
    if((name=="?")&&(charge=="?")&&(spin=="?")&&(regular=="?")&&(mass=="?")){
    System.out.println("Not enough info");    
    }
    if(((mass=="light")&&(charge=="2/3"))||(name=="up")){
    //set everything to up quark;    
    }
    if(((mass=="medium")&&(charge=="2/3"))||(name=="charmed")){
    //set everything to charmed quark;    
    }
    if(((mass=="heavy")&&(charge=="2/3"))||(name=="top")){
    //set everything to top quark;    
    }
    if(((mass=="light")&&(charge=="-1/3"))||(name=="down")){
    //set everything to down quark;    
    }
    if(((mass=="medium")&&(charge=="-1/3"))||(name=="strange")){
    //set everything to strange quark;    
    }
    if(((mass=="heavy")&&(charge=="-1/3"))||(name=="bottom")){
    //set everything to bottom quark;    
    }
                
}

}
