package exemplo10;

import exemplo08.JFrameBaseInterface;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

/**
 * @author Gabriel de Oliveira Ferreira
 */
public class ExemploHospitalJFrame implements JFrameBaseInterface {

    private JFrame jFrame;
    private JTextField jTextFieldNome, jTextFieldRendaAnual, jTextFieldAno;
    private JFormattedTextField jFormattedTextFieldCNPJ;
    private JComboBox jComboBoxCategoria;
    private JCheckBox jCheckBoxPrivado;
    private JLabel jLabelAno, jLabelNome,jLabelRenda,
            jLabelRendaAnual, jLabelCategoria, jLabelCNPJ;
    private JButton jButtonAdicionar, jButtonEditar, jButtonExcluir;
    private JTable jTable;
    private JScrollPane jScrollPane;

    public void ExemploHospitalJFrame() {
        gerarTela();
        instanciarComponentes();
        gerarLocalizacoes();
        gerarDimensoes();
        adicionarComponentes();
        jFrame.setVisible(true);
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame("Hospital para o seu momento");
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setSize(600, 500);
        jFrame.setLocationRelativeTo(null);
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jTextFieldAno);
        jFrame.add(jTextFieldNome);
        jFrame.add(jTextFieldRendaAnual);
        jFrame.add(jFormattedTextFieldCNPJ);
        jFrame.add(jComboBoxCategoria);
        jFrame.add(jCheckBoxPrivado);
        jFrame.add(jLabelAno);
        jFrame.add(jLabelRenda);
        jFrame.add(jLabelRendaAnual);
        jFrame.add(jLabelCNPJ);
        jFrame.add(jLabelCategoria);
        jFrame.add(jLabelNome);
        jFrame.add(jButtonAdicionar);
        jFrame.add(jButtonEditar);
        jFrame.add(jButtonExcluir);
        jFrame.add(jScrollPane);
    }

    @Override
    public void instanciarComponentes() {
        
        jTable = new JTable();
        configurarJTable();
        jScrollPane = new JScrollPane(jTable);
        
        
        jLabelAno = new JLabel("Ano");
        jLabelCategoria = new JLabel("Categoria");
        jLabelCNPJ = new JLabel("CNPJ");
        jLabelNome = new JLabel("Nome");
        jLabelRenda = new JLabel("Renda");
        jLabelRendaAnual = new JLabel("Renda Anual");
        jTextFieldAno = new JTextField();
        jTextFieldNome = new JTextField();
        jTextFieldRendaAnual = new JTextField();
        jButtonAdicionar = new JButton("Adicionar");
        jButtonEditar = new JButton("Editar");
        jButtonExcluir = new JButton("Excluir");
        jCheckBoxPrivado = new JCheckBox("Privado");
        jComboBoxCategoria = new JComboBox();
        configurarJComboBox();
        configurarJFormattedTextField();
        
        
    }

    private void configurarJComboBox() {
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
        modelo.addElement("Cardiologia");
        modelo.addElement("Oncologia");
    }
    
    private void configurarJFormattedTextField() {
        try {
            MaskFormatter maskFormatter = new
            MaskFormatter("##.###.###/####-##");
            maskFormatter.install(jFormattedTextFieldCNPJ);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Chama o programador pq deu ruim");
        }
    }
    
    @Override
    public void gerarLocalizacoes() {
        jLabelNome.setLocation(10, 10);
        jTextFieldNome.setLocation(10, 35);
        
        jLabelAno.setLocation(10, 60);
        jTextFieldAno.setLocation(10, 85);
        
        jLabelCNPJ.setLocation(10, 110);
        jFormattedTextFieldCNPJ.setLocation(10, 135);
        
        jLabelCategoria.setLocation(10, 160);
        jComboBoxCategoria.setLocation(10, 10);
        
        jLabelRendaAnual.setLocation(10, 210);
        jTextFieldRendaAnual.setLocation(10, 235);
        
        jCheckBoxPrivado.setLocation(10, 260);
        
        jButtonAdicionar.setLocation(10, 285);
    }

    @Override
    public void gerarDimensoes() {
        jLabelNome.setSize(150, 20);
        jTextFieldNome.setSize(150, 20);
        
        jLabelAno.setSize(150, 20);
        jTextFieldAno.setSize(150, 20);
        
        jLabelCNPJ.setSize(150, 20);
        jFormattedTextFieldCNPJ.setSize(150, 20);
        
        jLabelCategoria.setSize(150, 20);
        jComboBoxCategoria.setSize(150, 20);
        
        jLabelRendaAnual.setSize(150, 20);
        jTextFieldRendaAnual.setSize(150, 20);
        
        jCheckBoxPrivado.setSize(150, 20);
        
        jButtonAdicionar.setSize(100, 20);
        jButtonEditar.setSize(100, 20);
        jButtonExcluir.setSize(100, 20);
    }

    private void configurarJTable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
