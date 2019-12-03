package com.wangzhen.sequence.demo;

import android.util.Log;

import com.wangzhen.sequence.SequenceTask;

/**
 * ThreeTask
 * Created by wangzhen on 2019-12-03.
 */
public class ThreeTask extends SequenceTask {
    @Override
    public void run() {
        Log.e("TAG", "-> ThreeTask.run()");
        controller().proceed();
    }
}
