package com.fs.test;


public class SwitchDemo {
	
	// 编写一个Java程序，判断变量x是奇数还是偶数
	public void M1(int x){
		int i = x%2;
		
		switch(i){//int值作为判断
		case 0:
			System.out.println("偶数");
		    break;
		case 1:
			System.out.println("奇数");
			break;
		default:break;
		
		}
	}
	//根据输入的字符打印星期几
	public void M2(char c){
		switch(c){
		case 'M':
			System.out.println("星期一");
			break;
		case 'T':
			System.out.println("星期二");
			break;
		default:
			System.out.println("星期天");
				break;
		}
	}
	public static void main(String[] args){
		SwitchDemo sd = new SwitchDemo();
		sd.M1(11);
		sd.M2('A');
	}
}
