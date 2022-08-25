public class Transmission {

    private  String modelNo;
    private int forwardGear;
    private double _1stGearRatio;
    private double _2ndGearRatio;
    private double _3rdGearRatio;
    private double _4thGearRatio;

    public Transmission(String modelNo, int forwardGear, double _1stGearRatio, double _2ndGearRatio, double _3rdGearRatio, double _4thGearRatio) {
        this.modelNo = modelNo;
        this.forwardGear = forwardGear;
        this._1stGearRatio = _1stGearRatio;
        this._2ndGearRatio = _2ndGearRatio;
        this._3rdGearRatio = _3rdGearRatio;
        this._4thGearRatio = _4thGearRatio;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public int getForwardGear() {
        return forwardGear;
    }

    public void setForwardGear(int forwardGear) {
        this.forwardGear = forwardGear;
    }

    public double get_1stGearRatio() {
        return _1stGearRatio;
    }

    public void set_1stGearRatio(double _1stGearRatio) {
        this._1stGearRatio = _1stGearRatio;
    }

    public double get_2ndGearRatio() {
        return _2ndGearRatio;
    }

    public void set_2ndGearRatio(double _2ndGearRatio) {
        this._2ndGearRatio = _2ndGearRatio;
    }

    public double get_3rdGearRatio() {
        return _3rdGearRatio;
    }

    public void set_3rdGearRatio(double _3rdGearRatio) {
        this._3rdGearRatio = _3rdGearRatio;
    }

    public double get_4thGearRatio() {
        return _4thGearRatio;
    }

    public void set_4thGearRatio(double _4thGearRatio) {
        this._4thGearRatio = _4thGearRatio;
    }
    public void showSpecs(){
        System.out.println("Transmission modelNo = " + modelNo);
        System.out.println("Key Specification: ");
        System.out.println("forwardGear = " + forwardGear);
        System.out.println("_1stGearRatio = " + _1stGearRatio);
        System.out.println("_2ndGearRatio = " + _2ndGearRatio);
        System.out.println("_3rdGearRatio = " + _3rdGearRatio);
        System.out.println("_4thGearRatio = " + _4thGearRatio);

    }
}