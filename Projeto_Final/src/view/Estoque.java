package view;

import Interface.BaseInterfaceJava;
import javafx.scene.control.ComboBox;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Carlos Augusto Borges
 * @author Guilherme Henerique Bialas(guilhermebialas31@gmail.com)
 * @ date 2018/08/30
 */
public class Estoque implements BaseInterfaceJava {

    private JFrame jFrameEstoque;
    private JLabel jLabelId, jLabelQuantidade, jLabelStatus, jLabelCategoria, jLabelPesquisa;
    private JTextField jTextFieldId, jTextFieldQuantidade, jTextFieldStatus, jTextFieldPesquisa;
    private JButton jButtonSair;
    private ComboBox jComboBoxCategoria;

    public Estoque() {
        instanciarComponentes();
        gerarTela();
        adicionarComponentes();
        gerarLocalizacoes();
        gerarDimensoes();
        jFrameEstoque.setVisible(true);

    }

    @Override
    public void gerarTela() {
        jFrameEstoque = new JFrame("Cadastro de Estoque");
        jFrameEstoque.setSize(800, 600);
        jFrameEstoque.setLayout(null);
        jFrameEstoque.setLocationRelativeTo(null);
        jFrameEstoque.setResizable(false);
        jFrameEstoque.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {
        //JLabel's
        jFrameEstoque.add(jLabelQuantidade);
        jFrameEstoque.add(jLabelId);
        jFrameEstoque.add(jLabelCategoria);
        jFrameEstoque.add(jLabelStatus);
        jFrameEstoque.add(jLabelPesquisa);

        //JTextField's
        jFrameEstoque.add(jTextFieldQuantidade);
        jFrameEstoque.add(jTextFieldId);
        jFrameEstoque.add(jTextFieldStatus);
        jFrameEstoque.add(jTextFieldPesquisa);

        //Button
        jFrameEstoque.add(jButtonSair);
        
        //ComboBox
        
       
    }

    @Override
    public void gerarLocalizacoes() {
        //JLabel's
        jLabelQuantidade.setLocation(10, 40);

        //JTextField
    }

    @Override
    public void gerarDimensoes() {
        //JLabel's
        jLabelQuantidade.setSize(100, 20);
        jLabelId.setSize(100,20);
        jLabelCategoria.setSize(100,20);
        jLabelStatus.setSize(100,20);
        jLabelPesquisa.setSize(100,20);
       
        //JTextField's
        jTextFieldQuantidade.setSize(100,20);
        jTextFieldId.setSize(100,20);
        jTextFieldStatus.setSize(100,20);
        jTextFieldPesquisa.setSize(100,20);
        
    }

    @Override
    public void instanciarComponentes() {
        //JLabel's
        jLabelQuantidade = new JLabel("Quantidade");
        jLabelCategoria = new JLabel("Categoria");
        jLabelId = new JLabel("Número");
        jLabelStatus = new JLabel("Status da peça");
        jLabelPesquisa = new JLabel("Pesquisa");

        //JTextField's
        jTextFieldQuantidade = new JTextField("");
        jTextFieldStatus = new JTextField("");
        jTextFieldId = new JTextField("");
        jTextFieldPesquisa = new JTextField("");
       
        //ComboBox
       
        
       

    
    }

}
