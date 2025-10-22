package pckg_VJ_1_ZD1B;

import javax.swing.*;
import java.awt.*;

public class PresentationPanel extends JPanel {

    private JTextField resultField;
    private JTextArea allResults;
    private JScrollPane scrollPane;

    public PresentationPanel() {

        initComponents();
        layoutComponents();

    }

    private void initComponents() {
        this.resultField = new JTextField(15);
        this.resultField.setEditable(false);
        this.resultField.setFocusable(false);
        this.allResults = new JTextArea(10, 15);
        this.allResults.setEditable(false);
        this.allResults.setFocusable(false);
        this.scrollPane = new JScrollPane(allResults, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    }

    private void layoutComponents() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Result:"), gbc);
        gbc.gridy = 1;
        add(resultField, gbc);

        gbc.gridy = 2;
        add(new JLabel("All Results:"), gbc);
        gbc.gridy = 3;
        add(scrollPane, gbc);


    }

    public void setResult(String result) {
        resultField.setText(result);
    }

    public void appendResult(String result) {
        allResults.append(result + "\n");
    }
}
