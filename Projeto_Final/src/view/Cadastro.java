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

/**
 *
 * @author Guilherme Bialas
 */
public class Cadastro implements BaseInterfaceJava {

    private JFrame jFrame;
    private JLabel jLabelQuantidade, jLabelValor, jLabelDescricao, jLabelAplicacao,
            jLabelUnidadeDeMedida, jLabelLocalizacao, jLabelValorUnitario, jLabelStatusPeca, jLabelPeso;
    private JTextField jTextFieldQuantiade,jTextFieldValor, jTextFieldDescricao, jTextFieldAplicacao, jTextFieldUnidadeDeMedida,
            jTextFieldLocalizacao,jTextFieldValorUnitario,jTextFieldStatusPeca, jTextFieldPeso;
    private JButton jButton, jButtonSalvar, jButtonExcluir, jButtonAdicionar;

    public void Cadastro() {
        instanciarComponentes();
        gerarTela();
        adicionarComponentes();
        gerarLocalizacoes();
        gerarDimensoes();

    }
    @Override
    public void instanciarComponentes() {
        
        jLabelQuantidade = new JLabel("Quantidade");
    }

    @Override
    public void gerarTela() {

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
