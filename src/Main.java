import javax.swing.*;

public class Main extends JFrame {

    private JTextArea gintuanNiLemonTextArea;
    private JPanel panel1;
    private JTextField userNameField;
    private JLabel passText;
    private JTextField passField;
    private JButton btn1;

    public static void main(String[] args) {

        AdminCredentials adminCredentials = new AdminCredentials();
        LoginPage loginPage = new LoginPage(adminCredentials.getLoginInfo());
        loginPage.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}

