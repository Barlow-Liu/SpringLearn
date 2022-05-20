package aopAspectJ.dao.impl;

import aopAspectJ.dao.OrderDao;

public class OrderDaoImpl implements OrderDao {
	@Override
	public void add() {
		System.out.println("正在执行 OrderDao 中的 add() 方法");
	}

	@Override
	public void delete() {
		System.out.println("正在执行 OrderDao 中的 delete() 方法");
	}

	@Override
	public Integer modify() {
		System.out.println("正在执行 OrderDao 中的 modify() 方法");
		return 1;
	}

	@Override
	public void get() {
		// 异常
		System.out.println("正在执行 OrderDao 中的 get() 方法，开始");
		int a = 10 / 0;
		System.out.println("正在执行 OrderDao 中的 get() 方法，结束");
	}
}
