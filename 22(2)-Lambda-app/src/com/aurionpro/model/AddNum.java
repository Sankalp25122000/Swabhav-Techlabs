package com.aurionpro.model;

public class AddNum implements IAddable {
	@Override
	public int add(int a , int b) {
		return a+b;
	}

	public static void main(String[] args) {
//		AddNum sum = new AddNum();
//		System.out.println(sum.add(1, 2));
//		
//		
//		IAddable sum1 = new IAddable() {
//			
//			@Override
//			public int add(int a, int b) {
//				// TODO Auto-generated method stub
//				return a+b;
//			}
//			
//			
//		};
//		System.out.println(sum1.add(2, 3));
		IAddable sum3 = (a ,b) -> a+b;
		System.out.println(sum3.add(6, 7));
	}

}
