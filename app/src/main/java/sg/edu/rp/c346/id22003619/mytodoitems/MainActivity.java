package sg.edu.rp.c346.id22003619.mytodoitems;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
TextView tv;
ListView lv;
CustomAdapter adapter;
ArrayList<ToDoItem> alItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.tv);
        lv=findViewById(R.id.lvItem);
        alItem=new ArrayList<>();

        Calendar date=Calendar.getInstance();
        date.set(2023,9,19);
        ToDoItem item=new ToDoItem("Brush",date);
        alItem.add(item);

        Calendar date2=Calendar.getInstance();
        date2.set(2022,8,06);
        ToDoItem item2=new ToDoItem("Pick up car",date2);
        alItem.add(item2);

        adapter=new CustomAdapter(this,R.layout.row,alItem);
        lv.setAdapter(adapter);
    }
}