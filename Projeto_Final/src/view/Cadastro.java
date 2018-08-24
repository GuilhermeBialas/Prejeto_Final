/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Interface.BaseInterfaceJava;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Guilherme Bialas
 */
public class Cadastro implements BaseInterfaceJava {

    private JFrame jFrameCadastro;
    private JLabel jLabelQuantidade, jLabelValor, jLabelDescricao, jLabelAplicacao,
            jLabelUnidadeDeMedida, jLabelLocalizacao, jLabelValorUnitario, jLabelStatusPeca, jLabelPeso, jLabelCategoria;
    private JTextField jTextFieldQuantiade, jTextFieldValor, jTextFieldDescricao, jTextFieldAplicacao, jTextFieldUnidadeDeMedida,
            jTextFieldLocalizacao, jTextFieldValorUnitario, jTextFieldStatusPeca, jTextFieldPeso, jTextFieldCategoria;
    private JButton jButtonSalvar, jButtonExcluir, jButtonAdicionar;
    private JRadioButton jRadioButtonNovo, jRadioButtonSemiNovo;
  

    public Cadastro() {
        instanciarComponentes();
        gerarTela();
        adicionarComponentes();
        gerarLocalizacoes();
        gerarDimensoes();
        acaoBotaoSalvar();
        jFrameCadastro.setVisible(true);

    }

    @Override
    public void gerarTela() {
        jFrameCadastro = new JFrame("Cadastro de Produtos");
        jFrameCadastro.setSize(600, 400);
        jFrameCadastro.setLayout(null);
        jFrameCadastro.setLocationRelativeTo(null);
        jFrameCadastro.setResizable(false);
        jFrameCadastro.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {
        //jLabel's
        jFrameCadastro.add(jLabelQuantidade);
        jFrameCadastro.add(jLabelValor);
        jFrameCadastro.add(jLabelDescricao);
        jFrameCadastro.add(jLabelAplicacao);
        jFrameCadastro.add(jLabelUnidadeDeMedida);
        jFrameCadastro.add(jLabelLocalizacao);
        jFrameCadastro.add(jLabelValorUnitario);
        jFrameCadastro.add(jLabelStatusPeca);
        jFrameCadastro.add(jLabelPeso);
        jFrameCadastro.add(jLabelCategoria);

        //JTextField's
        jFrameCadastro.add(jTextFieldQuantiade);
        jFrameCadastro.add(jTextFieldValor);
        jFrameCadastro.add(jTextFieldDescricao);
        jFrameCadastro.add(jTextFieldAplicacao);
        jFrameCadastro.add(jTextFieldUnidadeDeMedida);
        jFrameCadastro.add(jTextFieldLocalizacao);
        jFrameCadastro.add(jTextFieldValorUnitario);
        
        jFrameCadastro.add(jTextFieldPeso);
        jFrameCadastro.add(jTextFieldCategoria);

        //JButton's
        jFrameCadastro.add(jButtonSalvar);
        jFrameCadastro.add(jButtonExcluir);
        jFrameCadastro.add(jButtonAdicionar);
        
        //CheckBox
        jFrameCadastro.add(jRadioButtonNovo);
        jFrameCadastro.add(jRadioButtonSemiNovo);

    }

    @Override
    public void gerarLocalizacoes() {
        //Descricao
        jLabelDescricao.setLocation(10, 10);
        jTextFieldDescricao.setLocation(120, 10);

        //Quantidade
        jLabelQuantidade.setLocation(10, 40);
        jTextFieldQuantiade.setLocation(120, 40);

        //Valor
        jLabelValor.setLocation(10, 70);
        jTextFieldValor.setLocation(120, 70);

        //Aplicacao
        jLabelAplicacao.setLocation(10, 100);
        jTextFieldAplicacao.setLocation(120, 100);

        //UnidadeDeMedida
        jLabelUnidadeDeMedida.setLocation(10, 140);
        jTextFieldUnidadeDeMedida.setLocation(120, 140);

        //Localizacao
        jLabelLocalizacao.setLocation(10, 180);
        jTextFieldLocalizacao.setLocation(120, 180);

        //ValorUnitario
        jLabelValorUnitario.setLocation(10, 210);
        jTextFieldValorUnitario.setLocation(120, 210);

        //StatusPeca
        jLabelStatusPeca.setLocation(10, 240);
        
        jRadioButtonNovo.setLocation(120,240);
        jRadioButtonSemiNovo.setLocation(200, 240);

        //Peso
        jLabelPeso.setLocation(10, 280);
        jTextFieldPeso.setLocation(120, 280);

        //BotaoSalvar
        jButtonSalvar.setLocation(500, 10);

        //BotaoExcluir
        jButtonExcluir.setLocation(500, 70);

        //BotaoAdicionar
        jButtonAdicionar.setLocation(500, 150);

        //Categoria
        jLabelCategoria.setLocation(10, 310);
        jTextFieldCategoria.setLocation(120, 310);
    }

    @Override
    public void gerarDimensoes() {

        //JButton's
        jButtonSalvar.setSize(100, 35);
        jButtonExcluir.setSize(100, 35);
        jButtonAdicionar.setSize(100, 35);

        //JTextField's
        jTextFieldQuantiade.setSize(100, 20);
        jTextFieldValor.setSize(100, 20);
        jTextFieldDescricao.setSize(100, 20);
        jTextFieldAplicacao.setSize(100, 20);
        jTextFieldUnidadeDeMedida.setSize(100, 20);
        jTextFieldLocalizacao.setSize(100, 20);
        jTextFieldValorUnitario.setSize(100, 20);
        jTextFieldStatusPeca.setSize(100, 20);
        jTextFieldPeso.setSize(100, 20);
        jTextFieldCategoria.setSize(100, 20);

        //JLabel's
        jLabelQuantidade.setSize(100, 20);
        jLabelValor.setSize(100, 20);
        jLabelDescricao.setSize(100, 20);
        jLabelAplicacao.setSize(100, 20);
        jLabelUnidadeDeMedida.setSize(100, 20);
        jLabelLocalizacao.setSize(100, 20);
        jLabelValorUnitario.setSize(100, 20);
        jLabelStatusPeca.setSize(100, 20);
        jLabelPeso.setSize(100, 20);
        jLabelCategoria.setSize(100, 20);

        //CheckBox
        jRadioButtonNovo.setSize(20,20);
        jRadioButtonSemiNovo.setSize(20,20);
    }
    @Override
    public void instanciarComponentes() {
        //JLabel's 
        jLabelQuantidade = new JLabel("Quantidade");
        jLabelValor = new JLabel("Valor");
        jLabelDescricao = new JLabel("Descricao");
        jLabelAplicacao = new JLabel("Aplicação");
        jLabelUnidadeDeMedida = new JLabel("Und Medida");
        jLabelLocalizacao = new JLabel("Localização");
        jLabelValorUnitario = new JLabel("ValorUnitario");
        jLabelStatusPeca = new JLabel("Status da Peça");
        jLabelPeso = new JLabel("Peso");
        jLabelCategoria = new JLabel("Categoria");

        //JTextField's
        jTextFieldQuantiade = new JTextField("");
        jTextFieldValor = new JTextField("");
        jTextFieldDescricao = new JTextField("");
        jTextFieldAplicacao = new JTextField("");
        jTextFieldUnidadeDeMedida = new JTextField("");
        jTextFieldLocalizacao = new JTextField("");
        jTextFieldValorUnitario = new JTextField("");
        jTextFieldStatusPeca = new JTextField("");
        jTextFieldPeso = new JTextField("");
        jTextFieldCategoria = new JTextField("");
        //JButton's
        jButtonSalvar = new JButton("Salva");
        jButtonExcluir = new JButton("Excluir");
        jButtonAdicionar = new JButton("Adicionar");
        
        //RadioButton
        jRadioButtonNovo = new JRadioButton("Novo");
        jRadioButtonSemiNovo = new JRadioButton("SemiNovo");
    }

    private void acaoBotaoSalvar() {
        jButtonSalvar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (jTextFieldDescricao.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "A descricao deve ser preenchida");
                    jTextFieldDescricao.requestFocus();
                    return;
                }
                if (jTextFieldAplicacao.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "A Aplicacao deve ser preenchida");
                    jTextFieldDescricao.requestFocus();
                    return;
                }
                if (jTextFieldValor.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "O valor deve ser preenchido");
                    jTextFieldValor.requestFocus();
                }
//teste
            }
        });

    }
}
