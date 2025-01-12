package emulator;

import emulator.debug.Texture;

public interface IEmulatorPlatform {
    public boolean isX64();

    String getName();

    String getTitleName();

    public String getInfoString(String version);

    public void loadLibraries();

    boolean supportsM3G();

    boolean supportsMascotCapsule();

    Texture convertMicro3DTexture(Object o);
}
