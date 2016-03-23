package com.toast.example.supershuttle.toast_message;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToastMessage(View v){
        Toast toast = Toast.makeText(MainActivity.this,"Awesome Guy", Toast.LENGTH_LONG);
        toast.show();
    }

}
