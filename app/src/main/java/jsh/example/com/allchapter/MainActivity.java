package jsh.example.com.allchapter;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        LinearLayout linearLayout= new LinearLayout(this);
        TextView tvTitle = new TextView(this);
        ListView listView = new ListView(this);

        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setBackgroundColor(Color.GREEN);

        ArrayList<Class> testCalsses = new ArrayList<>();
        ArrayList<String> testList = new ArrayList<>();

        //testCalsses.add(ResourceActivity.class);

        //testList.add("리소스");

        listView.setAdapter(new TestAdapter(testList, this));

        tvTitle.setText("chapter 7");

        linearLayout.addView(tvTitle);
        linearLayout.addView(listView);

        setContentView(linearLayout);
    }
}
