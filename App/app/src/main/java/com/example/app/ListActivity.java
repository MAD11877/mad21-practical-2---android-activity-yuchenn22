package com.example.app;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import java.util.Random;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ImageView imageviewbutton = findViewById(R.id.imageView2);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        Random rand = new Random();
        int int_random = rand.nextInt(10);
        imageviewbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Button Pressed!");

                builder.setTitle("Profile");
                builder.setMessage("MADness");
                builder.setCancelable(true);
                builder.setPositiveButton("View", new
                        DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog, int id){
                                Intent activityName = new Intent(ListActivity.this,MainActivity.class);
                                Random rand = new Random();
                                int randomint = rand.nextInt(100000);
                                activityName.putExtra("value", randomint);
                                startActivity(activityName);
                            }
                        });
                builder.setNegativeButton("Close", new
                        DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog, int id){
                            }
                        });
                AlertDialog dialog
                        = builder.create();
                dialog.show();
            }
        });
    }
}