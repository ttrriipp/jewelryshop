import Frame.LoginPage;
import Model.AdminCredentials;

public class Main {
    public static void main(String[] args) {
        AdminCredentials adminCredentials = new AdminCredentials();
        LoginPage loginPage = new LoginPage(adminCredentials.getLoginInfo());
        loginPage.setVisible(true);
    }
}
