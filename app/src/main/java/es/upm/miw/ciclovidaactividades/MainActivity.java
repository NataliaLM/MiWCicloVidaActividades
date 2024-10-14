package es.upm.miw.ciclovidaactividades;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends Activity {

    private static final String MI_TAG = "MiW";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(MI_TAG, "onCreate()");
        Log.i(MI_TAG, "- CREATED");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i(MI_TAG, "onStart()");
        Log.i(MI_TAG, "- STARTED");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i(MI_TAG, "onResume()");
        Log.i(MI_TAG, "- RESUMED");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i(MI_TAG, "onPause()");
        Log.i(MI_TAG, "- PAUSED");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i(MI_TAG, "onStop()");
        Log.i(MI_TAG, "- STOPPED");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.i(MI_TAG, "onRestart()");
    }

    @Override
    protected void onDestroy() {
        Log.i(MI_TAG, "onDestroy()");
        Log.i(MI_TAG, "- DESTROYED");

        super.onDestroy();
    }

    public void lanzarDialogo(View v) {
        Intent intent = new Intent(getApplicationContext(), MiDialogo.class);
        startActivity(intent);
    }
}
