package com.udemy.java.thread.producer.consumer.blocking;

import java.util.concurrent.BlockingQueue;

public class SharedResource
{
    BlockingQueue<Integer> questions;

    public SharedResource(BlockingQueue<Integer> questions)
    {
        super();
        this.questions = questions;
    }
}
