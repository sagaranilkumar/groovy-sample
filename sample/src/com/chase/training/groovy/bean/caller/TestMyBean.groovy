package com.chase.training.groovy.bean.caller

import com.chase.training.groovy.bean.MyBean;


class TestMyBean {

	static main(args) {
		MyBean bean = new MyBean();
		println bean.defaultDefStr
		println bean.defaultStr
		println bean.privateStr
		println "*****************"
		println bean.getDefaultDefStr()
		println bean.doSomething()
	}
}
