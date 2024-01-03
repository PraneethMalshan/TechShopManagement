package inventoryjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Order extends javax.swing.JFrame {

    public Order() {
        initComponents();
        SelectProd();
        SelectCust();
        GetToday();
    }
    
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null; 
    
    public void SelectProd(){
        try{
              Con = DriverManager.getConnection("jdbc:derby://localhost:1527/invdb","root","1234");
              St = Con.createStatement();
              Rs = St.executeQuery("select * from PRODUTTBL");
              ProductTbl.setModel(DbUtils.resultSetToTableModel(Rs));
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void SelectCust(){
        try{
              Con = DriverManager.getConnection("jdbc:derby://localhost:1527/invdb","root","1234");
              St = Con.createStatement();
              Rs = St.executeQuery("select * from CUSTOMERTBL");
              CustomerTbl.setModel(DbUtils.resultSetToTableModel(Rs));
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BilId = new javax.swing.JTextField();
        QtyTb = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        AddBtn = new javax.swing.JButton();
        UserUpdate = new javax.swing.JButton();
        AddToOrderBtn = new javax.swing.JButton();
        OrderToHome = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTbl = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        CustomerTbl = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        CustNameLbl = new javax.swing.JLabel();
        DateLbl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        BillTbl = new javax.swing.JTable();
        TotalAmTbl = new javax.swing.JLabel();
        Price = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        PrintBtn = new javax.swing.JButton();
        TotalAmTbl1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1326, 778));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("INVENTORY MANAGEMENT SYSTEM");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MANAGE ORDERS");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(468, 468, 468))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(341, 341, 341)))
                .addComponent(jLabel1)
                .addGap(47, 47, 47))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel4.setText("Order Id");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel5.setText("Customer Name");

        BilId.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        QtyTb.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel6.setText("Date");

        AddBtn.setBackground(new java.awt.Color(0, 0, 0));
        AddBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(204, 204, 204));
        AddBtn.setText("Add Order");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        UserUpdate.setBackground(new java.awt.Color(0, 0, 0));
        UserUpdate.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        UserUpdate.setForeground(new java.awt.Color(204, 204, 204));
        UserUpdate.setText("View orders");
        UserUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserUpdateMouseClicked(evt);
            }
        });
        UserUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserUpdateActionPerformed(evt);
            }
        });

        AddToOrderBtn.setBackground(new java.awt.Color(0, 0, 0));
        AddToOrderBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        AddToOrderBtn.setForeground(new java.awt.Color(204, 204, 204));
        AddToOrderBtn.setText("AddToOrder");
        AddToOrderBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToOrderBtnMouseClicked(evt);
            }
        });
        AddToOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToOrderBtnActionPerformed(evt);
            }
        });

        OrderToHome.setBackground(new java.awt.Color(0, 0, 0));
        OrderToHome.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        OrderToHome.setForeground(new java.awt.Color(204, 204, 204));
        OrderToHome.setText("Home");
        OrderToHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrderToHomeMouseClicked(evt);
            }
        });
        OrderToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderToHomeActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabel9.setText("PRODUCT LIST");

        ProductTbl.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        ProductTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProdID", "Name", "Quantity", "Description", "Category"
            }
        ));
        ProductTbl.setIntercellSpacing(new java.awt.Dimension(0, 0));
        ProductTbl.setRowHeight(30);
        ProductTbl.setSelectionBackground(new java.awt.Color(0, 0, 0));
        ProductTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductTbl);

        CustomerTbl.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        CustomerTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CusID", "Name", "Phone"
            }
        ));
        CustomerTbl.setIntercellSpacing(new java.awt.Dimension(0, 0));
        CustomerTbl.setRowHeight(30);
        CustomerTbl.setSelectionBackground(new java.awt.Color(0, 0, 0));
        CustomerTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerTblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(CustomerTbl);

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabel10.setText("CUSTOMER LIST");

        CustNameLbl.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        CustNameLbl.setText("CustName");

        DateLbl.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        DateLbl.setText("Date");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel7.setText("Quantity");

        BillTbl.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        BillTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num", "Product", "Quantity", "UPrice", "Total"
            }
        ));
        BillTbl.setIntercellSpacing(new java.awt.Dimension(0, 0));
        BillTbl.setRowHeight(30);
        BillTbl.setSelectionBackground(new java.awt.Color(0, 0, 0));
        BillTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BillTblMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(BillTbl);

        TotalAmTbl.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        TotalAmTbl.setText("Amount");

        Price.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel8.setText("Price");

        PrintBtn.setBackground(new java.awt.Color(0, 0, 0));
        PrintBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        PrintBtn.setForeground(new java.awt.Color(204, 204, 204));
        PrintBtn.setText("Print");
        PrintBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintBtnMouseClicked(evt);
            }
        });
        PrintBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintBtnActionPerformed(evt);
            }
        });

        TotalAmTbl1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        TotalAmTbl1.setText("RS : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(264, 264, 264))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(101, 101, 101)
                                .addComponent(BilId, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                                        .addComponent(DateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CustNameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UserUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(OrderToHome, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(QtyTb, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddToOrderBtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(TotalAmTbl1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TotalAmTbl, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PrintBtn)
                        .addGap(55, 55, 55))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AddToOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(BilId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(QtyTb, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TotalAmTbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TotalAmTbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CustNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(OrderToHome, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void GetToday(){
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        
        DateLbl.setText(dtf.format(now));
       
    }
    
    
    private void update(){
        
        int newqty = oldqty - Integer.valueOf(QtyTb.getText());
        
        try{
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/invdb","root","1234");
            String UpdateQuery = "update root.PRODUTTBL set PRODQTY="+newqty+""+" where PRODID ="+productid;
            Statement Add = Con.createStatement();
            Add.executeUpdate(UpdateQuery);
//            JOptionPane.showMessageDialog(this, "Category Updated Successfully.!");
            SelectProd();
               }catch (Exception e) {
                   e.printStackTrace();
               }
        
    }
    
    
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked

        if (BilId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,"Enter The Bill Id");
        } else {
        
        try{
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/invdb","root","1234");
            PreparedStatement add = Con.prepareStatement("insert into ORDERTBL values(?,?,?,?)");
            add.setInt(1, Integer.valueOf(BilId.getText()));
            add.setString(2, CustNameLbl.getText());
            add.setString(3, DateLbl.getText());
            add.setInt(4, Integer.valueOf(TotalAmTbl.getText()));
          
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this,"Order Successfully Added");
            Con.close();
            

        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }

    }//GEN-LAST:event_AddBtnMouseClicked

    private void UserUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserUpdateMouseClicked

//        if (Uname.getText().isEmpty()||QtyTb.getText().isEmpty()||Uphone.getText().isEmpty() ) {
//            JOptionPane.showMessageDialog(this, "Missing Information");
//        }
//        else {
//
//            try{
//                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/invdb","root","1234");
//                String UpdateQuery = "update root.USERTBL set UNAME='"+Uname.getText()+"'"+",UPASS='"+QtyTb.getText()+"'"+"where UPHONE ="+"'"+Uphone.getText()+"'";
//                Statement Add = Con.createStatement();
//                Add.executeUpdate(UpdateQuery);
//                JOptionPane.showMessageDialog(this, "User Updated Successfully.!");
//                selectUser();
//            }catch (Exception e) {
//                e.printStackTrace();
//            }
//        }

    }//GEN-LAST:event_UserUpdateMouseClicked

    private void UserUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserUpdateActionPerformed

    int i = 1,Uprice,tot=0,total;
    String ProdName;
    private void AddToOrderBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToOrderBtnMouseClicked

        if (flag == 0 || QtyTb.getText().isEmpty() || Price.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(this, "Select Product and Enter Qty");
            
        } else {
            
        Uprice = Integer.valueOf(Price.getText());
        tot = Uprice * Integer.valueOf(QtyTb.getText());
        Vector v = new Vector();
        v.add(i);
        v.add(ProdName);
        v.add(QtyTb.getText());
        v.add(Uprice);
        v.add(tot);
        DefaultTableModel dt =  (DefaultTableModel)BillTbl.getModel();
        dt.addRow(v);
        total = total + tot ;
        TotalAmTbl.setText(""+total);
        update();
        i++;
        
        }
    }//GEN-LAST:event_AddToOrderBtnMouseClicked

    private void AddToOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToOrderBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToOrderBtnActionPerformed

    private void OrderToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderToHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrderToHomeActionPerformed

    int flag = 0,productid,oldqty;
    private void ProductTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTblMouseClicked
        DefaultTableModel model = (DefaultTableModel)ProductTbl.getModel();
        int Myindex = ProductTbl.getSelectedRow();
        productid = Integer.valueOf(model.getValueAt(Myindex, 0).toString());
        ProdName = model.getValueAt(Myindex, 1).toString();
        oldqty = Integer.valueOf(model.getValueAt(Myindex, 2).toString());
//        ProdDesc.setText(model.getValueAt(Myindex, 3).toString());
        flag = 1;
    }//GEN-LAST:event_ProductTblMouseClicked

    private void CustomerTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerTblMouseClicked
        DefaultTableModel model = (DefaultTableModel)CustomerTbl.getModel();
        int Myindex = CustomerTbl.getSelectedRow();
//        CustId.setText(model.getValueAt(Myindex, 0).toString());
        CustNameLbl.setText(model.getValueAt(Myindex, 1).toString());
//        CustPhone.setText(model.getValueAt(Myindex, 2).toString());

    }//GEN-LAST:event_CustomerTblMouseClicked

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnActionPerformed

    private void BillTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillTblMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BillTblMouseClicked

    private void OrderToHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderToHomeMouseClicked
        
        new HomeForm().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_OrderToHomeMouseClicked

    private void PrintBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintBtnMouseClicked
        
        try{
            BillTbl.print();
        }catch(Exception exp) {
            exp.printStackTrace();
        }
        
    }//GEN-LAST:event_PrintBtnMouseClicked

    private void PrintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrintBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton AddToOrderBtn;
    private javax.swing.JTextField BilId;
    private javax.swing.JTable BillTbl;
    private javax.swing.JLabel CustNameLbl;
    private javax.swing.JTable CustomerTbl;
    private javax.swing.JLabel DateLbl;
    private javax.swing.JButton OrderToHome;
    private javax.swing.JTextField Price;
    private javax.swing.JButton PrintBtn;
    private javax.swing.JTable ProductTbl;
    private javax.swing.JTextField QtyTb;
    private javax.swing.JLabel TotalAmTbl;
    private javax.swing.JLabel TotalAmTbl1;
    private javax.swing.JButton UserUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
