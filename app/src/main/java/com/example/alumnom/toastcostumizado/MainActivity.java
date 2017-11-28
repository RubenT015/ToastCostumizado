package com.example.alumnom.toastcostumizado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pulsar(View v){
        LayoutInflater inflater = getLayoutInflater();
        View miLayout = inflater.inflate(R.layout.toast_costumizado,(ViewGroup) findViewById(R.id.layoutToastCostumizado));

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(miLayout);

        tv1=(TextView)miLayout.findViewById(R.id.tv1);
        tv1.setText(R.string.textoToast);

        toast.show();
    }
}
