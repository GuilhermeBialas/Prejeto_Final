/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.ClienteBean;
import bean.ProdutoBean;
import database.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcio Pedro Schiehl
 */
<<<<<<< HEAD
/*public class ClienteDao {
    public void obterNome(){
        
    }
=======
public class ClienteDao {
    
    public List<ClienteBean> obterNome(){
     List<ClienteBean> clientes = new ArrayList<>();
     Connection conexao = Conexao.obterConexao();
     if(conexao != null)       {
     String sql = "SELECT nome FROM clientes;";
     try{
         Statement statement = conexao.createStatement();
         statement.execute(sql);
         ResultSet resultSet = statement.getResultSet();
         while(resultSet.next()){
             ClienteBean cliente = new ClienteBean();
             cliente.setNome(resultSet.getString("nome"));
             clientes.add(cliente);
         }
     }catch(SQLException e){
       e.printStackTrace();
     }finally{
         Conexao.fecharConexao();
     }       
         
     }
     return clientes;
            
       
    }/*
>>>>>>> 04ee1aea9e53899730fce6a8de237451be9c099e
    public int inserir(ProdutoBean cliente){
        
    }
    public int apagar(ProdutoBean cliente){
        
    }
    public void obterClientes(){
        
    }
    public void Alterar(ProdutoBean cliente){
        
    }*/
    
}*/
