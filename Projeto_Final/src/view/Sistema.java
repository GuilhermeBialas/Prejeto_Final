/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Interface.BaseInterfaceJava;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Alunos
 */
public class Sistema implements BaseInterfaceJava{
    public Sistema (){
        gerarTela();
        trocaIcone();
        instaciarComponentes();
        adicionarComponentes();
        gerarLocalizacoes();
        gerarDimensoes();
        //acaoBotaoCadastro();
       jFrame.setVisible(true);
    }
    
    private JFrame jFrame;
   private JButton jButtonCadastro, jButtonEstoque, jButtonVenda, jButtonSair;

    @Override
    public void instaciarComponentes() {
        jButtonCadastro = new JButton("Cadastro");
        jButtonEstoque = new JButton("Estoque");
        jButtonVenda = new JButton("Venda");
        jButtonSair = new JButton("Sair");
    }
    @Override
    public void gerarTela() {
        jFrame = new JFrame("nome do sistema");
        jFrame.setSize(800,600);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(null);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(jFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jButtonCadastro);
        jFrame.add(jButtonEstoque);
        jFrame.add(jButtonVenda);
        jFrame.add(jButtonSair);
        
    }
   
        
   

    @Override
    public void gerarLocalizacoes() {
        jButtonCadastro.setLocation(10,10);
        jButtonEstoque.setLocation(120,10);
        jButtonVenda.setLocation(240,10);
        jButtonSair.setLocation(360,10);
    }

    @Override
    public void gerarDimensoes() {
        jButtonCadastro.setSize(100,50);
        jButtonEstoque.setSize(100,50);
        jButtonSair.setSize(100,50);
        jButtonVenda.setSize(100,50);
    }


    private void trocaIcone() {
       URL url = this.getClass().getResource("/icones/air-filter.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
       jFrame.setIconImage(imagemTitulo);
    }

   /* private void acaoBotaoCadastro() {
        
    }*/


    
    
}
