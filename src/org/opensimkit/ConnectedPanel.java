/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.opensimkit;

import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import org.opensimkit.utilities.Messages;

/**
 *
 * @author ahmedmaawy
 */
public class ConnectedPanel extends javax.swing.JPanel {

    private int numTextItems;
    
    /**
     * Creates new form ConnectedPanel
     */
    
    public ConnectedPanel() {
        initComponents();
        
        numTextItems = 0;
    }
    
    /**
     * Creates text boxes from a string array
     * 
     * @param items 
     */
    
    public void createTextBoxes(ArrayList<String> items)
    {
        numTextItems = items.size();
        messagesPanel.setItems(items);
    }
    
    /**
     * Returns number of textArea items
     * 
     * @return 
     */

    public int getNumTextItems() {
        return numTextItems;
    }

    /**
     * Returns the messages panel
     * 
     * @return 
     */
    
    public MessagesPanel getMessagesPanel() {
        return messagesPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelConnectedTop = new javax.swing.JPanel();
        jLabelLiveEditing = new javax.swing.JLabel();
        jPanelConnectedBottom = new javax.swing.JPanel();
        jPanelLiveEdit = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPaneMessages = new javax.swing.JScrollPane();
        messagesPanel = new org.opensimkit.MessagesPanel();
        jPanelLiveEditHelp = new javax.swing.JPanel();
        jLabelAutoSave = new javax.swing.JLabel();
        jButtonSave = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelAutoSave1 = new javax.swing.JLabel();
        jButtonEject = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(500, 300));

        jPanelConnectedTop.setBackground(new java.awt.Color(255, 255, 255));

        jLabelLiveEditing.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabelLiveEditing.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLiveEditing.setText("You are currently editing a SIM card");

        org.jdesktop.layout.GroupLayout jPanelConnectedTopLayout = new org.jdesktop.layout.GroupLayout(jPanelConnectedTop);
        jPanelConnectedTop.setLayout(jPanelConnectedTopLayout);
        jPanelConnectedTopLayout.setHorizontalGroup(
            jPanelConnectedTopLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelConnectedTopLayout.createSequentialGroup()
                .add(jLabelLiveEditing, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelConnectedTopLayout.setVerticalGroup(
            jPanelConnectedTopLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelConnectedTopLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jLabelLiveEditing))
        );

        jPanelConnectedBottom.setBackground(new java.awt.Color(255, 255, 255));

        jPanelLiveEdit.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jScrollPaneMessages.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPaneMessages.setPreferredSize(new java.awt.Dimension(120, 300));
        jScrollPaneMessages.setViewportView(messagesPanel);

        org.jdesktop.layout.GroupLayout messagesPanelLayout = new org.jdesktop.layout.GroupLayout(messagesPanel);
        messagesPanel.setLayout(messagesPanelLayout);
        messagesPanelLayout.setHorizontalGroup(
            messagesPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 244, Short.MAX_VALUE)
        );
        messagesPanelLayout.setVerticalGroup(
            messagesPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 383, Short.MAX_VALUE)
        );

        jScrollPaneMessages.setViewportView(messagesPanel);

        jPanelLiveEditHelp.setBackground(new java.awt.Color(255, 255, 255));

        jLabelAutoSave.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabelAutoSave.setText("<html> <div style=\"width:100%\"> <p>Edit the text in any of the boxes in the list on the left</p> <br/> <p>When you have finished editing click on the save button below to store those messages on card.</p> </div> </html>");

        jButtonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/opensimkit/resources/SaveButton.png"))); // NOI18N
        jButtonSave.setBorder(null);
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jLabelAutoSave1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabelAutoSave1.setText("<html> <div style=\"width:100%\"><p>If you have finished working with this card, you can eject it and work with another.</p> <br/> <p>Click the eject button below and follow the instructions.</p> </div> </html>");

        jButtonEject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/opensimkit/resources/EjectButton.png"))); // NOI18N
        jButtonEject.setBorder(null);
        jButtonEject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEjectActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanelLiveEditHelpLayout = new org.jdesktop.layout.GroupLayout(jPanelLiveEditHelp);
        jPanelLiveEditHelp.setLayout(jPanelLiveEditHelpLayout);
        jPanelLiveEditHelpLayout.setHorizontalGroup(
            jPanelLiveEditHelpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelLiveEditHelpLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelLiveEditHelpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabelAutoSave1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jSeparator1)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelLiveEditHelpLayout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(jPanelLiveEditHelpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jButtonSave)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabelAutoSave, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 303, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jButtonEject))))
                .addContainerGap())
        );
        jPanelLiveEditHelpLayout.setVerticalGroup(
            jPanelLiveEditHelpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelLiveEditHelpLayout.createSequentialGroup()
                .addContainerGap()
                .add(jLabelAutoSave, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 113, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButtonSave)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabelAutoSave1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButtonEject)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout jPanelLiveEditLayout = new org.jdesktop.layout.GroupLayout(jPanelLiveEdit);
        jPanelLiveEdit.setLayout(jPanelLiveEditLayout);
        jPanelLiveEditLayout.setHorizontalGroup(
            jPanelLiveEditLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelLiveEditLayout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPaneMessages, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelLiveEditHelp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelLiveEditLayout.setVerticalGroup(
            jPanelLiveEditLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelLiveEditLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelLiveEditLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPaneMessages, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                    .add(jSeparator2))
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelLiveEditHelp, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout jPanelConnectedBottomLayout = new org.jdesktop.layout.GroupLayout(jPanelConnectedBottom);
        jPanelConnectedBottom.setLayout(jPanelConnectedBottomLayout);
        jPanelConnectedBottomLayout.setHorizontalGroup(
            jPanelConnectedBottomLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelConnectedBottomLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelLiveEdit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        jPanelConnectedBottomLayout.setVerticalGroup(
            jPanelConnectedBottomLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelConnectedBottomLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelLiveEdit, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jPanelConnectedBottom, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createSequentialGroup()
                        .add(jPanelConnectedTop, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelConnectedTop, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelConnectedBottom, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        // TODO add your handling code here:
        ArrayList<JTextArea> textAreaList = messagesPanel.getjTextAreaList();
        ArrayList<String> items = new ArrayList<String>();
        int numItems = textAreaList.size();
        
        for(int itemLoop = 0; itemLoop < numItems; itemLoop ++) {
            items.add(textAreaList.get(itemLoop).getText());
        }
        
        // Clear all messages
        
        if(OpenSIMKit.serialPorts.saveMessages("123", items, true))
        {
            JOptionPane.showMessageDialog(this, "All messages saved");
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Not all messages were succesfully saved");
        }
        
        String simMessages = OpenSIMKit.serialPorts.getAllMessages();
        Messages messages = new Messages(simMessages);
        
        messagesPanel.setItems(messages.getMessages());
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonEjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEjectActionPerformed
        // TODO add your handling code here:
        OpenSIMKit.serialPorts.disconnectPort();
        OpenSIMKit.serialPorts = null;
        
        OpenSIMKit.mainFrame.setDisconnectedInterface();
    }//GEN-LAST:event_jButtonEjectActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEject;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabelAutoSave;
    private javax.swing.JLabel jLabelAutoSave1;
    private javax.swing.JLabel jLabelLiveEditing;
    private javax.swing.JPanel jPanelConnectedBottom;
    private javax.swing.JPanel jPanelConnectedTop;
    private javax.swing.JPanel jPanelLiveEdit;
    private javax.swing.JPanel jPanelLiveEditHelp;
    private javax.swing.JScrollPane jScrollPaneMessages;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private org.opensimkit.MessagesPanel messagesPanel;
    // End of variables declaration//GEN-END:variables
}
