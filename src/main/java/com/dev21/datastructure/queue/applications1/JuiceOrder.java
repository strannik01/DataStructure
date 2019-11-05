package com.dev21.datastructure.queue.applications1;

public class JuiceOrder implements Order {
	private int id;
	private String name;
	private int count;

	public JuiceOrder(int id, String name, int count) {
		this.id = id;
		this.name = name;
		this.count = count;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int count() {
		return count;
	}

	@Override
	public String toString() {
		return "JuiceOrder [id=" + id + ", name=" + name + ", count=" + count + "]";
	}

}
