package exemplo06;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * @author Alunos
 */
public class ExemploJTextArea01 {

    private JFrame jFrame;
    private JTextArea jTextArea;
    private JLabel jLabelDescricao;
    private JScrollPane jScrollPane;

    public ExemploJTextArea01() {

    }

    private void gerarTela() {
        jFrame = new JFrame();
        
    }
    
    private void gerarDimensoes() {
        
    }

    private void gerarLocalizacoes() {
        jLabelDescricao.setSize(70, 20);
        jScrollPane.setSize(10,10);
    }

    private void adicionarComponentes() {

    }

    private void instanciarComponentes() {
        jTextArea = new JTextArea();
        jLabelDescricao = new JLabel("Descrição");
    }

    private void configurarJScrollPane() {
        jScrollPane.setViewportView(jTextArea);
        jScrollPane.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jTextArea.setLineWrap(true);
    }
}
