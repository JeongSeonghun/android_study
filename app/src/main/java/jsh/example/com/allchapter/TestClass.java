package jsh.example.com.allchapter;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by EMGRAM on 2017-05-11.
 */

public class TestClass {
    Context context;
    ArrayList<Class> testCalsses = new ArrayList<>();
    ArrayList<String> testList = new ArrayList<>();
    LinearLayout linearLayout;
    TextView tvTitle;
    ListView listView;

    public TestClass(Context context){
        this.context = context;
        init();
    }

    private void init(){
        linearLayout= new LinearLayout(context);
        tvTitle = new TextView(context);
        listView = new ListView(context);
    }

    public void setTitle(String title){
        tvTitle.setText(title);
    }

    public void setClass(String testName, Class testClass){
        testList.add(testName);
        testCalsses.add(testClass);
    }

    public void getView(){
        listView.setAdapter(new TestAdapter(testList, context));
        linearLayout.addView(tvTitle);
        linearLayout.addView(listView);
    }

}
