package com.example.javier.app1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
public static final String EXTRA_MESSAGE = ".MainActivity.EXTRA_MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendmessage(View v){
        Log.d(tag "ID Button");
        EditText editMessage = (EditText)findViewById(R.id.edit_message);
        String message = editMessage.getText().toString();
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
