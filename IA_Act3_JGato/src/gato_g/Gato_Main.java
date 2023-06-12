package gato_g;

import javax.swing.UIManager;


public class Gato_Main {

    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException |
                IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.out.println("Error Nimbus: "+ ex.getMessage());
        }

       JFramePrincipal mf = new JFramePrincipal();
       mf.setVisible(true);     
        


    }
}
