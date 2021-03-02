package in.tejas.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    GridView listView;
//    String[] technology={"Android","Flutter","React Native","Express JS","Mongo DB","Node JS","Angular JS","ASP.net","CSS","HTML 5","PHP","Python"};
    ArrayList<String> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listView = findViewById(R.id.list_view);

        arrayList=new ArrayList<>();
        arrayList.add("Android");
        arrayList.add("Flutter");
        arrayList.add("React Native");
        arrayList.add("Express JS");
        arrayList.add("Node Js");
        arrayList.add("Mongo DB");
        arrayList.add("angular JS");
        arrayList.add("CSS");
        arrayList.add("HTML");
        arrayList.add("Python");
        arrayList.add("Asp.net");
        arrayList.add("PHP");



        final ArrayAdapter adapter=new ArrayAdapter(ListViewActivity.this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(adapter);




        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

//                new ToastIntentClass(ListViewActivity.this,technology[position]);

//               String s= parent.getItemAtPosition(position).toString();
//               String s= parent.getItemAtPosition(position)+ "";
//                String s= (String) parent.getItemAtPosition(position);
//                String s= String.valueOf(parent.getItemAtPosition(position));

//                new ToastIntentClass(ListViewActivity.this,s);

                new ToastIntentClass(ListViewActivity.this,arrayList.get(position));
            }
        });
    }
}
