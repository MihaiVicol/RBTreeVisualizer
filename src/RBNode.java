package RED_BLACK;

import java.awt.*;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class RBNode {
	public int key;
	public color colour;
	public RBNode right=RBTree.Nil;
	public RBNode left=RBTree.Nil;
	public RBNode parent=RBTree.Nil;
	public JLabel lab;
	public RBNode(int x)
	{
		this.key=x;
		this.colour=color.BLACK;
		lab=new JLabel("", SwingConstants.CENTER);
		lab.setOpaque(true);
		lab.setBackground(Color.black);
		lab.setForeground(Color.green);
	}
}
