package final_exam;

import java.awt.*;
import com.borland.jbcl.layout.*;
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

public class HuaRongRoad2 extends JFrame implements MouseListener{
  JButton restart = new JButton();
  Character button[]=new Character[10];
  JLabel jLabel_text = new JLabel();
  JLabel jLabel_num = new JLabel();
  JLabel exitplace = new JLabel();
  int movenum;
  JLabel jLabel1 = new JLabel();
  JButton back = new JButton();
  JLabel text = new JLabel();
  JLabel lastmove = new JLabel();

  public HuaRongRoad2() {
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
  public static void main(String[] args) {//主函数，用于创建Frame
    HuaRongRoad2 huarongroad = new HuaRongRoad2();
  }
  private void jbInit() throws Exception {
    initCharacher();
    movenum=0;

    this.setVisible(true);//可见性
    this.setSize(new Dimension(700, 830));//大小
    this.setLocation(700,70);//确定位置

    restart.setBounds(new Rectangle(236, 707, 100, 29));
    restart.setText("重新开始");
    restart.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        restart_actionPerformed(e);
      }
    });//初始化函数
    this.getContentPane().setBackground(Color.white);//背景颜色
    this.setDefaultCloseOperation(3);//关闭按钮选项
    this.setTitle("华容道游戏");//标题
    this.getContentPane().setLayout(null);//布局器
    jLabel_text.setText("步数:");
    jLabel_text.setBounds(new Rectangle(142, 709, 108, 27));
    jLabel_num.setText("0");
    jLabel_num.setBounds(new Rectangle(186, 709, 96, 27));
    exitplace.setText("这是出口");
    exitplace.setBounds(new Rectangle(280, 610, 81, 30));
    jLabel1.setText("点击你要移动的人物实现移动，方向由点击位置决定");
    jLabel1.setBounds(new Rectangle(55, 54, 352, 31));
    back.setBounds(new Rectangle(361, 708, 120, 30));
    back.setText("返回上一层");
    back.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        back_actionPerformed(e);
      }
    });
    text.setText("你上一步走的是：");
    text.setBounds(new Rectangle(148, 753, 153, 26));
    lastmove.setBounds(new Rectangle(265, 754, 132, 25));
    this.getContentPane().add(restart, null);
    this.getContentPane().add(jLabel_text, null);
    this.getContentPane().add(jLabel_num, null);
    this.getContentPane().add(restart, null);
    this.getContentPane().add(jLabel_text, null);
    this.getContentPane().add(jLabel_num, null);
    this.getContentPane().add(restart, null);
    this.getContentPane().add(jLabel_text, null);
    this.getContentPane().add(jLabel_num, null);
    this.getContentPane().add(restart, null);
    this.getContentPane().add(jLabel_text, null);
    this.getContentPane().add(jLabel_num, null);
    this.getContentPane().add(exitplace, null);
    this.getContentPane().add(lastmove, null);
    this.getContentPane().add(text, null);

    restart.setFont(new Font("楷体",Font.PLAIN, 16));
    jLabel_num.setFont(new Font("楷体",Font.PLAIN, 16));
    jLabel_text.setFont(new Font("楷体",Font.PLAIN, 16));
    exitplace.setFont(new Font("楷体",Font.PLAIN, 16));
    back.setFont(new Font("楷体",Font.PLAIN, 16));
    text.setFont(new Font("楷体",Font.PLAIN, 16));
    lastmove.setFont(new Font("楷体",Font.PLAIN, 16));

  }

  void initCharacher(){
    String[] name = { "曹操", "关羽", "马超", "黄忠", "张飞", "赵云", "兵", "兵", "兵", "兵" };
    for(int i=0;i<10;i++)
    {
      button[i]=new Character(i,name[i]);//为每个按钮加上名字
      button[i].addMouseListener(this);//添加鼠标监听
      this.getContentPane().add(button[i]);//把button添加到面板上
      button[i].setText(name[i]);//显示名字
    }
    button[0].setBounds(200,100,200,200);//确定位置和大小
    button[1].setBounds(200,400,200,100);
    button[2].setBounds(100,400,100,200);
    button[3].setBounds(400,400,100,200);
    button[4].setBounds(100,100,100,200);
    button[5].setBounds(400,100,100,200);
    button[6].setBounds(100,300,100,100);
    button[7].setBounds(400,300,100,100);
    button[8].setBounds(200,300,100,100);
    button[9].setBounds(300,300,100,100);

    this.getContentPane().add(restart, null);
    this.getContentPane().add(jLabel_text, null);
    this.getContentPane().add(jLabel_num, null);
    this.getContentPane().add(jLabel1, null);
    this.getContentPane().add(restart, null);
    this.getContentPane().add(back, null);
    this.getContentPane().add(text, null);

  }


 public void mouseClicked(MouseEvent e) {
      //需要同时考虑四个方向，可能出现既能左移又能右移的状况，所以必须通过鼠标点击的位置判断
      //同时，因为左右移动和上下移动是没有优先级的，故而要同时考虑
    Character nowbutton=(Character)e.getSource();//获取被press的按钮

    int xx=e.getX();//返回事件相对于源组件的水平 x 坐标
    int yy=e.getY();//返回事件相对于源组件的y
    int w=nowbutton.getBounds().width;//button的宽
    int h=nowbutton.getBounds().height;//button的高
    int flag=0;

    if(xx<w/2)//点击目标的左侧，左移
    {
      flag=move(nowbutton,2);
    }
    if(xx>w/2)//右移
    {
      flag=move(nowbutton,3);
    }
    if(yy<h/2&&flag==0)//下移
    {
      move(nowbutton,1);
    }
    if(yy>h/2&&flag==0)//上移
    {
      move(nowbutton,0);
    }
  }
  int move(Character nowbutton,int place)//此处做一个简单的约定，place=0为上移，1为下，2为左，3为右
  {
    int x=nowbutton.getBounds().x;//button的x
    int y=nowbutton.getBounds().y;//button的y
    Rectangle nowplace=nowbutton.getBounds();//当前button的矩形信息

    //dx和dy是对应的上下左右的x和y值变化的大小
    int dx[]={0,0,-100,100};
    int dy[]={100,-100,0,0};
    x+=dx[place];
    y+=dy[place];
    nowplace.setLocation(x,y);//要更改到的位置

    if((x+nowbutton.getBounds().width)>500||x<100||y<100||(y+nowbutton.getBounds().height)>600)//超出运行范围,将不执行移动
     return 0;
    for(int i=0;i<10;i++)
    {
      if(nowbutton.number!=i)
      {
        if(nowplace.intersects(button[i].getBounds()))//会和现有button重叠,将不执行移动；intersects函数返回两个rectangle相交的部分
          return 0;
      }
    }

    //可以执行移动
    movenum++;
    jLabel_num.setText(Integer.toString(movenum));//改变步数显示
    lastmove.setText(nowbutton.getName());
    nowbutton.setLocation(x,y);

    if(button[0].getLocation().equals(new Point(200,400)) )//曹操到了出口
      winning();

    return 1;

  }

  void restart_actionPerformed(ActionEvent e) {//点击重新开始
    HuaRongRoad2 huarong=new HuaRongRoad2();//重新建立一次
    this.dispose();
  }
  void winning()
  {
    Winning winning = new Winning();
    winning.setSize(400,300);
    winning.setVisible(true);
  }

  public void mouseReleased(MouseEvent e) {}
  public void mouseEntered(MouseEvent e) {}
  public void mouseExited(MouseEvent e) {}
  public void mousePressed(MouseEvent e) {}

  void back_actionPerformed(ActionEvent e) {
    Start start = new Start();
    this.dispose();
  }


}