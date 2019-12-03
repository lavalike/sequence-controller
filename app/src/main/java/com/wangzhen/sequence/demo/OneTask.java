package com.wangzhen.sequence.demo;

import android.util.Log;

import com.wangzhen.sequence.SequenceTask;

/**
 * OneTask
 * Created by wangzhen on 2019-12-03.
 */
public class OneTask extends SequenceTask {
    @Override
    public void run() {
        Log.e("TAG", "-> OneTask.run()");
        controller().proceed();
    }
}
