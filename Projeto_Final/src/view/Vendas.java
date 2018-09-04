/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Interface.BaseInterfaceJava;
import bean.ProdutoBean;
import dao.ProdutoDao;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
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
    private JLabel jLabelID, jLabelStatus, jLabelCategoria, jLabelNovo, jLabelSemiNovo, jLabelDescricao, jLabelQuantidade;
    private JTextField jTextFieldId, jTextFieldDescricao, jTextFieldQuantidade;
    private JRadioButton jRadioButtonNovo, jRadioButtonSemiNovo;
    private ButtonGroup jradioButtonGroup;
    private DefaultTableModel dtm, dtmp;
    private JScrollPane jScrollPaneBuscador, jScrollPanePedido;
    private JTable jTableBusca, jTablePedido;
    private JComboBox jComboBoxCategoriaC;
    String Pedido = "";
    int contador = 0;

    public Vendas() {
        instanciarComponentes();
        gerarTela();
        trocaIcone();
        adicionarComponentes();
        gerarLocalizacoes();
        gerarDimensoes();
        radionGroup();
        acaobotaoSair();
        configuarJTableBusca();
        configurarJTablePedido();
        comboBoxConfigura();
        gerarLocalizacoes();
        gerarDimensoes();
        acaoBotaoIncluir();
        acaoPopularTabelaCampoVazio();
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
        jFrameVendas.add(jButtonTestes);
        //adiciona a JTable's
        jFrameVendas.add(jScrollPaneBuscador);
        jFrameVendas.add(jScrollPanePedido);
        //JComboBox's
        jFrameVendas.add(jComboBoxCategoriaC);
    }

    @Override
    public void gerarLocalizacoes() {
        //Localização das JLabel's
        jLabelID.setLocation(10, 10);
        jLabelStatus.setLocation(110, 10);
        jLabelCategoria.setLocation(230, 10);
        jLabelNovo.setLocation(180, 10);
        jLabelSemiNovo.setLocation(180, 40);
        jLabelDescricao.setLocation(500, 10);
        jLabelQuantidade.setLocation(10, 40);
        //JTextiField's
        jTextFieldId.setLocation(60, 10);
        jTextFieldDescricao.setLocation(550, 10);
        jTextFieldQuantidade.setLocation(90, 40);
        //jRadion's
        jRadioButtonSemiNovo.setLocation(160, 10);
        jRadioButtonNovo.setLocation(160, 40);
        //JButton's
        jButtonSair.setLocation(680, 530);
        jButtonIncuir.setLocation(10, 530);
        jButtonTestes.setLocation(680,30);
        //Jtable's
        jScrollPaneBuscador.setLocation(10, 70);
        jScrollPanePedido.setLocation(410, 70);
        //JComboBox's
        jComboBoxCategoriaC.setLocation(300, 10);
    }

    @Override
    public void gerarDimensoes() {
        jLabelID.setSize(50, 20);
        jLabelStatus.setSize(100, 20);
        jLabelCategoria.setSize(100, 20);
        jLabelNovo.setSize(100, 20);
        jLabelSemiNovo.setSize(100, 20);
        jLabelDescricao.setSize(45, 20);
        jLabelQuantidade.setSize(70, 20);

        jTextFieldId.setSize(50, 20);
        jTextFieldDescricao.setSize(230, 20);
        jTextFieldQuantidade.setSize(50, 20);

        jRadioButtonNovo.setSize(20, 20);
        jRadioButtonSemiNovo.setSize(20, 20);

        jButtonSair.setSize(100, 35);
        jButtonIncuir.setSize(100, 35);
        jButtonTestes.setSize(100,35);

        jScrollPaneBuscador.setSize(360, 360);
        jScrollPanePedido.setSize(360, 360);

        jComboBoxCategoriaC.setSize(192, 20);

    }

    @Override
    public void instanciarComponentes() {
        jLabelID = new JLabel("Numero");
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
        jButtonTestes = new JButton("teste");

        jTableBusca = new JTable();
        jTablePedido = new JTable();

        jScrollPaneBuscador = new JScrollPane(jTableBusca);
        jScrollPanePedido = new JScrollPane(jTablePedido);

        jComboBoxCategoriaC = new JComboBox();
    }

    
    private void pesquisarPorNome(){
        //todo
    }
    
    private void pesquisarPorId(){
        //todo
    }
    private void IncluirNoPedido(){
       ArrayList<String> status = new ArrayList<>();
       ArrayList<String> categoria = new ArrayList<>();
       ArrayList<String> produto = new ArrayList<>();
       ArrayList<Float> quantidade = new ArrayList<>();
       ArrayList<Integer> id =new ArrayList<>();
       ArrayList<Integer> item = new ArrayList<>();
       contador++;
       if(jRadioButtonNovo.isSelected()){
           status.add("Novo");
       }
       if(jRadioButtonSemiNovo.isSelected()){
           status.add("Semi-novo");
       }
       int resultadoCombo = jComboBoxCategoriaC.getSelectedIndex();
       
       if(resultadoCombo == 0){
           categoria.add("Acessorios e acabamento");
       }
       if(resultadoCombo == 1){
           categoria.add("Centrais e modulos");
       }
       if(resultadoCombo == 2){
           categoria.add("Injeção e carburador");
       }
       if(resultadoCombo == 3){
           categoria.add("Motor");
       }
       if(resultadoCombo == 4){
           categoria.add("Polias e Tensores");
       }
       if(resultadoCombo == 5){
           categoria.add("Retentor e Junta");
       }
       if(resultadoCombo == 6){
           categoria.add("Suspenção e Freio");
       }
       if(resultadoCombo == 7){
           categoria.add("Correias e Corente de Comando");
       }
       
       produto.add(jTextFieldDescricao.getText());
       quantidade.add(Float.parseFloat(jTextFieldQuantidade.getText()));
       id.add(Integer.parseInt(jTextFieldId.getSelectedText()));
       item.add(contador);
       
       
       
    }

    private void radionGroup() {
        ButtonGroup jradioButtonGroup = new ButtonGroup();
        jradioButtonGroup.add(jRadioButtonSemiNovo);
        jradioButtonGroup.add(jRadioButtonNovo);
        jRadioButtonNovo.setText("Novo");
        jRadioButtonSemiNovo.setText("Semi - novo");
    }

    private void validacao() {
      
        if(!jRadioButtonNovo.isSelected() && !jRadioButtonSemiNovo.isSelected()){
            JOptionPane.showMessageDialog(null, "O Status deve ser Marcado", "Erro Status", JOptionPane.ERROR_MESSAGE);
           jLabelStatus.setForeground(Color.red);
           return;
        }
        if (jComboBoxCategoriaC.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "A categoria deve ser Selecionada", "Erro Categoria", JOptionPane.ERROR_MESSAGE);
            jLabelCategoria.setForeground(Color.red);
            jComboBoxCategoriaC.requestFocus();
            return;
        }
        
        
        if(jTextFieldDescricao.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Você deve informar o Produto", "Erro Descrição", JOptionPane.ERROR_MESSAGE);
            jTextFieldDescricao.requestFocus();
            jLabelDescricao.setForeground(Color.red);
            return;
        }
        
        if (jTextFieldQuantidade.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Você deve informar a quantidade", "Erro Quantidade null", JOptionPane.ERROR_MESSAGE);
            jLabelQuantidade.setForeground(Color.red);
            jTextFieldQuantidade.requestFocus();
            return;
        }
        jLabelBlack();
        
    }
    private void limpatela(){
        jTextFieldId.setText("");
        
       jradioButtonGroup.clearSelection();
        jComboBoxCategoriaC.setSelectedIndex(-1);
        jTextFieldDescricao.setText("");
        jTextFieldQuantidade.setText("");
    }
    
    private void jLabelBlack(){
        jLabelStatus.setForeground(Color.black);
        jLabelCategoria.setForeground(Color.black);
        jLabelDescricao.setForeground(Color.black);
        jLabelQuantidade.setForeground(Color.black);
    }

    private void acaobotaoSair() {
        jButtonSair.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jFrameVendas.dispose();
            }
        });
    }
    
    private  void acaoBotaotests(){
        jButtonTestes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpatela();
                JOptionPane.showMessageDialog(null, "teste");
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

    private void configurarJTablePedido() {
        dtmp = new DefaultTableModel();
        dtmp.addColumn("Descrição");
        dtmp.addColumn("Quantidade");
        dtmp.addColumn("Valor unitario");
        dtmp.addColumn("Valor Total");
        jTablePedido.setModel(dtmp);
    }

    private void comboBoxConfigura() {

        jComboBoxCategoriaC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Acessorios e acabamento", "Centrais e modulos",
            "Injeção e carburador", "Motor", "Polias e Tensores", "Retentor e Junta",
            "Suspenção e Freio", "Correias e Corente de Comando"}));
        jComboBoxCategoriaC.setSelectedIndex(-1);
        jComboBoxCategoriaC.setToolTipText("Categoria");

    }

    private void acaoBotaoIncluir() {
        jButtonIncuir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                validacao();
            }
        });
    }
    private void acaoPopularTabelaCampoVazio(){
      if(jTextFieldDescricao.getText().trim().isEmpty()||jTextFieldId.getText().trim().isEmpty()){
        List<ProdutoBean> produtos = new ProdutoDao().obterProdutos();
        DefaultTableModel dtm = (DefaultTableModel) jTableBusca.getModel();
       
        dtm.setRowCount(0);
        
        for (ProdutoBean produto : produtos) {
            dtm.addRow(new Object[]{
                produto.getDescricao(),
                produto.getQuantidade(),
                produto.getValorUnitario(),
                produto.getValor()
            });
        }
    }
    }   
     private void trocaIcone() {
        URL url = this.getClass().getResource("/icones/shopping_cart.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        jFrameVendas.setIconImage(imagemTitulo);

    }


}
