package com.example.demo;

public class TestAbc implements Runnable {
    public TestAbc(){
        System.out.println("--->construct111");
    }
    public TestAbc(String a){
        System.out.println("--->construct"+a);
    }
    private String  abc;

    public String getAbc() {
        return abc;
    }

    public void setAbc(String abc) {
        this.abc = abc;
    }

    @Override
    public void run() {
        System.out.println("---------->");
    }

    public static void main(String[] args) throws InterruptedException {
//        new Thread(new TestAbc()).start();
        Runnable runnable = TestAbc::new;
        runnable.run();

        Runnable runnable2 = ()->new TestAbc();
        runnable2.run();
        new Thread(TestAbc::new).start();
        new Thread(()->new TestAbc()).start();
//        new Thread(()->{
//            System.out.println("---->");
//        }).start();
//        Thread.sleep(100000);
    }
}
