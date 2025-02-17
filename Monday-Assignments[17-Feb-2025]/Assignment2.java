package com.celcom.day10;

class Goods {
	private String name;
	private int id;
	private int price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}

class Producer extends Thread {
	Goods goods;

	Producer(Goods goods) {
		this.goods = goods;
	}

	public void run() {
		synchronized (goods) {
			System.out.println("Producer producing the goods...");
			goods.setName("Apples");
			goods.setId(12345);
			goods.setPrice(200);

			goods.notify();
		}
	}
}

class Consumer extends Thread {
	Goods goods;

	Consumer(Goods goods) {
		this.goods = goods;
	}

	public void run() {
		synchronized (goods) {
			System.out.println("Waiting for producer response.");
			try {
				goods.wait();
				
			} catch (InterruptedException e) {
				System.out.println("Consumer Interrupted.");
			}
			System.out.printf("%s of %d is %d of cost", goods.getName(), goods.getId(), goods.getPrice());

		}
	}
}

public class Assignment2 {
	public static void main(String[] args) throws InterruptedException {
		Goods goods = new Goods();
		Producer obj = new Producer(goods);
		Consumer obj2 = new Consumer(goods);
		
		obj2.start();
		Thread.sleep(2000);
		obj.start();
	}
}
