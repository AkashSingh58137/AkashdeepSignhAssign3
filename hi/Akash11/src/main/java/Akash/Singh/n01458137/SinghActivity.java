package Akash.Singh.n01458137;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SinghActivity extends AppCompatActivity {
    TextView tv;
    String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singh);
        tv = (TextView) findViewById(R.id.txt3);
        Intent intent = getIntent();
        st = intent.getStringExtra("key");
        tv.setText(st);
    };

}
