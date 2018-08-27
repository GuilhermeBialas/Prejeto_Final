/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import Interface.BaseInterfaceJava;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
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
    private JRadioButton jRadioButtonNovo, jRadioButtonSemiNovo;
    private ButtonGroup buttonGroup;
    
    /*private DefaultTableModel dtm;
    private JScrollPane jScrollPane;
    private JTable jTablePedido;*/
    public Vendas(){
        instanciarComponentes();
        gerarTela();
        adicionarComponentes();
        gerarLocalizacoes();
        gerarDimensoes();
        radionGroup();
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
        jFrameVendas.add(jRadioButtonNovo);
        jFrameVendas.add(jRadioButtonSemiNovo);
    }

    @Override
    public void gerarLocalizacoes() {
        //Localização das JLabel's
        jLabelID.setLocation(10,10);
        jLabelStatus.setLocation(110,10);
        jLabelCategoria.setLocation(230, 10);
        
        jTextFieldId.setLocation(60, 10);
        
        jRadioButtonSemiNovo.setLocation(160,10);
        jRadioButtonNovo.setLocation(160,40);
    }

    @Override
    public void gerarDimensoes() {
       jLabelID.setSize(50,20);
       jLabelStatus.setSize(100,20);
       jLabelCategoria.setSize(100, 20);
        
       jTextFieldId.setSize(50, 20);
       
       jRadioButtonNovo.setSize(20,20);
       jRadioButtonSemiNovo.setSize(20,20);
    }

    @Override
    public void instanciarComponentes() {
        jLabelID  = new JLabel("Numero");
        jLabelStatus = new JLabel("Status");
        jLabelCategoria = new JLabel("Categoria");
        
        jTextFieldId = new JTextField();
        
      jRadioButtonNovo = new JRadioButton("Novo");
      jRadioButtonSemiNovo = new JRadioButton("SemiNovo");
    };

    private void radionGroup() {
        ButtonGroup jradioButtonGroup  = new ButtonGroup();
        jradioButtonGroup.add(jRadioButtonSemiNovo);
        jradioButtonGroup.add(jRadioButtonNovo);
    }
    
    
}
