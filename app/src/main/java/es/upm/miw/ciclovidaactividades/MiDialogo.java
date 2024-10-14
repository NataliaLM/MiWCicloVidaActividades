package es.upm.miw.ciclovidaactividades;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class MiDialogo extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_dialog);
    }

    /**
     * Callback method defined by the View
     * @param v View
     */
    public void finishDialog(View v) {
        this.finish();
    }
}
