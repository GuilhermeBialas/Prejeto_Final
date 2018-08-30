package view;

import Interface.BaseInterfaceJava;
import javax.swing.JButton;
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
        
        //JTextField's
        
        
       
    }

    @Override
    public void gerarLocalizacoes() {
     jLabelId.setLocation(20,20);
    }

    @Override
    public void gerarDimensoes() {
        //JLabel's
        jLabelId.setSize(100,20);
        
        
    }

    @Override
    public void instanciarComponentes() {
      jLabelId = new JLabel("Número");
 
    }

}
