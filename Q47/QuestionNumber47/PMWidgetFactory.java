package com.springboot.demo.mycoolapp.quesNum47.QuestionNumber47;

public class PMWidgetFactory extends WidgetFactory implements PMWindow,PMScrollBar {
	
	public void CreateScrollBar() {
		System.out.println("From PM- ScrollBar created..!");
	}
	
	public void CreateWindow() {
		System.out.println("From PM -  Window created..!");
	}
}
