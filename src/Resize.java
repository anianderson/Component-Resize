
import component.alteration.Dimension;

public class Resize extends javax.swing.JFrame {

    public Resize() {
        initComponents();
    }

    private final Dimension d = new Dimension();

    /*private int cx, cy, omx = -100, omy;

     private void dragging() {
     int mx = (int) getMousePosition().getX();
     int my = (int) getMousePosition().getY();
     if (omx == -100) {
     omx = mx;
     omy = my;
     }
     jTextField1.setLocation(jTextField1.getX() - (omx - mx), jTextField1.getY() - (omy - my));
     omx = mx;
     omy = my;
     }

     /*private void changeDimension() {
     int mx = (int) getMousePosition().getX();
     int my = (int) getMousePosition().getY();
     if (omx == -100) {
     omx = mx;
     omy = my;
     }
     jTextField1.setLocation(mx, my - 23);
     System.out.println(mx);
     System.out.println(omx);
     System.out.println(my);
     System.out.println(omy);
     System.out.println(cx);
     System.out.println(cy);
     if (cx > mx) {
     jTextField1.setSize((jTextField1.getWidth() + (omx - mx)), jTextField1.getHeight());
     } else {
     if (cx < mx) {
     jTextField1.setSize((jTextField1.getWidth() + omx - mx), jTextField1.getHeight());
     }
     }
     if (cy > my - 23) {
     jTextField1.setSize(jTextField1.getWidth(), jTextField1.getHeight() + (omy - my));
     } else {
     if (cy < my - 23) {
     jTextField1.setSize(jTextField1.getWidth(), jTextField1.getHeight() + omy - my);
     }
     }
     }

     private void changeDimension3() {
     int mx = (int) getMousePosition().getX();
     int my = (int) getMousePosition().getY() - jTextField1.getHeight();
     if (omx == -100) {
     omx = mx;
     omy = my;
     }
     jTextField1.setLocation(mx, my - 23);
     System.out.println(mx);
     System.out.println(omx);
     System.out.println(my);
     System.out.println(omy);
     System.out.println(cx);
     System.out.println(cy);
     if (cx > mx) {
     jTextField1.setSize((jTextField1.getWidth() + (omx - mx)), jTextField1.getHeight());
     } else {
     if (cx < mx) {
     jTextField1.setSize((jTextField1.getWidth() + (omx - mx)), jTextField1.getHeight());
     }
     }
     if (cy > my - 23 - jTextField1.getHeight()) {
     jTextField1.setSize(jTextField1.getWidth(), jTextField1.getHeight() - (omy - my));
     } else {
     if (cy < my - 23 - jTextField1.getHeight()) {
     jTextField1.setSize(jTextField1.getWidth(), jTextField1.getHeight() - (omy - my));
     }
     }
     }

     private void changeDimension1() {
     int mx = (int) getMousePosition().getX() - jTextField1.getWidth();
     int my = (int) getMousePosition().getY();
     if (omx == -100) {
     omx = mx;
     omy = my;
     }
     jTextField1.setLocation(mx, my - 23);
     System.out.println(mx);
     System.out.println(omx);
     System.out.println(my);
     System.out.println(omy);
     System.out.println(cx);
     System.out.println(cy);
     if (cx > mx) {
     jTextField1.setSize((jTextField1.getWidth() - (omx - mx)), jTextField1.getHeight());
     } else {
     if (cx < mx) {
     jTextField1.setSize((jTextField1.getWidth() - (omx - mx)), jTextField1.getHeight());
     }
     }
     if (cy > my - 23 - jTextField1.getHeight()) {
     jTextField1.setSize(jTextField1.getWidth(), jTextField1.getHeight() + (omy - my));
     } else {
     if (cy < my - 23 - jTextField1.getHeight()) {
     jTextField1.setSize(jTextField1.getWidth(), jTextField1.getHeight() + omy - my);
     }
     }
     }

     private void changeDimension4() {
     int mx = (int) getMousePosition().getX() - jTextField1.getWidth();
     int my = (int) getMousePosition().getY() - jTextField1.getHeight();
     if (omx == -100) {
     omx = mx;
     omy = my;
     }
     jTextField1.setLocation(mx, my - 23);
     System.out.println(mx);
     System.out.println(omx);
     System.out.println(my);
     System.out.println(omy);
     System.out.println(cx);
     System.out.println(cy);
     if (cx > mx) {
     jTextField1.setSize((jTextField1.getWidth() - (omx - mx)), jTextField1.getHeight());
     } else {
     if (cx < mx) {
     jTextField1.setSize((jTextField1.getWidth() - (omx - mx)), jTextField1.getHeight());
     }
     }
     if (cy > my - 23 - jTextField1.getHeight()) {
     jTextField1.setSize(jTextField1.getWidth(), jTextField1.getHeight() - (omy - my));
     } else {
     if (cy < my - 23 - jTextField1.getHeight()) {
     jTextField1.setSize(jTextField1.getWidth(), jTextField1.getHeight() - (omy - my));
     }
     }
     }*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(null);

        jTextField1.setEditable(false);
        jTextField1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jTextField1MouseDragged(evt);
            }
        });
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(250, 160, 210, 130);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        /*jTextField2.setVisible(true);
         jTextField3.setVisible(true);
         jTextField4.setVisible(true);
         jTextField5.setVisible(true);*/
        d.setResizable(jTextField1);
    }//GEN-LAST:event_jTextField1FocusGained

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        requestFocus();
        /*jTextField2.setVisible(false);
         jTextField3.setVisible(false);
         jTextField4.setVisible(false);
         jTextField5.setVisible(false);*/
    }//GEN-LAST:event_formWindowOpened

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        d.lostResizable();
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseDragged
        d.setDragged(jTextField1,true);
    }//GEN-LAST:event_jTextField1MouseDragged
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Resize().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
