
package dao;

import bean.ProdutoBean;
import database.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Guilherme Bialas
 */
public class ProdutoDao {
  //Está em desenvolvimento
    public int inserir(ProdutoBean produto){
        Connection conexao = Conexao.obterConexao();
        if(conexao != null){
            String sql = "INSERT INTO produto"
                         + "\n(categoria, quantidade, valor, descricao, aplicacao, unidade_de_medida, localizacao, valor_unitario, status_peca)"
                         +"\nVALUES(?,?,?,?,?,?,?,?,?)";
            try {
                PreparedStatement preparedStatement =  conexao.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS );
                
                preparedStatement.setString(1, produto.getAplicacao());
                preparedStatement.setString(2, produto.getCategoria());
                preparedStatement.setString(3, produto.getDescricao());
                preparedStatement.setString(4, produto.getLocalizacao());
                preparedStatement.setString(5, produto.getStatusPecas());
                preparedStatement.setString(6, produto.getUnidadeDeMedida());
                preparedStatement.setFloat(7, produto.getQuantidade());
                preparedStatement.setFloat(8, produto.getValor());
                preparedStatement.setFloat(9, pro);
                
            } catch (Exception e) {
            }
            }
            
        }               
    }

