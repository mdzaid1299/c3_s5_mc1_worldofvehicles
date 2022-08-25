public class AutomaticCVT extends Transmission{
    private double _5thGearRatio;
    private double _6thGearRatio;


    public AutomaticCVT(String modelNo, int forwardGear, double _1stGearRatio, double _2ndGearRatio, double _3rdGearRatio, double _4thGearRatio, double _5thGearRatio, double _6thGearRatio) {
        super(modelNo, forwardGear, _1stGearRatio, _2ndGearRatio, _3rdGearRatio, _4thGearRatio);
        this._5thGearRatio = _5thGearRatio;
        this._6thGearRatio = _6thGearRatio;
    }

    public double get_5thGearRatio() {
        return _5thGearRatio;
    }

    public void set_5thGearRatio(double _5thGearRatio) {
        this._5thGearRatio = _5thGearRatio;
    }

    public double get_6thGearRatio() {
        return _6thGearRatio;
    }

    public void set_6thGearRatio(double _6thGearRatio) {
        this._6thGearRatio = _6thGearRatio;
    }
    public void showSpecsCVT(){
        System.out.println("_5thGearRatio = " + _5thGearRatio);
        System.out.println("_6thGearRatio = " + _6thGearRatio);
    }
}