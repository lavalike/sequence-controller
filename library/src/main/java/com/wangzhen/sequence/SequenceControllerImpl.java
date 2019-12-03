package com.wangzhen.sequence;

import android.app.Activity;

import java.util.LinkedList;
import java.util.Queue;

/**
 * the default sequence controller implementation
 * Created by wangzhen on 2019-12-03.
 */
public final class SequenceControllerImpl implements SequenceController {
    private Activity activity;
    private Queue<SequenceTask> mTaskQueue = new LinkedList<>();

    public SequenceControllerImpl(Activity activity) {
        if (activity == null)
            throw new NullPointerException("null activity is not permitted");
        this.activity = activity;
    }

    @Override
    public void enqueue(SequenceTask task) {
        task.attachController(this);
        task.attachActivity(activity);
        mTaskQueue.offer(task);
    }

    @Override
    public void dequeue(SequenceTask task) {
        mTaskQueue.remove(task);
    }

    @Override
    public void proceed() {
        if (!mTaskQueue.isEmpty()) {
            mTaskQueue.poll().run();
        }
    }
}
