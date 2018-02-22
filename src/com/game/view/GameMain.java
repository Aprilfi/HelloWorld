package com.game.view;

import javax.swing.JFrame;

/**
 * 
 * @author wu
 * @function 游戏的主面板类
 */
public class GameMain extends JFrame{
	private static final long serialVersionUID = 1L;
	
	//静态画板类
	public static JumpPanel jumpPanel;
	
	public GameMain() {
		//设置窗口的基本属性
		this.setTitle("jump");
		this.setSize(600,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//创建画板类对象
		jumpPanel = new JumpPanel();
		this.add(jumpPanel);
		//设置窗口可见
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GameMain();
	}
}
