package final_exam;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//�����ݵ����治ͬ��ɫ��button������,button���Դ����֡���ɫ�ȱ���
//����FocusListener��Ϊ����ÿ��button/����������focus����Ҫ������ɫ�����Ե�����Character��������
class Character extends JButton implements FocusListener{
  int number;
  Color before;

  Character(int n,String s){
      setName(s);
      number=n;
      before=this.getBackground();
      setFont(new Font("����",Font.PLAIN, 26));
      addFocusListener(this);//��ӽ������
  }
  public void focusGained(final FocusEvent e){
      setBackground(Color.pink);
      //��ü����͸ı���ɫ
  }
  public void focusLost(final FocusEvent e){
      setBackground(before);
      //ʧȥ����������ɫ�Ļ�ȥ
  }
}