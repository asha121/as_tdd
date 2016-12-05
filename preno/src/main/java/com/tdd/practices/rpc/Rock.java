package com.tdd.practices.rpc;

public class Rock {
	private String name;
	private String msg;

	public String getName() {
		return name;
	}

	public Rock(String name, String msg) {
		super();
		this.name = name;
		this.msg = msg;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
