package pckg_no_fasade;

public class App {

    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        Lights lights = new Lights();
        Projector proj = new Projector();
        Screen screen = new Screen();
        Player player = new Player();

        HomeTheatre homeTheatre = new HomeTheatre(amp, player, lights, screen, proj);
        homeTheatre.turnOnProjector();
        homeTheatre.turnOnPlayer();
        homeTheatre.turnOnAmplifier();
        homeTheatre.pullUpScreen();
        homeTheatre.turnLightsOff();
        // ... watching movie ...
        homeTheatre.turnLightsOn();
        homeTheatre.turnOffProjector();
        homeTheatre.turnOffPlayer();
        homeTheatre.turnOffAmplifier();
    }
}
