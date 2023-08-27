package uz.maktab.IT.maktabIT.service.vm;

public class UserPasswordWM {

    private String login;
    private String OldPassword;
    private String newPassword;
    private String newPasswordConfrim;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getOldPassword() {
        return OldPassword;
    }

    public void setOldPassword(String oldPassword) {
        OldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getNewPasswordConfrim() {
        return newPasswordConfrim;
    }

    public void setNewPasswordConfrim(String newPasswordConfrim) {
        this.newPasswordConfrim = newPasswordConfrim;
    }
}
