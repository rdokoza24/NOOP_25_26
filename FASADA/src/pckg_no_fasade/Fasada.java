package pckg_no_fasade;

public class Fasada {

    private Amplifier amplifier;
    private Lights lights;
    private Screen screen;
    private Projector projector;
    private Player player;

    public Fasada(Amplifier amplifier, Player player, Lights lights, Screen screen, Projector projector) {
        this.amplifier = amplifier;
        this.lights = lights;
        this.screen = screen;
        this.projector = projector;
        this.player = player;
    }

    public void watchMovie() {
        System.out.println("Get ready to watch a movie...");
        lights.turnOffLights();
        screen.downScreen();
        projector.turnOnProj();
        amplifier.turnOnAmp();
        player.turnOnPlayer();
    }

    public void stopMovie() {
        System.out.println("Shutting movie theater down...");
        player.turnOffPlayer();
        amplifier.turnOffAmp();
        projector.turnOffProj();
        screen.upScreen();
        lights.turnOnLights();
    }
}
