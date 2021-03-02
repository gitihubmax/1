package in.tejas.login;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class SqliteDatabaseActivity extends AppCompatActivity {

    EditText rollno,name,marks;
    Button insert,show,update,delete,search;
    ListView listview;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite_database);

        db=openOrCreateDatabase("Student",MODE_PRIVATE,null);
        String tablequery="create table if not exists record(roll int(10),name varchar(255),mark int(3))";
        db.execSQL(tablequery);

        rollno=findViewById(R.id.sqlite_roll);
        name=findViewById(R.id.sqlite_name);
        marks=findViewById(R.id.sqlite_mark);
        insert=findViewById(R.id.sqlite_insert);
        show.findViewById(R.id.sqlite_show);
        listview.findViewById(R.id.sqlite_list);
//        update.findViewById(R.id.sqlite_update);
//        delete.findViewById(R.id.sqlite_delete);
//        search.findViewById(R.id.sqlite_search);

//        search.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String searchQuery="select * from record where roll='"+rollno.getText().toString()+"'";
//                Cursor cursor=db.rawQuery(searchQuery,null);
//                if(cursor.moveToFirst())
//                {
//                    do {
//                        rollno.setText(cursor.getString(0));
//                        name.setText(cursor.getString(1));
//                        marks.setText(cursor.getString(2));
//                    }while (cursor.moveToNext());
//                }
//            }
//        });


        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String showQuery="select * from record";
//                Cursor cursor=db.rawQuery(showQuery,null);
//                if(cursor.moveToNext())
//                {
//                    ArrayList<String> arrayList=new ArrayList();
//                    do {
//                        arrayList.add(
//                                "Roll No : " +cursor.getString(0)
//                                        +"\n"+
//                                        "Name :" +cursor.getString(1)
//                                        +"\n"+
//                                        "Mark: "+cursor.getString(2)
//                        );
//                    }while (cursor.moveToNext());
//
//                    ArrayAdapter adapter=new ArrayAdapter(SqliteDatabaseActivity.this,android.R.layout.simple_list_item_1,arrayList);
//                    listview.setAdapter(adapter);
//                }
            }
        });

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rollno.getText().toString().equals(""))
                {
                    rollno.setError("Roll no Required");
                }
                else if(name.getText().toString().equals(""))
                {
                    name.setError("Name Required");
                }
                else if(marks.getText().toString().equals(""))
                {
                    marks.setError("marks Required");
                }
                else
                {
                    String insertQuery="insert into record values('"+rollno.getText().toString()+"','"+name.getText().toString()+"','"+marks.getText().toString()+"')";
                    db.execSQL(insertQuery);
                    new ToastIntentClass(SqliteDatabaseActivity.this,"Insert Successfully");
                    clearData();
                }

            }
        });

//        update.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(rollno.getText().toString().equals(""))
//                {
//                    rollno.setError("Roll no Required");
//                }
//                else if(name.getText().toString().equals(""))
//                {
//                    name.setError("Name Required");
//                }
//                else if(marks.getText().toString().equals(""))
//                {
//                    marks.setError("marks Required");
//                }
//                else
//                {
//                    String updateQuery="update record set name='"+name.getText().toString()+"', mark='"+marks.getText().toString()+"' where roll='"+rollno.getText().toString()+"'";
//                    db.execSQL(updateQuery);
//                    new ToastIntentClass(SqliteDatabaseActivity.this,"Update Successfully");
//                    clearData();
//                }
//
//            }
//        });

//        delete.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(rollno.getText().toString().equals(""))
//                {
//                    rollno.setError("Roll no Required");
//                }
//                else
//                {
//                    String deleteeQuery="delete from reocrd where roll='"+rollno.getText().toString()+"'";
//                    db.execSQL(deleteeQuery);
//                    new ToastIntentClass(SqliteDatabaseActivity.this,"Delete Successfully");
//                    clearData();
//                }
//
//            }
//        });

    }
    private void clearData()
    {
        rollno.setText("");
        name.setText("");
        marks.setText("");
    }
}
