package demo1;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {
	ArrayList<User> array ;
	int count = 0;//用于保存id的值
	/**
	 * 这是自动增长id 的方法
	 */
	
	private int increaseId() {
		count+=1;
		return count;	
	}
	/**
	 * 随机生成账号的方法
	 */
	private int Account() {
		int num = 0;
		do {
		 num = (int)(Math.random()*900000000+100000000);
		}while(array.contains(num));
		return num;
		
	}
	/**
	 * 这是初始化数据的方法
	 */
	private void init() {
		array = new ArrayList<>();
		//用于接收id的值
		System.out.println(count);
		array.add(new User(increaseId(),Account(),"樊大大","1",1,1));
		array.add(new User(increaseId(),Account(),"张三","1",1,1));
		array.add(new User(increaseId(),Account(),"范晓晓","1",1,1));
		array.add(new User(increaseId(),Account(),"臧三","1",1,1));
		array.add(new User(increaseId(),Account(),"李四","1",1,1));
		array.add(new User(increaseId(),Account(),"王五","1",1,1));
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

