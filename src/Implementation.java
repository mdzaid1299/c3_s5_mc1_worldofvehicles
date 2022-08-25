public class Implementation {
    public static void main(String[] args) {
        Manual obj1 = new Manual("AMTD5",5,2.950,1.940,1.340,1.000,0.630,1.456);
        System.out.println("Transmission type = "+obj1.getClass());
        obj1.showSpecs();
        obj1.showSpecsManual();
        System.out.println();
        AMT obj2 = new AMT("AMTP4",4,2.540,1.920,1.510,1.000,0.630);
        System.out.println("Transmission type = "+obj2.getClass());
        obj2.showSpecs();
        obj2.showSpecsAMT();
        System.out.println();
        AutomaticCVT obj3 = new AutomaticCVT("CVT6",6,2.631,1.440,1.1165,0.906,0.680,0.499);
        System.out.println("Transmission type = "+obj3.getClass());
        obj3.showSpecs();
        obj3.showSpecsCVT();
        System.out.println();
        AutomaticDCT obj4 = new AutomaticDCT("DCT8",8,4.714,3.143,2.106,1.667,1.285,1.000,0.839,0.667);
        System.out.println("Transmission type = "+obj4.getClass());
        obj4.showSpecs();
        obj4.showSpecsDCT();
    }
}