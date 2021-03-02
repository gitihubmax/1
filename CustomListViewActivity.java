package in.tejas.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class CustomListViewActivity extends AppCompatActivity {

    GridView listView;

    String[] technology={"Android","java","ios","Flutter","React Native","Express JS"};
    int []images={R.drawable.indiamap,R.drawable.airtel,R.drawable.bcci,R.drawable.snack,R.mipmap.ic_launcher,R.drawable.ic_launcher_background};

    ArrayList<CustomList> arrayList;

    CustomListAdapter customListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);
        listView=findViewById(R.id.custom_listview);
        arrayList=new ArrayList<>();
        for(int i=0;i<technology.length;i++)
        {
            CustomList list=new CustomList();
            list.setName(technology[i]);
            list.setTechImage(images[i]);
            arrayList.add(list);
        }
//        customListAdapter= new CustomListAdapter(CustomListViewActivity.this,technology,images);
        customListAdapter= new CustomListAdapter(CustomListViewActivity.this,arrayList);

        listView.setAdapter(customListAdapter);

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String s = arrayList.get(position).getName();
//                new ToastIntentClass(CustomListViewActivity.this,s);
//            }
//        });
    }
}
