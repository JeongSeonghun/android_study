package jsh.example.com.allchapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;

/**
 * Created by EMGRAM on 2017-04-12.
 */

public class TestAdapter extends BaseAdapter{
    ArrayList testList;
    ArrayList<Class> testClassList;
    Context context;
    int selectPosition;
    public TestAdapter(Context context){
        testList= new ArrayList();
        testClassList = new ArrayList<>();
        this.context = context;
    }

    public TestAdapter(ArrayList testList, Context context){
        this.testList= testList;
        this.context= context;
    }

    public void setClasses(ArrayList<Class> classes){
        this.testClassList = classes;
    }
    public void setNames(ArrayList testList){
        this.testList = testList;
    }

    public void add(Object item){
        testList.add(item);
    }

    public void addClasses(ArrayList<Class> classes){
        testClassList.addAll(classes);
    }

    @Override
    public int getCount() {
        return testList.size();
    }

    @Override
    public Object getItem(int position) {
        return testClassList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LinearLayout linearLayout = new LinearLayout(context);
        //TextView textView = new TextView(context);
        Button button = new Button(context);

        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setBackgroundColor(Color.GREEN);

        //linearLayout.addView(textView);
        linearLayout.addView(button);

        if(testList.get(position) instanceof String){
            //textView.setText((String)testList.get(position));
            button.setText((String)testList.get(position));
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, testClassList.get(position));
                context.startActivity(intent);
            }
        });
        return linearLayout;
    }
}
