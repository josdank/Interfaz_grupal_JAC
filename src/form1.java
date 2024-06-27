import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    public JPanel mainPanel;
    private JTextField n1;
    private JTextField n2;
    private JButton suma;
    private JButton resta;
    private JButton multiplicación;
    private JButton raiz;
    private JButton sen;
    private JButton npotencia;
    private JButton division;
    private JButton cos;
    private JButton tan;
    private JButton igual;
    private JTextField respuesta;
    private JLabel signo;

    public form1() {
        suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                signo.setText(" + ");
            }
        });
        resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                signo.setText(" - ");
            }
        });
        multiplicación.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                signo.setText(" * ");
            }
        });
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                signo.setText(" / ");
            }
        });
        raiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                signo.setText(" √ ");
            }
        });
        npotencia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                signo.setText(" x^ ");
            }
        });
        sen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {signo.setText(" sen ");}
        });
        igual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (signo.getText().equals(" + ")) {
                    signo.setText(" + ");
                    float numero1 = Float.parseFloat(n1.getText());
                    float numero2 = Float.parseFloat(n2.getText());
                    if (numero1 != 0 && numero2 != 0) {
                        respuesta.setText(String.valueOf(String.format("%.2f",(numero1 + numero2))));
                    }
                    respuesta.setText(respuesta.getText());
                } else if (signo.getText().equals(" - ")) {
                    signo.setText(" - ");
                    float numero1 = Float.parseFloat(n1.getText());
                    float numero2 = Float.parseFloat(n2.getText());
                    if (numero1 != 0 && numero2 != 0) {
                        respuesta.setText(String.valueOf(String.format("%.2f",(numero1 - numero2))));
                    }
                    respuesta.setText(respuesta.getText());
                }else if (signo.getText().equals(" * ")) {
                    signo.setText(" * ");
                    float numero1 = Float.parseFloat(n1.getText());
                    float numero2 = Float.parseFloat(n2.getText());
                    if (numero1 != 0 && numero2 != 0) {
                        respuesta.setText(String.valueOf(String.format("%.2f",(numero1 * numero2))));
                    }
                    respuesta.setText(respuesta.getText());
                }else if (signo.getText().equals(" / ")) {
                    signo.setText(" / ");
                    float numero1 = Float.parseFloat(n1.getText());
                    float numero2 = Float.parseFloat(n2.getText());
                    if (numero2 != 0) {
                        respuesta.setText(String.valueOf(String.format("%.2f",(numero1 / numero2))));
                    }else {
                        respuesta.setText("No se puede para 0, no sea gil animal ");
                    }
                    respuesta.setText(respuesta.getText());
                } else if (signo.getText().equals(" √ ")) {
                    signo.setText(" √ ");
                    float numero1 = Float.parseFloat(n1.getText());
                    float numero2 = Float.parseFloat(n2.getText());
                    double raiz = Math.pow(numero2, 1.0 / numero1);
                    respuesta.setText(String.valueOf(String.format("%.2f",(raiz))));
                } else if (signo.getText().equals(" x^ ")) {
                    signo.setText(" x^ ");
                    float numero1 = Float.parseFloat(n1.getText());
                    float numero2 = Float.parseFloat(n2.getText());
                    double resultado = Math.pow(numero1, numero2);
                    respuesta.setText(String.valueOf(String.format("%.2f",(resultado))));
                } else if (signo.getText().equals(" sen ")) {
                    signo.setText(" sen ");
                    float numero1 = Float.parseFloat(n1.getText());
                    float numero2 = Float.parseFloat(n2.getText());

                    if (numero2 == 0) {
                        double angulo = Math.toRadians(numero1);
                        double resultado = Math.sin(angulo);
                        respuesta.setText(String.valueOf(String.format("%.2f",(resultado))));
                    } else {
                        double angulo = Math.toRadians(numero1);
                        double resultado = Math.sin(angulo);
                        respuesta.setText(String.valueOf(String.format("%.2f",(resultado * numero2))));
                    }
                }
            }
        });
    }
}
