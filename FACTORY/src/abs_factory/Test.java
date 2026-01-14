package abs_factory;

public class Test {

    public static void main(String[] args) {
        WordEditApp wordEditApp = new WordEditApp(new MACGUIFactory());
        wordEditApp.createGUI();
        System.out.println(wordEditApp);
        WordEditApp wordEditApp2 = new WordEditApp(new WINGUIFactory());
        wordEditApp2.createGUI();
        System.out.println(wordEditApp2);
    }
}
