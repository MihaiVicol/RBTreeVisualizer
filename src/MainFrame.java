package RED_BLACK;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import BTREE.BTreeFrame;

public class MainFrame extends JFrame implements MouseListener{
		
		private JLabel RBTree = new JLabel();
		private JLabel BTree = new JLabel();
		private ImageIcon icon1 = new ImageIcon(new ImageIcon("red-tree-derek-clark.jpg").getImage().getScaledInstance(640, 800, Image.SCALE_SMOOTH));
		private ImageIcon icon3 = new ImageIcon(new ImageIcon("red-tree-derek-clark-2.png").getImage().getScaledInstance(640, 800, Image.SCALE_SMOOTH));
		private ImageIcon icon2 = new ImageIcon(new ImageIcon("green-tree.jpg").getImage().getScaledInstance(640, 800, Image.SCALE_SMOOTH));
		private ImageIcon icon4 = new ImageIcon(new ImageIcon("green-tree-2.png").getImage().getScaledInstance(640, 800, Image.SCALE_SMOOTH));
		private JButton rbbutton = new JButton("Red-Black-Tree");
		private ImageIcon icon = new ImageIcon("JjeEtvWjDjg43Z5-Fall-Tree-PNG-Background-Image.png");
		private JButton bbutton = new JButton("B-Tree");

		
		public MainFrame() {
			
			//frame
			setLayout(null);
			setVisible(true);
			setSize(1280, 800);
			setTitle("TreeViz");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setResizable(false);
			setLocationRelativeTo(null);
			setIconImage(icon.getImage());
			//frame
			
			//labels
			RBTree.setBounds(0, 0, 640, 800);
			BTree.setBounds(640, 0, 640, 800);
			RBTree.setIcon(icon1);
			BTree.setIcon(icon2);
			RBTree.setLayout(null);
			BTree.setLayout(null);
			//labels

			add(RBTree);
			add(BTree);
			RBTree.add(rbbutton);
			rbbutton.setBounds(240, 375, 150, 50);
			rbbutton.setBackground(Color.GRAY);
			BTree.add(bbutton);
			rbbutton.setFocusable(false);
			bbutton.setFocusable(false);
			bbutton.setBounds(260, 375, 150, 50);
			bbutton.setBackground(Color.GRAY);
			rbbutton.addMouseListener(this);
			bbutton.addMouseListener(this);
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			if(e.getSource() == rbbutton) {
				dispose();
				new RBTreeFrame();
			}
			if(e.getSource() == bbutton) {
				dispose();
				new BTreeFrame();
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			if(e.getSource() == rbbutton) {
				RBTree.setIcon(icon3);
			}
			if(e.getSource() == bbutton) {
				BTree.setIcon(icon4);
			}
		}

		@Override
		public void mouseExited(MouseEvent e) {
			if(e.getSource() == rbbutton) {
				RBTree.setIcon(icon1);
			}
			if(e.getSource() == bbutton) {
				BTree.setIcon(icon2);
			}
		}
}
