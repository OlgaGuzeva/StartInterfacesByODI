/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loaddictisandostls;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static loaddictisandostls.Settings.PATH_TO_ICON_SETTINGS;
import static loaddictisandostls.Settings.prop;

/**
 *
 * @author guzeva
 */
public class SettingsFrame extends javax.swing.JFrame implements Runnable {

    ImageIcon image = new ImageIcon(PATH_TO_ICON_SETTINGS);
    /**
     * Creates new form SettingsFrame
     */
    public SettingsFrame() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        initComponents();
        Settings.getSettings(serverAddr.getSelectedItem().toString());
        setFields();        
        run();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        odiHost = new javax.swing.JTextField();
        odiUser = new javax.swing.JTextField();
        odiPassword = new javax.swing.JTextField();
        odiWorkRep = new javax.swing.JTextField();
        dictScenName = new javax.swing.JTextField();
        dictVersion = new javax.swing.JTextField();
        ostScenName = new javax.swing.JTextField();
        ostVersion = new javax.swing.JTextField();
        canselButton = new javax.swing.JButton();
        confirmButton = new javax.swing.JButton();
        serverAddr = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        recOtlVersion = new javax.swing.JTextField();
        recOtlScenName = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Settings");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(new ImageIcon(PATH_TO_ICON_SETTINGS).getImage());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("ODI агент");

        jLabel2.setText("Host:");

        jLabel3.setText("User:");

        jLabel4.setText("Password:");

        jLabel5.setText("Work repository name:");

        jLabel6.setText("Scenario name:");

        jLabel7.setText("Version:");

        jLabel8.setText("Scenario name:");

        jLabel9.setText("Version:");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText("Справочники");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setText("Остатки");

        odiHost.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        canselButton.setText("Cancel");
        canselButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canselButtonActionPerformed(evt);
            }
        });

        confirmButton.setText("OK");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        serverAddr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "45.10", "45.2" }));
        serverAddr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serverAddrActionPerformed(evt);
            }
        });

        jLabel12.setText("Version:");

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel13.setText("Необеспеченные рецепты");

        jLabel14.setText("Scenario name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel14)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(recOtlScenName, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ostScenName, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dictScenName, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(25, 25, 25)
                                            .addComponent(jLabel9))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel12)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dictVersion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                                    .addComponent(ostVersion, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(recOtlVersion, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(odiHost)
                            .addComponent(odiUser)
                            .addComponent(odiPassword)
                            .addComponent(odiWorkRep)
                            .addComponent(serverAddr, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(canselButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(serverAddr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(odiHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(odiUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(odiPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(odiWorkRep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(dictScenName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(ostScenName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(recOtlScenName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dictVersion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ostVersion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(recOtlVersion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(canselButton)
                    .addComponent(confirmButton))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        if(modified()){
            changeConstants();
        }
        setVisible(false); 
        dispose(); 
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void canselButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canselButtonActionPerformed
        setVisible(false); 
        dispose();
    }//GEN-LAST:event_canselButtonActionPerformed

    private void serverAddrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serverAddrActionPerformed
        Settings.getSettings(serverAddr.getSelectedItem().toString());
        setFields();
    }//GEN-LAST:event_serverAddrActionPerformed

    private void setFields(){
        odiHost.setText(prop.getProperty("ODI_HOST"));
        odiUser.setText(prop.getProperty("ODI_USER"));
        odiPassword.setText(prop.getProperty("ODI_PASS"));
        odiWorkRep.setText(prop.getProperty("ODI_WORK_REP"));
        dictScenName.setText(prop.getProperty("DICT_SCEN_NAME"));
        dictVersion.setText(prop.getProperty("DICT_SCEN_VERSION"));
        ostScenName.setText(prop.getProperty("OST_SCEN_NAME"));
        ostVersion.setText(prop.getProperty("OST_SCEN_VERSION"));
        recOtlScenName.setText(prop.getProperty("REC_OTL_SCEN_NAME"));
        recOtlVersion.setText(prop.getProperty("REC_OTL_SCEN_VERSION"));
    }
    
    private boolean modified(){
        //agent fields
        if(!odiHost.getText().equals(prop.getProperty("ODI_HOST"))){
            return true;
        }
        if(!odiPassword.getText().equals(prop.getProperty("ODI_PASS"))){
            return true;
        }
        if(!odiUser.getText().equals(prop.getProperty("ODI_USER"))){
            return true;
        }
        if(!odiWorkRep.getText().equals(prop.getProperty("ODI_WORK_REP"))){
            return true;
        }
        //ostls fields
        if(!ostScenName.getText().equals(prop.getProperty("OST_SCEN_NAME"))){
            return true;
        }
        if(!ostVersion.getText().equals(prop.getProperty("OST_SCEN_VERSION"))){
            return true;
        }
        //dictionaties fields
        if(!dictScenName.getText().equals(prop.getProperty("DICT_SCEN_NAME"))){
            return true;
        }
        if(!dictVersion.getText().equals(prop.getProperty("DICT_SCEN_VERSION"))){
            return true;
        }
        //apsto fields
        if(!recOtlScenName.getText().equals(prop.getProperty("REC_OTL_SCEN_NAME"))){
            return true;
        }
        if(!recOtlVersion.getText().equals(prop.getProperty("REC_OTL_SCEN_VERSION"))){
            return true;
        }
        return false;
    }
    
    private void changeConstants(){
        prop.setProperty("ODI_HOST",          odiHost.getText());
        prop.setProperty("ODI_USER",          odiUser.getText());
        prop.setProperty("ODI_PASS",          odiPassword.getText());
        prop.setProperty("ODI_WORK_REP",      odiWorkRep.getText());
        prop.setProperty("DICT_SCEN_NAME",    dictScenName.getText());
        prop.setProperty("DICT_SCEN_VERSION", dictVersion.getText());
        prop.setProperty("OST_SCEN_NAME",     ostScenName.getText());
        prop.setProperty("OST_SCEN_VERSION",  ostVersion.getText());
        prop.setProperty("REC_OTL_SCEN_NAME", recOtlScenName.getText());
        prop.setProperty("REC_OTL_SCEN_VERSION", recOtlVersion.getText());
        
        try {
            if(serverAddr.getSelectedItem().toString().equals("45.2")){  
                prop.store(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(Settings.PATH_TO_PROPERTIES_2), "UTF-8")), null);
            }else{
                prop.store(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(Settings.PATH_TO_PROPERTIES_10), "UTF-8")), null);
            }
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public void run() {
        setVisible(true);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton canselButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JTextField dictScenName;
    private javax.swing.JTextField dictVersion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField odiHost;
    private javax.swing.JTextField odiPassword;
    private javax.swing.JTextField odiUser;
    private javax.swing.JTextField odiWorkRep;
    private javax.swing.JTextField ostScenName;
    private javax.swing.JTextField ostVersion;
    private javax.swing.JTextField recOtlScenName;
    private javax.swing.JTextField recOtlVersion;
    private javax.swing.JComboBox<String> serverAddr;
    // End of variables declaration//GEN-END:variables
}
