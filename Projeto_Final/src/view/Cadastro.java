/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Interface.BaseInterfaceJava;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Guilherme Bialas
 */
public class Cadastro implements BaseInterfaceJava {

    private JFrame jFrame;
    private JLabel jLabelQuantidade, jLabelValor, jLabelDescricao, jLabelAplicacao,
            jLabelUnidadeDeMedida, jLabelLocalizacao, jLabelValorUnitario, jLabelStatusPeca, jLabelPeso;
    private JTextField jTextFieldQuantiade, jTextFieldValor, jTextFieldDescricao, jTextFieldAplicacao, jTextFieldUnidadeDeMedida,
            jTextFieldLocalizacao, jTextFieldValorUnitario, jTextFieldStatusPeca, jTextFieldPeso;
    private JButton jButtonSalvar, jButtonExcluir, jButtonAdicionar;

    public void Cadastro() {
        instanciarComponentes();
        gerarTela();
        adicionarComponentes();
        gerarLocalizacoes();
        gerarDimensoes();
        jFrame.setVisible(true);

    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame("Cadastro de Produtos");
        jFrame.setSize(800, 600);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {
        //jLabel's
        jFrame.add(jLabelQuantidade);
        jFrame.add(jLabelValor);
        jFrame.add(jLabelDescricao);
        jFrame.add(jLabelAplicacao);
        jFrame.add(jLabelUnidadeDeMedida);
        jFrame.add(jLabelLocalizacao);
        jFrame.add(jLabelValorUnitario);
        jFrame.add(jLabelStatusPeca);
        jFrame.add(jLabelPeso);

        //JTextField's
        jFrame.add(jTextFieldQuantiade);
        jFrame.add(jTextFieldValor);
        jFrame.add(jTextFieldDescricao);
        jFrame.add(jTextFieldAplicacao);
        jFrame.add(jTextFieldUnidadeDeMedida);
        jFrame.add(jTextFieldLocalizacao);
        jFrame.add(jTextFieldValorUnitario);
        jFrame.add(jTextFieldStatusPeca);
        jFrame.add(jTextFieldPeso);

        //JButton's
        jFrame.add(jButtonSalvar);
        jFrame.add(jButtonExcluir);
        jFrame.add(jButtonAdicionar);

    }

    @Override
    public void gerarLocalizacoes() {
        //Descricao
      jLabelDescricao.setLocation(10,10);
      jTextFieldDescricao.setLocation(120,10);
        
        //Quantidade
        jLabelQuantidade.setLocation(10, 40);
        jTextFieldQuantiade.setLocation(120, 40);
        
        //Valor
        
        jLabelValor.setLocation(10, 70);
        jTextFieldValor.setLocation(120, 70);
        
        //Aplicacao
        jLabelAplicacao.setLocation(10, 100);
        jTextFieldAplicacao.setLocation(120, 100);
        
        //UnidadeDeMedida
        jLabelUnidadeDeMedida.setLocation(10, 140);
        jTextFieldUnidadeDeMedida.setLocation(120, 140);
        
        //Localizacao
        jLabelLocalizacao.setLocation(10,180);
        jTextFieldLocalizacao.setLocation(120,180);
        
        //ValorUnitario
        jLabelValorUnitario.setLocation(10, 210);
        jTextFieldValorUnitario.setLocation(120,210);
        
        //StatusPeca
        jLabelStatusPeca.setLocation(10, 240);
        jTextFieldStatusPeca.setLocation(120, 240);
        
        //Peso
        jLabelPeso.setLocation(10, 280);
        jTextFieldPeso.setLocation(120, 280);
        
        //BotaoSalvar
        jButtonSalvar.setLocation(300,10);
        
        //BotaoExcluir
        jButtonExcluir.setLocation(300,70);
        
        //BotaoAdicionar
        jButtonAdicionar.setLocation(300, 150);
        
    }

    @Override
    public void gerarDimensoes() {

        //JButton's
        jButtonSalvar.setSize(100, 50);
        jButtonExcluir.setSize(100, 50);
        jButtonAdicionar.setSize(100, 50);

        //JTextField's
        jTextFieldQuantiade.setSize(100, 20);
        jTextFieldValor.setSize(100, 20);
        jTextFieldDescricao.setSize(100, 20);
        jTextFieldAplicacao.setSize(100, 20);
        jTextFieldUnidadeDeMedida.setSize(100, 20);
        jTextFieldLocalizacao.setSize(100, 20);
        jTextFieldValorUnitario.setSize(100, 20);
        jTextFieldStatusPeca.setSize(100, 20);
        jTextFieldPeso.setSize(100, 20);

        //JLabel's
        jLabelQuantidade.setSize(100, 20);
        jLabelValor.setSize(100, 20);
        jLabelDescricao.setSize(100, 20);
        jLabelAplicacao.setSize(100, 20);
        jLabelUnidadeDeMedida.setSize(100, 20);
        jLabelLocalizacao.setSize(100, 20);
        jLabelValorUnitario.setSize(100, 20);
        jLabelStatusPeca.setSize(100, 20);
        jLabelPeso.setSize(100, 20);

    }

    @Override
    public void instanciarComponentes() {
        //JLabel's 

        jLabelQuantidade = new JLabel("Quantidade");
        jLabelValor = new JLabel("Valor");
        jLabelDescricao = new JLabel("Descricao");
        jLabelAplicacao = new JLabel("Aplicação");
        jLabelUnidadeDeMedida = new JLabel("Unidade De medida");
        jLabelLocalizacao = new JLabel("Localização");
        jLabelValorUnitario = new JLabel("ValorUnitario");
        jLabelStatusPeca = new JLabel("Status da Peça");
        jLabelPeso = new JLabel("Peso");

        //JTextField's
        jTextFieldQuantiade = new JTextField("");
        jTextFieldValor = new JTextField("");
        jTextFieldDescricao = new JTextField("");
        jTextFieldAplicacao = new JTextField("");
        jTextFieldUnidadeDeMedida = new JTextField("");
        jTextFieldLocalizacao = new JTextField("");
        jTextFieldValorUnitario = new JTextField("");
        jTextFieldStatusPeca = new JTextField("");
        jTextFieldPeso = new JTextField("");

        //JButton's
        jButtonSalvar = new JButton("Salva");
        jButtonExcluir = new JButton("Excluir");
        jButtonAdicionar = new JButton("Adicionar");
    }

}
