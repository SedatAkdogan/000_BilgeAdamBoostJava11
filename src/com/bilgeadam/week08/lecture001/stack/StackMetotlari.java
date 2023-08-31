package com.bilgeadam.week08.lecture001.stack;

import java.util.Stack;

public class StackMetotlari {

	public static void main(String[] args) {
		
		// Stack ->> LIFO ->> Last in First Out

		Stack<Integer> stack = new Stack<Integer>();
		stack.add(1); // 1 sayisini ' stacke ekler.
		stack.push(2); // 2 sayisini stack'e ekler.Genellikle stacklerde ekleme islemi icin push kullanilir.
		
		stack.peek();// Stack'e en son eklenen degeri ,stackten cıkarmadan getirir.
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println();
		
		stack.pop();// Stack'e en son eklenen degeri getrir ve Stack'ten cıkarır.
		System.out.println(stack.pop());
		System.out.println(stack);
		
	//	stack.pop(); Stack'te eleman kalmamısken bu method tekrar calistirlirsa EmptyStackException hatasi alinir.
		
		// is,has,
		stack.isEmpty(); // Stack'te eleman olup olmadıgını kontrol eder.Eger hic eleman yoksa true,varsa false doner.
		System.out.println(stack.isEmpty());
		
		
		
		
	}

}
