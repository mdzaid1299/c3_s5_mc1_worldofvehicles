public class AutomaticDCT extends AMT{
    public AutomaticDCT(String modelNo, int noOfGears, String transmissionType) {
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