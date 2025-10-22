package pckg_VJ_1_ZD1B;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class InputPanel extends JPanel {

    private JTextField fstNumberField;
    private JTextField sndNumberField;
    private JComboBox<ALG_OPERATION> algOperationCombo;
    private JButton calculateButton;
    private InputPanelListener inputPanelListener;

    public InputPanel() {

        Border outer = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        Border inner = BorderFactory.createTitledBorder("Input Panel");
        Border border = BorderFactory.createCompoundBorder(outer, inner);
        setBorder(border);
        Dimension dims = getPreferredSize();
        dims.width += 250;
        setPreferredSize(dims);
        initComponents();
        layoutComponents();
        activatePanel();
    }

    public void setInputPanelListener(InputPanelListener inputPanelListener) {
        this.inputPanelListener = inputPanelListener;
    }

    private void initComponents() {
        this.fstNumberField = new JTextField(10);
        this.sndNumberField = new JTextField(10);
        this.algOperationCombo = new JComboBox<>();
        DefaultComboBoxModel<ALG_OPERATION> comboBoxModel = new DefaultComboBoxModel<>();
        for (ALG_OPERATION op : ALG_OPERATION.values()) {
            comboBoxModel.addElement(op);
        }
        algOperationCombo.setModel(comboBoxModel);
        algOperationCombo.setSelectedIndex(-1);
        calculateButton = new JButton("Calculate");
    }

    private void layoutComponents() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("First Number:"), gbc);
        gbc.gridx = 1;
        add(fstNumberField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Second Number:"), gbc);
        gbc.gridx = 1;
        add(sndNumberField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        add(new JLabel("Operation:"), gbc);
        gbc.gridx = 1;
        add(algOperationCombo, gbc);

        gbc.gridy = 4;
        gbc.weighty = 1.0;
        add(calculateButton, gbc);


    }

    private void activatePanel() {

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    Double fst = Double.parseDouble(fstNumberField.getText());
                    Double snd = Double.parseDouble(sndNumberField.getText());
                    ALG_OPERATION alg_operation =(ALG_OPERATION) algOperationCombo.getSelectedItem();
                    InputPanelData inputPanelData = new InputPanelData(fst, snd, alg_operation);
                    if(inputPanelListener != null) {
                        inputPanelListener.inputPanelEventOccurred(inputPanelData);
                    }

                }catch(NumberFormatException nfe) {

                    JOptionPane.showMessageDialog(InputPanel.this, nfe.getMessage(), "Exception input", JOptionPane.ERROR_MESSAGE);

                }

            }
        });
    }


}
