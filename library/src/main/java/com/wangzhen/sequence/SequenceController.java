package com.wangzhen.sequence;

/**
 * sequence controller
 * Created by wangzhen on 2019/2/12.
 */
public interface SequenceController {
    /**
     * put task into queue
     *
     * @param task task
     */
    void enqueue(SequenceTask task);

    /**
     * remove task from queue
     *
     * @param task task
     */
    void dequeue(SequenceTask task);

    /**
     * remove task from queue and execute the task.
     */
    void proceed();
}
