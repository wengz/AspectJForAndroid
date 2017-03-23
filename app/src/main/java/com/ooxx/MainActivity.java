package com.ooxx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.ooxx.aspectjlib.DebugTrace;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Thread(){

            @Override
            public void run() {
                testFunction();
            }
        }.start();
    }

    @DebugTrace
    private void testFunction (){
        try{
            Log.d("xxx", ""+TestModuleClassA.testFunction());
            Thread.sleep(10);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
