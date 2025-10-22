package pckg_VJ_1_ZD1B;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private InputPanel inputPanel;
    private PresentationPanel presentationPanel;
    private CalculationStrategy calculationStrategy;

    public MainFrame() {
        super("Simple calculator");
        setSize(600, 350);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initComponents();
        layoutComponents();
        activateMainFrame();

    }

    private void initComponents() {
        this.inputPanel = new InputPanel();
        this.presentationPanel = new PresentationPanel();
    }

    private void layoutComponents() {
        setLayout(new BorderLayout());
        add(presentationPanel, BorderLayout.CENTER);
        add(inputPanel, BorderLayout.WEST);

    }

    private void activateMainFrame() {
        inputPanel.setInputPanelListener(new InputPanelListener() {
            @Override
            public void inputPanelEventOccurred(InputPanelData ipd) {
                CalculationStrategy calculationStrategy = resolveAlgOperation(ipd.getAlgOperation());
                Double result = calculationStrategy.performCalculation(ipd.getFirstNumber(), ipd.getSecondNumber());
                try {
                    presentationPanel.setResult(result.toString());
                    presentationPanel.appendResult(ipd.getFirstNumber() + " " + ipd.getAlgOperation() + " " + ipd.getSecondNumber());
                } catch (NullPointerException e) {
                    presentationPanel.setResult("Error");
                }
            }
        });
    }

    private CalculationStrategy resolveAlgOperation(ALG_OPERATION alg_operation){
        switch(alg_operation.toString()){
            case "Addition": return new AdditionStrategy();
            case "Subtraction": return new SubtractionStrategy();
            case "Multiplication": return new MultiplicationStrategy();
            case "Division": return new DivisionStrategy();
            default: return null;
        }
    }
}
