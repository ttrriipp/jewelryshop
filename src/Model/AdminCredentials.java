package Model;

import java.util.HashMap;

public class AdminCredentials {

    HashMap<String, String> loginInfo = new HashMap<String, String>();

    public AdminCredentials(){
        loginInfo.put("admin1", "adminpass1");
        loginInfo.put("admin2", "adminpass2");
        loginInfo.put("admin3", "adminpass3");
        loginInfo.put("wallybayola", "wallyuwu");
    }

    public HashMap getLoginInfo(){
        return loginInfo;
    }

}
