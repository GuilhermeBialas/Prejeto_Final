/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import Interface.BaseInterfaceJava;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marcio pedro Schiehl
 */
public class Vendas implements BaseInterfaceJava{
    private JFrame jFrameVendas;
    private JLabel jLabelID, jLabelStatus, jLabelCategoria;
    private JTextField jTextFieldId;
    
    /*private DefaultTableModel dtm;
    private JScrollPane jScrollPane;
    private JTable jTablePedido;*/
    public Vendas(){
        instanciarComponentes();
        gerarTela();
        adicionarComponentes();
        gerarLocalizacoes();
        gerarDimensoes();
        //configuarJTable();
        gerarLocalizacoes();
         gerarDimensoes();
        instanciarComponentes();
        jFrameVendas.setVisible(true);
    }
    @Override
    public void gerarTela() {
        jFrameVendas = new JFrame("Venda de Produtos");
        jFrameVendas.setSize(800, 600);
        jFrameVendas.setLayout(null);
        jFrameVendas.setLocationRelativeTo(null);
        jFrameVendas.setResizable(false);
        jFrameVendas.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {
        //JLabel's do Projeto
        jFrameVendas.add(jLabelID);
        jFrameVendas.add(jLabelStatus);
        jFrameVendas.add(jLabelCategoria);
        //JTextField's do Projeto
        jFrameVendas.add(jTextFieldId);
    }

    @Override
    public void gerarLocalizacoes() {
        //Localização das JLabel's
        jLabelID.setLocation(10,10);
        jLabelStatus.setLocation(170,10);
        jLabelCategoria.setLocation(230, 10);
        
        jTextFieldId.setLocation(420, 10);
    }

    @Override
    public void gerarDimensoes() {
       jLabelID.setSize(10,20);
       jLabelStatus.setLocation(10,20);
       jLabelCategoria.setLocation(10, 20);
        
       jTextFieldId.setLocation(10, 20);
    }

    @Override
    public void instanciarComponentes() {
        jLabelID  = new JLabel("Numero");
        jLabelStatus = new JLabel("Status");
        jLabelCategoria = new JLabel("Categoria");
        
        jTextFieldId = new JTextField();
    };
    
    
}
