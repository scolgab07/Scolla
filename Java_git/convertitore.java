import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class convertitore {
	private String simbolo="€";
    private double tasso = 1;
    private JFrame frame;
    private JTextField tfield_part;
    private JTextField tfield_final;
    private double[] tassiCambio = {1, 1.1, 0.85, 130, 1.05};
    String[] simboliValute = {"€", "$", "£", "¥", "Fr"};
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    convertitore window = new convertitore();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public convertitore() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 430, 284);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        String[] valute = {"EUR (€)", "USD ($)", "GBP (£)", "JPY (¥)", "CHF (Fr)"};
        
        JComboBox<String> valuta_final = new JComboBox(valute);
        JComboBox<String> valuta_part = new JComboBox(valute);
        
        valuta_part.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	calcTasso(valuta_final,valuta_part);
                aggiorna();
            }
        });
        valuta_part.setBounds(10, 49, 148, 21);
        frame.getContentPane().add(valuta_part);
        
       
        valuta_final.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	calcTasso(valuta_final,valuta_part);
                aggiorna();
            }
        });
        valuta_final.setBounds(231, 49, 148, 21);
        frame.getContentPane().add(valuta_final);
        
        tfield_part = new JTextField();
        tfield_part.setBounds(10, 206, 96, 19);
        frame.getContentPane().add(tfield_part);
        tfield_part.setColumns(10);
        writeNumbersonly(tfield_part);
      
        tfield_part.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
               aggiorna();
            }
        });

        tfield_final = new JTextField();
        tfield_final.setEditable(false);
        tfield_final.setColumns(10);
        tfield_final.setBounds(231, 206, 96, 19);
        frame.getContentPane().add(tfield_final);
        
        JLabel lblNewLabel = new JLabel("Valuta di partenza:");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblNewLabel.setBounds(10, 26, 130, 13);
        frame.getContentPane().add(lblNewLabel);
        
        JLabel lblValutaInCui = new JLabel("Valuta di arrivo:");
        lblValutaInCui.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblValutaInCui.setBounds(231, 27, 148, 13);
        frame.getContentPane().add(lblValutaInCui);
        
        JLabel lblImportoDaConvertire = new JLabel("Importo da convertire:");
        lblImportoDaConvertire.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblImportoDaConvertire.setBounds(10, 183, 130, 13);
        frame.getContentPane().add(lblImportoDaConvertire);
        
        JLabel lblRisultato = new JLabel("Risultato:");
        lblRisultato.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblRisultato.setBounds(231, 183, 130, 13);
        frame.getContentPane().add(lblRisultato);
    }

    /**
     * il metodo serve per evitare che vengano inserite lettere nei textfield dedicati al numero degli articoli
     */
    public void writeNumbersonly(JTextField textField) {
        textField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar(); // c è il carattere quindi il tasto che è stato premuto
                if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE  && c != '.') {
                    e.consume(); // annulla scrittura
                }
                if (c == '.' && textField.getText().contains(".")) {
                    e.consume(); // annulla l'inserimento del secondo punto
                }
            }});
    }
    public void calcTasso(JComboBox<String> arrivo,JComboBox<String> partenza) {
    	tasso=tassiCambio[arrivo.getSelectedIndex()]/tassiCambio[partenza.getSelectedIndex()];
    	 simbolo=simboliValute[arrivo.getSelectedIndex()];
    }
    public void aggiorna() {
    	 if (tfield_part.getText().isEmpty()) {
             tfield_final.setText(" ");
         } else {
             tfield_final.setText(String.format("%.2f"+simbolo, Double.parseDouble(tfield_part.getText()) * tasso));
         }
    }
}
