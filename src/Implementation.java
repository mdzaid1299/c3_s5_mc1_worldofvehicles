public class Implementation {
    public static void main(String[] args) {
        Manual manual = new Manual("Manual", 6, "MP7");
        manual.setGearRatio(new double[]{1.6780, 2.780, 2.67, 1.000, 5.67, 1.234});
        manual.showSpecs();
        System.out.println("------------------");

        AMT amt = new AMT("Automatic Manual", 6, "AMTD8");
        amt.setGearRatio(new double[]{2.550, 2.990, 1.894, 2.000, 3.630,1.567});
        amt.showSpecs();
        AutomaticCVT automaticCVT = new AutomaticCVT("Automatic Cvt",6,"AMDT7");
        automaticCVT.setGearRatio(new double[]{1.234,2.34,1.567,3.89,3.67,0.99});
        automaticCVT.showSpecs();
    }
}