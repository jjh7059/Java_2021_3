package xyz.itwill.io;

import java.io.Serializable;

//ȸ������(���̵�, �̸�, ��ȭ��ȣ)�� �����ϱ� ���� Ŭ����
// => ��ü ������ �Է� �Ǵ� ��� ó���Ǵ� Ŭ������ �ݵ�� ��ü ����ȭ Ŭ������ ����
// => ��ü ����ȭ(Object Serialization) : �ν��Ͻ��� byte �迭(���õ����� ����)�� ��ȯ�Ͽ�
//�Է� �Ǵ� ����ϴ� ����� ����

//��ü ����ȭ Ŭ������ �����ϴ� ���
//1. java.io.Serializable �������̽��� ��ӹ޾� ���� (���������� ���)
// => �ν��Ͻ��� ��� �ʵ尪�� byte �迭�� ��ȯ�Ͽ� �Է� �Ǵ� ����ϴ� ��� ����
//2. java.io.Externalizable �������̽��� ��ӹ޾� ���� (�ʵ尡 ���� �� ���)
// => �������̽��� �߻�޼ҵ带 �������̵� �����Ͽ� �Է� �Ǵ� ��¿� ���� ��ȯ ó��
// => �ν��Ͻ��� Ư�� �ʵ尪�� byte �迭�� ��ȯ�Ͽ� �Է� �Ǵ� ����ϴ� ��� ����

//��ü ����ȭ Ŭ������ Ŭ������ �����ϱ� ���� �������� �ο��ϴ� �ʵ�(serialVersionUID)�� �����ϴ� ���� ����
// => ��Ŭ���������� serialVersionUID �ʵ尪�� �ڵ����� �����ϴ� ��� ����
public class Member implements Serializable {
	private static final long serialVersionUID = -3306639107947980039L;
	private String id;
	private String name;
	private String phone;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String id, String name, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "���̵� = " + id + ", �̸� = " + name + ", ��ȭ��ȣ = " + phone;
	}
}
