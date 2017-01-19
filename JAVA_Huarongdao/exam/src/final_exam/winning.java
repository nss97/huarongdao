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

public class Winning extends JFrame {
  JLabel jLabel1 = new JLabel();
  JToggleButton jToggleButton1 = new JToggleButton();

  public Winning() {
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
  public static void main(String[] args) {
    Winning winning = new Winning();


  }
  private void jbInit() throws Exception {
    this.setSize(400,300);
    this.setLocation(800,300);//确定位置
    this.setVisible(true);

    jLabel1.setText("恭喜你获得胜利！！！");
    jLabel1.setFont(new Font("楷体",Font.PLAIN, 22));
    jLabel1.setBounds(new Rectangle(107, 61, 226, 104));
    this.getContentPane().setBackground(Color.white);
    this.setDefaultCloseOperation(3);
    this.getContentPane().setLayout(null);
    jToggleButton1.setText("退出游戏");
    jToggleButton1.setBounds(new Rectangle(117, 167, 136, 37));
    jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jToggleButton1_actionPerformed(e);
      }
    });
    this.getContentPane().add(jToggleButton1, null);
    this.getContentPane().add(jLabel1, null);
  }

  void jToggleButton1_actionPerformed(ActionEvent e) {
    System.exit(0);
  }
}