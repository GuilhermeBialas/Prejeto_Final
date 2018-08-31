/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import Interface.BaseInterfaceJava;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
 * @author Márcio Pedro Schiehl(mpschiehl@outlook.com)
 * @date 2018-08-27
 */
public class Vendas implements BaseInterfaceJava {
    private JFrame jFrameVendas;
    private JLabel jLabelID, jLabelStatus, jLabelCategoria, jLabelNovo, jLabelSemiNovo,jLabelDescricao,jLabelQuantidade;
    private JTextField jTextFieldId, jTextFieldDescricao,jTextFieldQuantidade;
    private JRadioButton jRadioButtonNovo, jRadioButtonSemiNovo;
    private ButtonGroup buttonGroup;
    private JButton jButtonSair, jButtonIncuir;
    private DefaultTableModel dtm,dtmp;
    private JScrollPane jScrollPaneBuscador,jScrollPanePedido;
    private JTable jTableBusca, jTablePedido;
    private JComboBox jComboBoxCategoriaC;
    public Vendas(){
        instanciarComponentes();
        gerarTela();
        adicionarComponentes();
        gerarLocalizacoes();
        gerarDimensoes();
        radionGroup();
        acaobotao();
        configuarJTableBusca();
        configurarJTablePedido();
        comboBoxConfigura();
        gerarLocalizacoes();
         gerarDimensoes();
         acaoBotaoIncluir();
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
        jFrameVendas.add(jLabelNovo);
        jFrameVendas.add(jLabelSemiNovo);
        jFrameVendas.add(jLabelDescricao);
        jFrameVendas.add(jLabelQuantidade);
        //JTextField's do Projeto
        jFrameVendas.add(jTextFieldId);
        jFrameVendas.add(jTextFieldDescricao);
        jFrameVendas.add(jTextFieldQuantidade);
        //JRadionButton's
        jFrameVendas.add(jRadioButtonNovo);
        jFrameVendas.add(jRadioButtonSemiNovo);
        //JButton's
        jFrameVendas.add(jButtonSair);
        jFrameVendas.add(jButtonIncuir);
        //adiciona a JTable's
         jFrameVendas.add(jScrollPaneBuscador);
         jFrameVendas.add(jScrollPanePedido);
         //JComboBox's
         jFrameVendas.add(jComboBoxCategoriaC);
    }

    @Override
    public void gerarLocalizacoes() {
        //Localização das JLabel's
        jLabelID.setLocation(10,10);
        jLabelStatus.setLocation(110,10);
        jLabelCategoria.setLocation(230, 10);
        jLabelNovo.setLocation(180,10);
        jLabelSemiNovo.setLocation(180,40);
        jLabelDescricao.setLocation(500,10);
        jLabelQuantidade.setLocation(10,40);
        //JTextiField's
        jTextFieldId.setLocation(60, 10);
        jTextFieldDescricao.setLocation(550,10);
        jTextFieldQuantidade.setLocation(90,40);
        //jRadion's
        jRadioButtonSemiNovo.setLocation(160,10);
        jRadioButtonNovo.setLocation(160,40);
        //JButton's
        jButtonSair.setLocation(680,530);
        jButtonIncuir.setLocation(10,530);
        //Jtable's
        jScrollPaneBuscador.setLocation(10,70);
        jScrollPanePedido.setLocation(410,70);
        //JComboBox's
        jComboBoxCategoriaC.setLocation(300 ,10);
    }

    @Override
    public void gerarDimensoes() {
       jLabelID.setSize(50,20);
       jLabelStatus.setSize(100,20);
       jLabelCategoria.setSize(100, 20);
       jLabelNovo.setSize(100,20);
       jLabelSemiNovo.setSize(100,20);
       jLabelDescricao.setSize(45,20);
       jLabelQuantidade.setSize(70,20);
          
       jTextFieldId.setSize(50, 20);
       jTextFieldDescricao.setSize(230,20);
       jTextFieldQuantidade.setSize(50,20);
       
       jRadioButtonNovo.setSize(20,20);
       jRadioButtonSemiNovo.setSize(20,20);
       
       jButtonSair.setSize(100,35);
       jButtonIncuir.setSize(100, 35);
       
       jScrollPaneBuscador.setSize(360,360);
       jScrollPanePedido.setSize(360,360);
       
       jComboBoxCategoriaC.setSize(192,20);
       
    }

    @Override
    public void instanciarComponentes() {
        jLabelID  = new JLabel("Numero");
        jLabelStatus = new JLabel("Status:");
        jLabelCategoria = new JLabel("Categoria");
        jLabelSemiNovo = new JLabel("Semi Novo");
        jLabelNovo = new JLabel("Novo");
        jLabelDescricao = new JLabel("Produto");
        jLabelQuantidade = new JLabel("Quantidade");
        
        jTextFieldId = new JTextField();
        jTextFieldDescricao = new JTextField();
        jTextFieldQuantidade = new JTextField();
        
      jRadioButtonNovo = new JRadioButton();
      jRadioButtonSemiNovo = new JRadioButton();
      
      jButtonSair = new JButton("Sair");
      jButtonIncuir = new JButton("Incluir");
      
      jTableBusca = new JTable();
      jTablePedido = new JTable();
      
       jScrollPaneBuscador = new JScrollPane(jTableBusca);
       jScrollPanePedido = new JScrollPane(jTablePedido);
       
       jComboBoxCategoriaC = new JComboBox();
    };

    private void radionGroup() {
        ButtonGroup jradioButtonGroup  = new ButtonGroup();
        jradioButtonGroup.add(jRadioButtonSemiNovo);
        jradioButtonGroup.add(jRadioButtonNovo);
    }
    private void validacao(){
      /* String  categoria = jComboBoxCategoriaC.getSelectedItem().toString();
        JOptionPane.showMessageDialog(null, categoria);*/
        if(jComboBoxCategoriaC.getSelectedIndex() == -1||jComboBoxCategoriaC.getSelectedItem()==null ){
           JOptionPane.showMessageDialog(null, "A categoria de ser Selecionada", "Erro Categoria",JOptionPane.ERROR_MESSAGE);
           jLabelCategoria.setForeground(Color.red);
           jComboBoxCategoriaC.requestFocus();
           return;
       }
    }

    private void acaobotao() {
         jButtonSair.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               jFrameVendas.dispose();
            }
        });
    }
    
     private void configuarJTableBusca() {
        dtm = new DefaultTableModel();
        dtm.addColumn("Descrição");
        dtm.addColumn("Quantidade");
        dtm.addColumn("Valor unitario");
        dtm.addColumn("Valor Total");
        jTableBusca.setModel(dtm);
    }
     
    private void configurarJTablePedido(){
         dtmp = new DefaultTableModel();
        dtmp.addColumn("Descrição");
        dtmp.addColumn("Quantidade");
        dtmp.addColumn("Valor unitario");
        dtmp.addColumn("Valor Total");
        jTablePedido.setModel(dtmp);
    } 

    private void comboBoxConfigura() {
        
        jComboBoxCategoriaC.setModel(new javax.swing.DefaultComboBoxModel <>(new String[]{"Acessorios e acabamento","Centrais e modulos",
            "Injeção e carburador","Motor","Polias e Tensores","Retentor e Junta",
            "Suspenção e Freio","Correias e Corente de Comando"}));
        jComboBoxCategoriaC.setSelectedIndex(-1);
        jComboBoxCategoriaC.setToolTipText("Categoria");
    }
    private void acaoBotaoIncluir(){
        jButtonIncuir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                validacao();
            }
        });
    }
        
    
    
}
