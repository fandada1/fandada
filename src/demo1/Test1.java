package demo1;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {
	ArrayList<User> array ;
	int count = 0;//���ڱ���id��ֵ
	/**
	 * �����Զ�����id �ķ���
	 */
	
	private int increaseId() {
		count+=1;
		return count;	
	}
	/**
	 * ��������˺ŵķ���
	 */
	private int Account() {
		int num = 0;
		do {
		 num = (int)(Math.random()*900000000+100000000);
		}while(array.contains(num));
		return num;
		
	}
	/**
	 * ���ǳ�ʼ�����ݵķ���
	 */
	private void init() {
		array = new ArrayList<>();
		//���ڽ���id��ֵ
		System.out.println(count);
		array.add(new User(increaseId(),Account(),"�����","1",1,1));
		array.add(new User(increaseId(),Account(),"����","1",1,1));
		array.add(new User(increaseId(),Account(),"������","1",1,1));
		array.add(new User(increaseId(),Account(),"���","1",1,1));
		array.add(new User(increaseId(),Account(),"����","1",1,1));
		array.add(new User(increaseId(),Account(),"����","1",1,1));
	}
	private void seek() {
		
		Iterator<User> it = array.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
	private void add(String userName, String userPwd) {
		array.add(new User(increaseId(),Account(),userName,userPwd));
		
	}
	
	
	
	public static void main(String[] args) {
		Test1  t  = new Test1();
		t.init();
		t.seek();
		}
	}

