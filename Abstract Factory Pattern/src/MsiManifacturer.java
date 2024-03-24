public class MsiManifacturer extends Company {

    @Override
    public Gpu generateGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor generateMonitor() {
        return new MsiMonitor();
    }

}
