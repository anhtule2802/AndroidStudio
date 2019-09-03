package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Alert Dialog
    TextView tv_ketqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AlertDialog.Builder mydialog = new AlertDialog.Builder(this);
        mydialog.setTitle("Message");
        tv_ketqua = (TextView)findViewById(R.id.tv_ketqua);
        final CharSequence[] items = {"Đỏ","Vàng","Cam"};
        final boolean[] arrayCheck = {false,false,false};
        mydialog.setMultiChoiceItems(items, arrayCheck, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                arrayCheck[i] = b;
            }
        });
        mydialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String st="";
                for(int j=0;j<items.length;j++)
                    if(arrayCheck[j])
                        st += items[j].toString()+"\n";
                    tv_ketqua.setText(st);
            }
        });
        AlertDialog alertDialog = mydialog.create();
        alertDialog.show();
    }
}
