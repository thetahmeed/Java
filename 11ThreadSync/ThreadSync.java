class Table {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.print(n * i + " ");

            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class MyThread1 extends Thread {
    Table t;

    MyThread1(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class MyThread2 extends Thread {
    Table t;

    MyThread2(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}

class ThreadSync {
    public static void main(String[] srgs) {
        Table table = new Table();

        MyThread1 myThread1 = new MyThread1(table);
        MyThread2 myThread2 = new MyThread2(table);

        myThread1.start();
        myThread2.start();
    }
}
