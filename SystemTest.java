package io.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class SystemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ʹ��System.setOut������������Ϣ�����ָ���ļ��������û�������
		String str="Hello World!";
		try {
			System.out.println(Integer.parseInt(str));
		}
		catch(Exception e) {
			try {
				System.setOut(new PrintStream(new FileOutputStream("C:\\Users\\��\\MyGit\\test.txt",true)));
			}
			catch(Exception e1) {
				//e1.printStackTrace();
			}
			System.out.println(e);
		}
	}

}
