package com.bilgeadam.week08.lecture001.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMetotlari {

	public static void main(String[] args) {
		
		// Queue FIFO --> First in First Out prensibiyle isler.Yani ilk gelen lk cikar.
		
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(2); // siraya bir eleman ekler.
		queue.add(2); // siraya bir eleman ekler.
		queue.peek(); // siradaki ilk ogeyi dondurur.Herhangi bir islem yapmaz. Normalde stackte son elemanı veriyordu burda ilk cünkü FIFO
		queue.poll(); // sıradaki ilk ogeyi döndurür ve sıradan cıkarır. stackteki pop metodunun muadili.
		queue.isEmpty(); // sırada eleman kalıp kalmadgidini gösterir.

	}

}
