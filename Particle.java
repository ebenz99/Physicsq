package physics;

public class Particle {
//fields
    //ADD BOSONS
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
public static final String CHARGE_NEG_ONE_THIRD = "-1/3";
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
    
public static final String STATE_REGULAR = "regular";
public static final String STATE_ANTI = "anti"; 

public static final String TYPE_QUARK = "quark";
public static final String TYPE_LEPTON = "lepton"; 

public static final int ID_ONE = 1;
public static final int ID_TWO = 2;
public static final int ID_THREE = 3;
public static final int ID_FOUR = 4;
public static final int ID_FIVE = 5;
public static final int ID_SIX = 6;
public static final int ID_SEVEN = 7;
public static final int ID_EIGHT = 8;
public static final int ID_NINE = 9;
public static final int ID_TEN = 10;
public static final int ID_ELEVEN = 11;
public static final int ID_TWELVE = 12;





private String mass;
private String charge;
private String spin;
private String regular;
private String name;
private String type;
private int ID;

//all-args constructor
public Particle(String myName, String myCharge, String mySpin, String myRegular, String myMass, String myType){
    mass=myMass;
    charge=myCharge;
    spin=mySpin;
    regular=myRegular;
    name=myName;
    type = myType;
    ID = 0;
    /////SET ID HERE???///////////////
}
//name constructor (not input based)
public Particle(String myName){
    if(myName.equals("up quark")){
     mass=MASS_LIGHT;
     name=NAME_UP;
     charge=CHARGE_POS_TWO_THIRDS;
     spin=SPIN_POS_HALF;
     regular=STATE_REGULAR;
     type=TYPE_QUARK;
     ID = 1;
    }
    if(myName.equals("down quark")){
     mass=MASS_LIGHT;
     name=NAME_DOWN;
     charge=CHARGE_NEG_ONE_THIRD;
     spin=SPIN_POS_HALF;
     regular=STATE_REGULAR;
     type=TYPE_QUARK;
     ID=4;
    }
    if(myName.equals("charmed quark")){
     mass=MASS_MEDIUM;
     name=NAME_CHARMED;
     charge=CHARGE_POS_TWO_THIRDS;
     spin=SPIN_POS_HALF;
     regular=STATE_REGULAR;
     type=TYPE_QUARK;
     ID=2;
    }
    if(myName.equals("strange quark")){
     mass=MASS_MEDIUM;
     name=NAME_STRANGE;
     charge=CHARGE_NEG_ONE_THIRD;
     spin=SPIN_POS_HALF;
     regular=STATE_REGULAR;
     type=TYPE_QUARK;
     ID=5;
    }
    if(myName.equals("top quark")){
     mass=MASS_HEAVY;
     name=NAME_TOP;
     charge=CHARGE_POS_TWO_THIRDS;
     spin=SPIN_POS_HALF;
     regular=STATE_REGULAR;
     type=TYPE_QUARK;
     ID=3;
    }
    if(myName.equals("bottom quark")){
     mass=MASS_HEAVY;
     name=NAME_BOTTOM;
     charge=CHARGE_NEG_ONE_THIRD;
     spin=SPIN_POS_HALF;
     regular=STATE_REGULAR;
     type=TYPE_QUARK;
     ID=6;
    }
     if(myName.equals("electron")){
      mass=MASS_LIGHT;
      name=NAME_ELECTRON;
      charge=CHARGE_NEG_ONE;
      spin=SPIN_POS_HALF;
      regular=STATE_REGULAR;
      type=TYPE_LEPTON;
      ID=7;
    }
     if(myName.equals("muon")){
      mass=MASS_MEDIUM;
      name=NAME_MUON;
      charge=CHARGE_NEG_ONE;
      spin=SPIN_POS_HALF;
      regular=STATE_REGULAR;
      type=TYPE_LEPTON;
      ID=8;
    }
    if(myName.equals("tauon")){
     mass=MASS_HEAVY;
     name=NAME_TAUON;
     charge=CHARGE_NEG_ONE;
     spin=SPIN_POS_HALF;
     regular=STATE_REGULAR;
     type=TYPE_LEPTON;
     ID=9;
    }
     if(myName.equals("electron neutrino")){
      mass=MASS_LIGHT;
      name=NAME_ELECTRON_NEUTRINO;
      charge=CHARGE_ZERO;
      spin=SPIN_POS_HALF;
      regular=STATE_REGULAR;
      type=TYPE_LEPTON;
      ID=10;
    }
     if(myName.equals("muon neutrino")){
      mass=MASS_MEDIUM;
      name=NAME_MUON_NEUTRINO;
      charge=CHARGE_ZERO;
      spin=SPIN_POS_HALF;
      regular=STATE_REGULAR;
      type=TYPE_LEPTON;
      ID=11;
    }
    if(myName.equals("tau neutrino")){
     mass=MASS_HEAVY;
     name=NAME_TAU_NEUTRINO;
     charge=CHARGE_ZERO;
     spin=SPIN_POS_HALF;
     regular=STATE_REGULAR;
     type=TYPE_LEPTON;
     ID=12;
    }    
    if(myName.equals("anti up quark")){
     mass=MASS_LIGHT;
     name=NAME_ANTI_UP;
     charge=CHARGE_NEG_TWO_THIRDS;
     spin=SPIN_POS_HALF;
     regular=STATE_ANTI;
     type=TYPE_QUARK;
     ID=-1;
    }
    if(myName.equals("anti down quark")){
     mass=MASS_LIGHT;
     name=NAME_ANTI_DOWN;
     charge=CHARGE_POS_ONE_THIRD;
     spin=SPIN_POS_HALF;
     regular=STATE_ANTI;
     type=TYPE_QUARK;
     ID=-4;
    }
    if(myName.equals("anti charmed quark")){
     mass=MASS_MEDIUM;
     name=NAME_ANTI_CHARMED;
     charge=CHARGE_NEG_TWO_THIRDS;
     spin=SPIN_POS_HALF;
     regular=STATE_ANTI;
     type=TYPE_QUARK;
     ID = -2;
    }
    if(myName.equals("anti strange quark")){
     mass=MASS_MEDIUM;
     name=NAME_ANTI_STRANGE;
     charge=CHARGE_POS_ONE_THIRD;
     spin=SPIN_POS_HALF;
     regular=STATE_ANTI;
     type=TYPE_QUARK;
     ID = -5;
    }
    if(myName.equals("anti top quark")){
     mass=MASS_HEAVY;
     name=NAME_ANTI_TOP;
     charge=CHARGE_NEG_TWO_THIRDS;
     spin=SPIN_POS_HALF;
     regular=STATE_ANTI;
     type=TYPE_QUARK;
     ID = -3;
    }
    if(myName.equals("anti bottom quark")){
     mass=MASS_HEAVY;
     name=NAME_ANTI_BOTTOM;
     charge=CHARGE_POS_ONE_THIRD;
     spin=SPIN_POS_HALF;
     regular=STATE_ANTI;
     type=TYPE_QUARK;
     ID = -6;
    }
     if(myName.equals("anti electron")){
      mass=MASS_LIGHT;
      name=NAME_ANTI_ELECTRON;
      charge=CHARGE_POS_ONE;
      spin=SPIN_POS_HALF;
      regular=STATE_ANTI;
      type=TYPE_LEPTON;
      ID = -7;
    }
     if(myName.equals("anti muon")){
      mass=MASS_MEDIUM;
      name=NAME_ANTI_MUON;
      charge=CHARGE_POS_ONE;
      spin=SPIN_POS_HALF;
      regular=STATE_ANTI;
      type=TYPE_LEPTON;
      ID = -8;
    }
    if(myName.equals("anti tauon")){
     mass=MASS_HEAVY;
     name=NAME_ANTI_TAUON;
     charge=CHARGE_POS_ONE;
     spin=SPIN_POS_HALF;
     regular=STATE_ANTI;
     type=TYPE_LEPTON;
     ID = -9;
    }
     if(myName.equals("anti electron neutrino")){
      mass=MASS_LIGHT;
      name=NAME_ANTI_ELECTRON_NEUTRINO;
      charge=CHARGE_ZERO;
      spin=SPIN_POS_HALF;
      regular=STATE_ANTI;
      type=TYPE_LEPTON;
      ID = -10;
    }
     if(myName.equals("anti muon neutrino")){
      mass=MASS_MEDIUM;
      name=NAME_ANTI_MUON_NEUTRINO;
      charge=CHARGE_ZERO;
      spin=SPIN_POS_HALF;
      regular=STATE_ANTI;
      type=TYPE_LEPTON;
      ID = -11;
     }
    if(myName.equals("anti tau neutrino")){
     mass=MASS_HEAVY;
     name=NAME_ANTI_TAU_NEUTRINO;
     charge=CHARGE_ZERO;
     spin=SPIN_POS_HALF;
     regular=STATE_ANTI;
     type=TYPE_LEPTON;
     ID = -12;
    }    

}
    
    
public void setParticle(String myName, String myCharge, String mySpin, String myRegular, String myMass, String myType){
    if((name.equals("?"))&&(charge.equals("?"))&&(spin.equals("?"))&&(regular.equals("?"))&&(mass.equals("?"))){
    System.out.println("Not enough info");    
    }
    if(((mass.equals("light"))&&(charge.equals("2/3")))||(myName.equals("up quark"))){
     mass=MASS_LIGHT;
     name=NAME_UP;
     charge=CHARGE_POS_TWO_THIRDS;
     spin=SPIN_POS_HALF;
     regular=STATE_REGULAR;
     type=TYPE_QUARK;
     ID = 1;
    }
    if(((mass.equals("medium"))&&(charge.equals("2/3")))||(myName.equals("charmed quark"))){
     mass=MASS_MEDIUM;
     name=NAME_CHARMED;
     charge=CHARGE_POS_TWO_THIRDS;
     spin=SPIN_POS_HALF;
     regular=STATE_REGULAR;
     type=TYPE_QUARK;
     ID = 2;
    }
    if(((mass.equals("heavy"))&&(charge.equals("2/3")))||(myName.equals("top quark"))){
     mass=MASS_HEAVY;
     name=NAME_TOP;
     charge=CHARGE_POS_TWO_THIRDS;
     spin=SPIN_POS_HALF;
     regular=STATE_REGULAR;
     type=TYPE_QUARK;
     ID = 3;
    }
    if(((mass.equals("light"))&&(charge.equals("-1/3")))||(myName.equals("down quark"))){
     mass=MASS_LIGHT;
     name=NAME_DOWN;
     charge=CHARGE_NEG_ONE_THIRD;
     spin=SPIN_POS_HALF;
     regular=STATE_REGULAR;
     type=TYPE_QUARK;
     ID = 4;
    }
    if(((mass.equals("medium"))&&(charge.equals("-1/3")))||(myName.equals("strange quark"))){
     mass=MASS_MEDIUM;
     name=NAME_STRANGE;
     charge=CHARGE_NEG_ONE_THIRD;
     spin=SPIN_POS_HALF;
     regular=STATE_REGULAR;
     type=TYPE_QUARK;
     ID = 5;
    }
    if(((mass.equals("heavy"))&&(charge.equals("-1/3")))||(myName.equals("bottom quark"))){
     mass=MASS_HEAVY;
     name=NAME_BOTTOM;
     charge=CHARGE_NEG_ONE_THIRD;
     spin=SPIN_POS_HALF;
     regular=STATE_REGULAR;
     type=TYPE_QUARK;
     ID = 6;
    }
    if(((mass.equals("light"))&&(charge.equals("-2/3")))||(myName.equals("anti up quark"))){
     mass=MASS_MEDIUM;
     name=NAME_ANTI_CHARMED;
     charge=CHARGE_NEG_TWO_THIRDS;
     spin=SPIN_POS_HALF;
     regular=STATE_ANTI;
     type=TYPE_QUARK;
     ID = -1;
    }
    if(((mass.equals("medium"))&&(charge.equals("-2/3")))||(myName.equals("anti charmed quark"))){
     mass=MASS_MEDIUM;
     name=NAME_ANTI_CHARMED;
     charge=CHARGE_NEG_TWO_THIRDS;
     spin=SPIN_POS_HALF;
     regular=STATE_ANTI;
     type=TYPE_QUARK;
     ID = -2;
    }
    if(((mass.equals("heavy"))&&(charge.equals("-2/3")))||(myName.equals("anti top quark"))){
     mass=MASS_HEAVY;
     name=NAME_ANTI_TOP;
     charge=CHARGE_NEG_TWO_THIRDS;
     spin=SPIN_POS_HALF;
     regular=STATE_ANTI;
     type=TYPE_QUARK;
     ID = -3;
    }
    if(((mass.equals("light"))&&(charge.equals("1/3")))||(myName.equals("anti down quark"))){
     mass=MASS_LIGHT;
     name=NAME_ANTI_DOWN;
     charge=CHARGE_POS_ONE_THIRD;
     spin=SPIN_POS_HALF;
     regular=STATE_ANTI;
     type=TYPE_QUARK;
     ID = -4;
    }
    if(((mass.equals("medium"))&&(charge.equals("1/3")))||(myName.equals("anti strange quark"))){
     mass=MASS_MEDIUM;
     name=NAME_ANTI_STRANGE;
     charge=CHARGE_POS_ONE_THIRD;
     spin=SPIN_POS_HALF;
     regular=STATE_ANTI;
     type=TYPE_QUARK;
     ID = -5;
    }
    if(((mass.equals("heavy"))&&(charge.equals("1/3")))||(myName.equals("anti bottom quark"))){
     mass=MASS_HEAVY;
     name=NAME_ANTI_BOTTOM;
     charge=CHARGE_POS_ONE_THIRD;
     spin=SPIN_POS_HALF;
     regular=STATE_ANTI;
     type=TYPE_QUARK;
     ID=-6;
    }
     if(((mass.equals("light"))&&(charge.equals("-1")))||(myName.equals("electron"))){
      mass=MASS_LIGHT;
      name=NAME_ELECTRON;
      charge=CHARGE_NEG_ONE;
      spin=SPIN_POS_HALF;
      regular=STATE_REGULAR;
      type=TYPE_LEPTON;
      ID = 7;
    }
     if(((mass.equals("medium"))&&(charge.equals("-1")))||(myName.equals("muon"))){
      mass=MASS_MEDIUM;
      name=NAME_MUON;
      charge=CHARGE_NEG_ONE;
      spin=SPIN_POS_HALF;
      regular=STATE_REGULAR;
      type=TYPE_LEPTON;
      ID = 8;
    }
    if(((mass.equals("heavy"))&&(charge.equals("-1")))||(myName.equals("tauon"))){
     mass=MASS_HEAVY;
     name=NAME_TAUON;
     charge=CHARGE_NEG_ONE;
     spin=SPIN_POS_HALF;
     regular=STATE_REGULAR;
     type=TYPE_LEPTON;
     ID = 9;
    }
     if(((mass.equals("light"))&&(charge.equals("0")))||(myName.equals("electron neutrino"))){
      mass=MASS_LIGHT;
      name=NAME_ELECTRON_NEUTRINO;
      charge=CHARGE_ZERO;
      spin=SPIN_POS_HALF;
      regular=STATE_REGULAR;
      type=TYPE_LEPTON;
      ID = 10;
    }
     if(((mass.equals("medium"))&&(charge.equals("0")))||(myName.equals("muon neutrino"))){
      mass=MASS_MEDIUM;
      name=NAME_MUON_NEUTRINO;
      charge=CHARGE_ZERO;
      spin=SPIN_POS_HALF;
      regular=STATE_REGULAR;
      type=TYPE_LEPTON;
      ID = 11;
    }
    if(((mass.equals("heavy"))&&(charge.equals("0")))||(myName.equals("tau neutrino"))){
     mass=MASS_HEAVY;
     name=NAME_TAU_NEUTRINO;
     charge=CHARGE_ZERO;
     spin=SPIN_POS_HALF;
     regular=STATE_REGULAR;
     type=TYPE_LEPTON;
     ID = 12;
    }
     if(((mass.equals("light"))&&(charge.equals("1")))||(myName.equals("anti electron"))){
      mass=MASS_LIGHT;
      name=NAME_ANTI_ELECTRON;
      charge=CHARGE_POS_ONE;
      spin=SPIN_POS_HALF;
      regular=STATE_ANTI;
      type=TYPE_LEPTON;
      ID = -7;
    }
     if(((mass.equals("medium"))&&(charge.equals("1")))||(myName.equals("anti muon"))){
      mass=MASS_MEDIUM;
      name=NAME_ANTI_MUON;
      charge=CHARGE_POS_ONE;
      spin=SPIN_POS_HALF;
      regular=STATE_ANTI;
      type=TYPE_LEPTON;
      ID = -8;
    }
    if(((mass.equals("heavy"))&&(charge.equals("1")))||(myName.equals("anti tauon"))){
     mass=MASS_HEAVY;
     name=NAME_ANTI_TAUON;
     charge=CHARGE_POS_ONE;
     spin=SPIN_POS_HALF;
     regular=STATE_ANTI;
     type=TYPE_LEPTON;
     ID = -9;
    }
     if(((mass.equals("light"))&&(charge.equals("0")))||(myName.equals("anti electron neutrino"))){
      mass=MASS_LIGHT;
      name=NAME_ANTI_ELECTRON_NEUTRINO;
      charge=CHARGE_ZERO;
      spin=SPIN_POS_HALF;
      regular=STATE_ANTI;
      type=TYPE_LEPTON;
      ID = -10;
    }
     if(((mass.equals("medium"))&&(charge.equals("0")))||(myName.equals("anti muon neutrino"))){
      mass=MASS_MEDIUM;
      name=NAME_ANTI_MUON_NEUTRINO;
      charge=CHARGE_ZERO;
      spin=SPIN_POS_HALF;
      regular=STATE_ANTI;
      type=TYPE_LEPTON;
      ID = -11;
    }
    if(((mass.equals("heavy"))&&(charge.equals("0")))||(myName.equals("anti tau neutrino"))){
     mass=MASS_HEAVY;
     name=NAME_ANTI_TAU_NEUTRINO;
     charge=CHARGE_ZERO;
     spin=SPIN_POS_HALF;
     regular=STATE_ANTI;
     type=TYPE_LEPTON;
     ID = -12;
    }
    else{
        System.out.println("Not a particle or not enough information");
    }
}

    public String getName(){
        return this.name;
    }
    public String getCharge(){
        return this.charge;
    }
    public String getSpin(){
        return this.spin;
    }
    public String getMass(){
        return this.mass;
    }
    public String getRegular(){
        return this.regular;
    }
    public String getType(){
        return this.type;
    }
    public int getID(){
        return this.ID;
    }
    public void setName(String myName){
        name = myName;
    }
    public void setCharge(String myCharge){
        charge = myCharge;
    }
    public void setSpin(String mySpin){
        spin = mySpin;
    }
    public void setMass(String myMass){
        mass = myMass;
    }    
    public void setRegular(String myRegular){
        regular = myRegular;
    }
    public void setType(String myType){
        type = myType;
    }
    public void setID(int myID){
        ID = myID;
    }

    public String makeNameRegular(){
        int length =  (this.name.length());
        name = (this.name).substring(5,length);
        return name;
    }
    public String makeNameAnti(){
        name = "anti" + (this.name);
        return name;
    }
    
    public boolean equals(Object other){
       if (!(other instanceof Particle)){
         return false;
       }
       Particle theOther = (Particle)other;
       if((this.name.equals(theOther.name)) && (this.charge.equals(theOther.charge)) && (this.spin.equals(theOther.spin)) && (this.mass.equals(theOther.mass)) && (this.regular.equals(theOther.regular))){
        return true;
       }
       else{
        return false;
       }  
    }
    
    
    
    public String toString(){
     if(regular.equals("regular")){
      String reg = ("%n Your particle is the " + name + ". Its mass is " + mass + ", its charge is " + charge + ", and its spin is " + spin + ". It is a regular particle.");  
      return reg;
     }
     if (regular.equals("anti")){
      String reg = ("Your particle is the " + name + ". Its mass is " + mass + ", its charge is " + charge + ", and its spin is " + spin + ". It is an anti particle.");  
      return reg;
     }                   
     else
       return "";
    }
}
