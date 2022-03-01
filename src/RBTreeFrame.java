package RED_BLACK;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.geom.*;
import java.util.concurrent.TimeUnit;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
public class RBTreeFrame extends JFrame implements MouseListener, ActionListener{
	
		private JFrame x = new JFrame();
		private JFrame x1 = new JFrame();
		private JFrame x2 = new JFrame();
		private JFrame x3 = new JFrame();
		private JFrame x4 = new JFrame();
		private JFrame x5 = new JFrame();
		private JButton b = new JButton("Add");
		private JButton b1 = new JButton("Remove");
		private JButton b2 = new JButton("find");
		private JButton b3 = new JButton("find");
		private JButton b4 = new JButton("find");
		private JTextField c = new JTextField(9);
		private ImageIcon background = new ImageIcon("background.png");
		private ImageIcon helpp = new ImageIcon("help.png");
		private ImageIcon optionss = new ImageIcon("options.png");
		private ImageIcon add1 = new ImageIcon("addpic_1.png");
		private ImageIcon add2 = new ImageIcon("addpic_2.png");
		private ImageIcon remove1 = new ImageIcon("remove_1.png");
		private ImageIcon remove2 = new ImageIcon("remove_2.png");
		private ImageIcon reset1 = new ImageIcon("reset_1.png");
		private ImageIcon reset2 = new ImageIcon("reset_2.png");
		private ImageIcon max = new ImageIcon("max.png");
		private ImageIcon min = new ImageIcon("min.png");
		private ImageIcon succesor1 = new ImageIcon("succesor_1.png");
		private ImageIcon succesor2 = new ImageIcon("succesor_2.png");
		private ImageIcon predecesor1 = new ImageIcon("predecesor_1.png");
		private ImageIcon predecesor2 = new ImageIcon("predecesor_2.png");
		private ImageIcon search1 = new ImageIcon("search_1.png");
		private ImageIcon search2 = new ImageIcon("search_2.png");
		private ImageIcon back = new ImageIcon("back.png");
		private ImageIcon icon = new ImageIcon("JjeEtvWjDjg43Z5-Fall-Tree-PNG-Background-Image.png");
		public RBTree a=new RBTree();
        private JLabel treeP = new JLabel();
        private JMenuBar mb = new JMenuBar();
        private JMenu help = new JMenu("Help");
        private JMenu mainmenu = new JMenu("MainMenu");
        private JLabel options = new JLabel();
        private JLabel t1 = new JLabel();
        private JLabel t2 = new JLabel();
        private JLabel t3 = new JLabel();
        private JLabel t4 = new JLabel();
        private JLabel t5 = new JLabel();
        private JLabel t6 = new JLabel();
        private JLabel t7 = new JLabel();
        private JLabel t8 = new JLabel();
        private JLabel t9 = new JLabel();
        public RBTreeFrame() {

            //frame
           setSize(1500, 830);
           setLayout(null);
           setVisible(true);
           setResizable(false);
           setTitle("TreeViz");
           setIconImage(icon.getImage());
           add(treeP);
           treeP.setLayout(null);
           options.setLayout(null);
           add(options);
           treeP.setBounds(0, 0, 1500, 650);
           treeP.setIcon(background);
           options.setBounds(0, 650, 1500, 180);
           options.setIcon(optionss);
           options.add(t1);
           options.add(t2);
           options.add(t3);
           options.add(t4);
           options.add(t5);
           options.add(t6);
           options.add(t7);
           options.add(t8);
           options.add(t9);
           t1.setBounds(0, -5, 166, 140);
           t1.setIcon(add1);
           t1.addMouseListener(this);
           t1.setCursor(new Cursor(Cursor.HAND_CURSOR));
           t2.setBounds(166, 0, 166, 140);
           t2.setIcon(remove1);
         
           t2.addMouseListener(this);
           t2.setCursor(new Cursor(Cursor.HAND_CURSOR));
           t3.setBounds(332, 0, 166, 140);
           t3.setIcon(reset1);

           t3.addMouseListener(this);
           t3.setCursor(new Cursor(Cursor.HAND_CURSOR));

           t4.setBounds(498, 0, 166, 140);
           t4.setIcon(max);
           t4.addMouseListener(this);
           t4.setCursor(new Cursor(Cursor.HAND_CURSOR));
           t5.setBounds(664, 0, 166, 140);
           t5.setIcon(min);
           t5.addMouseListener(this);
           t5.setCursor(new Cursor(Cursor.HAND_CURSOR));
           t6.setBounds(830, 0, 166, 140);
           t6.setIcon(succesor1);

           t6.addMouseListener(this);
           t6.setCursor(new Cursor(Cursor.HAND_CURSOR));

           t7.setBounds(996, 0, 166, 140);
           t7.setIcon(predecesor1);

           t7.addMouseListener(this);
           t7.setCursor(new Cursor(Cursor.HAND_CURSOR));

           t8.setBounds(1162, 0, 166, 140);
           t8.setIcon(search1);
           t8.addMouseListener(this);
           t8.setCursor(new Cursor(Cursor.HAND_CURSOR));
           t9.setBounds(1328, 0, 166, 140);
           t9.setIcon(back);
           t9.addMouseListener(this);
           t9.setCursor(new Cursor(Cursor.HAND_CURSOR));
           setJMenuBar(mb);
           mb.add(help);
           mb.add(mainmenu);
           setLocationRelativeTo(null);
           b.addActionListener(this);
           b1.addActionListener(this);
           b2.addActionListener(this);
           b3.addActionListener(this);
           b4.addActionListener(this); 
           mainmenu.addMouseListener(this);
           mainmenu.setCursor(new Cursor(Cursor.HAND_CURSOR));
           help.addMouseListener(this);
           help.setCursor(new Cursor(Cursor.HAND_CURSOR));
           setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
        
		@Override
		public void mouseClicked(MouseEvent e) {
			if(e.getSource() == help) {
				JLabel bacc = new JLabel();
				bacc.setIcon(helpp);
				x5 = new JFrame();
				x5.setSize(815, 630);
				x5.setTitle("TreeViz");
				x5.setIconImage(icon.getImage());
			    x5.setVisible(true);
			    x5.setResizable(false);
			    x5.setLayout(null);
			    x5.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			    bacc.setBounds(0, 0, 800, 600);
			    x5.add(bacc);
			    x5.setLocationRelativeTo(null);
				
			}
			if(e.getSource() == t1) {
				x.setIconImage(icon.getImage());
			    x.setVisible(true);
			    x.setResizable(false);
			    x.setLayout(null);
			    x.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			    x.setSize(185, 85);
			    c.setBounds(10, 10, 80, 30);
			    b.setBounds(100, 10, 60, 30);
			    x.setLocationRelativeTo(null);  
			    x.add(c);  
			    x.add(b); 
			}
			else if(e.getSource()==t2)
			{
				x1.setIconImage(icon.getImage());
				x1.setVisible(true);
			    x1.setResizable(false);
			    x1.setLayout(null);
			    x1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			    x1.setSize(210, 85);
			    c.setBounds(10, 10, 80, 30);
			    b1.setBounds(100, 10, 85, 30);
			    x1.setLocationRelativeTo(null);  
			    x1.add(c);  
			    x1.add(b1); 
			}
			if(e.getSource()== t3) {
				treeP.removeAll();
				treeP.revalidate();
				treeP.repaint();
				a = new RBTree();
			}
			if(e.getSource()==t4) {
				a.maximum(a.root);
			}
			if(e.getSource()==t5)
			{
				a.min(a.root);
			}
			if(e.getSource()==t6)
			{
				x2.setIconImage(icon.getImage());
				x2.setVisible(true);
			    x2.setResizable(false);
			    x2.setLayout(null);
			    x2.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			    x2.setSize(185, 85);
			    c.setBounds(10, 10, 80, 30);
			    b2.setBounds(100, 10, 60, 30);
			    x2.setLocationRelativeTo(null);  
			    x2.add(c);  
			    x2.add(b2); 
			}
			if(e.getSource()==t7)
			{
				x4.setIconImage(icon.getImage());
				x4.setVisible(true);
			    x4.setResizable(false);
			    x4.setLayout(null);
			    x4.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			    x4.setSize(185, 85);
			    c.setBounds(10, 10, 80, 30);
			    b4.setBounds(100, 10, 60, 30);
			    x4.setLocationRelativeTo(null);  
			    x4.add(c);  
			    x4.add(b4);
			}
			if(e.getSource()==t8)
			{
				x3.setIconImage(icon.getImage());
				x3.setVisible(true);
			    x3.setResizable(false);
			    x3.setLayout(null);
			    x3.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			    x3.setSize(185, 85);
			    c.setBounds(10, 10, 80, 30);
			    b3.setBounds(100, 10, 60, 30);
			    x3.setLocationRelativeTo(null);  
			    x3.add(c);  
			    x3.add(b3);
			}
			if(e.getSource() == t9){
				a.bfs(treeP);
			}
			
		}
		

		@Override
		public void mousePressed(MouseEvent e) {
			if(e.getSource() == mainmenu) {
				dispose();
				new MainFrame();
			}
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			if(e.getSource() == t1) {
				t1.setIcon(add2);
			}
			if(e.getSource() == t2) {
				t2.setIcon(remove2);
			}
			if(e.getSource() == t3) {
				t3.setIcon(reset2);
			}
			if(e.getSource() == t6) {
				t6.setIcon(succesor2);
			}
			if(e.getSource() == t7) {
				t7.setIcon(predecesor2);
			}
			if(e.getSource() == t8) {
				t8.setIcon(search2);
			}
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			if(e.getSource() == t1) {
				t1.setIcon(add1);
			}
			if(e.getSource() == t2) {
				t2.setIcon(remove1);
			}
			if(e.getSource() == t3) {
				t3.setIcon(reset1);
			}
			if(e.getSource() == t6) {
				t6.setIcon(succesor1);
			}
			if(e.getSource() == t7) {
				t7.setIcon(predecesor1);
			}
			if(e.getSource() == t8) {
				t8.setIcon(search1);
			}
			
		}


		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == b) {
				
			    a.RBInstert(Integer.parseInt(c.getText()), treeP);
			    
			    c.setText("");
			}
			else if(e.getSource()==b1)
			{
				
				a.RBDelete(Integer.parseInt(c.getText()), treeP);
				
				c.setText("");
			}
			else if(e.getSource()==b2){
				
				
				a.successorpath(a.search(Integer.parseInt(c.getText())));
				c.setText("");
			}
			else if(e.getSource()==b3)
			{
				
				
				a.searchpath(Integer.parseInt(c.getText()));
				c.setText("");
			}
			else {
				
				x4.dispose();
				a.predecessorpath(a.search(Integer.parseInt(c.getText())));
				c.setText("");
			}
		}
}