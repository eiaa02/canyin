//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package 餐饮管理系统;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Land {
    private JFrame jf;
    private JPanel jp1;
    private JPanel jp3;
    private JPanel jp4;
    private JTextField jtf1;
    private JPasswordField jpf1;
    private JLabel jl1;
    private JLabel jl2;
    private JButton jb1;
    private JButton jb2;

    public Land() {
    }

    public void init() {
        this.jf = new JFrame("登陆");
        this.jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        this.jp3 = new JPanel();
        this.jp4 = new JPanel();
        this.jtf1 = new JTextField(15);
        this.jpf1 = new JPasswordField(15);
        this.jpf1.setEchoChar('*');
        this.jl1 = new JLabel("用户");
        this.jl2 = new JLabel("密码");
        this.jb1 = new JButton("登陆");
        this.jb2 = new JButton("重置");
        this.jf.setLayout(new GridLayout(3, 1));
        this.jf.add(jp2);
        this.jf.add(this.jp3);
        this.jf.add(this.jp4);
        jp2.add(this.jl1);
        jp2.add(this.jtf1);
        this.jp3.add(this.jl2);
        this.jp3.add(this.jpf1);
        this.jp4.add(this.jb1);
        this.jp4.add(this.jb2);
        this.jb1.addActionListener(new ButtonListener());
        this.jb2.addActionListener(new ButtonListener());
        this.jf.pack();
        this.jf.setLocation(400, 300);
        this.jf.setLocationRelativeTo((Component) null);
        this.jf.setVisible(true);
        this.jf.setAlwaysOnTop(false);
    }

    public static void showMessageDialog(Component parentComponent, Object message, String title, int messageType, Icon icon) {
    }

    public static void main(String[] args) {
        (new Land()).init();
    }

    private class ButtonListener implements ActionListener {
        private ButtonListener() {
        }

        public void actionPerformed(ActionEvent event) {
            String command = event.getActionCommand();
            if ("登陆".equals(command) && Land.this.jtf1.getText().equals("123") && Land.this.jpf1.getText().equals("123")) {
                (new System()).init(Land.this.jtf1.getText());
                Land.this.jf.setVisible(false);
            } else if ("登陆".equals(command) && Land.this.jtf1.getText().equals("") && Land.this.jpf1.getText().equals("")) {
                JOptionPane.showMessageDialog((Component) null, "请输入用户名和密码", "提示", 1);
            } else if ("重置".equals(command)) {
                Land.this.jtf1.setText("");
                Land.this.jpf1.setText("");
            } else {
                JOptionPane.showMessageDialog((Component) null, "用户名或密码错误！", "错误 ", 0);
                Land.this.jtf1.setText("");
                Land.this.jpf1.setText("");
            }

        }
    }
}