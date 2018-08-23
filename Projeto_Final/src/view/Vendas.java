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
 * @author Leonardo Moreira
 */
    public class Vendas implements BaseInterfaceJava {
        private JFrame jFrame;
    private JLabel jLabelQuantidade, jLabelValor, jLabelDescricao,
            jLabelUnidadeDeMedida, jLabelValorUnitario,jLabelStatusPeca, jLabelPeso;
    private JTextField jTextFieldQuantiade, jTextFieldValor,jTextFieldDescricao,jTextFieldAplicacao, jTextFieldUnidadeDeMedida,
            jTextFieldLocalizacao, jTextFieldValorUnitario,jTextFieldStatusPeca,jTextFieldPeso;
    private JButton jButtonSalvar, jButtonExcluir, jButtonAdicionar;
    
    public void Vendas(){
        instanciarComponentes();
        gerarTela();
        adicionarComponentes();
        gerarLocalizacoes();
        gerarDimensoes();
        jFrame.setVisible(true);
        
    }

        @Override
        public void instanciarComponentes() {
            jLabelQuantidade = new JLabel("Quantidade");
        jLabelValor = new JLabel("Valor");
        jLabelDescricao = new JLabel("Descricao");
        jLabelUnidadeDeMedida = new JLabel("Unidade De medida");
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
        @Override
        public void gerarTela() {
        jFrame = new JFrame("Venda de Produtos");
        jFrame.setSize(530, 40);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        }
        @Override
        public void adicionarComponentes() {
        }
        @Override
        public void gerarLocalizacoes() {
        }
        @Override
        public void gerarDimensoes() {
        }
    
    }
