package final_exam;

import java.awt.*;
import javax.swing.*;

/**
 * <p>Title: final exam</p>
 * <p>Description: 华容道</p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company: BNU</p>
 * @author 徐静乐
 * @version 1.0
 */

public class Rules extends JFrame {
  Image img;
  JLabel jLabel1 = new JLabel();

  public Rules() {
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
  public static void main(String[] args) {
    Rules rules = new Rules();
  }
  private void jbInit() throws Exception {
    this.setLocation(850,350);
    this.setSize(300,450);//大小
    this.setVisible(true);//可见性
    this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    this.getContentPane().setLayout(null);
    img=getToolkit().getImage("1.gif");
    this.getContentPane().add(jLabel1, null);
  }
  public void paint(Graphics g){
  int w=img.getWidth(this);
  int h=img.getHeight(this);
  g.drawImage(img,30,100,this);
  }
}