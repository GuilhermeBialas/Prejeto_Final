package view;

import Interface.BaseInterfaceJava;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
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
    private JLabel jLabelId, jLabelQuantidade, jLabelStatus, jLabelCategoria, jLabelProduto;
    private JTextField jTextFieldId, jTextFieldQuantidade, jTextFieldProduto;
    private JButton jButtonSair;
    private JRadioButton jRadioButtonNovo, jRadioButtonSemiNovo;

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
        jFrameEstoque = new JFrame("Estoque");
        jFrameEstoque.setSize(800, 600);
        jFrameEstoque.setLayout(null);
        jFrameEstoque.setLocationRelativeTo(null);
        jFrameEstoque.setResizable(false);
        jFrameEstoque.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {

        //jLabel's
        jFrameEstoque.add(jLabelId);
        jFrameEstoque.add(jLabelQuantidade);
        jFrameEstoque.add(jLabelStatus);

        //JTextField's
        jFrameEstoque.add(jTextFieldId);
        jFrameEstoque.add(jTextFieldQuantidade);
        
        //JRadioButton's
        jFrameEstoque.add(jRadioButtonNovo);
        jFrameEstoque.add(jRadioButtonSemiNovo);
    }

    @Override
    public void gerarLocalizacoes() {
        //jLabel's
        jLabelId.setLocation(20, 20);
        jLabelQuantidade.setLocation(20,70);
        jLabelStatus.setLocation(140,20);
        

        //jTextField's
        jTextFieldId.setLocation(20, 40);
        jTextFieldQuantidade.setLocation(20,90);
        
        //JRadioButton's
        jRadioButtonNovo.setLocation(260,20);
        jRadioButtonSemiNovo.setLocation(260,50);
    }

    @Override
    public void gerarDimensoes() {
        //JLabel's
        jLabelId.setSize(100, 20);
        jLabelQuantidade.setSize(100,20);
        jLabelStatus.setSize(100,20);

        //jTextField's
        jTextFieldId.setSize(100, 20);
        jTextFieldQuantidade.setSize(100,20);
        
        //JRadioButton's
        jRadioButtonNovo.setSize(20,20);
        jRadioButtonSemiNovo.setSize(20,20);
    }

    @Override
    public void instanciarComponentes() {
        //JLabel's
        jLabelId = new JLabel("Número");
        jLabelQuantidade = new JLabel("Quantidade");
        jLabelStatus = new JLabel("Status");
        
        //jTextField's
        jTextFieldId = new JTextField("");
        jTextFieldQuantidade = new JTextField("");
        
        //JRadioButton's
        jRadioButtonNovo = new JRadioButton();
        jRadioButtonSemiNovo = new JRadioButton();
    }

}
