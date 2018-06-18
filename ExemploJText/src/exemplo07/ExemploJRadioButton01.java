package exemplo07;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 * @author Alunos
 */
public class ExemploJRadioButton01 {
    private JFrame jFrame;
    private JLabel jLabelCor;
    private JRadioButton 
            jRadioButtonCorPreto,
            jRadioButtonCorBranco,
            jRadioButtonCorFuchsia,
            jRadioButtonCorRose;
    private ButtonGroup jButtonGroupCor;
    private JButton jButtonSalvar, jButtonLimparSelecao;
    
    
    public ExemploJRadioButton01() {
    gerarTela();
    instanciarComponentes();
    gerarDimensoes();
    gerarLocalizacoes();
    adicionarComponentes();
    definirRadioParaButtonGroup();
    adicionaracao();
    jFrame.setVisible(true);
}
    
    
    private void definirRadioParaButtonGroup() {
        jButtonGroupCor.add(jRadioButtonCorRose);
        jButtonGroupCor.add(jRadioButtonCorBranco);
        jButtonGroupCor.add(jRadioButtonCorPreto);
        jButtonGroupCor.add(jRadioButtonCorFuchsia);
    }

    private void adicionarComponentes() {
        jFrame.add(jLabelCor);
        jFrame.add(jRadioButtonCorBranco);
        jFrame.add(jRadioButtonCorPreto);
        jFrame.add(jRadioButtonCorFuchsia);
        jFrame.add(jRadioButtonCorRose);
    }

    private void gerarLocalizacoes() {
        jLabelCor.setLocation(10, 10);
        jRadioButtonCorBranco.setLocation(10, 110);
        jRadioButtonCorPreto.setLocation(10, 60);
        jRadioButtonCorFuchsia.setLocation(10, 85);
        jRadioButtonCorRose.setLocation(10, 35);
    }

    private void gerarDimensoes() {
        jLabelCor.setSize(40, 20);
        jRadioButtonCorBranco.setSize(100, 20);
        jRadioButtonCorPreto.setSize(100, 20);
        jRadioButtonCorRose.setSize(100, 20);
        jRadioButtonCorFuchsia.setSize(100, 20);
        jButtonSalvar.setSize(120, 20);
        jButtonLimparSelecao.setSize(120, 20);
    }

    private void instanciarComponentes() {
        jLabelCor = new JLabel("COR");
        jRadioButtonCorBranco = new JRadioButton("Branco");
        jRadioButtonCorPreto = new JRadioButton("Preto");
        jRadioButtonCorRose = new JRadioButton("Rosa");
        jRadioButtonCorFuchsia = new JRadioButton("Fuchsia");
        jButtonGroupCor = new ButtonGroup();
        jButtonSalvar = new JButton("Salvar");
        jButtonLimparSelecao = new JButton("Selecionar");
        
    }

    private void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(500, 500);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void estilizarRadioButton() {
        jRadioButtonCorBranco.setContentAreaFilled(false);
        jRadioButtonCorFuchsia.setContentAreaFilled(false);
        jRadioButtonCorPreto.setContentAreaFilled(false);
        jRadioButtonCorRose.setContentAreaFilled(false);
    } 
    
    private void adicionaracao() {
        jButtonLimparSelecao.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jButtonGroupCor.clearSelection();
            }
        });
        jButtonSalvar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                    if (jRadioButtonCorBranco.isSelected()) {
                    jFrame.getContentPane().setBackground(Color.WHITE);
                    definirCorTexto("#000000");
                } else if (jRadioButtonCorPreto.isSelected()){
                    jFrame.getContentPane().setBackground(Color.BLACK);
                }
            }

 
                    private void definirCorTexto(String string) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
}
