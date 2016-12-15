package demo.leakcanary.srain.in.leakcanarydemo;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class TestRunnableActivity extends Activity {

    private static final String TAG = "TestRunnableActivity";
    private Handler mHandler = new Handler();
    private Task mTask = new Task();
    private byte[] bytes = new byte[40960000];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        mHandler.post(mTask);
    }

    @Override
    protected void onDestroy() {
        Log.v("yrc", TAG + " onDestroy");
        mHandler.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    private class Task implements Runnable {
        @Override
        public void run() {
            mHandler.postDelayed(mTask, 3000);
        }
    }
}
