package restaurant;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pizzeria {

	private JFrame frame;
	private JTextField tfieldPax;
	private JTextField tfieldTavolo;
	private JTextField tfieldTotcoperto;
	private JTextField tfieldmargherita;
	private JTextField tfieldsals;
	private JTextField tfieldTotmarg;
	private JTextField tfieldTotsals;
	private JTextField tfieldTotpizze;
	private JTextField tfieldCoca;
	private JTextField tfieldAcqua;
	private JTextField tfieldBirra;
	private JTextField tfieldTotacqua;
	private JTextField tfieldTotCoca;
	private JTextField tfieldTotBirra;
	private JTextField tfieldTotbibite;
	private JTextField tfieldTot;
	private JLabel lblNewLabel;
	private JLabel lblPax;
	private JLabel lblTotcoperto;
	private double totBibite;
	double totPizze;
	double tot;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pizzeria window = new pizzeria();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public pizzeria() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.setBounds(100, 100, 899, 607);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

//------------------inizio label		
		lblNewLabel = new JLabel("Tavolo:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(28, 117, 100, 34);
		frame.getContentPane().add(lblNewLabel);

		lblPax = new JLabel("Pax:   1,00€\r\n");
		lblPax.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPax.setBounds(28, 161, 144, 34);
		frame.getContentPane().add(lblPax);

		lblTotcoperto = new JLabel("TotCoperto :");
		lblTotcoperto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTotcoperto.setBounds(478, 143, 124, 34);
		frame.getContentPane().add(lblTotcoperto);

		JLabel lblPizza = new JLabel("Bibite:\r\n");
		lblPizza.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPizza.setBounds(30, 344, 100, 34);
		frame.getContentPane().add(lblPizza);

		JLabel lblMargherita = new JLabel("margherita: 5,00€\r\n");
		lblMargherita.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMargherita.setBounds(106, 216, 173, 34);
		frame.getContentPane().add(lblMargherita);

		JLabel lblNewLabel_1_1 = new JLabel("salsiccia e patate: 8,00€\r\n");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(106, 256, 247, 34);
		frame.getContentPane().add(lblNewLabel_1_1);

		JLabel lblN = new JLabel("N.");
		lblN.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblN.setBounds(394, 216, 25, 34);
		frame.getContentPane().add(lblN);

		JLabel lblN_1 = new JLabel("N.");
		lblN_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblN_1.setBounds(394, 256, 25, 34);
		frame.getContentPane().add(lblN_1);

		JLabel lblTot = new JLabel("Tot:");
		lblTot.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTot.setBounds(654, 216, 100, 34);
		frame.getContentPane().add(lblTot);

		JLabel lblTot_1 = new JLabel("Tot:");
		lblTot_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTot_1.setBounds(654, 256, 100, 34);
		frame.getContentPane().add(lblTot_1);

		JLabel lblTot_1_1 = new JLabel("TotPizze:");
		lblTot_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTot_1_1.setBounds(618, 300, 100, 34);
		frame.getContentPane().add(lblTot_1_1);

		JLabel lblPizza_1 = new JLabel("Pizza:");
		lblPizza_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPizza_1.setBounds(30, 216, 100, 34);
		frame.getContentPane().add(lblPizza_1);

		JLabel lblAcqua = new JLabel("Acqua: 1,00€\r\n");
		lblAcqua.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAcqua.setBounds(106, 347, 173, 34);
		frame.getContentPane().add(lblAcqua);

		JLabel lblNewLabel_1_1_1 = new JLabel("Coca-Cola: 2,50€\r\n");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(106, 388, 247, 34);
		frame.getContentPane().add(lblNewLabel_1_1_1);

		JLabel lblN_2 = new JLabel("N.");
		lblN_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblN_2.setBounds(395, 344, 25, 34);
		frame.getContentPane().add(lblN_2);

		JLabel lblN_1_1 = new JLabel("N.");
		lblN_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblN_1_1.setBounds(394, 382, 25, 34);
		frame.getContentPane().add(lblN_1_1);

		JLabel lblNewLabel_1_1_1_1 = new JLabel("Birra artigianale: 5,00€\r\n");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1.setBounds(106, 423, 247, 34);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);

		JLabel lblTot_1_2 = new JLabel("Tot:");
		lblTot_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTot_1_2.setBounds(654, 388, 100, 34);
		frame.getContentPane().add(lblTot_1_2);

		JLabel lblTot_2 = new JLabel("Tot:");
		lblTot_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTot_2.setBounds(654, 350, 100, 34);
		frame.getContentPane().add(lblTot_2);

		JLabel lblTot_1_1_1 = new JLabel("Tot:");
		lblTot_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTot_1_1_1.setBounds(654, 423, 48, 34);
		frame.getContentPane().add(lblTot_1_1_1);

		JLabel lblTot_1_1_1_1 = new JLabel("TotBibite:");
		lblTot_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTot_1_1_1_1.setBounds(596, 467, 106, 34);
		frame.getContentPane().add(lblTot_1_1_1_1);

		JLabel lblN_1_1_1 = new JLabel("N.");
		lblN_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblN_1_1_1.setBounds(394, 423, 25, 34);
		frame.getContentPane().add(lblN_1_1_1);

		JLabel lblTot_1_1_1_1_1 = new JLabel("Totale:");
		lblTot_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTot_1_1_1_1_1.setBounds(618, 511, 106, 34);
		frame.getContentPane().add(lblTot_1_1_1_1_1);

//------------------fine label
		
		tfieldPax = new JTextField();
		writeNumbersonly(tfieldPax);
		tfieldPax.addKeyListener(new KeyAdapter() {

			public void keyReleased(KeyEvent e) {
				updateTfield(tfieldPax,tfieldTotcoperto,1);
				tot(0);
				
			}
		});

		tfieldPax.setBounds(202, 161, 96, 31);
		frame.getContentPane().add(tfieldPax);
		tfieldPax.setColumns(10);

		tfieldTavolo = new JTextField();
		writeNumbersonly(tfieldTavolo);
		tfieldTavolo.setColumns(10);
		tfieldTavolo.setBounds(202, 117, 96, 31);
		frame.getContentPane().add(tfieldTavolo);

		tfieldTotcoperto = new JTextField();
		tfieldTotcoperto.setEditable(false);
		tfieldTotcoperto.setColumns(10);
		tfieldTotcoperto.setBounds(616, 149, 96, 31);
		frame.getContentPane().add(tfieldTotcoperto);

		tfieldmargherita = new JTextField();
		writeNumbersonly(tfieldmargherita);
		tfieldmargherita.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				updateTfield(tfieldmargherita,tfieldTotmarg,5);
				updatetotpizza();
				tot(0);
			}
		});

		tfieldmargherita.setColumns(10);
		tfieldmargherita.setBounds(429, 222, 96, 31);
		frame.getContentPane().add(tfieldmargherita);

		tfieldsals = new JTextField();
		writeNumbersonly(tfieldsals);
		tfieldsals.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				updateTfield(tfieldsals,tfieldTotsals,8);
				updatetotpizza();
				tot(0);
			}
		});

		tfieldsals.setColumns(10);
		tfieldsals.setBounds(429, 262, 96, 31);
		frame.getContentPane().add(tfieldsals);

		tfieldTotmarg = new JTextField();
		tfieldTotmarg.setEditable(false);
		tfieldTotmarg.setColumns(10);
		tfieldTotmarg.setBounds(738, 222, 96, 31);
		frame.getContentPane().add(tfieldTotmarg);

		tfieldTotsals = new JTextField();
		tfieldTotsals.setEditable(false);
		tfieldTotsals.setColumns(10);
		tfieldTotsals.setBounds(738, 262, 96, 31);
		frame.getContentPane().add(tfieldTotsals);

		tfieldTotpizze = new JTextField();
		tfieldTotpizze.setEditable(false);
		tfieldTotpizze.setColumns(10);
		tfieldTotpizze.setBounds(738, 300, 96, 31);
		frame.getContentPane().add(tfieldTotpizze);

		tfieldCoca = new JTextField();
		writeNumbersonly(tfieldCoca);
		tfieldCoca.addKeyListener(new KeyAdapter() {
			@Override

			public void keyReleased(KeyEvent e) {
				updateTfield(tfieldCoca,tfieldTotCoca,2.5);
				updatetotbibite();
				tot(0);
			}

		});
		tfieldCoca.setColumns(10);
		tfieldCoca.setBounds(429, 388, 96, 31);
		frame.getContentPane().add(tfieldCoca);

		tfieldAcqua = new JTextField();
		writeNumbersonly(tfieldAcqua);
		tfieldAcqua.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				updateTfield(tfieldAcqua,tfieldTotacqua,1);
				updatetotbibite();
				tot(0);
			}

		});
		tfieldAcqua.setColumns(10);
		tfieldAcqua.setBounds(429, 347, 96, 31);
		frame.getContentPane().add(tfieldAcqua);

		tfieldBirra = new JTextField();
		writeNumbersonly(tfieldBirra);
		tfieldBirra.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				updateTfield(tfieldBirra,tfieldTotBirra,5);
				updatetotbibite();
				tot(0);
			}

		});

		tfieldBirra.setColumns(10);
		tfieldBirra.setBounds(429, 429, 96, 31);
		frame.getContentPane().add(tfieldBirra);

		tfieldTotacqua = new JTextField();
		tfieldTotacqua.setEditable(false);
		tfieldTotacqua.setColumns(10);
		tfieldTotacqua.setBounds(738, 350, 96, 31);
		frame.getContentPane().add(tfieldTotacqua);

		tfieldTotCoca = new JTextField();
		tfieldTotCoca.setEditable(false);
		tfieldTotCoca.setColumns(10);
		tfieldTotCoca.setBounds(738, 388, 96, 31);
		frame.getContentPane().add(tfieldTotCoca);

		tfieldTotBirra = new JTextField();
		tfieldTotBirra.setEditable(false);
		tfieldTotBirra.setColumns(10);
		tfieldTotBirra.setBounds(738, 429, 96, 31);
		frame.getContentPane().add(tfieldTotBirra);

		tfieldTotbibite = new JTextField();
		tfieldTotbibite.setEditable(false);
		tfieldTotbibite.setColumns(10);
		tfieldTotbibite.setBounds(738, 470, 96, 31);
		frame.getContentPane().add(tfieldTotbibite);

		tfieldTot = new JTextField();
		tfieldTot.setEditable(false);
		tfieldTot.setColumns(10);
		tfieldTot.setBounds(738, 517, 96, 31);
		frame.getContentPane().add(tfieldTot);
		
		JRadioButton RbuttonCop = new JRadioButton("Consuma qui");
		RbuttonCop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visibility(true);
				tot(0);
		
				
			}
		});
		buttonGroup.add(RbuttonCop);
		RbuttonCop.setBounds(30, 46, 103, 21);
		frame.getContentPane().add(RbuttonCop);
		
		JRadioButton RbuttonDel = new JRadioButton("Delivery");
		RbuttonDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visibility(false);
				tot(5);
			}
		});
		buttonGroup.add(RbuttonDel);
		RbuttonDel.setBounds(316, 46, 103, 21);
		frame.getContentPane().add(RbuttonDel);
		
		JRadioButton RbuttonAsp = new JRadioButton("Asporto");
		RbuttonAsp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visibility(false);
				tot(1);
			}
		});
		buttonGroup.add(RbuttonAsp);
		RbuttonAsp.setBounds(171, 46, 103, 21);
		frame.getContentPane().add(RbuttonAsp);

	}

	/**
	 * il metodo serve per evitare che vengano inserite lettere nei textfield dedicati al numero degli articoli
	 */
	public void writeNumbersonly(JTextField textField) { //nei parametri va inserito il nome del textfied
		        textField.addKeyListener(new KeyAdapter() {
		            public void keyTyped(KeyEvent e) {
		                char c = e.getKeyChar(); //c è il carattere quindi il tasto che è stato premuto
		                if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE) { //la prima condizione verifica che c non sia una lettera l' altra che non sia un numero
		                    e.consume(); //annulla scrittura
		                }
		            }
		        });}
	/**
	 * metodo generale utile alla modifica dei singoli text field,bisogna richiamarlo nei singoli textfield e passare come parametri il textfield corrente,quello che verrà aggiornato in base ai dati inseriti dall'utente ed il prezzo dell'articolo
	 */
	public void updateTfield(JTextField tfield,JTextField tfieldtot,double prezzo) {
		try {
			int num = Integer.parseInt(tfield.getText());
			double tot = num * prezzo;
			tfieldtot.setText(String.format("%.2f€", tot));
		} catch (NumberFormatException ex) {
			tfieldtot.setText(" ");
		}}
	
	/**
	 * il metodo serve per calcolare il totale del prezzo delle pizze e aggiornare il textfield dedicato 
	 */
	
	public void updatetotpizza() {
	    try {
	    	
	        int totmarg = 0;
	        int totsals = 0;

	        if (!tfieldmargherita.getText().isEmpty()) { //la funzione isEmpty torna true se il tfield è vuoto,il punto esclamativo inverte quindi torna true solo se contiente qualcosa e fa quindi il parsing,in caso contrario rimane 0
	            totmarg = Integer.parseInt(tfieldmargherita.getText());
	        }
	        if (!tfieldsals.getText().isEmpty()) {
	            totsals = Integer.parseInt(tfieldsals.getText());
	        }
	        
	        
	        totPizze = (totsals * 8) + (totmarg * 5);

	        tfieldTotpizze.setText(String.format("%.2f€", totPizze));
	
	        
	    

	  
	    } catch (NumberFormatException ex) {
	        tfieldTotpizze.setText("");

	    }
	}
	/**
	 * il metodo serve per calcolare il totale del prezzo delle bibite e aggiornare il textfield dedicato 
	 */
	public void updatetotbibite() {
	    try {
	       
	        int totacqua = 0;
	        int totcoca = 0;
	        int totbirra = 0;

	        if (!tfieldAcqua.getText().isEmpty()) { //la funzione isEmpty torna true se il tfield è vuoto,il punto esclamativo inverte quindi torna true solo se contiente qualcosa e fa quindi il parsing,in caso contrario rimane 0
	            totacqua = Integer.parseInt(tfieldAcqua.getText());
	        }
	        if (!tfieldCoca.getText().isEmpty()) {
	            totcoca = Integer.parseInt(tfieldCoca.getText());
	        }
	        if (!tfieldBirra.getText().isEmpty()) {
	            totbirra = Integer.parseInt(tfieldBirra.getText());
	        }

	 
	        totBibite = (totacqua * 1) + (totbirra * 5) + (totcoca*2.5);
	        
	        tfieldTotbibite.setText(String.format("%.2f€", totBibite));
	      

	  
	    } catch (NumberFormatException ex) {
	        tfieldTotbibite.setText("");

	    }
	}
	
	/**
	 * il metodo serve per calcolare il prezzo del conto totale e aggiornare il textfield dedicato 
	 */
	public void tot(int x) {
		String paxtfield=tfieldPax.getText();
		double pax;
		if(paxtfield.trim().isEmpty()) {
			pax = 0;
		}
		else {
			pax=Double.parseDouble(tfieldPax.getText());
		}
		
		if(x==0) {
			tot = totPizze + totBibite+pax+x;
			tfieldTot.setText(String.format("%.2f€",tot));
		}
		
		else if(x==1) {
			tot = totPizze + totBibite;
			tfieldTot.setText(String.format("%.2f€",tot));
		}
		
		
		else {
			tot = totPizze + totBibite+x;
			tfieldTot.setText(String.format("%.2f€",tot));
		}
		
	}
	
	public void visibility(boolean x) {
	    tfieldTavolo.setVisible(x);
	    tfieldPax.setVisible(x);
	    tfieldTotcoperto.setVisible(x);
	    lblPax.setVisible(x);
	    lblNewLabel.setVisible(x);
	    lblTotcoperto.setVisible(x);
	}
}


