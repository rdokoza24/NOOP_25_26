package pckg_simple_remote;

public class MainApp {

    public static void main(String[] args) {

        RemoteController simpleRC = new RemoteController();
        GarageDoor garageDoor = new GarageDoor();
        Light light = new Light();
        simpleRC.setCommand(new GarageDoorCmd(garageDoor));
        simpleRC.remoteControllerButtonPressed();
        simpleRC.remoteControllerButtonPressed();
        simpleRC.setCommand(new LightCmd(light));
        simpleRC.remoteControllerButtonPressed();
        simpleRC.remoteControllerButtonPressed();
    }
}
