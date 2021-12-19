/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adminpage;

import java.awt.Color;
import javax.swing.JOptionPane;
import DB.DB;
import index.Main;
import index.members;
import java.awt.Toolkit;

/**
 *
 * @author magne
 */
public class adminpage extends javax.swing.JFrame {
    DB db = new DB();
    
    /**
     * Creates new form adminpage
     */
    public adminpage() {
        initComponents();
        setLocation((Toolkit.getDefaultToolkit().getScreenSize().width/2-getSize().width/2),
                (Toolkit.getDefaultToolkit().getScreenSize().height/2-getSize().height/2));
        try{db.DBopen();}
        catch (Exception e){
            System.out.println("SQLException : " + e.getMessage());
        }
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
        txtname = new javax.swing.JTextField();
        txttime = new javax.swing.JTextField();
        txtdir = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        txtday = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("영화 추가 페이지");

        jLabel2.setText("영화 이름");

        jLabel3.setText("상영 시간");

        jLabel4.setText("영화 감독");

        jLabel5.setText("영화 가격");

        jLabel6.setText("연령 제한");

        jLabel7.setText("상영 요일");

        txttime.setForeground(new java.awt.Color(153, 153, 153));
        txttime.setText("ex) 14:00~16:00");
        txttime.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txttimeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txttimeFocusLost(evt);
            }
        });

        txtprice.setForeground(new java.awt.Color(153, 153, 153));
        txtprice.setText("숫자 입력");
        txtprice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpriceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtpriceFocusLost(evt);
            }
        });

        txtage.setForeground(new java.awt.Color(153, 153, 153));
        txtage.setText("숫자 입력");
        txtage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtageFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtageFocusLost(evt);
            }
        });

        txtday.setForeground(new java.awt.Color(153, 153, 153));
        txtday.setText("화~일요일 기입 ex) 화");
        txtday.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtdayFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtdayFocusLost(evt);
            }
        });

        jButton1.setText("영화 추가");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("logout");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(144, 144, 144))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtage))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtprice))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtdir))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txttime))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtday)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txttime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtdir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txttimeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttimeFocusGained
        if ( txttime.getText().equals("ex) 14:00~16:00")){
            txttime.setText("");
            txttime.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txttimeFocusGained

    private void txttimeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttimeFocusLost
        if ( txttime.getText().equals("")){
            txttime.setText("ex) 14:00~16:00");
            txttime.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txttimeFocusLost

    private void txtpriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpriceFocusGained
        if ( txtprice.getText().equals("숫자 입력")){
            txtprice.setText("");
            txtprice.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtpriceFocusGained

    private void txtpriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpriceFocusLost
        if ( txtprice.getText().equals("")){
            txtprice.setText("숫자 입력");
            txtprice.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtpriceFocusLost

    private void txtageFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtageFocusGained
        if ( txtage.getText().equals("숫자 입력")){
            txtage.setText("");
            txtage.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtageFocusGained

    private void txtageFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtageFocusLost
        if ( txtage.getText().equals("")){
            txtage.setText("숫자 입력");
            txtage.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtageFocusLost

    private void txtdayFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdayFocusGained
        if ( txtday.getText().equals("화~일요일 기입 ex) 화")){
            txtday.setText("");
            txtday.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtdayFocusGained

    private void txtdayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdayFocusLost
        if ( txtday.getText().equals("")){
            txtday.setText("화~일요일 기입 ex) 화");
            txtday.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtdayFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String moviename = txtname.getText();
        String movietime = txttime.getText();
        String moviedir = txtdir.getText();
        String movieprice = txtprice.getText();
        String movieage = txtage.getText();
        String movieday = txtday.getText();

        if(moviename.trim().length() == 0 || movietime.equals("ex) 14:00~16:00") 
                || moviedir.trim().length() == 0|| movieprice.equals("숫자 입력")
                || movieage.equals("숫자 입력")|| movieday.equals("화~일요일 기입 ex) 화")){
            JOptionPane.showMessageDialog(null,"모든 사항을 기입해주세요.");
        }
        else{
            if(ismovie(moviename, movietime, movieday) == 1){
                JOptionPane.showMessageDialog(null,"중복된 영화가 있습니다.");
            }
            else if(ismovie(moviename, movietime, movieday) == -1){
                String id = String.valueOf(getnext());
                insertmovie(id, moviename, movietime, moviedir, movieprice, movieage, movieday);
                JOptionPane.showMessageDialog(null,"영화 추가 완료!!");
                Main main = new Main();
                main.setVisible(true);
                setVisible(false);
            }
        }
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        Main main = new Main();
        members.logout();
        setVisible(false);
        main.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked
    private int ismovie(String moviename, String movietime, String movieday){
        String SQL = "select * from movie where moviename = ? and movietime = ? and movieday = ?";
        try{
            db.pstmt = db.conn.prepareStatement(SQL);
            db.pstmt.setString(1, moviename);
            db.pstmt.setString(2, movietime);
            db.pstmt.setString(3, movieday);
            db.rs = db.pstmt.executeQuery();
            if(db.rs.next()){
                return 1;  // 중복된 영화가 있을경우
            }
            return -1;   // 중복 영화 x 경우
        }catch (Exception e) {
                    System.out.println("SQLException : " + e.getMessage());
        }return -2;  // DB오류
    }
    private int getnext(){
        String SQL = "select max(to_number(movieid)) from movie group by 1";
        try{
            db.pstmt = db.conn.prepareStatement(SQL);
            db.rs = db.pstmt.executeQuery();
            if(db.rs.next()){
                return db.rs.getInt(1) + 1;
            }
            return 1; // 아무 영화 없을경우
            
        }catch (Exception e) {
                    System.out.println("SQLException : " + e.getMessage());
        }return -2;  // DB오류
    }
    private void insertmovie(String id, String moviename, String movietime, String moviedir, String movieprice, String movieage, String movieday){
        int price = Integer.parseInt(movieprice);
        int age = Integer.parseInt(movieage);
        int a = 9;
        String SQL = "insert into movie values(?,?,?,?,?,?,?,?)";
        try{
            db.pstmt = db.conn.prepareStatement(SQL);
            db.pstmt.setString(1, id);
            db.pstmt.setString(2, moviename);
            db.pstmt.setString(3, movietime);
            db.pstmt.setString(4, moviedir);
            db.pstmt.setInt(5, price);
            db.pstmt.setInt(6, a);
            db.pstmt.setInt(7, age);
            db.pstmt.setString(8, movieday);
            db.pstmt.executeUpdate();
        }catch (Exception e) {
                    System.out.println("SQLException : " + e.getMessage());
        }
    }
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
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtday;
    private javax.swing.JTextField txtdir;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txttime;
    // End of variables declaration//GEN-END:variables
}
