package dao;

import bean.ProdutoBean;
import database.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author Guilherme Bialas
 */
public class ProdutoDao {

    //Está em desenvolvimento
    public int inserir(ProdutoBean produto) {
        Connection conexao = Conexao.obterConexao();
        if (conexao != null) {
            String sql = "INSERT INTO produto"
                    + "\n(categoria, quantidade, valor, descricao, aplicacao, unidade_de_medida, localizacao, valor_unitario, status_peca)"
                    + "\nVALUES(?,?,?,?,?,?,?,?,?)";
            try {
                PreparedStatement preparedStatement = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

                preparedStatement.setString(1, produto.getAplicacao());
                preparedStatement.setString(2, produto.getCategoria());
                preparedStatement.setString(3, produto.getDescricao());
                preparedStatement.setString(4, produto.getLocalizacao());
                preparedStatement.setString(5, produto.getStatusPecas());
                preparedStatement.setString(6, produto.getUnidadeDeMedida());
                preparedStatement.setFloat(7, produto.getQuantidade());
                preparedStatement.setFloat(8, produto.getValor());
                preparedStatement.setFloat(9, produto.getValorUnitario());
                preparedStatement.execute();

                ResultSet resultSet = preparedStatement.getGeneratedKeys();
                if (resultSet.next()) {
                    return resultSet.getInt(1);
                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                Conexao.fecharConexao();
            }
        }
        return 0;
    }

    public boolean alterar(ProdutoBean produto) {
        Connection conexao = Conexao.obterConexao();
        String sql = "UPDATE pecas SET quantidade = ?,"
    + " valor = ?, descricao = ?,unidadeDeMedida = ?, localizacao = ?, valorUnitario = ? ";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, produto.getDescricao());
            ps.setString(2, produto.getUnidadeDeMedida());
            ps.setString(3, produto.getLocalizacao());
            ps.setFloat(4, produto.getValorUnitario());
            ps.setFloat(5, produto.getQuantidade());
            ps.setFloat(6, produto.getValor());
            return  ps.executeUpdate() == 1;
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            Conexao.fecharConexao();
        }
        return false;
 }
 public ProdutoBean obterProdutoPeloId(int id){
     String sql = "SELECT id, aplicacao, valor, valorUnitario, quantidade ";
     Connection conexao = Conexao.obterConexao();
     if(conexao != null){
         try {
             PreparedStatement ps = conexao.prepareStatement(sql);
             ps.setInt(1,id);
             ps.execute();
             ResultSet resultSet = ps.getResultSet();
             if(resultSet.next()){
                 ProdutoBean produto = new ProdutoBean();
                 produto.setId(resultSet.getInt("id"));
                 produto.setAplicacao(resultSet.getString("aplicacao"));
                 produto.setValor(resultSet.getFloat("valor"));
                 produto.setValorUnitario(resultSet.getFloat("valorUnitario"));
                 produto.setQuantidade(resultSet.getFloat("quantidade"));
              return produto;
             }
         } catch (Exception e) {
             e.printStackTrace();
         }finally{
             Conexao.fecharConexao();
         }
     }
     return null;
 }
 
 
 public List<ProdutoBean> obterProdutos(){
     Connection conexao = Conexao.obterConexao();
     if(conexao != null){
     String sql ="SELECT id, aplicacao, valor, valorUnitario, statusPeca";
         try {
             Statement statement = conexao.createStatement();
             statement.execute(sql);
             ResultSet resultSet = statement.getResultSet();
             while(resultSet.next()){
                 ProdutoBean produto = new ProdutoBean();
                 produto.setId(resultSet.getInt("id"));
                 produto.setAplicacao(resultSet.getString("aplicacao"));
                 produto.setValor(resultSet.getFloat("valor"));
                 
                 
             }
         } catch (Exception e) {
         }
     }
 }
     }
 


    

