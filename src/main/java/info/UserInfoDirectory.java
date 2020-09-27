/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class UserInfoDirectory {
    private ArrayList<UserInfo> userInfoDirectory;

    public UserInfoDirectory() {
        this.userInfoDirectory = new ArrayList<UserInfo>();
    }
    
    public ArrayList<UserInfo> getUserAccountDirectory() {
        return userInfoDirectory;
    }

    public void setUserAccountDirectory(ArrayList<UserInfo> userAccountDirectory) {
        this.userInfoDirectory = userAccountDirectory;
    }
    
    public void addUserAccount(UserInfo ua) {
        userInfoDirectory.add(ua);
    }
    
    public void removeUserAccount(UserInfo userAccount){
        userInfoDirectory.remove(userAccount);
    }
    
    public UserInfo getUserAccount(String userName) {
        for (UserInfo ua: userInfoDirectory) {
            if (ua.getUsername().equals(userName)) {
                return ua;
            }
        }
        return null;
    }
}
