import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUILJubavniKalkulator extends JFrame {
    private JPanel mainPanel;
    private JLabel lblImeKorisnika;
    private JLabel lblImeSimpatije;
    private JTextField txtImeKorisnika;
    private JTextField txtImeSimpatije;
    private JButton btnRacunaj;
    private JLabel lblNaslovPrograma;
    private JLabel lblRezultatKalkulatora1;
    private JLabel lblRezultat2;

    public GUILJubavniKalkulator(String title){
        super(title);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        btnRacunaj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                LjubavniKalkulator01 ljK = new LjubavniKalkulator01(txtImeKorisnika.getText(), txtImeSimpatije.getText());

                String strPrviBroj = String.valueOf(ljK.zavrsnaLista.get(0));
                String strDrugiBroj = String.valueOf(ljK.zavrsnaLista.get(1));

                lblRezultat2.setText(strPrviBroj + strDrugiBroj + "%");
                System.out.println(lblRezultat2.getText());

            }
        });
    }

    public static void main(String[] args) {

        new GUILJubavniKalkulator("Ljubavni kalkulator");
    }

}
