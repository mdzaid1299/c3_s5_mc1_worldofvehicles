public abstract  class Transmission {

    private  String modelNo;
    private String transmissionType;
    private int noOfGears;
    double[] gearRatio = new double[noOfGears];

    public Transmission(String modelNo, int noOfGears,String transmissionType) {
        this.modelNo = modelNo;
        this.noOfGears = noOfGears;
        this.transmissionType = transmissionType;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public int getNoOfGears() {
        return noOfGears;
    }

    public void setNoOfGears(int noOfGears) {
        this.noOfGears = noOfGears;
    }

    public double[] getGearRatio() {
        return gearRatio;
    }

    public void setGearRatio(double[] gearRatio) {
        this.gearRatio = gearRatio;
    }
    public void showSpecs() {
        System.out.println("Transmission Type = " + transmissionType);
        System.out.println("Transmission model No = " + modelNo);
        System.out.println();
        System.out.println("Key Specifications :");
        System.out.println("Forward Gears = " + noOfGears);
        int count = 1;
        for (int i = 0; i < noOfGears; i++) {
            System.out.println(count + " Gear Ratio : " + gearRatio[i]);
            count++;
        }
    }
}