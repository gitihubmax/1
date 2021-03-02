package in.tejas.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecyclerViewDemoActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    String[] technology={"Android","java","ios","Flutter","React Native","Express JS"};
    int []images={R.drawable.indiamap,R.drawable.airtel,R.drawable.bcci,R.drawable.snack,R.mipmap.ic_launcher,R.drawable.ic_launcher_background};

    ArrayList<RecycleList> arrayList;

    Recycleadapter recycleadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_demo);
        recyclerView=findViewById(R.id.recycleview);
        recyclerView.setLayoutManager(new LinearLayoutManager(RecyclerViewDemoActivity.this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setNestedScrollingEnabled(false);
        arrayList=new ArrayList<>();
        for(int i=0;i<technology.length;i++)
        {
            RecycleList list=new RecycleList();
            list.setName(technology[i]);
            list.setImage(images[i]);
            arrayList.add(list);
        }
        recycleadapter=new Recycleadapter(RecyclerViewDemoActivity.this,arrayList);
        recyclerView.setAdapter(recycleadapter);


    }
}
