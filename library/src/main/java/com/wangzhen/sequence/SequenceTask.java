package com.wangzhen.sequence;

import android.app.Activity;

/**
 * sequence task, you need extends this
 * Created by wangzhen on 2019/2/12.
 */
public abstract class SequenceTask {
    private SequenceController controller;
    private Activity activity;

    /**
     * attach sequence controller
     *
     * @param controller controller
     */
    public void attachController(SequenceController controller) {
        this.controller = controller;
    }


    /**
     * attach Activity
     *
     * @param activity activity
     */
    public void attachActivity(Activity activity) {
        this.activity = activity;
    }

    /**
     * get attached sequence controller
     *
     * @return controller
     */
    protected SequenceController controller() {
        return controller;
    }

    /**
     * get attached sequence activity
     *
     * @return activity
     */
    protected Activity activity() {
        return activity;
    }

    /**
     * execute task
     */
    public abstract void run();
}
