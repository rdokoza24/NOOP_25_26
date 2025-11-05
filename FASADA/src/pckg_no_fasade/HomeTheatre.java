package pckg_no_fasade;

public class HomeTheatre {

    private Amplifier amplifier;
    private Player player;
    private Lights lights;
    private Screen screen;
    private Projector projector;


    public HomeTheatre(Amplifier amp, Player player, Lights lights, Screen screen, Projector projector) {
        this.amplifier = amp;
        this.player = player;
        this.lights = lights;
        this.screen = screen;
        this.projector = projector;
    }

    public void turnLightsOn() {
        lights.turnOnLights();
    }

    public void turnLightsOff() {
        lights.turnOffLights();
    }

    public void turnOnPlayer() {
        player.turnOnPlayer();
    }

    public void turnOffPlayer() {
        player.turnOffPlayer();
    }

    public void turnOnAmplifier() {
        amplifier.turnOnAmp();
    }

    public void turnOffAmplifier() {
        amplifier.turnOffAmp();
    }

    public void pullUpScreen() {
        screen.upScreen();
    }

    public void downScreen() {
        screen.downScreen();
    }

    public void turnOnProjector() {
        projector.turnOnProj();
    }

    public void turnOffProjector() {
        projector.turnOffProj();
    }

}
