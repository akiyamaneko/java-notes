package spi;

import java.util.ServiceLoader;

public class ServiceLoaderTest {
    public static void main(String[] args) {
        final ServiceLoader<SpiInterfaceService> supportedList = ServiceLoader.load(SpiInterfaceService.class);

        for (SpiInterfaceService spiInterfaceService : supportedList) {
            spiInterfaceService.print();
        }
    }
}
