package com.fs.test;


public class SwitchDemo {
	
	// ��дһ��Java�����жϱ���x����������ż��
	public void M1(int x){
		int i = x%2;
		
		switch(i){//intֵ��Ϊ�ж�
		case 0:
			System.out.println("ż��");
		    break;
		case 1:
			System.out.println("����");
			break;
		default:break;
		
		}
	}
	//����������ַ���ӡ���ڼ�
	public void M2(char c){
		switch(c){
		case 'M':
			System.out.println("����һ");
			break;
		case 'T':
			System.out.println("���ڶ�");
			break;
		default:
			System.out.println("������");
				break;
		}
	}
	public static void main(String[] args){
		SwitchDemo sd = new SwitchDemo();
		sd.M1(11);
		sd.M2('A');
	}
}
