package com.wangzhen.sequence.demo;

import android.util.Log;

import com.wangzhen.sequence.SequenceTask;

/**
 * TwoTask
 * Created by wangzhen on 2019-12-03.
 */
public class TwoTask extends SequenceTask {
    @Override
    public void run() {
        Log.e("TAG", "-> TwoTask.run()");
        controller().proceed();
    }
}
