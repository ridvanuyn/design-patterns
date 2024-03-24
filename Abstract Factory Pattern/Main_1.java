public class Main_1 {
    public static void main(String[] args) {

        Company msiCompany = new MsiManifacturer();
        Gpu msiGpu = msiCompany.generateGpu();
        msiGpu.assemble();

        Company asusCompany = new AsusManifacturer();
        Gpu asusGpu = asusCompany.generateGpu();
        asusGpu.assemble();
    }

}