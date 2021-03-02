package in.tejas.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SplashNext extends AppCompatActivity {

    Button atof,logindemo,listviewdemo,spinnerdemo,tabdemo,customdemo,recyclerdemo,expanddemo,sqlitedemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_next);

        atof=findViewById(R.id.sp_atof);
        logindemo=findViewById(R.id.sp_login);
        listviewdemo=findViewById(R.id.sp_listview);
        spinnerdemo=findViewById(R.id.sp_spinner);
        tabdemo=findViewById(R.id.sp_tab);
        customdemo=findViewById(R.id.sp_custom);
        recyclerdemo=findViewById(R.id.sp_recycle);
        expanddemo=findViewById(R.id.sp_expand);
        sqlitedemo=findViewById(R.id.sp_sqlite);



        logindemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new ToastIntentClass(SplashNext.this,MainActivity.class);
            }
        });

        listviewdemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new ToastIntentClass(SplashNext.this,ListViewActivity.class);
            }
        });

        spinnerdemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new ToastIntentClass(SplashNext.this,SpinnerView.class);
            }
        });

        atof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new ToastIntentClass(SplashNext.this,ActivityToFragmentActivity.class);
            }
        });

        tabdemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new ToastIntentClass(SplashNext.this,TabDemoActivity.class);
            }
        });

        customdemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new ToastIntentClass(SplashNext.this,CustomListViewActivity.class);
            }
        });

        recyclerdemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new ToastIntentClass(SplashNext.this,RecyclerViewDemoActivity.class);
            }
        });

        expanddemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new ToastIntentClass(SplashNext.this,ExpandListActivity.class);
            }
        });

        sqlitedemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new ToastIntentClass(SplashNext.this,SqliteDatabaseActivity.class);
            }
        });
    }
}
