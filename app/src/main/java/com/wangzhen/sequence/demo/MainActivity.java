package com.wangzhen.sequence.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wangzhen.sequence.SequenceController;
import com.wangzhen.sequence.SequenceControllerImpl;

/**
 * MainActivity
 * Created by wangzhen on 2019-12-03.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SequenceController controller = new SequenceControllerImpl(this);
        controller.enqueue(new OneTask());
        controller.enqueue(new TwoTask());
        controller.enqueue(new ThreeTask());
        controller.proceed();
    }
}
