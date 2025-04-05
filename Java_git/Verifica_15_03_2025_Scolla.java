import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Verifica_15_03_2025_Scolla {

    private JFrame frame;
    private JTextField ore;
    private JTextField risultato;
    private String[] veicoli = {"auto", "moto", "bici"};
    private int[] prezzi = {3, 2, 1};
    private JComboBox mezzi = new JComboBox(veicoli);
    JRadioButton sconto_10 = new JRadioButton("sconto 10%");
    JRadioButton sconto_no = new JRadioButton("no sconto");
    private final ButtonGroup buttonGroup = new ButtonGroup();
    double sconto = 1.0;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Verifica_15_03_2025_Scolla window = new Verifica_15_03_2025_Scolla();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Verifica_15_03_2025_Scolla() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 483, 279);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        mezzi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Calc();
            }
        });

        mezzi.setBounds(42, 71, 124, 21);
        frame.getContentPane().add(mezzi);

        sconto_10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Sconto();
            }
        });
        buttonGroup.add(sconto_10);
        sconto_10.setBounds(352, 71, 103, 21);
        frame.getContentPane().add(sconto_10);

        sconto_no.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Sconto();
            }
        });
        buttonGroup.add(sconto_no);
        sconto_no.setBounds(352, 94, 103, 21);
        frame.getContentPane().add(sconto_no);
        sconto_no.setSelected(true);

        ore = new JTextField();
        ore.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                Calc();
            }
        });
        ore.setBounds(42, 175, 96, 19);
        frame.getContentPane().add(ore);
        ore.setColumns(10);

        risultato = new JTextField();
        risultato.setEditable(false);
        risultato.setColumns(10);
        risultato.setBounds(352, 175, 96, 19);
        frame.getContentPane().add(risultato);
        
        JButton btn_esci = new JButton("esci");
        btn_esci.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		System.exit(0);
        	}
        });
        btn_esci.setBounds(370, 211, 85, 21);
        frame.getContentPane().add(btn_esci);
        
        JLabel lblNewLabel = new JLabel("Seleziona mezzo");
        lblNewLabel.setBounds(42, 48, 96, 13);
        frame.getContentPane().add(lblNewLabel);
        
        JLabel lblOreDiSosta = new JLabel("Ore di sosta");
        lblOreDiSosta.setBounds(42, 152, 96, 13);
        frame.getContentPane().add(lblOreDiSosta);
        
        JLabel lblTotaleDaPagare = new JLabel("totale da pagare");
        lblTotaleDaPagare.setBounds(352, 152, 96, 13);
        frame.getContentPane().add(lblTotaleDaPagare);
    }

    public void Sconto() {
        if (sconto_10.isSelected()) {
            sconto = 0.9; 
        } else {
            sconto = 1.0;
        }
        Calc();
    }
 

    public void Calc() {
        try {
            if (ore.getText().isEmpty()) {
                risultato.setText(" ");
            } else {
                int prezzo = prezzi[mezzi.getSelectedIndex()];
                double oreInserite = Double.parseDouble(ore.getText());
                double result = (oreInserite * prezzo) * sconto;
                risultato.setText(String.format("%.2f€", result));
            }
        } catch (Exception e) {
            risultato.setText("ERRORE");
        }
    }
}
