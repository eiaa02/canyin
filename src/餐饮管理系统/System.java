//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package 餐饮管理系统;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.Dialog.ModalityType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class System implements ActionListener {
    JMenuBar jm1 = new JMenuBar();
    private JLabel jl1;
    private JButton jb1;
    private JButton jb2;
    private JButton jb3;
    private JButton jb4;
    private JButton jb5;
    private JPanel jp1;
    private JTabbedPane jtp2;
    private JPanel jp8;
    private JButton jb6;
    private JButton jb7;
    private JButton jb8;
    private JButton jb9;
    private JButton jb10;
    private JButton jb11;
    private JPanel jp9;
    private JComboBox jcb11;
    private JLabel jl20;
    private JLabel jl21;
    private JLabel jl22;
    private JTextField jtf2;
    private JTable jt;
    private JScrollPane jsp;
    String[] jg = new String[]{"桌1", "桌2", "桌3", "桌4", "桌5", "桌6"};
    private DefaultTableModel model;
    private Vector data;
    private Vector names;
    private JTabbedPane jtp;
    private ImageIcon img;
    private JPanel jp2;
    private JPanel jp3;
    private JPanel jp4;
    private JPanel jp5;
    private JPanel jp6;
    private JPanel jp7;
    private JLabel jl2;
    private JLabel jl3;
    private JLabel jl4;
    private JLabel jl5;
    private JLabel jl6;
    private JLabel jl7;
    private JLabel jl8;
    private JLabel jl9;
    private JLabel jl10;
    private JLabel jl11;
    private JLabel jl12;
    private JLabel jl13;
    private JLabel jl14;
    private JLabel jl15;
    private JLabel jl16;
    private JLabel jl17;
    private JLabel jl18;
    private JLabel jl19;
    private JCheckBox jcb1;
    private JCheckBox jcb2;
    private JCheckBox jcb3;
    private JCheckBox jcb4;
    private JCheckBox jcb5;
    private JCheckBox jcb6;
    private JCheckBox jcb7;
    private JCheckBox jcb8;
    private JCheckBox jcb9;
    boolean B = true;
    BufferedWriter out;
    JFrame jf;

    public System() {
    }

    public void init(String username) {
        this.jl1 = new JLabel("*****科大餐厅欢迎您*****", 0);
        this.jl1.setOpaque(true);
        this.jl1.setBackground(Color.pink);
        Font f = new Font("楷体", 0, 45);
        this.jl1.setFont(f);
        this.jl1.setForeground(Color.BLUE);
        JMenu menu1 = new JMenu("系统设置");
        this.jm1.add(menu1);
        JMenu menu2 = new JMenu("餐厅名称字体");
        JMenu menu3 = new JMenu("餐厅名称颜色");
        JMenuItem item9 = new JMenuItem("退出登录");
        menu1.add(menu2);
        menu1.add(menu3);
        menu1.addSeparator();
        menu1.add(item9);
        item9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int i = JOptionPane.showConfirmDialog((Component) null, "是否真的退出登录", "退出登录", 0);
                if (i == 0) {
                    System.this.jf.setVisible(false);
                    (new Land()).init();
                }

            }
        });
        JMenuItem item1 = new JMenuItem("楷体");
        JMenuItem item2 = new JMenuItem("宋体");
        JMenuItem item3 = new JMenuItem("黑体");
        JMenuItem item4 = new JMenuItem("正文");
        menu2.add(item1);
        menu2.add(item2);
        menu2.add(item3);
        menu2.add(item4);
        item1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Font f = new Font("楷体", 0, 45);
                System.this.jl1.setFont(f);
            }
        });
        item2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Font f = new Font("宋体", 0, 45);
                System.this.jl1.setFont(f);
            }
        });
        item3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Font f = new Font("黑体", 0, 45);
                System.this.jl1.setFont(f);
            }
        });
        item4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Font f = new Font("正文", 0, 45);
                System.this.jl1.setFont(f);
            }
        });
        JMenuItem item5 = new JMenuItem("蓝色");
        JMenuItem item6 = new JMenuItem("红色");
        JMenuItem item7 = new JMenuItem("黑色");
        JMenuItem item8 = new JMenuItem("绿色");
        menu3.add(item5);
        menu3.add(item6);
        menu3.add(item7);
        menu3.add(item8);
        item5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.this.jl1.setForeground(Color.BLUE);
            }
        });
        item6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.this.jl1.setForeground(Color.RED);
            }
        });
        item7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.this.jl1.setForeground(Color.BLACK);
            }
        });
        item8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.this.jl1.setForeground(Color.green);
            }
        });
        this.jp1 = new JPanel();
        this.jb1 = new JButton("取消");
        this.jb2 = new JButton("下单");
        this.jb3 = new JButton("加单");
        this.jb4 = new JButton("结账");
        this.jtp2 = new JTabbedPane();
        this.jp8 = new JPanel();
        this.jb6 = new JButton("热销菜式");
        this.jb7 = new JButton("小炒类");
        this.jb8 = new JButton("蔬菜类");
        this.jb9 = new JButton("主食类");
        this.jb10 = new JButton("甜品类");
        this.jb11 = new JButton("饮品类");
        this.jp9 = new JPanel();
        this.jl20 = new JLabel("请选择桌号：");
        this.jcb11 = new JComboBox(this.jg);
        this.jl21 = new JLabel("请输入用餐人数：");
        this.jtf2 = new JTextField();
        this.jl22 = new JLabel("已点菜式列表：");
        this.model = new DefaultTableModel();
        this.data = new Vector();
        this.names = new Vector();
        this.names.add("菜名");
        this.names.add("价格（元）");
        this.model.setDataVector(this.data, this.names);
        this.jt = new JTable(this.model);
        this.jsp = new JScrollPane(this.jt);
        this.jtp = new JTabbedPane();
        this.img = new ImageIcon("主食类//红烧肉.jpg");
        this.jl2 = new JLabel(this.img);
        this.img = new ImageIcon("主食类//红烧猪蹄.jpg");
        this.jl3 = new JLabel(this.img);
        this.img = new ImageIcon("主食类//家常炒面.jpg");
        this.jl4 = new JLabel(this.img);
        this.img = new ImageIcon("小炒类//家常小炒.jpg");
        this.jl5 = new JLabel(this.img);
        this.img = new ImageIcon("小炒类//木须肉.jpg");
        this.jl6 = new JLabel(this.img);
        this.img = new ImageIcon("小炒类//小炒圆白菜.jpg");
        this.jl7 = new JLabel(this.img);
        this.img = new ImageIcon("蔬菜类//苦瓜炒蛋.jpg");
        this.jl8 = new JLabel(this.img);
        this.img = new ImageIcon("蔬菜类//炒四季豆.jpg");
        this.jl9 = new JLabel(this.img);
        this.img = new ImageIcon("蔬菜类//凉拌土豆丝.jpg");
        this.jl10 = new JLabel(this.img);
        this.jl11 = new JLabel("39", 0);
        this.jl12 = new JLabel("39", 0);
        this.jl13 = new JLabel("39", 0);
        this.jl14 = new JLabel("28", 0);
        this.jl15 = new JLabel("28", 0);
        this.jl16 = new JLabel("28", 0);
        this.jl17 = new JLabel("18", 0);
        this.jl18 = new JLabel("18", 0);
        this.jl19 = new JLabel("18", 0);
        this.jcb1 = new JCheckBox("红烧肉");
        this.jcb2 = new JCheckBox("红烧猪蹄");
        this.jcb3 = new JCheckBox("家常炒面");
        this.jcb4 = new JCheckBox("家常小炒");
        this.jcb5 = new JCheckBox("木须肉");
        this.jcb6 = new JCheckBox("小炒圆白菜");
        this.jcb7 = new JCheckBox("苦瓜炒蛋");
        this.jcb8 = new JCheckBox("炒四季豆");
        this.jcb9 = new JCheckBox("凉拌土豆丝");
        this.jp2 = new JPanel();
        this.jp3 = new JPanel();
        this.jp4 = new JPanel();
        this.jp5 = new JPanel();
        this.jp6 = new JPanel();
        this.jp7 = new JPanel();
        this.jtp.add("热销菜式", this.jp2);
        this.jtp.add("小炒类", this.jp3);
        this.jtp.add("蔬菜类", this.jp4);
        this.jtp.add("主食类", this.jp5);
        this.jtp.add("甜品类", this.jp6);
        this.jtp.add("饮品类", this.jp7);
        this.jtp2.add("菜式导航", this.jp8);
        this.jp2.setLayout(new GridLayout(9, 3));
        this.jp3.setLayout(new GridLayout(9, 3));
        this.jp4.setLayout(new GridLayout(9, 3));
        this.jp5.setLayout(new GridLayout(9, 3));
        this.jp6.setLayout(new GridLayout(9, 3));
        this.jp7.setLayout(new GridLayout(9, 3));
        this.jp8.setLayout(new GridLayout(15, 1));
        this.jp9.setLayout(new GridLayout(6, 1));
        this.jp9.setPreferredSize(new Dimension(250, 0));
        this.jb1.addActionListener(this);
        this.jb1.setActionCommand("取消");
        this.jb2.addActionListener(this);
        this.jb2.setActionCommand("下单");
        this.jb3.addActionListener(this);
        this.jb3.setActionCommand("加单");
        this.jb4.addActionListener(this);
        this.jb4.setActionCommand("结账");
        this.jb6.addActionListener(this);
        this.jb6.setActionCommand("热销菜式");
        this.jb7.addActionListener(this);
        this.jb7.setActionCommand("小炒类");
        this.jb8.addActionListener(this);
        this.jb8.setActionCommand("蔬菜类");
        this.jb9.addActionListener(this);
        this.jb9.setActionCommand("主食类");
        this.jb10.addActionListener(this);
        this.jb10.setActionCommand("甜品类");
        this.jb11.addActionListener(this);
        this.jb11.setActionCommand("饮品类");
        this.jp1.add(this.jb1);
        this.jp1.add(this.jb2);
        this.jp1.add(this.jb3);
        this.jp1.add(this.jb4);
        this.jp2.add(this.jl2);
        this.jp2.add(this.jl3);
        this.jp2.add(this.jl4);
        this.jp2.add(this.jl11);
        this.jp2.add(this.jl12);
        this.jp2.add(this.jl13);
        this.jp2.add(this.jcb1);
        this.jp2.add(this.jcb2);
        this.jp2.add(this.jcb3);
        this.jp2.add(this.jl5);
        this.jp2.add(this.jl6);
        this.jp2.add(this.jl7);
        this.jp2.add(this.jl14);
        this.jp2.add(this.jl15);
        this.jp2.add(this.jl16);
        this.jp2.add(this.jcb4);
        this.jp2.add(this.jcb5);
        this.jp2.add(this.jcb6);
        this.jp2.add(this.jl8);
        this.jp2.add(this.jl9);
        this.jp2.add(this.jl10);
        this.jp2.add(this.jl17);
        this.jp2.add(this.jl18);
        this.jp2.add(this.jl19);
        this.jp2.add(this.jcb7);
        this.jp2.add(this.jcb8);
        this.jp2.add(this.jcb9);
        this.jp8.add(this.jb6);
        this.jp8.add(this.jb7);
        this.jp8.add(this.jb8);
        this.jp8.add(this.jb9);
        this.jp8.add(this.jb10);
        this.jp8.add(this.jb11);
        this.jp9.add(this.jl20);
        this.jp9.add(this.jcb11);
        this.jp9.add(this.jl21);
        this.jp9.add(this.jtf2);
        this.jp9.add(this.jl22);
        this.jp9.add(this.jsp);
        this.img = new ImageIcon("小炒类//豆角炒腊肉.jpg");
        this.jl2 = new JLabel(this.img);
        this.img = new ImageIcon("小炒类//家常小炒.jpg");
        this.jl3 = new JLabel(this.img);
        this.img = new ImageIcon("小炒类//木须肉.jpg");
        this.jl4 = new JLabel(this.img);
        this.img = new ImageIcon("小炒类//农家小炒肉.jpg");
        this.jl5 = new JLabel(this.img);
        this.img = new ImageIcon("小炒类//四季豆小炒肉.jpg");
        this.jl6 = new JLabel(this.img);
        this.img = new ImageIcon("小炒类//小炒牛肉.jpg");
        this.jl7 = new JLabel(this.img);
        this.img = new ImageIcon("小炒类//小炒香菇黄瓜条.jpg");
        this.jl8 = new JLabel(this.img);
        this.img = new ImageIcon("小炒类//小炒圆白菜.jpg");
        this.jl9 = new JLabel(this.img);
        this.img = new ImageIcon();
        this.jl10 = new JLabel(this.img);
        this.jl11 = new JLabel("28", 0);
        this.jl12 = new JLabel("28", 0);
        this.jl13 = new JLabel("28", 0);
        this.jl14 = new JLabel("28", 0);
        this.jl15 = new JLabel("28", 0);
        this.jl16 = new JLabel("28", 0);
        this.jl17 = new JLabel("28", 0);
        this.jl18 = new JLabel("28", 0);
        this.jl19 = new JLabel("", 0);
        this.jcb1 = new JCheckBox("豆角炒腊肉");
        this.jcb2 = new JCheckBox("家常小炒");
        this.jcb3 = new JCheckBox("木须肉");
        this.jcb4 = new JCheckBox("农家小炒肉");
        this.jcb5 = new JCheckBox("四季豆小炒肉");
        this.jcb6 = new JCheckBox("小炒牛肉");
        this.jcb7 = new JCheckBox("小炒香菇黄瓜条");
        this.jcb8 = new JCheckBox("小炒圆白菜");
        this.jp3.add(this.jl2);
        this.jp3.add(this.jl3);
        this.jp3.add(this.jl4);
        this.jp3.add(this.jl11);
        this.jp3.add(this.jl12);
        this.jp3.add(this.jl13);
        this.jp3.add(this.jcb1);
        this.jp3.add(this.jcb2);
        this.jp3.add(this.jcb3);
        this.jp3.add(this.jl5);
        this.jp3.add(this.jl6);
        this.jp3.add(this.jl7);
        this.jp3.add(this.jl14);
        this.jp3.add(this.jl15);
        this.jp3.add(this.jl16);
        this.jp3.add(this.jcb4);
        this.jp3.add(this.jcb5);
        this.jp3.add(this.jcb6);
        this.jp3.add(this.jl8);
        this.jp3.add(this.jl9);
        this.jp3.add(this.jl10);
        this.jp3.add(this.jl17);
        this.jp3.add(this.jl18);
        this.jp3.add(this.jl19);
        this.jp3.add(this.jcb7);
        this.jp3.add(this.jcb8);
        this.img = new ImageIcon("蔬菜类//炒四季豆.jpg");
        this.jl2 = new JLabel(this.img);
        this.img = new ImageIcon("蔬菜类//苦瓜炒蛋.jpg");
        this.jl3 = new JLabel(this.img);
        this.img = new ImageIcon("蔬菜类//凉拌土豆丝.jpg");
        this.jl4 = new JLabel(this.img);
        this.img = new ImageIcon("蔬菜类//茄子肉末.jpg");
        this.jl5 = new JLabel(this.img);
        this.img = new ImageIcon("蔬菜类//豌豆炒鸡米.jpg");
        this.jl6 = new JLabel(this.img);
        this.img = new ImageIcon("蔬菜类//虾酱荷兰豆.jpg");
        this.jl7 = new JLabel(this.img);
        this.img = new ImageIcon("蔬菜类//腰果玉米.jpg");
        this.jl8 = new JLabel(this.img);
        this.img = new ImageIcon();
        this.jl9 = new JLabel(this.img);
        this.img = new ImageIcon();
        this.jl10 = new JLabel(this.img);
        this.jl11 = new JLabel("18", 0);
        this.jl12 = new JLabel("18", 0);
        this.jl13 = new JLabel("18", 0);
        this.jl14 = new JLabel("18", 0);
        this.jl15 = new JLabel("18", 0);
        this.jl16 = new JLabel("18", 0);
        this.jl17 = new JLabel("18", 0);
        this.jl18 = new JLabel("", 0);
        this.jl19 = new JLabel("", 0);
        this.jcb1 = new JCheckBox("炒四季豆");
        this.jcb2 = new JCheckBox("苦瓜炒蛋");
        this.jcb3 = new JCheckBox("凉拌土豆丝");
        this.jcb4 = new JCheckBox("茄子肉末");
        this.jcb5 = new JCheckBox("豌豆炒鸡米");
        this.jcb6 = new JCheckBox("虾酱荷兰豆");
        this.jcb7 = new JCheckBox("腰果玉米");
        this.jp4.add(this.jl2);
        this.jp4.add(this.jl3);
        this.jp4.add(this.jl4);
        this.jp4.add(this.jl11);
        this.jp4.add(this.jl12);
        this.jp4.add(this.jl13);
        this.jp4.add(this.jcb1);
        this.jp4.add(this.jcb2);
        this.jp4.add(this.jcb3);
        this.jp4.add(this.jl5);
        this.jp4.add(this.jl6);
        this.jp4.add(this.jl7);
        this.jp4.add(this.jl14);
        this.jp4.add(this.jl15);
        this.jp4.add(this.jl16);
        this.jp4.add(this.jcb4);
        this.jp4.add(this.jcb5);
        this.jp4.add(this.jcb6);
        this.jp4.add(this.jl8);
        this.jp4.add(this.jl9);
        this.jp4.add(this.jl10);
        this.jp4.add(this.jl17);
        this.jp4.add(this.jl18);
        this.jp4.add(this.jl19);
        this.jp4.add(this.jcb7);
        this.img = new ImageIcon("主食类//红烧肉.jpg");
        this.jl2 = new JLabel(this.img);
        this.img = new ImageIcon("主食类//红烧猪蹄.jpg");
        this.jl3 = new JLabel(this.img);
        this.img = new ImageIcon("主食类//家常炒面.jpg");
        this.jl4 = new JLabel(this.img);
        this.img = new ImageIcon("主食类//金牌海鲜炒饭.jpg");
        this.jl5 = new JLabel(this.img);
        this.img = new ImageIcon("主食类//糖醋排骨.jpg");
        this.jl6 = new JLabel(this.img);
        this.img = new ImageIcon("主食类//新奥尔良烤翅.jpg");
        this.jl7 = new JLabel(this.img);
        this.img = new ImageIcon("主食类//照烧鸡腿.jpg");
        this.jl8 = new JLabel(this.img);
        this.img = new ImageIcon();
        this.jl9 = new JLabel(this.img);
        this.img = new ImageIcon();
        this.jl10 = new JLabel(this.img);
        this.jl11 = new JLabel("39", 0);
        this.jl12 = new JLabel("39", 0);
        this.jl13 = new JLabel("39", 0);
        this.jl14 = new JLabel("39", 0);
        this.jl15 = new JLabel("39", 0);
        this.jl16 = new JLabel("39", 0);
        this.jl17 = new JLabel("39", 0);
        this.jl18 = new JLabel("", 0);
        this.jl19 = new JLabel("", 0);
        this.jcb1 = new JCheckBox("红烧肉");
        this.jcb2 = new JCheckBox("红烧猪蹄");
        this.jcb3 = new JCheckBox("家常炒面");
        this.jcb4 = new JCheckBox("金牌海鲜炒饭");
        this.jcb5 = new JCheckBox("糖醋排骨");
        this.jcb6 = new JCheckBox("新奥尔良烤翅");
        this.jcb7 = new JCheckBox("照烧鸡腿");
        this.jp5.add(this.jl2);
        this.jp5.add(this.jl3);
        this.jp5.add(this.jl4);
        this.jp5.add(this.jl11);
        this.jp5.add(this.jl12);
        this.jp5.add(this.jl13);
        this.jp5.add(this.jcb1);
        this.jp5.add(this.jcb2);
        this.jp5.add(this.jcb3);
        this.jp5.add(this.jl5);
        this.jp5.add(this.jl6);
        this.jp5.add(this.jl7);
        this.jp5.add(this.jl14);
        this.jp5.add(this.jl15);
        this.jp5.add(this.jl16);
        this.jp5.add(this.jcb4);
        this.jp5.add(this.jcb5);
        this.jp5.add(this.jcb6);
        this.jp5.add(this.jl8);
        this.jp5.add(this.jl9);
        this.jp5.add(this.jl10);
        this.jp5.add(this.jl17);
        this.jp5.add(this.jl18);
        this.jp5.add(this.jl19);
        this.jp5.add(this.jcb7);
        this.img = new ImageIcon("甜品类//红豆马蹄糕.jpg");
        this.jl2 = new JLabel(this.img);
        this.img = new ImageIcon("甜品类//红糖鸡蛋.jpg");
        this.jl3 = new JLabel(this.img);
        this.img = new ImageIcon("甜品类//榴莲酥.jpg");
        this.jl4 = new JLabel(this.img);
        this.img = new ImageIcon("甜品类//芒果糯米糍.jpg");
        this.jl5 = new JLabel(this.img);
        this.img = new ImageIcon("甜品类//全麦小餐包.jpg");
        this.jl6 = new JLabel(this.img);
        this.img = new ImageIcon("甜品类//杂果榴莲冰.jpg");
        this.jl7 = new JLabel(this.img);
        this.img = new ImageIcon("甜品类//紫薯汤圆.jpg");
        this.jl8 = new JLabel(this.img);
        this.img = new ImageIcon();
        this.jl9 = new JLabel(this.img);
        this.img = new ImageIcon();
        this.jl10 = new JLabel(this.img);
        this.jl11 = new JLabel("12", 0);
        this.jl12 = new JLabel("12", 0);
        this.jl13 = new JLabel("12", 0);
        this.jl14 = new JLabel("12", 0);
        this.jl15 = new JLabel("12", 0);
        this.jl16 = new JLabel("12", 0);
        this.jl17 = new JLabel("12", 0);
        this.jl18 = new JLabel("", 0);
        this.jl19 = new JLabel("", 0);
        this.jcb1 = new JCheckBox("红豆马蹄糕");
        this.jcb2 = new JCheckBox("红糖鸡蛋");
        this.jcb3 = new JCheckBox("榴莲酥");
        this.jcb4 = new JCheckBox("芒果糯米糍");
        this.jcb5 = new JCheckBox("全麦小餐包");
        this.jcb6 = new JCheckBox("杂果榴莲冰");
        this.jcb7 = new JCheckBox("紫薯汤圆");
        this.jp6.add(this.jl2);
        this.jp6.add(this.jl3);
        this.jp6.add(this.jl4);
        this.jp6.add(this.jl11);
        this.jp6.add(this.jl12);
        this.jp6.add(this.jl13);
        this.jp6.add(this.jcb1);
        this.jp6.add(this.jcb2);
        this.jp6.add(this.jcb3);
        this.jp6.add(this.jl5);
        this.jp6.add(this.jl6);
        this.jp6.add(this.jl7);
        this.jp6.add(this.jl14);
        this.jp6.add(this.jl15);
        this.jp6.add(this.jl16);
        this.jp6.add(this.jcb4);
        this.jp6.add(this.jcb5);
        this.jp6.add(this.jcb6);
        this.jp6.add(this.jl8);
        this.jp6.add(this.jl9);
        this.jp6.add(this.jl10);
        this.jp6.add(this.jl17);
        this.jp6.add(this.jl18);
        this.jp6.add(this.jl19);
        this.jp6.add(this.jcb7);
        this.img = new ImageIcon("饮品类//补气养颜饮.jpg");
        this.jl2 = new JLabel(this.img);
        this.img = new ImageIcon("饮品类//玫瑰陈皮饮.jpg");
        this.jl3 = new JLabel(this.img);
        this.img = new ImageIcon("饮品类//梅子冬瓜饮.jpg");
        this.jl4 = new JLabel(this.img);
        this.img = new ImageIcon("饮品类//木瓜红枣饮.jpg");
        this.jl5 = new JLabel(this.img);
        this.img = new ImageIcon("饮品类//苹果牛奶饮.jpg");
        this.jl6 = new JLabel(this.img);
        this.img = new ImageIcon("饮品类//苹果雪梨饮.jpg");
        this.jl7 = new JLabel(this.img);
        this.img = new ImageIcon("饮品类//肉桂姜糖饮.jpg");
        this.jl8 = new JLabel(this.img);
        this.img = new ImageIcon();
        this.jl9 = new JLabel(this.img);
        this.img = new ImageIcon();
        this.jl10 = new JLabel(this.img);
        this.jl11 = new JLabel("28", 0);
        this.jl12 = new JLabel("28", 0);
        this.jl13 = new JLabel("28", 0);
        this.jl14 = new JLabel("28", 0);
        this.jl15 = new JLabel("28", 0);
        this.jl16 = new JLabel("28", 0);
        this.jl17 = new JLabel("28", 0);
        this.jl18 = new JLabel("", 0);
        this.jl19 = new JLabel("", 0);
        this.jcb1 = new JCheckBox("补气养颜饮");
        this.jcb2 = new JCheckBox("玫瑰陈皮饮");
        this.jcb3 = new JCheckBox("梅子冬瓜饮");
        this.jcb4 = new JCheckBox("木瓜红枣饮");
        this.jcb5 = new JCheckBox("苹果牛奶饮");
        this.jcb6 = new JCheckBox("苹果雪梨饮");
        this.jcb7 = new JCheckBox("肉桂姜糖饮");
        this.jp7.add(this.jl2);
        this.jp7.add(this.jl3);
        this.jp7.add(this.jl4);
        this.jp7.add(this.jl11);
        this.jp7.add(this.jl12);
        this.jp7.add(this.jl13);
        this.jp7.add(this.jcb1);
        this.jp7.add(this.jcb2);
        this.jp7.add(this.jcb3);
        this.jp7.add(this.jl5);
        this.jp7.add(this.jl6);
        this.jp7.add(this.jl7);
        this.jp7.add(this.jl14);
        this.jp7.add(this.jl15);
        this.jp7.add(this.jl16);
        this.jp7.add(this.jcb4);
        this.jp7.add(this.jcb5);
        this.jp7.add(this.jcb6);
        this.jp7.add(this.jl8);
        this.jp7.add(this.jl9);
        this.jp7.add(this.jl10);
        this.jp7.add(this.jl17);
        this.jp7.add(this.jl18);
        this.jp7.add(this.jl19);
        this.jp7.add(this.jcb7);
        this.jf = new JFrame("点菜系统");
        this.jf.setSize(860, 635);
        this.jf.setJMenuBar(this.jm1);
        this.jf.setLayout(new BorderLayout(10, 0));
        this.jf.setDefaultCloseOperation(3);
        this.jf.setLocationRelativeTo((Component) null);
        this.jf.setVisible(true);
        this.jf.add(this.jp1, "South");
        this.jf.add(this.jl1, "North");
        this.jf.add(this.jtp, "Center");
        this.jf.add(this.jtp2, "West");
        this.jf.add(this.jp9, "East");
    }

    public void actionPerformed(ActionEvent e) {
        String var2;
        switch ((var2 = e.getActionCommand()).hashCode()) {
            case 640682:
                if (var2.equals("下单")) {
                    if (this.B && this.ForJCheckBoxnum(this.jp9)) {
                        this.ForJCheckBoxStr(this.jp2, this.data, this.names, this.model, this.jt);
                        this.ForJCheckBoxStr(this.jp3, this.data, this.names, this.model, this.jt);
                        this.ForJCheckBoxStr(this.jp4, this.data, this.names, this.model, this.jt);
                        this.ForJCheckBoxStr(this.jp5, this.data, this.names, this.model, this.jt);
                        this.ForJCheckBoxStr(this.jp6, this.data, this.names, this.model, this.jt);
                        this.ForJCheckBoxStr(this.jp7, this.data, this.names, this.model, this.jt);
                        this.jp9.add(this.jsp);
                        this.B = false;
                        return;
                    } else {
                        if (!this.ForJCheckBoxnum(this.jp9)) {
                            JOptionPane.showMessageDialog((Component) null, "请输入用餐人数", "下单错误", 0);
                            this.ForJCheckBox(this.jp2);
                            this.ForJCheckBox(this.jp3);
                            this.ForJCheckBox(this.jp4);
                            this.ForJCheckBox(this.jp5);
                            this.ForJCheckBox(this.jp6);
                            this.ForJCheckBox(this.jp7);
                        } else {
                            JOptionPane.showMessageDialog((Component) null, "您已下单,若需要点菜请点击加单按钮", "下单错误", 0);
                            this.ForJCheckBox(this.jp2);
                            this.ForJCheckBox(this.jp3);
                            this.ForJCheckBox(this.jp4);
                            this.ForJCheckBox(this.jp5);
                            this.ForJCheckBox(this.jp6);
                            this.ForJCheckBox(this.jp7);
                        }

                        return;
                    }
                }

                return;
            case 677045:
                if (var2.equals("加单")) {
                    if (!this.B) {
                        this.ForJCheckBoxStr(this.jp2, this.data, this.names, this.model, this.jt);
                        this.ForJCheckBoxStr(this.jp3, this.data, this.names, this.model, this.jt);
                        this.ForJCheckBoxStr(this.jp4, this.data, this.names, this.model, this.jt);
                        this.ForJCheckBoxStr(this.jp5, this.data, this.names, this.model, this.jt);
                        this.ForJCheckBoxStr(this.jp6, this.data, this.names, this.model, this.jt);
                        this.ForJCheckBoxStr(this.jp7, this.data, this.names, this.model, this.jt);
                        this.jp9.add(this.jsp);
                    } else {
                        JOptionPane.showMessageDialog((Component) null, "您还未下单，请先点击下单按钮", "加单错误", 0);
                        this.ForJCheckBox(this.jp2);
                        this.ForJCheckBox(this.jp3);
                        this.ForJCheckBox(this.jp4);
                        this.ForJCheckBox(this.jp5);
                        this.ForJCheckBox(this.jp6);
                        this.ForJCheckBox(this.jp7);
                    }

                    return;
                }

                return;
            case 693362:
                if (var2.equals("取消")) {
                    this.ForJCheckBox(this.jp2);
                    this.ForJCheckBox(this.jp3);
                    this.ForJCheckBox(this.jp4);
                    this.ForJCheckBox(this.jp5);
                    this.ForJCheckBox(this.jp6);
                    this.ForJCheckBox(this.jp7);
                }

                return;
            case 1042611:
                if (!var2.equals("结账")) {
                    return;
                }

                if (this.jt.getRowCount() != 0) {
                    int res = JOptionPane.showConfirmDialog((Component) null, "是否继续操作", "结账提示", 0);
                    if (res == 0) {
                        JDialog FRAME = new JDialog();
                        FRAME.setBounds(new Rectangle((int) this.jf.getBounds().getX() + 50, (int) this.jf.getBounds().getY() + 50, (int) this.jf.getBounds().getWidth(), (int) this.jf.getBounds().getHeight()));
                        FRAME.add(this.jsp, "North");

                        try {
                            this.out = new BufferedWriter(new FileWriter("账单.txt", true));
                            this.ForJCheckBoxnum(this.jp9, this.out, FRAME);
                        } catch (IOException var6) {
                            var6.printStackTrace();
                        }

                        FRAME.setModalityType(ModalityType.APPLICATION_MODAL);
                        FRAME.setVisible(true);
                        this.B = true;
                    }

                    return;
                }

                JOptionPane.showMessageDialog((Component) null, "您还未下单，不能进行结账", "结账错误", 0);
                this.ForJCheckBox(this.jp2);
                this.ForJCheckBox(this.jp3);
                this.ForJCheckBox(this.jp4);
                this.ForJCheckBox(this.jp5);
                this.ForJCheckBox(this.jp6);
                this.ForJCheckBox(this.jp7);
                break;
            case 20490999:
                if (var2.equals("主食类")) {
                    this.jtp.setSelectedIndex(3);
                }

                return;
            case 23573112:
                if (var2.equals("小炒类")) {
                    this.jtp.setSelectedIndex(1);
                }

                return;
            case 29515254:
                if (var2.equals("甜品类")) {
                    this.jtp.setSelectedIndex(4);
                }

                return;
            case 33840715:
                if (var2.equals("蔬菜类")) {
                    this.jtp.setSelectedIndex(2);
                }

                return;
            case 38450632:
                if (var2.equals("饮品类")) {
                    this.jtp.setSelectedIndex(5);
                }

                return;
            case 898955174:
                if (!var2.equals("热销菜式")) {
                    return;
                }
                break;
            default:
                return;
        }

        this.jtp.setSelectedIndex(0);
    }

    void ForJCheckBox(JPanel p) {
        int count = p.getComponentCount();

        for (int i = 0; i < count; ++i) {
            Component comp = p.getComponent(i);
            if (comp instanceof JCheckBox jcb) {
                if (jcb.isSelected()) {
                    jcb.setSelected(false);
                }
            }
        }

    }

    void ForJCheckBoxnum(JPanel p, BufferedWriter out, JDialog FRAME) throws IOException {
        String Str = "\r\n\r\n餐桌号:\t" + this.jg[this.jcb11.getSelectedIndex()] + "\r\n用餐人数:\t" + this.jtf2.getText() + "人";
        SimpleDateFormat sdf = new SimpleDateFormat("\r\n时间:\tyyyy年-MM月-dd日 HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        String dateStringParse = sdf.format(date);
        out.write(Str);
        out.write(dateStringParse);
        int rowCount = this.jt.getRowCount();
        int sum = 0;
        String b = null;

        for (int i = 0; i < rowCount; ++i) {
            String str = (String) this.jt.getValueAt(i, 0);
            out.write("\r\n菜名:\t" + str);
            str = (String) this.jt.getValueAt(i, 1);

            try {
                int a = Integer.parseInt(str);
                sum += a;
                b = Integer.toString(sum);
            } catch (NumberFormatException var15) {
                var15.printStackTrace();
            }

            out.write("\r\n价格:\t" + str + "元");
        }

        out.write("\r\n总金额:\t" + b + "元");
        out.flush();
        out.close();
        JLabel JL = new JLabel("总金额:" + b, 0);
        FRAME.add(JL, "South");
    }

    boolean ForJCheckBoxnum(JPanel p) {
        int count = p.getComponentCount();

        for (int i = 0; i < count; ++i) {
            Component comp = p.getComponent(i);
            if (comp instanceof JTextField jtf) {
                if (jtf.getText().equals("")) {
                    return false;
                }
            }
        }

        return true;
    }

    void ForJCheckBoxStr(JPanel p, Vector data, Vector names, DefaultTableModel model, JTable jt) {
        int count = p.getComponentCount();

        for (int i = 0; i < count; ++i) {
            Component comp = p.getComponent(i);
            if (comp instanceof JCheckBox jcb) {
                if (jcb.isSelected()) {
                    jcb.setSelected(false);
                    Component Comp = p.getComponent(i - 3);
                    JLabel jl = (JLabel) Comp;
                    Vector Row = new Vector();
                    Row.add(jcb.getText());
                    Row.add(jl.getText());
                    data.add(Row.clone());
                    model = new DefaultTableModel(data, names);
                    jt.setModel(model);
                }
            }
        }

    }
}
