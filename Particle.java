/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physics;

/**
 *xczxczxcZXc
 * @author ethan.bensman
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
    if(myName=="down quark"){
     mass=MASS_LIGHT;
     name=NAME_DOWN_QUARK;
     charge=CHARGE_NEG_ONE_THIRD;
     spin=SPIN_POS_HALF;
     regular=TYPE_REGULAR;
    }
    if(myName=="charmed quark"){
     mass=MASS_MEDIUM;
     name=NAME_CHARMED_QUARK;
     charge=CHARGE_POS_TWO_THIRDS;
     spin=SPIN_POS_HALF;
     regular=TYPE_REGULAR;
    }
    if(myName=="strange quark"){
     mass=MASS_MEDIUM;
     name=NAME_STRANGE_QUARK;
     charge=CHARGE_NEG_ONE_THIRD;
     spin=SPIN_POS_HALF;
     regular=TYPE_REGULAR;
    }
    if(myName=="top quark"){
     mass=MASS_HEAVY;
     name=NAME_TOP_QUARK;
     charge=CHARGE_POS_TWO_THIRDS;
     spin=SPIN_POS_HALF;
     regular=TYPE_REGULAR;
    }
    if(myName=="bottom quark"){
     mass=MASS_HEAVY;
     name=NAME_BOTTOM_QUARK;
     charge=CHARGE_NEG_ONE_THIRD;
     spin=SPIN_POS_HALF;
     regular=TYPE_REGULAR;
    }
     if(myName=="electron"){
      mass=MASS_LIGHT;
      name=NAME_ELECTRON;
      charge=CHARGE_NEG_ONE;
      spin=SPIN_POS_HALF;
      regular=TYPE_REGULAR;
    }
     if(myName=="muon"){
      mass=MASS_MEDIUM;
      name=NAME_MUON;
      charge=CHARGE_NEG_ONE;
      spin=SPIN_POS_HALF;
      regular=TYPE_REGULAR;
    }
    if(myName=="tauon"){
     mass=MASS_HEAVY;
     name=NAME_TAUON;
     charge=CHARGE_NEG_ONE;
     spin=SPIN_POS_HALF;
     regular=TYPE_REGULAR;
    }
     if(myName=="electron neutrino"){
      mass=MASS_LIGHT;
      name=NAME_ELECTRON_NEUTRINO;
      charge=CHARGE_ZERO;
      spin=SPIN_POS_HALF;
      regular=TYPE_REGULAR;
    }
     if(myName=="muon neutrino"){
      mass=MASS_MEDIUM;
      name=NAME_MUON_NEUTRINO;
      charge=CHARGE_ZERO;
      spin=SPIN_POS_HALF;
      regular=TYPE_REGULAR;
    }
    if(myName=="tau neutrino"){
     mass=MASS_HEAVY;
     name=NAME_TAU_NEUTRINO;
     charge=CHARGE_ZERO;
     spin=SPIN_POS_HALF;
     regular=TYPE_REGULAR;
    }    
        if(myName=="anti up quark"){
     mass=MASS_LIGHT;
     name=NAME_ANTI_UP_QUARK;
     charge=CHARGE_NEG_TWO_THIRDS;
     spin=SPIN_POS_HALF;
     regular=TYPE_ANTI;
    }
    if(myName=="anti down quark"){
     mass=MASS_LIGHT;
     name=NAME_ANTI_DOWN_QUARK;
     charge=CHARGE_POS_ONE_THIRD;
     spin=SPIN_POS_HALF;
     regular=TYPE_ANTI;
    }
    if(myName=="anti charmed quark"){
     mass=MASS_MEDIUM;
     name=NAME_ANTI_CHARMED_QUARK;
     charge=CHARGE_NEG_TWO_THIRDS;
     spin=SPIN_POS_HALF;
     regular=TYPE_ANTI;
    }
    if(myName=="anti strange quark"){
     mass=MASS_MEDIUM;
     name=NAME_ANTI_STRANGE_QUARK;
     charge=CHARGE_POS_ONE_THIRD;
     spin=SPIN_POS_HALF;
     regular=TYPE_ANTI;
    }
    if(myName=="anti top quark"){
     mass=MASS_HEAVY;
     name=NAME_ANTI_TOP_QUARK;
     charge=CHARGE_NEG_TWO_THIRDS;
     spin=SPIN_POS_HALF;
     regular=TYPE_ANTI;
    }
    if(myName=="anti bottom quark"){
     mass=MASS_HEAVY;
     name=NAME_ANTI_BOTTOM_QUARK;
     charge=CHARGE_POS_ONE_THIRD;
     spin=SPIN_POS_HALF;
     regular=TYPE_ANTI;
    }
     if(myName=="anti electron"){
      mass=MASS_LIGHT;
      name=NAME_ANTI_ELECTRON;
      charge=CHARGE_POS_ONE;
      spin=SPIN_POS_HALF;
      regular=TYPE_ANTI;
    }
     if(myName=="anti muon"){
      mass=MASS_MEDIUM;
      name=NAME_ANTI_MUON;
      charge=CHARGE_POS_ONE;
      spin=SPIN_POS_HALF;
      regular=TYPE_ANTI;
    }
    if(myName=="anti tauon"){
     mass=MASS_HEAVY;
     name=NAME_ANTI_TAUON;
     charge=CHARGE_POS_ONE;
     spin=SPIN_POS_HALF;
     regular=TYPE_ANTI;
    }
     if(myName=="anti electron neutrino"){
      mass=MASS_LIGHT;
      name=NAME_ANTI_ELECTRON_NEUTRINO;
      charge=CHARGE_ZERO;
      spin=SPIN_POS_HALF;
      regular=TYPE_ANTI;
    }
     if(myName=="anti muon neutrino"){
      mass=MASS_MEDIUM;
      name=NAME_ANTI_MUON_NEUTRINO;
      charge=CHARGE_ZERO;
      spin=SPIN_POS_HALF;
      regular=TYPE_ANTI;
    }
    if(myName=="anti tau neutrino"){
     mass=MASS_HEAVY;
     name=NAME_ANTI_TAU_NEUTRINO;
     charge=CHARGE_ZERO;
     spin=SPIN_POS_HALF;
     regular=TYPE_ANTI;
    }    

}
    
    
public static void setParticle(String myName, String myCharge, String mySpin, String myRegular, String myMass){
    if((name=="?")&&(charge=="?")&&(spin=="?")&&(regular=="?")&&(mass=="?")){
    System.out.println("Not enough info");    
    }
    if(((mass=="light")&&(charge=="2/3"))||(myName=="up quark")){
     mass=MASS_LIGHT;
     name=NAME_UP_QUARK;
     charge=CHARGE_POS_TWO_THIRDS;
     spin=SPIN_POS_HALF;
     regular=TYPE_REGULAR;    
    }
    if(((mass=="medium")&&(charge=="2/3"))||(myName=="charmed quark")){
     mass=MASS_MEDIUM;
     name=NAME_CHARMED_QUARK;
     charge=CHARGE_POS_TWO_THIRDS;
     spin=SPIN_POS_HALF;
     regular=TYPE_REGULAR;
    }
    if(((mass=="heavy")&&(charge=="2/3"))||(myName=="top quark")){
     mass=MASS_HEAVY;
     name=NAME_TOP_QUARK;
     charge=CHARGE_POS_TWO_THIRDS;
     spin=SPIN_POS_HALF;
     regular=TYPE_REGULAR;
    }
    if(((mass=="light")&&(charge=="-1/3"))||(myName=="down quark")){
     mass=MASS_LIGHT;
     name=NAME_DOWN_QUARK;
     charge=CHARGE_NEG_ONE_THIRD;
     spin=SPIN_POS_HALF;
     regular=TYPE_REGULAR;   
    }
    if(((mass=="medium")&&(charge=="-1/3"))||(myName=="strange quark")){
     mass=MASS_MEDIUM;
     name=NAME_STRANGE_QUARK;
     charge=CHARGE_NEG_ONE_THIRD;
     spin=SPIN_POS_HALF;
     regular=TYPE_REGULAR;    
    }
    if(((mass=="heavy")&&(charge=="-1/3"))||(myName=="bottom quark")){
     mass=MASS_HEAVY;
     name=NAME_BOTTOM_QUARK;
     charge=CHARGE_NEG_ONE_THIRD;
     spin=SPIN_POS_HALF;
     regular=TYPE_REGULAR;  
    }
    if(((mass=="light")&&(charge=="-2/3"))||(myName=="anti up quark")){
     mass=MASS_MEDIUM;
     name=NAME_ANTI_CHARMED_QUARK;
     charge=CHARGE_NEG_TWO_THIRDS;
     spin=SPIN_POS_HALF;
     regular=TYPE_ANTI;
    }
    if(((mass=="medium")&&(charge=="-2/3"))||(myName=="anti charmed quark")){
     mass=MASS_MEDIUM;
     name=NAME_ANTI_CHARMED_QUARK;
     charge=CHARGE_NEG_TWO_THIRDS;
     spin=SPIN_POS_HALF;
     regular=TYPE_ANTI;   
    }
    if(((mass=="heavy")&&(charge=="-2/3"))||(myName=="anti top quark")){
     mass=MASS_HEAVY;
     name=NAME_ANTI_TOP_QUARK;
     charge=CHARGE_NEG_TWO_THIRDS;
     spin=SPIN_POS_HALF;
     regular=TYPE_ANTI;
    }
    if(((mass=="light")&&(charge=="1/3"))||(myName=="anti down quark")){
     mass=MASS_LIGHT;
     name=NAME_ANTI_DOWN_QUARK;
     charge=CHARGE_POS_ONE_THIRD;
     spin=SPIN_POS_HALF;
     regular=TYPE_ANTI; 
    }
    if(((mass=="medium")&&(charge=="1/3"))||(myName=="anti strange quark")){
     mass=MASS_MEDIUM;
     name=NAME_ANTI_STRANGE_QUARK;
     charge=CHARGE_POS_ONE_THIRD;
     spin=SPIN_POS_HALF;
     regular=TYPE_ANTI; 
    }
    if(((mass=="heavy")&&(charge=="1/3"))||(myName=="anti bottom quark")){
     mass=MASS_HEAVY;
     name=NAME_ANTI_BOTTOM_QUARK;
     charge=CHARGE_POS_ONE_THIRD;
     spin=SPIN_POS_HALF;
     regular=TYPE_ANTI;  
    }
     if(((mass=="light")&&(charge=="-1"))||(myName=="electron")){
      mass=MASS_LIGHT;
      name=NAME_ELECTRON;
      charge=CHARGE_NEG_ONE;
      spin=SPIN_POS_HALF;
      regular=TYPE_REGULAR;
    }
     if(((mass=="medium")&&(charge=="-1"))||(myName=="muon")){
      mass=MASS_MEDIUM;
      name=NAME_MUON;
      charge=CHARGE_NEG_ONE;
      spin=SPIN_POS_HALF;
      regular=TYPE_REGULAR;
    }
    if(((mass=="heavy")&&(charge=="-1"))||(myName=="tauon")){
     mass=MASS_HEAVY;
     name=NAME_TAUON;
     charge=CHARGE_NEG_ONE;
     spin=SPIN_POS_HALF;
     regular=TYPE_REGULAR;
    }
     if(((mass=="light")&&(charge=="0"))||(myName=="electron neutrino")){
      mass=MASS_LIGHT;
      name=NAME_ELECTRON_NEUTRINO;
      charge=CHARGE_ZERO;
      spin=SPIN_POS_HALF;
      regular=TYPE_REGULAR;
    }
     if(((mass=="medium")&&(charge=="0"))||(myName=="muon neutrino")){
      mass=MASS_MEDIUM;
      name=NAME_MUON_NEUTRINO;
      charge=CHARGE_ZERO;
      spin=SPIN_POS_HALF;
      regular=TYPE_REGULAR;
    }
    if(((mass=="heavy")&&(charge=="0"))||(myName=="tau neutrino")){
     mass=MASS_HEAVY;
     name=NAME_TAU_NEUTRINO;
     charge=CHARGE_ZERO;
     spin=SPIN_POS_HALF;
     regular=TYPE_REGULAR;
    }
     if(((mass=="light")&&(charge=="1"))||(myName=="anti electron")){
      mass=MASS_LIGHT;
      name=NAME_ANTI_ELECTRON;
      charge=CHARGE_POS_ONE;
      spin=SPIN_POS_HALF;
      regular=TYPE_ANTI;
    }
     if(((mass=="medium")&&(charge=="1"))||(myName=="anti muon")){
      mass=MASS_MEDIUM;
      name=NAME_ANTI_MUON;
      charge=CHARGE_POS_ONE;
      spin=SPIN_POS_HALF;
      regular=TYPE_ANTI;
    }
    if(((mass=="heavy")&&(charge=="1"))||(myName=="anti tauon")){
     mass=MASS_HEAVY;
     name=NAME_ANTI_TAUON;
     charge=CHARGE_POS_ONE;
     spin=SPIN_POS_HALF;
     regular=TYPE_ANTI;
    }
     if(((mass=="light")&&(charge=="0"))||(myName=="anti electron neutrino")){
      mass=MASS_LIGHT;
      name=NAME_ANTI_ELECTRON_NEUTRINO;
      charge=CHARGE_ZERO;
      spin=SPIN_POS_HALF;
      regular=TYPE_ANTI;
    }
     if(((mass=="medium")&&(charge=="0"))||(myName=="anti muon neutrino")){
      mass=MASS_MEDIUM;
      name=NAME_ANTI_MUON_NEUTRINO;
      charge=CHARGE_ZERO;
      spin=SPIN_POS_HALF;
      regular=TYPE_ANTI;
    }
    if(((mass=="heavy")&&(charge=="0"))||(myName=="anti tau neutrino")){
     mass=MASS_HEAVY;
     name=NAME_ANTI_TAU_NEUTRINO;
     charge=CHARGE_ZERO;
     spin=SPIN_POS_HALF;
     regular=TYPE_ANTI;
    }                
}
    
public boolean equals(Object other){
       if (!(other instanceof Particle)){
         return false;
       }
       Animal theOther = (Animal)other;
       if((this.name.equals(theOther.name)) && (this.charge.equals(theOther.charge)) && (this.spin.equals(theOther.spin)) && (this.mass.equals(theOther.mass) && (this.regular.equals(theOther.regular)){
        return true;
       }
       else{
        return false;
       }  
}
    
    
    
    public static void toString(){
     if(regular="regular"){
      system.out.println("Your particle is the " + name + ". Its mass is " + mass + ", its charge is " + charge + ", and its spin is " + spin + ". It is a regular particle.");  
     }
     if(regular="anti"){
      system.out.println("Your particle is the " + name + ". Its mass is " + mass + ", its charge is " + charge + ", and its spin is " + spin + ". It is an anti particle.");  
     }                   

}
