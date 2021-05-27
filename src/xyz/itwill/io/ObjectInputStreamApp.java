package xyz.itwill.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;
import java.util.List;

public class ObjectInputStreamApp {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//ObjectInputStream : InputStream �ν��Ͻ��� ���޹޾� ���� �����͸� ���ϴ� �ڷ��� 
		//�Ǵ� �ν��Ͻ��� ��ȯ�Ͽ� ��ȯ�ϴ� ����� �����ϴ� �Է� ��Ʈ���� �����ϱ� ���� Ȯ�� Ŭ����
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("c:/data/object.txt"));
		
		//ObjectInputStream.readObject() : �Է� ��Ʈ���� ���� �����͸� ��ü(�ν��Ͻ�)�� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		// => readObject() �޼ҵ�� �ν��Ͻ��� Object Ÿ������ ��ȯ�ϹǷ� �ݵ�� ����� ��ü ����ȯ
		// => ��ȯ�Ǵ� �ν��Ͻ��� ���� Ŭ������ ���� ��� ClassNotFoundException �߻�
		String string = (String)in.readObject();
		Date date = (Date)in.readObject();
		@SuppressWarnings("unchecked")
		List<String> list = (List<String>)in.readObject();
		
		//�ν��Ͻ��� toString() �޼ҵ尡 �ڵ� ȣ��
		System.out.println("string = " + string);
		System.out.println("date = " + date);
		System.out.println("list = " + list);
		
		in.close();
	}
}
