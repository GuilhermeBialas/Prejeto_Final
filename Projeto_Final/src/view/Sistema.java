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
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Alunos
 */
public class Sistema implements BaseInterfaceJava{
    public Sistema (){
       /* instanciarComponentes();
        adicionarComponentes();
        gerarLocalizacoes();
        gerarDimensoes();*/
        gerarTela();
        trocaIcone();
       jFrame.setVisible(true);
    }
    
    private JFrame jFrame;
   

    @Override
    public void gerarTela() {
        jFrame = new JFrame("nome do sistema");
        jFrame.setSize(677,416);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(null);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(jFrame.DISPOSE_ON_CLOSE);
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

    private void instanciarComponentes() {
        
    }

    private void trocaIcone() {
       URL url = this.getClass().getResource("/icones/air-filter.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
       jFrame.setIconImage(imagemTitulo);
    }
    
}
