package in.tejas.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityToFragmentActivity extends AppCompatActivity {

    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_fragment);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Activity to Activity
//                new ToastIntentClass(ActivityToFragmentActivity.this,ListViewActivity.class);
//                Activity to Fragment
                FragmentManager manager=getSupportFragmentManager();
                manager.beginTransaction().replace(R.id.activity_layout,new DemoFragment()).addToBackStack("").commit();
            }
        });
    }
}
