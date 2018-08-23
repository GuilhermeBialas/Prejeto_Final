package view;

import Interface.BaseInterfaceJava;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;


/**
 *
 * @author Alunos Carlos Augusto Borges
 */
     public class Estoque implements BaseInterfaceJava {
         
           private JFrame jFrame;
    private JLabel jLabelQuantidade, jLabelValor, jLabelDescricao, jLabelAplicacao,
            jLabelUnidadeDeMedida, jLabelLocalizacao, jLabelValorUnitario, jLabelStatusPeca, jLabelPeso;
    private JTextField jTextFieldQuantiade, jTextFieldValor, jTextFieldDescricao, jTextFieldAplicacao, jTextFieldUnidadeDeMedida,
            jTextFieldLocalizacao, jTextFieldValorUnitario, jTextFieldStatusPeca, jTextFieldPeso;
    private JButton jButtonSalvar, jButtonExcluir, jButtonAdicionar;
         
    public Estoque(){
           
        instanciarComponentes();
        gerarTela();
        adicionarComponentes();
        gerarLocalizacoes();
        gerarDimensoes();
        jFrame.setVisible(true);
        
    }

  
    public void instaciarComponentes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame("Cadastro de Estoque");
        jFrame.setSize(800, 600);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);    }

    
    public void adicionarComponentes() {
        jFrame.add(jLabelQuantidade);
        jFrame.add(jLabelValor);
        jFrame.add(jLabelDescricao);
        jFrame.add(jLabelAplicacao);
        jFrame.add(jLabelUnidadeDeMedida);
        jFrame.add(jLabelLocalizacao);
        jFrame.add(jLabelValorUnitario);
        jFrame.add(jLabelStatusPeca);
        jFrame.add(jLabelPeso);

        jFrame.add(jTextFieldQuantiade);
        jFrame.add(jTextFieldValor);
        jFrame.add(jTextFieldDescricao);
        jFrame.add(jTextFieldAplicacao);
        jFrame.add(jTextFieldUnidadeDeMedida);
        jFrame.add(jTextFieldLocalizacao);
        jFrame.add(jTextFieldValorUnitario);
        jFrame.add(jTextFieldStatusPeca);
        jFrame.add(jTextFieldPeso);

        jFrame.add(jButtonSalvar);
        jFrame.add(jButtonExcluir);
        jFrame.add(jButtonAdicionar);
    }

    
    public void gerarLocalizacoes() {
      jLabelDescricao.setLocation(10,10);
      jTextFieldDescricao.setLocation(120,10);
        
        jLabelQuantidade.setLocation(10, 40);
        jTextFieldQuantiade.setLocation(120, 40);
        
        
        jLabelValor.setLocation(10, 70);
        jTextFieldValor.setLocation(120, 70);
        
        jLabelAplicacao.setLocation(10, 100);
        
        jTextFieldAplicacao.setLocation(120, 100);
        
        jLabelUnidadeDeMedida.setLocation(10, 140);
        
        jTextFieldUnidadeDeMedida.setLocation(120, 140);
        
        jLabelLocalizacao.setLocation(10,180);
        
        jTextFieldLocalizacao.setLocation(120,180);
        
        jLabelValorUnitario.setLocation(10, 210);
        
        jTextFieldValorUnitario.setLocation(120,210);
        
        jLabelStatusPeca.setLocation(10, 240);
        jTextFieldStatusPeca.setLocation(120, 240);
        
        jLabelPeso.setLocation(10, 280);
        
        jTextFieldPeso.setLocation(120, 280);
        
        jButtonSalvar.setLocation(300,10);
        
        jButtonExcluir.setLocation(300,70);
        
        jButtonAdicionar.setLocation(300, 150);
        
       
    }

    
    public void gerarDimensoes() {
      
        jButtonSalvar.setSize(100, 50);
        jButtonExcluir.setSize(100, 50);
        jButtonAdicionar.setSize(100, 50);

        jTextFieldQuantiade.setSize(100, 20);
        jTextFieldValor.setSize(100, 20);
        jTextFieldDescricao.setSize(100, 20);
        jTextFieldAplicacao.setSize(100, 20);
        jTextFieldUnidadeDeMedida.setSize(100, 20);
        jTextFieldLocalizacao.setSize(100, 20);
        jTextFieldValorUnitario.setSize(100, 20);
        jTextFieldStatusPeca.setSize(100, 20);
        jTextFieldPeso.setSize(100, 20);

        jLabelQuantidade.setSize(100, 20);
        jLabelValor.setSize(100, 20);
        jLabelDescricao.setSize(100, 20);
        jLabelAplicacao.setSize(100, 20);
        jLabelUnidadeDeMedida.setSize(100, 20);
        jLabelLocalizacao.setSize(100, 20);
        jLabelValorUnitario.setSize(100, 20);
        jLabelStatusPeca.setSize(100, 20);
        jLabelPeso.setSize(100, 20);
    }

    
    public void instanciarComponentes() {
        jLabelQuantidade = new JLabel("Quantidade");
        jLabelValor = new JLabel("Valor");
        jLabelDescricao = new JLabel("Descricao");
        jLabelAplicacao = new JLabel("Aplicação");
        jLabelUnidadeDeMedida = new JLabel("Unidade De medida");
        jLabelLocalizacao = new JLabel("Localização");
        jLabelValorUnitario = new JLabel("ValorUnitario");
        jLabelStatusPeca = new JLabel("Status da Peça");
        jLabelPeso = new JLabel("Peso");

        jTextFieldQuantiade = new JTextField("");
        jTextFieldValor = new JTextField("");
        jTextFieldDescricao = new JTextField("");
        jTextFieldAplicacao = new JTextField("");
        jTextFieldUnidadeDeMedida = new JTextField("");
        jTextFieldLocalizacao = new JTextField("");
        jTextFieldValorUnitario = new JTextField("");
        jTextFieldStatusPeca = new JTextField("");
        jTextFieldPeso = new JTextField("");

        jButtonSalvar = new JButton("Salvar");
        jButtonExcluir = new JButton("Excluir");
        jButtonAdicionar = new JButton("Adicionar");
    }
        
      }