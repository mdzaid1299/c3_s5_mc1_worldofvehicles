public class AMT extends Transmission{
    private double _5thGearRatio;

    public AMT(String modelNo, int forwardGear, double _1stGearRatio, double _2ndGearRatio, double _3rdGearRatio, double _4thGearRatio, double _5thGearRatio) {
        super(modelNo, forwardGear, _1stGearRatio, _2ndGearRatio, _3rdGearRatio, _4thGearRatio);
        this._5thGearRatio = _5thGearRatio;
    }

    public double get_5thGearRatio() {
        return _5thGearRatio;
    }

    public void set_5thGearRatio(double _5thGearRatio) {
        this._5thGearRatio = _5thGearRatio;
    }
    public void showSpecsAMT(){
        System.out.println("_5thGearRatio = " + _5thGearRatio);
    }
}