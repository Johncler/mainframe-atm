package bo.edu.ucb.sis213;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AtmFrame {
    private JFrame loginFrame;
    private JFrame mainFrame;
    private JTextField usuarioField;
    private JPasswordField contrasenaField;

    public AtmFrame() {
        createLoginFrame();
    }

    private void createLoginFrame() {
        loginFrame = new JFrame("Iniciar Sesión");
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setSize(300, 200);
        loginFrame.setLayout(new GridLayout(3, 2, 10, 10));

        JLabel usuarioLabel = new JLabel("Usuario:");
        usuarioField = new JTextField();

        JLabel contrasenaLabel = new JLabel("Contraseña:");
        contrasenaField = new JPasswordField();

        JButton loginButton = new JButton("Iniciar Sesión");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showMainFrame();
            }
        });

        loginFrame.add(usuarioLabel);
        loginFrame.add(usuarioField);
        loginFrame.add(contrasenaLabel);
        loginFrame.add(contrasenaField);
        loginFrame.add(new JLabel()); // Espacio en blanco
        loginFrame.add(loginButton);

        loginFrame.setVisible(true);
    }

    private void showMainFrame() {
        loginFrame.dispose();

        mainFrame = new JFrame("Cajero Automático");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(400, 300);
        mainFrame.setLayout(new GridLayout(6, 1, 10, 10));

        JButton consultarSaldoButton = new JButton("Consultar Saldo");
        JButton realizarDepositoButton = new JButton("Realizar Depósito");
        JButton realizarRetiroButton = new JButton("Realizar Retiro");
        JButton cambiarPinButton = new JButton("Cambiar PIN");
        JButton cerrarSesionButton = new JButton("Cerrar Sesión");

        cerrarSesionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Cerrar la aplicación
            }
        });

        mainFrame.add(consultarSaldoButton);
        mainFrame.add(realizarDepositoButton);
        mainFrame.add(realizarRetiroButton);
        mainFrame.add(cambiarPinButton);
        mainFrame.add(cerrarSesionButton);

        mainFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new AtmFrame();
            }
        });
    }
}
