package com.springboot.demo.mycoolapp.quesNum47.QuestionNumber47;

public class client {
	public static void main(String[] args) {
		PMWidgetFactory pmf=new PMWidgetFactory();
		pmf.CreateScrollBar();
		pmf.CreateWindow();
		MotifWidgetFactory mff=new MotifWidgetFactory();
		mff.CreateScrollBar();
		mff.CreateWindow();
	}
}
