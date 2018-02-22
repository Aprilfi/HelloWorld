package com.game.view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * 
 * @author Administrator
 * @function 游戏的画板
 */
public class JumpPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	
	public Pad pad;
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		g.setColor(Color.YELLOW);
		g.fill3DRect(20,70,20,30,true);
	}
}
