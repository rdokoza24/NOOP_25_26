package abs_factory;

public class WordEditApp {

    private GUIFactory factory;

    public WordEditApp(GUIFactory factory) {
        this.factory = factory;
    }

    public void createGUI() {
        factory.renderGUIApp();
    }

    @Override
    public String toString() {
        return "WordEditApp{" +
                "factory=" + factory +
                '}';
    }
}
