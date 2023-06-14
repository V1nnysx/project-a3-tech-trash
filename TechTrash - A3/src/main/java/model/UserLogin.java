package model;

public class UserLogin {

    private int id;
    private String userLogin;
    private String passwordLogin;
    private String emailLogin;

    /*public UserLogin(int id, String userLogin, String passwordLogin) {
        this.id = id;
        this.userLogin = userLogin;
        this.passwordLogin = passwordLogin;
        //this.emailLogin = emailLogin;

    }*/

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getPasswordLogin() {
        return passwordLogin;
    }

    public void setPasswordLogin(String passwordLogin) {
        this.passwordLogin = passwordLogin;
    }

    /*public String getEmailLogin(){
        return emailLogin;
    }
    
    public void setEmailLogin(String emailLogin){
        this.emailLogin = emailLogin;
    }*/
}
