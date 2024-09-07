import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class principal {
    private JTextField txtNumUno;
    private JTextField txtNumDos;
    private JLabel labNumUno;
    private JLabel labNumDos;
    private JButton btnSumar;
    private JButton btnRestar;
    private JButton btnMultiplicar;
    private JButton btnDividir;
    private JButton btnBorrar;
    private JTextField txtResultado;
    private JLabel labResultado;

    public principal() {
        double num1 = Double.parseDouble(txtNumUno.getText());
        double num2 = Double.parseDouble(txtNumDos.getText());
        //Boton de sumar
        btnSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double resultado = num1 + num2;
             btnSumar.setText(txtNumUno.getText()+txtNumDos.getText());
             JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + resultado);
            }
        });
        //Boton de borrar
        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             txtNumUno.setText("");
             txtNumDos.setText("");
             txtResultado.setText("");
            }
        });
        btnRestar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numUno = txtNumUno.getText();
                String numDos = txtNumDos.getText();
                double num1 = Double.parseDouble(numUno);
                double num2 = Double.parseDouble(numDos);
                double resultado = num1 - num2;
                JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + resultado);
            }
        });
        btnMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numUno = txtNumUno.getText();
                String numDos = txtNumDos.getText();
                double num1 = Double.parseDouble(numUno);
                double num2 = Double.parseDouble(numDos);
                double resultado = num1 * num2;
                JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es: " + resultado);
            }
        });
        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numUno = txtNumUno.getText();
                String numDos = txtNumDos.getText();
                double num1 = Double.parseDouble(numUno);
                double num2 = Double.parseDouble(numDos);
                double resultado = num1 / num2;
                JOptionPane.showMessageDialog(null, "El resultado de la division es: " + resultado);
            }
        });
    }


}