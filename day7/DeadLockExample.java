package com.celcom.day7;

//Inter_Thread_Communication
class Resource {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

class Reader extends Thread {
    Resource resource;

    Reader(Resource resource) {
        this.resource = resource;
    }

    public void run() {
        synchronized (resource) {
            System.out.println("Reader is waiting for writer to write data");
            try {
                resource.wait(); // Reader waits for writer to notify it
            } catch (InterruptedException e) {
                System.out.println("Reader interrupted");
            }
            // After receiving notification, Reader prints the data
            System.out.println("Data from Reader: " + resource.getData());
        }
    }
}

class Writer extends Thread {
    Resource resource;

    Writer(Resource resource) {
        this.resource = resource;
    }

    public void run() {
        synchronized (resource) {
            System.out.println("Writer is writing the data...");
            resource.setData("Hello Reader");
            resource.notify(); // Notify the Reader thread after writing data
        }
    }
}

public class DeadLockExample {
    public static void main(String[] args) throws InterruptedException {
        Resource resource = new Resource();

        Reader reader = new Reader(resource);
        reader.start(); 
        
        Thread.sleep(10000);

        Writer writer = new Writer(resource);
        writer.start(); 
    }
}
