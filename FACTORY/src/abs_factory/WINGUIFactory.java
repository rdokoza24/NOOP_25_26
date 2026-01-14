package abs_factory;

public class WINGUIFactory implements GUIFactory {

    @Override
    public void renderGUIApp() {
        WINButton winButton = new WINButton();
        winButton.renderButton();
        WINChckBox winChckBox = new WINChckBox();
        winChckBox.renderChckBox();
        WINList winList = new WINList();
        winList.renderList();
        WINComboBox winComboBox = new WINComboBox();
        winComboBox.renderCombo();
    }

    @Override
    public String toString() {
        return "WINGUIFactory";
    }
}
