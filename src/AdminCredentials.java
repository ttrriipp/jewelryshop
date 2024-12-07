import java.util.HashMap;

public class AdminCredentials {

    HashMap<String, String> loginInfo = new HashMap<String, String>();

    AdminCredentials(){
        loginInfo.put("admin1", "adminpass1");
        loginInfo.put("admin2", "adminpass2");
        loginInfo.put("admin3", "adminpass3");
        loginInfo.put("wallybayola", "wallyuwu");
    }

    protected HashMap getLoginInfo(){
        return loginInfo;
    }

}
