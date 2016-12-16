package demo.leakcanary.srain.in.leakcanarydemo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;

public class TestInstanceActivity extends ActionBarActivity {

    private static final String TAG = "TestInstanceActivity";

    private Ponkan mPonkan;
    private byte[] bytes = new byte[40960000];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        // TestDataModel.getInstance().setRetainedTextView(textView);
        mPonkan = Ponkan.getInstance(this);
    }

    @Override
    protected void onDestroy() {
        Log.v("yrc", TAG + " onDestroy");
        super.onDestroy();
    }
}
