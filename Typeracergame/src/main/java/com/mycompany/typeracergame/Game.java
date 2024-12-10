package com.mycompany.typeracergame;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors; 
import java.util.stream.Stream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author hcosm
 */
public class Game extends javax.swing.JFrame {

    /**
     * Creates new form Game
     */
    public Game() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setText("textul de citit jLabel1");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jToggleButton1.setText("English");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("jLabel3");
        jLabel3.setMaximumSize(new java.awt.Dimension(36, 17));
        jLabel3.setMinimumSize(new java.awt.Dimension(36, 17));
        jLabel3.setPreferredSize(new java.awt.Dimension(36, 17));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(702, 702, 702)
                        .addComponent(jToggleButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String text1;//textul intreg
    String text2;
    String terminat;
    long startTime = 0;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      startTime = System.currentTimeMillis();


        jLabel3.setFont(new Font("Didot", Font.PLAIN, 24));

        if (iterator % 2 == 0) {
            //engleza
            text1 = chooser().substring(0, chooser().length()/2);
            text2 = chooser().substring(chooser().length()/2);
        //    jLabel1.setText(chooser2());

        } else {
            text1 = chooser().substring(0, chooser().length()/2);
             text2 = chooser().substring(chooser().length()/2);
            //jLabel1.setText(chooser());

        }
        textiterator=0;
          jLabel3.setText("<html>"+"<font color='green'>"+text1.charAt(0)+"</font>"+"</font>"+"<font color='white'>"+text1.substring(1,text1.length())+"</font>"+"</html>");
          jLabel1.setText("<html>"+"<font color='green'>"+text2.charAt(0)+"</font>"+"</font>"+"<font color='white'>"+text2.substring(1,text2.length())+"</font>"+"</html>");
     
              
  
    }//GEN-LAST:event_jButton1ActionPerformed
    int iterator = 0;
    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        iterator++;
        if (iterator % 2 == 0) {
            jToggleButton1.setText("English");
        } else {
            jToggleButton1.setText("Romana");
        }
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    int textiterator=0;
    int textiteratorswitch=0;
    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
     
 if ((textiterator) != text1.length()) {
// "<html>H<font color='red'>e</font>llo World!</html>"
if( textiterator<text1.length()){
        if(textiterator>0)
             jLabel3.setText("<html>"/**/+"<font color='white'>"+text1.substring(0,textiterator)+"</font>"+"<font color='green'>"+text1.charAt(textiterator)+"</font>"+"<font color='white'>"+text1.substring(textiterator+1,text1.length())+"</font>"+"</html>");
        
        
             
      if(!(text1.charAt(textiterator)==evt.getKeyChar()&&(text1.length()!=0)))
      {

                 if(textiterator>0)
                     jLabel3.setText("<html>"+"<font color='white'>"+text1.substring(0,textiterator)+"</font>"+"<font color='red'>"+text1.charAt(textiterator)+"</font>"+"</font>"+"<font color='white'>"+text1.substring(textiterator+1,text1.length())+"</font>"+"</html>");
      }
      else
      {
       textiterator++;
      }
 }
 
 
 
 
 
      String textC=text1+text2;
 if ((textiterator) != textC.length()) {
// "<html>H<font color='red'>e</font>llo World!</html>"
if(textiterator>text1.length()){
        if(textiterator>0)
             jLabel1.setText("<html>"/**/+"<font color='white'>"+text2.substring(0,textiterator-text1.length())+"</font>"+"<font color='green'>"+text2.charAt(textiterator)+"</font>"+"<font color='white'>"+text2.substring(textiterator+1-text1.length(),textC.length()-text1.length())+"</font>"+"</html>");
        
        
             
      if(!(text2.charAt(textiterator-text1.length())==evt.getKeyChar()&&(text2.length()!=0)))
      {

                 if(textiterator>0)
                     jLabel1.setText("<html>"+"<font color='white'>"+text2.substring(0,textiterator-text1.length())+"</font>"+"<font color='red'>"+text2.charAt(textiterator-text1.length())+"</font>"+"</font>"+"<font color='white'>"+text2.substring(textiterator+1-text1.length(),textC.length()-text1.length())+"</font>"+"</html>");
      }
      else
      {
       textiterator++;
      }
 }
 }
 else
 {    long elapsedTime = System.currentTimeMillis() - startTime;
            long elapsedSeconds = elapsedTime / 1000;
            long secondsDisplay = elapsedSeconds % 60;
            long elapsedMinutes = elapsedSeconds / 60;
            //
            jLabel1.setText("End" + " Time: " + secondsDisplay + "s");
            jLabel1.setForeground(Color.red);
 }
 }
      // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    private String chooser() {

String finalstring="";
        File file = new File("textfile1.txt");

{ String filePath = "textfile1.txt"; // Replace with the path to your file 
try (Stream<String> lines = Files.lines(Paths.get(filePath))) { 
    List<String> randomLines = lines .skip((int) (Math.random() * 10)) // Skip a random number of lines 
        .limit(2) // Limit to 3 lines
        .collect(Collectors.toList());
for (String line : randomLines) {
        finalstring+=line+" ";
    }   
}
         catch (IOException e) {
            System.err.println("Error reading purchases.txt: " + e.getMessage());
            return "";
        }
}
return finalstring;
    }

    private String chooser2() {
String finalstring="";
        File file = new File("textfile2.txt");

{ String filePath = "textfile2.txt"; // Replace with the path to your file 
try (Stream<String> lines = Files.lines(Paths.get(filePath))) { 
    List<String> randomLines = lines 
            .skip((int) (Math.random() * 10)) // Skip a random number of lines 
        .limit(2) // Limit to 5 lines
        .collect(Collectors.toList());
for (String line : randomLines) {
        finalstring+=line+" ";
    }   
}
         catch (IOException e) {
            System.err.println("Error reading purchases.txt: " + e.getMessage());
            return "";
        }
    //
}

return finalstring;

}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
