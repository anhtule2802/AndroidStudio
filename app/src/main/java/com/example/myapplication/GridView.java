package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class GridView extends AppCompatActivity {
    String arr[] ={"Ipad","Iphone","New Ipad",
    "SamSung","Nokia","Sony Ericson","LG","Q-Mobile","HTC"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        final TextView selection =(TextView)findViewById(R.id.textView3);
        final GridView gv = (GridView)findViewById(R.id.gridView);
        ArrayAdapter<String> ds = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arr);
        gv.setAdapter(ds);
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
           public void onItemClick(AdapterView<?> arg0,View arg1,int arg2,long arg3){
               selection.setText(arr[arg2]);
           }
        });
    }
}
