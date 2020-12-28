/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_db;

import java.sql.Date;

/**
 *
 * @author Mateus
 */
public class OS {
    private int id;
    private Date data;
    private String equipamento;
    private String defeito;
    private String servico;
    private String tecnico;
    private float valor;
    private int clienteID;
    
    public OS(int idOS, Date dataOS, String equipamentoOS, String defeitoOS, String servicoOS, String tecnicoOS, float valorOS, int clienteID_OS){
        this.id = idOS;
        this.data = dataOS;
        this.equipamento = equipamentoOS;
        this.defeito = defeitoOS;
        this.servico = servicoOS;
        this.tecnico = tecnicoOS;
        this.valor = valorOS;
        this.clienteID = clienteID_OS;
    }

    public int getId() {
        return id;
    }

    public Date getData() {
        return data;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public String getDefeito() {
        return defeito;
    }

    public String getServico() {
        return servico;
    }

    public String getTecnico() {
        return tecnico;
    }

    public float getValor() {
        return valor;
    }

    public int getClienteID() {
        return clienteID;
    }
}
