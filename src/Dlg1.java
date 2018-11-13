import javax.swing.*;
import java.awt.event.*;

public class Dlg1 extends JDialog {
    private JPanel contentPane;

    private JButton buttonCancel;
    public JTextField txt1;

    public Dlg1() {
        setContentPane(contentPane);
        setModal(true);




        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }



    private void onCancel() {
        // add your code here if necessary
       //
        txt1.setText("Тест");
     //   dispose();
    }

    public static void main(String[] args) {
        Dlg1 dialog = new Dlg1();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
