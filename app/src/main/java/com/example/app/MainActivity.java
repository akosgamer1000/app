package com.example.app;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listwiew;
    List<Pojo> li;
    Myadapter my;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        init();
    }
    public void init(){
        listwiew=findViewById(R.id.list);
        li=new ArrayList<>();

        li.add(new Pojo(R.drawable.ic_wifi,"valami","valaki"));
        li.add(new Pojo(R.drawable.ic_wifi,"valami","valaki"));
        li.add(new Pojo(R.drawable.ic_wifi,"valami","valaki"));
        li.add(new Pojo(R.drawable.ic_wifi,"valami","valaki"));
        li.add(new Pojo(R.drawable.ic_wifi,"valami","valaki"));
        li.add(new Pojo(R.drawable.ic_wifi,"valami","valaki"));
        li.add(new Pojo(R.drawable.ic_wifi,"valami","valaki"));
        li.add(new Pojo(R.drawable.ic_wifi,"valami","valaki"));
        li.add(new Pojo(R.drawable.ic_wifi,"valami","valaki"));
        li.add(new Pojo(R.drawable.ic_wifi,"valami","valaki"));
        my=new Myadapter(MainActivity.this,li);
        listwiew.setAdapter(my);
    }
}