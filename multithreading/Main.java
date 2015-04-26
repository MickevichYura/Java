public class Main {

	public static void main(String[] args) throws InterruptedException {
		long before = System.currentTimeMillis();

		Thread threadProducer = new Thread(new Producer(args[0]));
		threadProducer.setName("Producer");
		Thread threadConsumer1 = new Thread(new Consumer());
		threadConsumer1.setName("Consumer 1");
		Thread threadConsumerMax = new Thread(new ConsumerReport());
		threadConsumerMax.setName("Consumer Max");

		threadProducer.start();
		threadConsumer1.start();
		threadConsumerMax.start();

		threadProducer.join();
		threadConsumer1.join();
		threadConsumerMax.join();

		System.out.println("max " + ConsumerReport.maxSize);
		System.out.println("sum " + ConsumerReport.sumSize);

		long after = System.currentTimeMillis();
		long time = (after - before);
		System.out.println("time " + time);

	}

}