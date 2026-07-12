package MultiThreading;
//1114 Print In Order
class Foo {

    private int signal = 1;
    public Foo() {
    }

    public synchronized void first(Runnable printFirst) throws InterruptedException {
        while(signal!=1){
            wait();
        }
        printFirst.run();
        signal = 2;
        notifyAll();
    }

    public synchronized void second(Runnable printSecond) throws InterruptedException {
        while(signal!=2){
            wait();
        }
        printSecond.run();
        signal = 3;
        notifyAll();
    }

    public synchronized void third(Runnable printThird) throws InterruptedException {
        while(signal!=3){
            wait();
        }
        printThird.run();
        notifyAll();
    }
}
