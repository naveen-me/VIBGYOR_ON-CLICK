package com.naveen.vibgyoronclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void red(View view) {
        Toast.makeText(this,"red is selected",Toast.LENGTH_LONG).show();
        Log.e("PRS","red: user clicked on red");
    }
    public void orange(View view) {
        Toast.makeText(this,"orange is selected",Toast.LENGTH_LONG).show();
        Log.e("PRS","orange: user clicked on orange");
    }
    public void yellow(View view) {
        Toast.makeText(this,"yellow is selected",Toast.LENGTH_LONG).show();
        Log.e("PRS","yellow: user clicked on yellow");
    }
    public void green(View view) {
        Toast.makeText(this,"green is selected",Toast.LENGTH_LONG).show();
        Log.e("PRS", "green: user clicked on green");
    }
    public void blue(View view) {
        Toast.makeText(this,"blue is selected",Toast.LENGTH_LONG).show();
        Log.e("PRS", "blue: user clicked on blue");
    }
    public void indigo(View view) {
        Toast.makeText(this,"indigo is selected",Toast.LENGTH_LONG).show();
        Log.e("PRS", "indigo: user clicked on indigo");
    }
    public void violet(View view) {
        Toast.makeText(this,"violet is selected",Toast.LENGTH_LONG).show();
        Log.e("PRS", "violet: user clicked on violet");
    }
}
