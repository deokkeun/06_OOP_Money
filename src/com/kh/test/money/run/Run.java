package com.kh.test.money.run;

import com.kh.test.money.model.vo.Money;

public class Run {

	public static void main(String[] args) {
		
		Money money = new Money(10000);
		System.out.println(money.getMoney() + Money.UNIT);
	}

}
