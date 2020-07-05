
import com.sun.org.apache.bcel.internal.generic.Select;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        
        
        initComponents();
        this.setLocationRelativeTo(null);
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        title = new javax.swing.JComboBox<>();
        customerSurname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        typeoffood = new javax.swing.JComboBox<>();
        addonfood = new javax.swing.JComboBox<>();
        beverage = new javax.swing.JComboBox<>();
        quantityofbeverage = new javax.swing.JComboBox<>();
        orderNow = new javax.swing.JButton();
        resetVariable = new javax.swing.JButton();
        error = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        customersurname = new javax.swing.JTextField();
        olfood = new javax.swing.JTextField();
        olcombofood = new javax.swing.JTextField();
        oladfood = new javax.swing.JTextField();
        olbeverages = new javax.swing.JTextField();
        olqbeverages = new javax.swing.JTextField();
        enjoy = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        Function = new javax.swing.JMenu();
        search = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(240, 240, 214));

        jPanel4.setBackground(new java.awt.Color(253, 227, 167));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        jLabel1.setText("Order Foods & Beverages");

        jPanel1.setBackground(new java.awt.Color(252, 185, 65));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Title                         :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Customer Surname      :");

        title.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Please select>", "Mr", "Mrs", "Miss", "Dr", "Prof" }));
        title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleActionPerformed(evt);
            }
        });

        customerSurname.setBackground(new java.awt.Color(253, 227, 167));
        customerSurname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        customerSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerSurnameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Type of Food             :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Combo                     :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Add On Food             :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Beverages                 :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Quantity of Beverages :");

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Please select>", "Combo 1", "Combo 2", "Family Combo", "Pair Combo", "Children Combo", "None" }));
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });

        typeoffood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Please select>", "BBQ", "Korean Food", "Chinese Food", "Indian Food" }));
        typeoffood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeoffoodActionPerformed(evt);
            }
        });

        addonfood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Please select>", "Fired Rice", "Sausage", "Fried Noodles with Seafood", "Steamed Fish", "None", " " }));
        addonfood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addonfoodActionPerformed(evt);
            }
        });

        beverage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Please select>", "SkyJuice", "Coke", "Pepsi", "Watermelon Juice", "Apple Juice", "Milo", "Coffee", "None", "" }));
        beverage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beverageActionPerformed(evt);
            }
        });

        quantityofbeverage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Please select>", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "None" }));
        quantityofbeverage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityofbeverageActionPerformed(evt);
            }
        });

        orderNow.setBackground(new java.awt.Color(52, 73, 94));
        orderNow.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        orderNow.setText("Order Now");
        orderNow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderNowMouseClicked(evt);
            }
        });
        orderNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderNowActionPerformed(evt);
            }
        });

        resetVariable.setBackground(new java.awt.Color(207, 0, 15));
        resetVariable.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        resetVariable.setText("Reset");
        resetVariable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetVariableMouseClicked(evt);
            }
        });
        resetVariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetVariableActionPerformed(evt);
            }
        });

        error.setEditable(false);
        error.setBackground(new java.awt.Color(252, 185, 65));
        error.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        error.setForeground(new java.awt.Color(255, 0, 0));
        error.setBorder(null);
        error.setDisabledTextColor(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(resetVariable)
                        .addGap(40, 40, 40)
                        .addComponent(orderNow))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(typeoffood, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addonfood, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(beverage, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantityofbeverage, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customerSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(customerSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(typeoffood, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(addonfood, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(beverage, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(quantityofbeverage, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderNow)
                    .addComponent(resetVariable))
                .addContainerGap(190, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(197, 239, 247));
        jPanel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        jLabel7.setText("Order List");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel10.setText("Below will be details of food & beverages that has been order");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Type of Food             :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Combo                     :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Add On Food             :");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Beverages                 :");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Quantity of Beverages :");

        customersurname.setEditable(false);
        customersurname.setBackground(new java.awt.Color(197, 239, 247));
        customersurname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        customersurname.setBorder(null);
        customersurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customersurnameActionPerformed(evt);
            }
        });

        olfood.setEditable(false);
        olfood.setBackground(new java.awt.Color(197, 239, 247));
        olfood.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        olfood.setBorder(null);

        olcombofood.setEditable(false);
        olcombofood.setBackground(new java.awt.Color(197, 239, 247));
        olcombofood.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        olcombofood.setBorder(null);

        oladfood.setEditable(false);
        oladfood.setBackground(new java.awt.Color(197, 239, 247));
        oladfood.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        oladfood.setBorder(null);

        olbeverages.setEditable(false);
        olbeverages.setBackground(new java.awt.Color(197, 239, 247));
        olbeverages.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        olbeverages.setBorder(null);
        olbeverages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                olbeveragesActionPerformed(evt);
            }
        });

        olqbeverages.setEditable(false);
        olqbeverages.setBackground(new java.awt.Color(197, 239, 247));
        olqbeverages.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        olqbeverages.setBorder(null);

        enjoy.setBackground(new java.awt.Color(197, 239, 247));
        enjoy.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        enjoy.setBorder(null);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(oladfood, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(olbeverages, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(enjoy, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addGap(18, 18, 18)
                                    .addComponent(olqbeverages, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel7))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(customersurname, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(olcombofood, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(olfood, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addGap(48, 48, 48)
                .addComponent(customersurname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(olfood, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(olcombofood, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(oladfood, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(olbeverages, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(olqbeverages, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(57, 57, 57)
                .addComponent(enjoy, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        Function.setText("Others Function");

        search.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        search.setText("Back To Main Menu");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        Function.add(search);

        jMenuBar1.add(Function);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleActionPerformed
       //String dataTitle = title.getSelectedItem().toString();
        
    }//GEN-LAST:event_titleActionPerformed

    private void customerSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerSurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerSurnameActionPerformed

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboActionPerformed

    private void typeoffoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeoffoodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeoffoodActionPerformed

    private void addonfoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addonfoodActionPerformed
        // TOD add your handling code here:
    }//GEN-LAST:event_addonfoodActionPerformed

    private void beverageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beverageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_beverageActionPerformed

    private void quantityofbeverageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityofbeverageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityofbeverageActionPerformed

    private void orderNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderNowActionPerformed
        
             
    }//GEN-LAST:event_orderNowActionPerformed

    private void resetVariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetVariableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resetVariableActionPerformed

    private void orderNowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderNowMouseClicked
        String datatitle = title.getSelectedItem().toString();
        String csurname = customerSurname.getText();
        String oltypeofood = typeoffood.getSelectedItem().toString();
        String olcombo = combo.getSelectedItem().toString();
        String oladdonfood = addonfood.getSelectedItem().toString();
        String olbeverage = beverage.getSelectedItem().toString();
        String olqbeverage = quantityofbeverage.getSelectedItem().toString();
        int count = 0;
        
       
        
        if (datatitle.equals("<Please Select>") || datatitle.equals("-------------")||
            oltypeofood.equals("<Please Select>") || oltypeofood.equals("-------------")||
            olcombo.equals("<Please Select>") || olcombo.equals("-------------")||
            oladdonfood.equals("<Please Select>") || oladdonfood.equals("-------------")||
            olbeverage.equals("<Please Select>") || olbeverage.equals("-------------")||
            olqbeverage.equals("<Please Select>") || olqbeverage.equals("-------------")){
            error.setText("Please Select & Enter Details");
        }
            String data1 = datatitle + " " + csurname ;
            customersurname.setText(data1);
            String data2 = oltypeofood;
            olfood.setText(data2);
            String data3 = olcombo;
            olcombofood.setText(data3);
            String data4 = oladdonfood ; 
            oladfood.setText(data4);
            String data5 = olbeverage;
            olbeverages.setText(data5);
            String data6 = olqbeverage;
            olqbeverages.setText(data6);
            enjoy.setText("Enjoy your meal~");
        
        
        
    }//GEN-LAST:event_orderNowMouseClicked

    private void customersurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customersurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customersurnameActionPerformed

    private void olbeveragesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_olbeveragesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_olbeveragesActionPerformed

    private void resetVariableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetVariableMouseClicked
        String def = " " ;
        
        String defaultcombo = "-------------";
        title.addItem(defaultcombo);
        title.setSelectedItem(defaultcombo);
        customerSurname.setText(def);
        typeoffood.addItem(defaultcombo);
        typeoffood.setSelectedItem(defaultcombo);
        combo.addItem(defaultcombo);
        combo.setSelectedItem(defaultcombo);
        addonfood.addItem(defaultcombo);
        addonfood.setSelectedItem(defaultcombo);
        beverage.addItem(defaultcombo);
        beverage.setSelectedItem(defaultcombo);
        quantityofbeverage.addItem(defaultcombo);
        quantityofbeverage.setSelectedItem(defaultcombo);


    }//GEN-LAST:event_resetVariableMouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        close();
        MainInterface minterface = new MainInterface();
        minterface.setVisible(true);
    }//GEN-LAST:event_searchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Function;
    private javax.swing.JComboBox<String> addonfood;
    private javax.swing.JComboBox<String> beverage;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JTextField customerSurname;
    private javax.swing.JTextField customersurname;
    private javax.swing.JTextField enjoy;
    private javax.swing.JTextField error;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField oladfood;
    private javax.swing.JTextField olbeverages;
    private javax.swing.JTextField olcombofood;
    private javax.swing.JTextField olfood;
    private javax.swing.JTextField olqbeverages;
    private javax.swing.JButton orderNow;
    private javax.swing.JComboBox<String> quantityofbeverage;
    private javax.swing.JButton resetVariable;
    private javax.swing.JMenuItem search;
    private javax.swing.JComboBox<String> title;
    private javax.swing.JComboBox<String> typeoffood;
    // End of variables declaration//GEN-END:variables

    private void close() {
         WindowEvent winClosingEvent =  new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
}
