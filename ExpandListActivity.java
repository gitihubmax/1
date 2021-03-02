package in.tejas.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;

public class ExpandListActivity extends AppCompatActivity {

    ExpandableListView expandableListView;
    String[] technology={"Android","Java","Php","Ios"};
    int[] image={R.drawable.airtel,R.drawable.bcci,R.drawable.snack,R.drawable.indiamap};
    ArrayList<ParentList> arrayParentLists;
    ArrayList<ChildList> arrayChildList;

    String[] androidArray={"Toast","Intent","Fragment","Listview"};
    String[] javaArray={"Core Java","Spring","Hibernet","JSF"};
    String[] phpArray={"Core Php","Wordpress","Laravel"};
    String[] iosArray={"Swift","Dart"};

    ExpandAdapter expandAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expand_list);
        expandableListView=findViewById(R.id.expand_list);
        arrayParentLists=new ArrayList<>();
        for(int i=0;i<technology.length;i++)
        {
            ParentList list=new ParentList();
            list.setName(technology[i]);
            list.setImage(image[i]);


            if(i==0)
            {
                arrayChildList=new ArrayList<>();
                for(int j=0;j<androidArray.length;j++)
                {
                    ChildList cList=new ChildList();
                    cList.setChildName(androidArray[j]);
                    arrayChildList.add(cList);
                }
                list.setArrayChild(arrayChildList);
            }

            if(i==1)
            {
                arrayChildList=new ArrayList<>();
                for(int j=0;j<javaArray.length;j++)
                {
                    ChildList cList=new ChildList();
                    cList.setChildName(javaArray[j]);
                    arrayChildList.add(cList);
                }
                list.setArrayChild(arrayChildList);
            }

            if(i==2)
            {
                arrayChildList=new ArrayList<>();
                for(int j=0;j<phpArray.length;j++)
                {
                    ChildList cList=new ChildList();
                    cList.setChildName(phpArray[j]);
                    arrayChildList.add(cList);
                }
                list.setArrayChild(arrayChildList);
            }

            if(i==3)
            {
                arrayChildList=new ArrayList<>();
                for(int j=0;j<iosArray.length;j++)
                {
                    ChildList cList=new ChildList();
                    cList.setChildName(iosArray[j]);
                    arrayChildList.add(cList);
                }
                list.setArrayChild(arrayChildList);
            }


            arrayParentLists.add(list);
        }
        expandAdapter=new ExpandAdapter(ExpandListActivity.this,arrayParentLists);
        expandableListView.setAdapter(expandAdapter);

    }
}
