package desktopResolution;

import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;

public class DesktopResolution {

    public static void main(String[] args) {
        GraphicsEnvironment localGraphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice defaultScreenDevice = localGraphicsEnvironment.getDefaultScreenDevice();
        GraphicsConfiguration defaultConfiguration = defaultScreenDevice.getDefaultConfiguration();
        Rectangle bounds = defaultConfiguration.getBounds();
        System.out.println("Desktop Resoltution : "+bounds.width+"x"+bounds.height);
    }

}
