package com.example.anuradha.calci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    Button b1,b2;
    EditText e11, e22;
   int i3,i4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.b1);
        b2= (Button) findViewById(R.id.b2);
        // b3= (Button) findViewById(R.id.b3);
        // b4= (Button) findViewById(R.id.b4);
        e11 = (EditText) findViewById(R.id.e1);
        e22 = (EditText) findViewById(R.id.e2);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        // b2.setOnClickListener(this);
        // b3.setOnClickListener(this);
        // b4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        String first=e11.getText().toString();
        String second=e22.getText().toString();
       int i1= Integer.parseInt(first);
        int i2=Integer.parseInt(second);


           if(id==R.id.b2)

           {
               i4 = i1 * i2;

               Toast.makeText(this, "multiply is" + i4, Toast.LENGTH_SHORT).show();
           }
           else if (id==R.id.b1)
           {
                i3=i1+i2;
               Toast.makeText(this, "sum is" + i3, Toast.LENGTH_SHORT).show();
           }
    }
}
