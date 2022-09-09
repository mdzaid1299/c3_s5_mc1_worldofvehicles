public class AMT extends Transmission {
    public AMT(String modelNo, int noOfGears, String transmissionType) {
        super(modelNo, noOfGears, transmissionType);
    }
    public double[] getGearRatio() {
        return super.getGearRatio();
    }

    @Override
    public void setGearRatio(double[] gearRatio) {
        super.setGearRatio(gearRatio);
    }

    @Override
    public void showSpecs() {
        super.showSpecs();
    }
}