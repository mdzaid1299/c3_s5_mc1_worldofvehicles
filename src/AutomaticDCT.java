public class AutomaticDCT extends Transmission{
    private double _5thGearRatio;
    private double _6thGearRatio;
    private double _7thGearRatio;
    private double _8thGearRatio;

    public AutomaticDCT(String modelNo, int forwardGear, double _1stGearRatio, double _2ndGearRatio, double _3rdGearRatio, double _4thGearRatio, double _5thGearRatio, double _6thGearRatio, double _7thGearRatio, double _8thGearRatio) {
        super(modelNo, forwardGear, _1stGearRatio, _2ndGearRatio, _3rdGearRatio, _4thGearRatio);
        this._5thGearRatio = _5thGearRatio;
        this._6thGearRatio = _6thGearRatio;
        this._7thGearRatio = _7thGearRatio;
        this._8thGearRatio = _8thGearRatio;
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

    public double get_7thGearRatio() {
        return _7thGearRatio;
    }

    public void set_7thGearRatio(double _7thGearRatio) {
        this._7thGearRatio = _7thGearRatio;
    }

    public double get_8thGearRatio() {
        return _8thGearRatio;
    }

    public void set_8thGearRatio(double _8thGearRatio) {
        this._8thGearRatio = _8thGearRatio;
    }
    public void showSpecsDCT(){
        System.out.println("_5thGearRatio = " + _5thGearRatio);
        System.out.println("_6thGearRatio = " + _6thGearRatio);
        System.out.println("_7thGearRatio = " + _7thGearRatio);
        System.out.println("_8thGearRatio = " + _8thGearRatio);
    }
}