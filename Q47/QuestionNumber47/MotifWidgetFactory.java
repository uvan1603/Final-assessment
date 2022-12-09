package com.springboot.demo.mycoolapp.quesNum47.QuestionNumber47;

public class MotifWidgetFactory extends WidgetFactory implements MotifWindow,MotifScrollBar {
	public void CreateScrollBar() {
		System.out.println("From Motif- ScrollBar created..!");
	}
	
	public void CreateWindow() {
		System.out.println("From Motif - Window created..!");
	}
}
