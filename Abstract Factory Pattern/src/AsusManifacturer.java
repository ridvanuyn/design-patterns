public class AsusManifacturer extends Company {

    @Override
    public Gpu generateGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor generateMonitor() {
        return new AsusMonitor();
    }

}
