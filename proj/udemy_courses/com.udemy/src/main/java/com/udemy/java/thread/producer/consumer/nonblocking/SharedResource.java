package com.udemy.java.thread.producer.consumer.nonblocking;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class SharedResource
{
    List<Integer> questions;
    AtomicInteger LIMIT;

    public SharedResource(List<Integer> questions, AtomicInteger lIMIT)
    {
        super();
        this.questions = questions;
        LIMIT = lIMIT;
    }
}
