package appletLifeCycle;

import java.applet.Applet;
import java.awt.Graphics;

public class appletLifeCycle extends Applet {
    public void init() {
        System.out.println("Initializing applet...");
    }

    public void start() {
        System.out.println("Starting applet...");
    }

    public void paint(Graphics g) {
        System.out.println("Painting applet...");
    }

    public void stop() {
        System.out.println("Stopping applet...");
    }

    public void destroy() {
        System.out.println("Destroying applet...");
    }
}
