package com.sample;

public class Book {
    // タイトル
    private String title;
    // 値段
    private int price;
    
    public static <T extends String> void showName(T... b){
    	for(String str : b) {
    		System.out.println(str);
    	}
    }
    
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}