package demo.leakcanary.srain.in.leakcanarydemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_go_to_test_instance).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToTest();
            }
        });

        findViewById(R.id.btn_go_to_test_runnable).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToRunnable();
            }
        });
    }

    private void goToTest() {
        Intent intent = new Intent(this, TestInstanceActivity.class);
        startActivity(intent);
    }

    private void goToRunnable() {
        Intent intent = new Intent(this, TestRunnableActivity.class);
        startActivity(intent);
    }
}
