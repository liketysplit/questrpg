public class CharacterClass {
    private String name;
    private int town;
    private double x,y;
    private double xp;
    private double level;
    private double intl;
    private double str;
    private double range;
    private double hp;
    private double aglity;
    private double def;
    private double swordxp,axexp,daggerxp, hammerxp, THSxp, THAxp, THHxp, bow, staff;
    private ItemClass[] equipeditems;
    private ItemClass[] inventory;
    private ItemClass[] bank;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTown() {
        return town;
    }

    public void setTown(int town) {
        this.town = town;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getXp() {
        return xp;
    }

    public void setXp(double xp) {
        this.xp = xp;
        setLevel(getlvlFromXp(this.xp));
    }

    public void addXp(double xp) {
        this.xp += xp;
        setLevel(getlvlFromXp(this.xp));
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    public double getIntl() {
        return intl;
    }

    public void setIntl(double intl) {
        this.intl = intl;
    }

    public double getStr() {
        return str;
    }

    public void setStr(double str) {
        this.str = str;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getAglity() {
        return aglity;
    }

    public void setAglity(double aglity) {
        this.aglity = aglity;
    }

    public double getDef() {
        return def;
    }

    public void setDef(double def) {
        this.def = def;
    }

    public double getSwordxp() {
        return swordxp;
    }

    public void setSwordxp(double swordxp) {
        this.swordxp = swordxp;
    }

    public double getAxexp() {
        return axexp;
    }

    public void setAxexp(double axexp) {
        this.axexp = axexp;
    }

    public double getDaggerxp() {
        return daggerxp;
    }

    public void setDaggerxp(double daggerxp) {
        this.daggerxp = daggerxp;
    }

    public double getHammerxp() {
        return hammerxp;
    }

    public void setHammerxp(double hammerxp) {
        this.hammerxp = hammerxp;
    }

    public double getTHSxp() {
        return THSxp;
    }

    public void setTHSxp(double THSxp) {
        this.THSxp = THSxp;
    }

    public double getTHAxp() {
        return THAxp;
    }

    public void setTHAxp(double THAxp) {
        this.THAxp = THAxp;
    }

    public double getTHHxp() {
        return THHxp;
    }

    public void setTHHxp(double THHxp) {
        this.THHxp = THHxp;
    }

    public double getBow() {
        return bow;
    }

    public void setBow(double bow) {
        this.bow = bow;
    }

    public double getStaff() {
        return staff;
    }

    public void setStaff(double staff) {
        this.staff = staff;
    }
    public double getlvlFromXp(double xp){
        if(xp < 1200){
            return(0.0);
        }
        else{
            if(xp <= 14700.0){
                return((-1050 + Math.sqrt(Math.pow(1050,2)-(4*150*((-1)*xp))))/(2*150));
            }
            else if(xp > 14700.0 && xp < 38000.0){
                return((-1050 + Math.sqrt(Math.pow(1050,2)-(4*200*(-2450-xp))))/(2*200));
            }
            else if(xp >= 38000.0 && xp < 75000.0){
                return((-1750 + Math.sqrt(Math.pow(1750,2)-(4*50*(9800-xp))))/(2*50));
            }
            else if(xp >= 75000.0 && xp < 150000.0){
                return(((-1)*(-1500) + Math.sqrt(Math.pow(-1500,2)-(4*250*(-22750-xp))))/(2*250));
            }
            else if(xp >= 150000.0 && xp < 228000.0){
                return(((-1)*(-13500) + Math.sqrt(Math.pow(-13500,2)-(4*500*(88000-xp))))/(2*500));
            }
            else if(xp >= 228000.0 && xp < 1210000.0){
                return((-1800 + Math.sqrt(Math.pow(1800,2)-(4*200*(-80000-xp))))/(2*200));
            }
            else if(xp >= 1210000.0 && xp <= 2250000.0){
                return(((-1)*(-145000) + Math.sqrt(Math.pow(-145000,2)-(4*2500*(2102500-xp))))/(2*2500));
            }
        }

        return 0.0;
    }
}
