/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_db;

/**
 *
 * @author Mateus
 */
public class User {
    private int id;
    private String tipo;
    private String tell;
    private String login;
    
    public User(int idUsr, String tipoUsr, String tellUsr, String loginUsr){
        this.id = idUsr;
        this.tipo = tipoUsr;
        this.tell = tellUsr;
        this.login = loginUsr;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getTell() {
        return tell;
    }

    public String getLogin() {
        return login;
    }
}
