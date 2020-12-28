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
public class Client {
  
    private int id;
    private String name;
    private String email;
    private String endereco;
    
    public Client(int idCli, String nomeCli, String emailCli, String endCle){
        this.id = idCli;
        this.name = nomeCli;
        this.email = emailCli;
        this.endereco = endCle;
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }
}
