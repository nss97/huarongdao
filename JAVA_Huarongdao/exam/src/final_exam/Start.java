package final_exam;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * <p>Title: final exam</p>
 * <p>Description: 华容道</p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company: BNU</p>
 * @author 徐静乐
 * @version 1.0
 */

public class Start extends JFrame {
  JButton jButton1 = new JButton();
  JLabel jLabel1 = new JLabel();
  JButton jButton2 = new JButton();
  JButton jButton3 = new JButton();
  JButton jButton4 = new JButton();

  public Start() {
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
  public static void main(String[] args) {
    Start start = new Start();
  }
  private void jbInit() throws Exception {
    this.setLocation(800,300);//确定位置
    this.setSize(380,500);//大小
    this.setVisible(true);//可见性
    jButton1.setBounds(new Rectangle(100, 80, 160, 40));
    jButton1.setText("示范");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton1_actionPerformed(e);
      }
    });
    this.getContentPane().setBackground(Color.white);
    this.setDefaultCloseOperation(3);
    this.getContentPane().setLayout(null);
    jLabel1.setText("欢迎你来到华容道游戏 by XJL");
    jLabel1.setBounds(new Rectangle(43, 6, 303, 60));
    jButton2.setBounds(new Rectangle(100, 160, 160, 40));
    jButton2.setText("一般模式1");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton2_actionPerformed(e);
      }
    });
    jButton3.setBounds(new Rectangle(100, 240, 160, 40));
    jButton3.setText("一般模式2");
    jButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton3_actionPerformed(e);
      }
    });
    jButton4.setBounds(new Rectangle(100, 320, 160, 40));
    jButton4.setText("简单模式");
    jButton4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton4_actionPerformed(e);
      }
    });
    this.getContentPane().add(jButton1, null);
    this.getContentPane().add(jButton2, null);
    this.getContentPane().add(jButton3, null);
    this.getContentPane().add(jButton4, null);
    this.getContentPane().add(jLabel1, null);


    jLabel1.setFont(new Font("楷体",Font.PLAIN, 20));
    jButton1.setFont(new Font("隶书",Font.PLAIN, 18));
    jButton2.setFont(new Font("隶书",Font.PLAIN, 18));
    jButton3.setFont(new Font("隶书",Font.PLAIN, 18));
    jButton4.setFont(new Font("隶书",Font.PLAIN, 18));
  }

  void jButton1_actionPerformed(ActionEvent e) {
    Rules rules = new Rules();
  }

  void jButton2_actionPerformed(ActionEvent e) {
    HuaRongRoad huarong=new HuaRongRoad();
    this.dispose();
  }

  void jButton3_actionPerformed(ActionEvent e) {
    HuaRongRoad2 huarong=new HuaRongRoad2();
    this.dispose();
  }

  void jButton4_actionPerformed(ActionEvent e) {
    HuaRongRoad3 huarong=new HuaRongRoad3();
    this.dispose();
  }
}