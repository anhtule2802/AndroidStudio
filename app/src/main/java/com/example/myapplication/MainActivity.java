package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv_ketqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AlertDialog.Builder mydialog = new AlertDialog.Builder(this);
        mydialog.setTitle("Message");
        tv_ketqua = (TextView)findViewById(R.id.tv_ketqua);
        final CharSequence[] items = {"Đỏ","Vàng","Cam"};
        mydialog.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                tv_ketqua.setText(items[i].toString());
            }
        });
        AlertDialog alertDialog = mydialog.create();
        alertDialog.show();
    }
}
