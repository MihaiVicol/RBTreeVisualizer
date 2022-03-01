package RED_BLACK;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.geom.Line2D;
import java.util.concurrent.TimeUnit;
import java.awt.geom.*;

public class RBTree {
	public int g =  730, h = 10;
	public static final RBNode Nil = new RBNode(0);
	public RBNode root=Nil;
	public void LeftRotate(RBNode x)
	{
		RBNode y=x.right;
		x.right=y.left;
		if(y.left!=Nil)
			y.left.parent=x;
		y.parent=x.parent;
		if(x.parent==Nil)
			root=y;
		else if(x==x.parent.left)
			x.parent.left=y;
		else
			x.parent.right=y;
		y.left=x;
		x.parent=y;
	}
	public void RightRotate(RBNode y)
	{
		RBNode x=y.left;
		y.left=x.right;
		if(x.right!=Nil)
			x.right.parent=y;
		x.parent=y.parent;
		if(y.parent==Nil)
			root=x;
		else if(y==y.parent.left)
			y.parent.left=x;
		else
			y.parent.right=x;
		x.right=y;
		y.parent=x;
	}
	public void searchpath(int k)
	{
		RBNode x=root;
		Border border = BorderFactory.createLineBorder(Color.BLUE, 5);
		while(x.left!=Nil||x.right!=Nil)
			if(x.key==k)
			{
				x.lab.setBorder(border);
				break;
			}
			else if(k>x.key)
			{
				x.lab.setBorder(border);
				x=x.right;
			}
			else
			{
				x.lab.setBorder(border);
				x=x.left;
			}
		x.lab.setBorder(border);
	}
	public RBNode minimum(RBNode w)
	{
		RBNode x=w;
		while(x.left!=Nil)
			x=x.left;
		return x;
	}
	public void min(RBNode w)
	{
		RBNode x=w;
		Border border = BorderFactory.createLineBorder(Color.BLUE, 5);
		x.lab.setBorder(border);
		while(x.left!=Nil)
		{
			x=x.left;
			x.lab.setBorder(border);
		}
	}
	public void maximum(RBNode w)
	{
		RBNode x=w;
		Border border = BorderFactory.createLineBorder(Color.BLUE, 5);
		x.lab.setBorder(border);
		while(x.right!=Nil)
		{
			x=x.right;
			x.lab.setBorder(border);
		}
	}
	public void successorpath(RBNode w)
	{
		Border border = BorderFactory.createLineBorder(Color.BLUE, 5);
		RBNode x=w;
		if(x.right!=Nil) {
			x.lab.setBorder(border);
			min(x.right);
			return;
		}
		
		RBNode y=x.parent;
		while(y!=Nil&&x==y.right)
		{
			x.lab.setBorder(border);
			x=y;
			y=x.parent;
		}
		x.lab.setBorder(border);
	}
	public void predecessorpath(RBNode w)
	{
		Border border = BorderFactory.createLineBorder(Color.BLUE, 5);
		if(w.left!=Nil)
			maximum(w.left);
		w.lab.setBorder(border);
		RBNode y=w.parent;
		while(y!=Nil&&w==y.left)
		{
			w=y;
			w.lab.setBorder(border);
			y=y.parent;
		}
		y.lab.setBorder(border);
	}
	public RBNode successor(RBNode w)
	{
		if(w==Nil)
			return w;
		RBNode x=w;
		if(x.right!=Nil)
			return minimum(x.right);
		RBNode y=x.parent;
		while(y!=Nil&&x==y.right)
		{
			x=y;
			y=x.parent;
		}
		return y;
	}
	public void RBInstert(int k, JLabel p)
	{
		RBNode z = new RBNode(k);
		RBNode y = Nil;
		RBNode x=root;		
		while(x!=Nil)
		{
			y=x; 
			x=(z.key<x.key) ? x.left:x.right;
		}
		z.parent=y;
		if(y==Nil)
			root=z;
		else if(z.key<y.key)
			y.left=z;
		else
			y.right=z;
		z.left=z.right=Nil;
		z.colour=color.RED;
		z.lab.setBackground(Color.red); 
		z.lab.setText(Integer.toString(k)); 
		z.lab.setOpaque(true); 
		RBInsertFixup(z,p);
		bfs(p);
	}
	public void RBInsertFixup(RBNode z, JLabel p)
	{
		while(z.parent.colour==color.RED)
			if(z.parent==z.parent.parent.right)
			{
				RBNode y=z.parent.parent.left;
				if(y.colour==color.RED)
				{
					z.parent.colour=color.BLACK;
					z.parent.lab.setBackground(Color.black); 
					y.colour=color.BLACK;
					y.lab.setBackground(Color.black);
					z.parent.parent.colour=color.RED;
					z.parent.parent.lab.setBackground(Color.red);
					z=z.parent.parent;
				}
				else
				{
					if(z==z.parent.left)
					{
						z=z.parent;
						RightRotate(z);
						
					}
					z.parent.colour=color.BLACK;
					z.parent.lab.setBackground(Color.black);
					z.parent.parent.colour=color.RED;
					z.parent.parent.lab.setBackground(Color.red);
					LeftRotate(z.parent.parent);
				}
			}
			else
			{
				RBNode y=z.parent.parent.right;
				if(y.colour==color.RED)
				{
					z.parent.colour=color.BLACK;
					z.parent.lab.setBackground(Color.black);
					y.colour=color.BLACK;
					y.lab.setBackground(Color.black);
					z.parent.parent.colour=color.RED;
					z.parent.parent.lab.setBackground(Color.red);
					z=z.parent.parent;
				}
				else
				{
					if(z==z.parent.right)
					{
						z=z.parent;
						LeftRotate(z);
					}
					z.parent.colour=color.BLACK;
					z.parent.lab.setBackground(Color.black);
					z.parent.parent.colour=color.RED;
					z.parent.parent.lab.setBackground(Color.red);
					RightRotate(z.parent.parent);
				}
				if(z==root)
					break;
			}
		root.colour=color.BLACK;
		root.lab.setBackground(Color.black);
	}
	public void RBDelete(int k, JLabel p)
	{
		RBNode z=search(k);
		RBNode y;
		RBNode x;
		if(z.left==Nil||z.right==Nil)
		{
			y=z;
			System.out.println(y.parent.key);
		}
		else
			y=successor(z);
		
		if(y.left!=Nil)
			x=y.left;
		else
			x=y.right;
		
		x.parent=y.parent;
		if(y.parent==Nil)
		{
			root=x;
		}
		else
			if(y==y.parent.left)
			{
				y.parent.left=x;
				if(y.key==0)
					y.parent.left=Nil;
			}
			else
			{
				y.parent.right=x;
				if(y.key==0)
					y.parent.right=Nil;
			}
		if(y!=z)
			z.key=y.key;
		if(y.colour==color.BLACK)
			RBDeleteFixup(x,p);
		bfs(p);
	}
	public void RBDeleteFixup(RBNode x, JLabel p)
	{
		RBNode w;
		while((x!=root)&&(x.colour==color.BLACK))
		{
			if(x==x.parent.left)
			{
				w=x.parent.right;
				if(w.colour==color.RED)
				{
					w.colour=color.BLACK;
					w.lab.setBackground(Color.black);
					x.parent.colour=color.RED;
					x.parent.lab.setBackground(Color.red);
					LeftRotate(x.parent);
					w=x.parent.right;
				}
				if((w.left.colour==color.BLACK)&&(w.right.colour==color.BLACK))
				{
					w.colour=color.RED;
					w.lab.setBackground(Color.red);
					x=x.parent;
				}
				else
				{
					if(w.right.colour==color.BLACK)
					{
						w.left.colour=color.BLACK;
						w.left.lab.setBackground(Color.black);
						w.colour=color.RED;
						w.lab.setBackground(Color.red);
						RightRotate(w);
						w=x.parent.right;
					}
					w.colour=x.parent.colour;
					if(x.parent.colour==color.RED)
						w.lab.setBackground(Color.red);
					else
						w.lab.setBackground(Color.black);
					x.parent.colour=color.BLACK;
					x.parent.lab.setBackground(Color.black);
					w.right.colour=color.BLACK;
					w.right.lab.setBackground(Color.black);
					LeftRotate(x.parent);
					x=root;
				}
			}
			else
			{
				w=x.parent.left;
				if(w.colour==color.RED)
				{
					w.colour=color.BLACK;
					w.lab.setBackground(Color.black);
					x.parent.colour=color.RED;
					x.parent.lab.setBackground(Color.red);
					RightRotate(x.parent);
					w=x.parent.left;
				}
				if((w.left.colour==color.BLACK)&&(w.right.colour==color.BLACK))
				{
					w.colour=color.RED;
					w.lab.setBackground(Color.red);
					x=x.parent;
				}
				else
				{
					if(w.left.colour==color.BLACK)
					{
						w.right.colour=color.BLACK;
						w.right.lab.setBackground(Color.black);
						w.colour=color.RED;
						w.lab.setBackground(Color.red);
						LeftRotate(w);
						w=x.parent.left;
					}
					w.colour=x.parent.colour;
					if(x.parent.colour==color.RED)
						w.lab.setBackground(Color.red);
					else
						w.lab.setBackground(Color.black);
					x.parent.colour=color.BLACK;
					x.parent.lab.setBackground(Color.black);
					w.left.colour=color.BLACK;
					w.left.lab.setBackground(Color.black);
					RightRotate(x.parent);
					x=root;
				}
			}
		}
		x.colour=color.BLACK;
		x.lab.setBackground(Color.black);
	}
	public RBNode search(int k)
	{
		RBNode x=root;
		while(x.left!=Nil||x.right!=Nil)
			if(x.key==k)
				return x;
			else if(k>x.key)
				x=x.right;
			else 
				x=x.left;
		return x;
	}
	public void bfs(JLabel p)
	{
		p.removeAll();
		p.invalidate();
		p.validate();
		p.repaint();
		int h=height(root);
		Display(p,h);
	}
	public void printlvl(RBNode root, int lvl, JLabel p)
	{
		int v;
		if(root==Nil)
			return;
		if(lvl==1)
		{
			if(root==this.root)
			{
				root.lab.setBounds(g,h,25,25);
			}
			else {
				if(root.parent.left==root)
				{
					Rectangle r=root.parent.lab.getBounds();
					v=r.x-(int)((Math.pow(2, height(root)))*10);
					root.lab.setBounds(v,r.y+100,25,25);
				}
				else
				{
					Rectangle r=root.parent.lab.getBounds();
					v=r.x+(int)((Math.pow(2, height(root)))*10);
					root.lab.setBounds(v,r.y+100,25,25);
				}
					
			}
			root.lab.setBorder(new EmptyBorder(0, 0, 0, 0));
			p.add(root.lab);
		}
		else if(lvl>1)
		{
			printlvl(root.left,lvl-1,p);
			printlvl(root.right,lvl-1,p);
		}
	}
	public int height(RBNode n)
	{
		if(n==Nil)
			return 0;
		int lheight=height(n.left);
		int rheight=height(n.right);
		if(lheight>rheight)
			return lheight+1;
		else
			return rheight+1;
	}
	public void Display(JLabel p, int h)
	{
		root.lab.setBounds(g,this.h,25,25);
		root.lab.setBorder(new EmptyBorder(0, 0, 0, 0));
		p.add(root.lab);
		if(root.left!=Nil)
		{
			root.left.lab.setBounds((int)(g-20-(Math.pow(2, height(root)-1))*10),this.h+60,25,25);
			root.left.lab.setBorder(new EmptyBorder(0, 0, 0, 0));
			p.add(root.left.lab);
		}
		if(root.right!=Nil)
		{
			root.right.lab.setBounds((int)(g+20+(Math.pow(2, height(root)-1))*10),this.h+60,25,25);
			root.right.lab.setBorder(new EmptyBorder(0, 0, 0, 0));
			p.add(root.right.lab);
		}
		for(int i=3;i<=h;i++)
		{
			printlvl(root,i,p);
		}
	}
}
