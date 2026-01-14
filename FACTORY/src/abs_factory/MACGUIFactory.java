package abs_factory;

public class MACGUIFactory implements GUIFactory {

    @Override
    public void renderGUIApp() {
        MACButton macButton = new MACButton();
        macButton.renderButton();
        MACChckBox macChckBox = new MACChckBox();
        macChckBox.renderChckBox();
        MACList macList = new MACList();
        macList.renderList();
        MACComboBox macComboBox = new MACComboBox();
        macComboBox.renderCombo();
    }

    @Override
    public String toString() {
        return "MACGUIFactory";
    }
}
