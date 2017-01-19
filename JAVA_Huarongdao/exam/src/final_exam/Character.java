package final_exam;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//代表华容道里面不同角色（button）的类,button中自带名字、颜色等变量
//关于FocusListener因为不是每个button/其他东西被focus都需要更改颜色，所以单独在Character里面设置
class Character extends JButton implements FocusListener{
  int number;
  Color before;

  Character(int n,String s){
      setName(s);
      number=n;
      before=this.getBackground();
      setFont(new Font("隶书",Font.PLAIN, 26));
      addFocusListener(this);//添加焦点监听
  }
  public void focusGained(final FocusEvent e){
      setBackground(Color.pink);
      //获得监听就改变颜色
  }
  public void focusLost(final FocusEvent e){
      setBackground(before);
      //失去监听，把颜色改回去
  }
}