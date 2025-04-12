import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JRadioButton;

public class Pizza {

    private JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_9;
    private JTextField textField_10;
    private JTextField textField_11;
    private JTextField textField_12;
    private JTextField textField_13;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Pizza window = new Pizza();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Pizza() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(70, 117, 128));
        frame.setBounds(100, 100, 450, 533);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel Table = new JLabel("Tavoli");
        Table.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
        Table.setBounds(0, 10, 67, 13);
        frame.getContentPane().add(Table);

        textField = new JTextField();
        textField.setBounds(56, 8, 96, 19);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        JLabel People = new JLabel("N Persone x 1€");
        People.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
        People.setBounds(0, 51, 139, 13);
        frame.getContentPane().add(People);

        textField_1 = new JTextField();
        textField_1.setBounds(103, 49, 96, 19);
        frame.getContentPane().add(textField_1);
        textField_1.setColumns(10);
        
        // funzione che permette l interazione 
        JButton ButtonInvia = new JButton("Invia");
        ButtonInvia.setForeground(new Color(0, 0, 0));
        ButtonInvia.setBackground(new Color(192, 192, 192));
        ButtonInvia.setFont(new Font("Tahoma", Font.PLAIN, 15));
        ButtonInvia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Ottieni le quantità inserite dall'utente
                    int numPerson = Integer.parseInt(textField_1.getText());
                    int margheritaQty = Integer.parseInt(textField_5.getText());
                    int marinaraQty = Integer.parseInt(textField_6.getText());
                    int acquaQty = Integer.parseInt(textField_3.getText());
                    int cocaColaQty = Integer.parseInt(textField_12.getText());  // Quantità Coca-Cola

                    // Calcola totali per ogni categoria
                    int copertoTotal = numPerson * 1;  // 1€ per persona
                    int margheritaTotal = margheritaQty * 4;  // 4€ per pizza Margherita
                    int marinaraTotal = marinaraQty * 5;  // 5€ per pizza Marinara
                    int acquaTotal = acquaQty * 1;  // 1€ per Acqua
                    int cocaColaTotal = cocaColaQty * 2;  // 2€ per Coca-Cola

                    // Calcola il totale delle pizze e delle bibite
                    int totalPizza = margheritaTotal + marinaraTotal;
                    int bibiteTotal = acquaTotal + cocaColaTotal;  // Totale Bibite (Acqua + Coca-Cola)
                    int totalOrder = copertoTotal + totalPizza + bibiteTotal;  // Totale Ordine

                    // Aggiorna i campi di testo con i totali
                    textField_2.setText(String.valueOf(copertoTotal));  // Totale Coperto
                    textField_7.setText(String.valueOf(margheritaTotal));  // Totale Margherita
                    textField_8.setText(String.valueOf(marinaraTotal));  // Totale Marinara
                    textField_4.setText(String.valueOf(bibiteTotal));  // Totale Bibite
                    textField_9.setText(String.valueOf(totalPizza));  // Totale Pizze
                    textField_10.setText(String.valueOf(bibiteTotal));  // Totale Bibite 
                    textField_11.setText(String.valueOf(totalOrder));  // Totale Ordine
                } catch (NumberFormatException ex) {
                    // In caso di errore nell'input, mostra un messaggio di errore
                    textField_11.setText("Errore input");
                }
            }
        });
        ButtonInvia.setBounds(209, 46, 85, 21);
        frame.getContentPane().add(ButtonInvia);

        JLabel TotCoperto = new JLabel(" TOT Coperto");
        TotCoperto.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
        TotCoperto.setBounds(334, 31, 112, 13);
        frame.getContentPane().add(TotCoperto);

        textField_2 = new JTextField();
        textField_2.setBounds(334, 49, 96, 19);
        frame.getContentPane().add(textField_2);
        textField_2.setColumns(10);

        JLabel PizzeTitle = new JLabel("Pizze :    Margherita  4€");
        PizzeTitle.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
        PizzeTitle.setBounds(-4, 94, 156, 19);
        frame.getContentPane().add(PizzeTitle);

        JLabel TypePizza = new JLabel("Marinara  5€");
        TypePizza.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
        TypePizza.setBounds(54, 123, 85, 13);
        frame.getContentPane().add(TypePizza);

        JLabel N1 = new JLabel("N:");
        N1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
        N1.setBounds(177, 97, 24, 13);
        frame.getContentPane().add(N1);

        textField_5 = new JTextField();
        textField_5.setBounds(209, 95, 34, 19);
        frame.getContentPane().add(textField_5);
        textField_5.setColumns(10);

        JLabel N2 = new JLabel("N:");
        N2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
        N2.setBounds(177, 123, 14, 13);
        frame.getContentPane().add(N2);

        textField_6 = new JTextField();
        textField_6.setBounds(209, 121, 34, 19);
        frame.getContentPane().add(textField_6);
        textField_6.setColumns(10);

        JLabel Tot1 = new JLabel("Tot");
        Tot1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
        Tot1.setBounds(253, 97, 45, 13);
        frame.getContentPane().add(Tot1);

        JLabel Tot2 = new JLabel("Tot");
        Tot2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
        Tot2.setBounds(251, 123, 24, 13);
        frame.getContentPane().add(Tot2);

        textField_7 = new JTextField();
        textField_7.setBounds(290, 95, 85, 19);
        frame.getContentPane().add(textField_7);
        textField_7.setColumns(10);

        textField_8 = new JTextField();
        textField_8.setBounds(285, 121, 86, 19);
        frame.getContentPane().add(textField_8);
        textField_8.setColumns(10);

        JLabel Drinks = new JLabel("Bibite:");
        Drinks.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
        Drinks.setBounds(0, 188, 45, 13);
        frame.getContentPane().add(Drinks);

        JLabel lblwater = new JLabel("Acqua   1€");
        lblwater.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
        lblwater.setBounds(56, 188, 83, 13);
        frame.getContentPane().add(lblwater);

        JLabel N3 = new JLabel("N:");
        N3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
        N3.setBounds(177, 188, 24, 13);
        frame.getContentPane().add(N3);

        textField_3 = new JTextField();
        textField_3.setBounds(198, 186, 34, 19);
        frame.getContentPane().add(textField_3);
        textField_3.setColumns(10);

        JLabel Tot3 = new JLabel("Tot:");
        Tot3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
        Tot3.setBounds(242, 188, 45, 13);
        frame.getContentPane().add(Tot3);

        textField_4 = new JTextField();
        textField_4.setBounds(275, 186, 85, 19);
        frame.getContentPane().add(textField_4);
        textField_4.setColumns(10);

        textField_9 = new JTextField();
        textField_9.setBounds(334, 150, 96, 19);
        frame.getContentPane().add(textField_9);
        textField_9.setColumns(10);

        JLabel TotPizze = new JLabel("Tot Pizze:");
        TotPizze.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
        TotPizze.setBounds(253, 150, 71, 13);
        frame.getContentPane().add(TotPizze);

        JLabel TotBibite = new JLabel("Tot Bibite:");
        TotBibite.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
        TotBibite.setBounds(285, 280, 70, 15);
        frame.getContentPane().add(TotBibite);

        textField_10 = new JTextField();
        textField_10.setBounds(354, 279, 72, 19);
        frame.getContentPane().add(textField_10);
        textField_10.setColumns(10);

        JLabel TotaleTOT = new JLabel("TOTALE:");
        TotaleTOT.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
        TotaleTOT.setBounds(0, 459, 67, 13);
        frame.getContentPane().add(TotaleTOT);

        textField_11 = new JTextField();
        textField_11.setBounds(56, 457, 96, 19);
        frame.getContentPane().add(textField_11);
        textField_11.setColumns(10);

        JLabel lblCocacola = new JLabel("Coca-Cola   2€");
        lblCocacola.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
        lblCocacola.setBounds(56, 221, 112, 13);
        frame.getContentPane().add(lblCocacola);

        JLabel N3_1 = new JLabel("N:");
        N3_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
        N3_1.setBounds(175, 221, 24, 13);
        frame.getContentPane().add(N3_1);

        textField_12 = new JTextField();
        textField_12.setColumns(10);
        textField_12.setBounds(198, 219, 34, 19);
        frame.getContentPane().add(textField_12);

        JLabel Tot3_1 = new JLabel("Tot:");
        Tot3_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
        Tot3_1.setBounds(242, 221, 45, 13);
        frame.getContentPane().add(Tot3_1);

        textField_13 = new JTextField();
        textField_13.setColumns(10);
        textField_13.setBounds(275, 219, 85, 19);
        frame.getContentPane().add(textField_13);
        
        JRadioButton rdbtnTavolo = new JRadioButton("Consumazione al tavolo");
        rdbtnTavolo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
        rdbtnTavolo.setBounds(17, 278, 156, 21);
        frame.getContentPane().add(rdbtnTavolo);
        
        JRadioButton rdbtnAsporto = new JRadioButton("Asporto");
        rdbtnAsporto.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
        rdbtnAsporto.setBounds(17, 317, 151, 21);
        frame.getContentPane().add(rdbtnAsporto);
        
        JRadioButton rdbtnConsegnaADomicilio = new JRadioButton("Consegna a domicilio");
        rdbtnConsegnaADomicilio.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
        rdbtnConsegnaADomicilio.setBounds(17, 352, 151, 21);
        frame.getContentPane().add(rdbtnConsegnaADomicilio);
        
     // Creazione del ButtonGroup (per la selezione singola dei radiobutton)
        ButtonGroup group = new ButtonGroup();

        // uniamo i tre JRadioButton al ButtonGroup
        group.add(rdbtnTavolo);
        group.add(rdbtnAsporto);
        group.add(rdbtnConsegnaADomicilio);

    }
}
