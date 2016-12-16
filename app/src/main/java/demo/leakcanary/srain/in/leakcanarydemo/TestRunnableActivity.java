package demo.leakcanary.srain.in.leakcanarydemo;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.TextView;

public class TestRunnableActivity extends Activity {

    private static final String TAG = "TestRunnableActivity";
    private Handler mHandler = new Handler();
    private Task mTask = new Task();
    private byte[] bytes = new byte[40960000];

    private TextView mTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        mTv = (TextView) findViewById(R.id.test_text_view);
        mHandler.post(mTask);
    }

    @Override
    protected void onDestroy() {
        Log.v("yrc", TAG + " onDestroy");
        mHandler.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    /**
     * task任务
     */
    private class Task implements Runnable {
        @Override
        public void run() {
            mHandler.postDelayed(mTask, 3000);
        }
    }

    private class MyHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            mTv.setText("..............");
        }
    }
}
