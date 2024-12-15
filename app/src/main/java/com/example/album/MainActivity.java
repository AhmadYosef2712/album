package com.example.album;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageButton n,b;
    private ImageView main;
    int counter=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main=findViewById(R.id.mainIMG);
        n=findViewById(R.id.next);
        n.setOnClickListener(this);
        b=findViewById(R.id.back);
        b.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.next && counter!=5)
            counter++;
        else
        {counter=1;main.setImageResource(R.drawable.a);}

        if(v.getId()==R.id.back && counter!=1)
            counter--;
        if (counter==1)
            main.setImageResource(R.drawable.a);
        if (counter==2)
            main.setImageResource(R.drawable.b);
        if (counter==3)
            main.setImageResource(R.drawable.c);
        if (counter==4)
            main.setImageResource(R.drawable.d);
        if (counter==5)
            main.setImageResource(R.drawable.e);
    }
}
