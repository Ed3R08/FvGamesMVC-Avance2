
package FVvisual;


public class Pantalla extends javax.swing.JFrame {
    String Consola_1;
    String Consola_2;

    public Pantalla() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btn1Login = new javax.swing.JButton();
        btn1Registrarse = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        btn1Inventario = new javax.swing.JButton();
        btn1Suscripcion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn1Trasportes = new javax.swing.JButton();
        btn1Incio = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn1Login.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn1Login.setText("Login");
        btn1Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1LoginActionPerformed(evt);
            }
        });

        btn1Registrarse.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn1Registrarse.setText("Registrarse");
        btn1Registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1RegistrarseActionPerformed(evt);
            }
        });

        Titulo.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        Titulo.setText("FVGames");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\computadora\\Desktop\\logo2.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Bienvenido a la tienda FVGames ");

        btn1Inventario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn1Inventario.setText("Inventario");
        btn1Inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1InventarioActionPerformed(evt);
            }
        });

        btn1Suscripcion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn1Suscripcion.setText("Suscripcion");
        btn1Suscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1SuscripcionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Ofertas");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Mas vendido");

        btn1Trasportes.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn1Trasportes.setText("Trasportes");
        btn1Trasportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1TrasportesActionPerformed(evt);
            }
        });

        btn1Incio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn1Incio.setText("Inicio");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Titulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                        .addComponent(btn1Incio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn1Trasportes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn1Inventario)
                        .addGap(18, 18, 18)
                        .addComponent(btn1Suscripcion)
                        .addGap(18, 18, 18)
                        .addComponent(btn1Registrarse)
                        .addGap(18, 18, 18)
                        .addComponent(btn1Login)
                        .addGap(14, 14, 14))
                    .addComponent(jSeparator2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel4)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Titulo)
                        .addComponent(btn1Registrarse)
                        .addComponent(btn1Login)
                        .addComponent(btn1Inventario)
                        .addComponent(btn1Suscripcion)
                        .addComponent(btn1Trasportes)
                        .addComponent(btn1Incio)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(179, 179, 179)
                .addComponent(jLabel4)
                .addContainerGap(388, Short.MAX_VALUE))
        );

        jMenu3.setText("File");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1LoginActionPerformed
        // TODO add your handling code here:
        Login login=new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn1LoginActionPerformed

    private void btn1RegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1RegistrarseActionPerformed
        // TODO add your handling code here:
        Registrarse regis=new Registrarse();
        regis.setVisible(true);
        regis.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn1RegistrarseActionPerformed

    private void btn1InventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1InventarioActionPerformed
        // TODO add your handling code here:
        Inventario inve=new Inventario();
        inve.setVisible(true);
        inve.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_btn1InventarioActionPerformed

    private void btn1TrasportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1TrasportesActionPerformed
        // TODO add your handling code here:
        Trasportes trans=new Trasportes();
        trans.setVisible(true);
        trans.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn1TrasportesActionPerformed

    private void btn1SuscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1SuscripcionActionPerformed
        // TODO add your handling code here:
        Suscripcion suscr=new Suscripcion();
        suscr.setVisible(true);
        suscr.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn1SuscripcionActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btn1Incio;
    private javax.swing.JButton btn1Inventario;
    private javax.swing.JButton btn1Login;
    private javax.swing.JButton btn1Registrarse;
    private javax.swing.JButton btn1Suscripcion;
    private javax.swing.JButton btn1Trasportes;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
