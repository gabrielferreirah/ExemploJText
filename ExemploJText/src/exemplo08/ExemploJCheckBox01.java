package exemplo08;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * @author Gabriel de Oliveira Ferreira
 */
public class ExemploJCheckBox01 implements JFrameBaseInterface {

    private JFrame jFrame;
    private JCheckBox jCheckBoxEuAceitoOsTermos,
            jCheckBoxEuLiOsTermos;
    private JButton jButtonLimpar, jButtonSalvar;

    public ExemploJCheckBox01() {
        gerarTela();
        adicionarComponentes();
        instanciarComponentes();
        gerarLocalizacoes();
        gerarDimensoes();
        jFrame.setVisible(true);
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(500, 500);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jButtonLimpar);
        jFrame.add(jButtonSalvar);
        jFrame.add(jCheckBoxEuAceitoOsTermos);
        jFrame.add(jCheckBoxEuLiOsTermos);
    }

    @Override
    public void instanciarComponentes() {
        jButtonLimpar = new JButton("Limpar");
        jButtonSalvar = new JButton("Salvar");
        jCheckBoxEuAceitoOsTermos = new JCheckBox("Eu Aceito os Termos");
        jCheckBoxEuLiOsTermos = new JCheckBox("Eu Li os Termos");
    }

    @Override
    public void gerarLocalizacoes() {
        jCheckBoxEuAceitoOsTermos.setLocation(10, 10);
        jCheckBoxEuLiOsTermos.setLocation(10, 35);
        jButtonLimpar.setLocation(10, 60);
        jButtonSalvar.setLocation(115, 60);
    }

    @Override
    public void gerarDimensoes() {
        jButtonSalvar.setSize(100, 20);
        jButtonLimpar.setSize(100, 20);
        jCheckBoxEuAceitoOsTermos.setSize(250, 20);
        jCheckBoxEuLiOsTermos.setSize(250, 20);
    }
}
