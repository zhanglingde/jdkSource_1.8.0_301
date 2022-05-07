package com.ling.juc.demo04;

import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;

/**
 * 生产者、消费者模式
 */
@Slf4j(topic = "c.Producer_Consumer")
public class Producer_Consumer {

    public static void main(String[] args) {
        MessageQueue queue = new MessageQueue(2);

        // 4 个生产者线程
        for (int i = 0; i < 4; i++) {
            int id = i;
            new Thread(() -> {
                queue.put(new Message(id, id));
            }, "生产者" + i).start();
        }

        new Thread(()->{
            while (true) {
                Message message = queue.take();
                log.debug("take message {}",message.getMessage());
            }
        },"消费者").start();
    }

}

@Slf4j(topic = "c.Producer_Consumer")
class MessageQueue {
    private LinkedList<Message> queue;
    private int capacity;

    public MessageQueue(int capacity) {
        this.capacity = capacity;
        queue = new LinkedList<>();
    }

    // 从队列头部获取消息
    public Message take() {
        synchronized (queue) {
            while (queue.isEmpty()) {
                log.debug("queue is empty,wait...");
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Message message = queue.removeFirst();
            queue.notifyAll();
            return message;
        }
    }

    // 从队列尾部添加消息
    public void put(Message message) {
        synchronized (queue) {
            while (queue.size() == capacity) {
                log.debug("queue is full,wait...");
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            queue.addLast(message);
            queue.notifyAll();
        }
    }
}

class Message {
    private int id;
    private Object message;

    public Message(int id, Object message) {
        this.id = id;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public Object getMessage() {
        return message;
    }
}
