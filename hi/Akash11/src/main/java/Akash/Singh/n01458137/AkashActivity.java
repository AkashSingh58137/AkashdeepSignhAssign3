package Akash.Singh.n01458137;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class AkashActivity extends AppCompatActivity {

    Button btn;
    Button btn1;
    EditText et;
    String st;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn2);
        et = (EditText) findViewById(R.id.text1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                st = et.getText().toString();
                Snackbar snackbar = Snackbar.make(findViewById(R.id.root), getString(R.string.Snackbar), BaseTransientBottomBar.LENGTH_INDEFINITE);
                snackbar.setAction("Continue", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(AkashActivity.this, SinghActivity.class);
                        intent.putExtra("key", st);
                        startActivity(intent);
                    }
                });
                snackbar.show();

            }



        });
    }
    public void Browser(View view)
    {

        Intent intent= null;
        intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.humber.ca"));
        startActivity(intent);
        Context context= getApplicationContext();
        Toast toast = Toast.makeText(context,getString(R.string.toast),Toast.LENGTH_SHORT);
         toast.show();
    }












}