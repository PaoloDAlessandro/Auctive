package it.itsrizzoli.auctive.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginForm {
    @Size(min=4, max=100, message = "Username deve esser tra 4 e 100 caratteri")
    @NotNull(message = "Username deve esser inserito")
    String username;

    @Size(min=6, max=25, message = "Password deve esser tra 6 e 25 caratteri")
    @NotNull(message = "Password deve esser inserito")
    String pass;

    public LoginForm() {
    }

    public LoginForm(String username, String pass) {
        this.username = username;
        this.pass = pass;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
