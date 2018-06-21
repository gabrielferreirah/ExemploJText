
import exemplo08.JFrameBaseInterface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * @author Alunos
 */
public class ExemploTudo implements JFrameBaseInterface {

    private JFrame jFrame;
    private JButton jButton00;
    private JButton jButton01;
    private JButton jButton02;
    private JButton jButton03;
    private JButton jButton04;
    private JButton jButton05;
    private JButton jButton06;
    private JButton jButton07;
    private JButton jButton08;
    private JButton jButton09;
    
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void instanciarComponentes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void gerarLocalizacoes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void gerarDimensoes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
        for (int i = 0;i < 10; i++){
            System.out.println("public void acaoJButton0" + i + " () {");
            System.out.println(
                    "jButton0" + i +
                            ".addActionListener(new ActionListener() {");
            System.out.println("@Override");
            System.out.println("public void actionPerformed(ActionEvent e) {");
            System.out.println("}");
            System.out.println("});");
            System.out.println("}");
            System.out.println("}");
        }
    }
    
    public void acaoJButton00() {
        jButton00.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
    
}
