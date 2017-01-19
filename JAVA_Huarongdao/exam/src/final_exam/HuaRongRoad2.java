package final_exam;

import java.awt.*;
import com.borland.jbcl.layout.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * <p>Title: final exam</p>
 * <p>Description: ���ݵ�</p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company: BNU</p>
 * @author �쾲��
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
  public static void main(String[] args) {//�����������ڴ���Frame
    HuaRongRoad2 huarongroad = new HuaRongRoad2();
  }
  private void jbInit() throws Exception {
    initCharacher();
    movenum=0;

    this.setVisible(true);//�ɼ���
    this.setSize(new Dimension(700, 830));//��С
    this.setLocation(700,70);//ȷ��λ��

    restart.setBounds(new Rectangle(236, 707, 100, 29));
    restart.setText("���¿�ʼ");
    restart.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        restart_actionPerformed(e);
      }
    });//��ʼ������
    this.getContentPane().setBackground(Color.white);//������ɫ
    this.setDefaultCloseOperation(3);//�رհ�ťѡ��
    this.setTitle("���ݵ���Ϸ");//����
    this.getContentPane().setLayout(null);//������
    jLabel_text.setText("����:");
    jLabel_text.setBounds(new Rectangle(142, 709, 108, 27));
    jLabel_num.setText("0");
    jLabel_num.setBounds(new Rectangle(186, 709, 96, 27));
    exitplace.setText("���ǳ���");
    exitplace.setBounds(new Rectangle(280, 610, 81, 30));
    jLabel1.setText("�����Ҫ�ƶ�������ʵ���ƶ��������ɵ��λ�þ���");
    jLabel1.setBounds(new Rectangle(55, 54, 352, 31));
    back.setBounds(new Rectangle(361, 708, 120, 30));
    back.setText("������һ��");
    back.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        back_actionPerformed(e);
      }
    });
    text.setText("����һ���ߵ��ǣ�");
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

    restart.setFont(new Font("����",Font.PLAIN, 16));
    jLabel_num.setFont(new Font("����",Font.PLAIN, 16));
    jLabel_text.setFont(new Font("����",Font.PLAIN, 16));
    exitplace.setFont(new Font("����",Font.PLAIN, 16));
    back.setFont(new Font("����",Font.PLAIN, 16));
    text.setFont(new Font("����",Font.PLAIN, 16));
    lastmove.setFont(new Font("����",Font.PLAIN, 16));

  }

  void initCharacher(){
    String[] name = { "�ܲ�", "����", "����", "����", "�ŷ�", "����", "��", "��", "��", "��" };
    for(int i=0;i<10;i++)
    {
      button[i]=new Character(i,name[i]);//Ϊÿ����ť��������
      button[i].addMouseListener(this);//����������
      this.getContentPane().add(button[i]);//��button���ӵ������
      button[i].setText(name[i]);//��ʾ����
    }
    button[0].setBounds(200,100,200,200);//ȷ��λ�úʹ�С
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
      //��Ҫͬʱ�����ĸ����򣬿��ܳ��ּ��������������Ƶ�״�������Ա���ͨ���������λ���ж�
      //ͬʱ����Ϊ�����ƶ��������ƶ���û�����ȼ��ģ��ʶ�Ҫͬʱ����
    Character nowbutton=(Character)e.getSource();//��ȡ��press�İ�ť

    int xx=e.getX();//�����¼������Դ�����ˮƽ x ����
    int yy=e.getY();//�����¼������Դ�����y
    int w=nowbutton.getBounds().width;//button�Ŀ�
    int h=nowbutton.getBounds().height;//button�ĸ�
    int flag=0;

    if(xx<w/2)//���Ŀ�����࣬����
    {
      flag=move(nowbutton,2);
    }
    if(xx>w/2)//����
    {
      flag=move(nowbutton,3);
    }
    if(yy<h/2&&flag==0)//����
    {
      move(nowbutton,1);
    }
    if(yy>h/2&&flag==0)//����
    {
      move(nowbutton,0);
    }
  }
  int move(Character nowbutton,int place)//�˴���һ���򵥵�Լ����place=0Ϊ���ƣ�1Ϊ�£�2Ϊ��3Ϊ��
  {
    int x=nowbutton.getBounds().x;//button��x
    int y=nowbutton.getBounds().y;//button��y
    Rectangle nowplace=nowbutton.getBounds();//��ǰbutton�ľ�����Ϣ

    //dx��dy�Ƕ�Ӧ���������ҵ�x��yֵ�仯�Ĵ�С
    int dx[]={0,0,-100,100};
    int dy[]={100,-100,0,0};
    x+=dx[place];
    y+=dy[place];
    nowplace.setLocation(x,y);//Ҫ���ĵ���λ��

    if((x+nowbutton.getBounds().width)>500||x<100||y<100||(y+nowbutton.getBounds().height)>600)//�������з�Χ,����ִ���ƶ�
     return 0;
    for(int i=0;i<10;i++)
    {
      if(nowbutton.number!=i)
      {
        if(nowplace.intersects(button[i].getBounds()))//�������button�ص�,����ִ���ƶ���intersects������������rectangle�ཻ�Ĳ���
          return 0;
      }
    }

    //����ִ���ƶ�
    movenum++;
    jLabel_num.setText(Integer.toString(movenum));//�ı䲽����ʾ
    lastmove.setText(nowbutton.getName());
    nowbutton.setLocation(x,y);

    if(button[0].getLocation().equals(new Point(200,400)) )//�ܲٵ��˳���
      winning();

    return 1;

  }

  void restart_actionPerformed(ActionEvent e) {//������¿�ʼ
    HuaRongRoad2 huarong=new HuaRongRoad2();//���½���һ��
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