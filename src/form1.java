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
    private JButton cancelButton;

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
                signo.setText(" X^ ");
            }
        });

        sen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                signo.setText(" SEN ");}
        });

        cos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                signo.setText(" COS ");}
        });

        tan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                signo.setText(" TAN ");
            }
        });

        igual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float numero1, numero2;
                double angulo, resultado;

                switch (signo.getText().trim().toUpperCase()) {
                    case "+":
                        signo.setText("+");
                        numero1 = Float.parseFloat(n1.getText());
                        numero2 = Float.parseFloat(n2.getText());
                        if (numero1 != 0 && numero2 != 0) {
                            respuesta.setText(String.valueOf(String.format("%.2f", (numero1 + numero2))));
                        }
                        break;

                    case "-":
                        signo.setText("-");
                        numero1 = Float.parseFloat(n1.getText());
                        numero2 = Float.parseFloat(n2.getText());
                        if (numero1 != 0 && numero2 != 0) {
                            respuesta.setText(String.valueOf(String.format("%.2f", (numero1 - numero2))));
                        }
                        break;

                    case "*":
                        signo.setText("*");
                        numero1 = Float.parseFloat(n1.getText());
                        numero2 = Float.parseFloat(n2.getText());
                        if (numero1 != 0 && numero2 != 0) {
                            respuesta.setText(String.valueOf(String.format("%.2f", (numero1 * numero2))));
                        }
                        break;

                    case "/":
                        signo.setText("/");
                        numero1 = Float.parseFloat(n1.getText());
                        numero2 = Float.parseFloat(n2.getText());
                        if (numero1 != 0 && numero2 != 0) {
                            respuesta.setText(String.valueOf(String.format("%.2f", (numero1 / numero2))));
                        }
                        break;

                    case "√":
                        signo.setText("√");
                        numero1 = Float.parseFloat(n1.getText());
                        numero2 = Float.parseFloat(n2.getText());
                        double raiz = Math.pow(numero2, 1.0 / numero1);
                        respuesta.setText(String.valueOf(String.format("%.2f", (raiz))));
                        break;

                    case "X^":
                        signo.setText("X^");
                        numero1 = Float.parseFloat(n1.getText());
                        numero2 = Float.parseFloat(n2.getText());
                        resultado = Math.pow(numero1, numero2);
                        respuesta.setText(String.valueOf(String.format("%.2f", (resultado))));
                        break;

                    case "SEN":
                        signo.setText("SEN");
                        numero1 = Float.parseFloat(n1.getText());
                        numero2 = Float.parseFloat(n2.getText());
                        if (numero2 == 0) {
                            angulo = Math.toRadians(numero1);
                            resultado = Math.sin(angulo);
                            respuesta.setText(String.valueOf(String.format("%.2f", (resultado))));
                        } else {
                            angulo = Math.toRadians(numero1);
                            resultado = Math.sin(angulo);
                            respuesta.setText(String.valueOf(String.format("%.2f", (resultado * numero2))));
                        }
                        break;

                    case "COS":
                        signo.setText("COS");
                        numero1 = Float.parseFloat(n1.getText());
                        numero2 = Float.parseFloat(n2.getText());
                        if (numero2 == 0) {
                            angulo = Math.toRadians(numero1);
                            resultado = Math.cos(angulo);
                            respuesta.setText(String.valueOf(String.format("%.2f", (resultado))));
                        } else {
                            angulo = Math.toRadians(numero1);
                            resultado = Math.cos(angulo);
                            respuesta.setText(String.valueOf(String.format("%.2f", (resultado * numero2))));
                        }
                        break;

                    case "TAN":
                        signo.setText("TAN");
                        numero1 = Float.parseFloat(n1.getText());
                        numero2 = Float.parseFloat(n2.getText());
                        if (numero2 == 0) {
                            angulo = Math.toRadians(numero1);
                            resultado = Math.tan(angulo);
                            respuesta.setText(String.valueOf(String.format("%.2f", (resultado))));
                        } else {
                            angulo = Math.toRadians(numero1);
                            resultado = Math.tan(angulo);
                            respuesta.setText(String.valueOf(String.format("%.2f", (resultado * numero2))));
                        }
                        break;
                }

            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1.setText(null);
                n2.setText(null);
                respuesta.setText(null);
            }
        });

    }
}
