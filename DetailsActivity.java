package in.tejas.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        imageView=findViewById(R.id.detail_iv);
        textView=findViewById(R.id.detail_text);

        Bundle bundle=getIntent().getExtras();
        textView.setText(bundle.getString("list_name"));
        imageView.setImageResource(bundle.getInt("list_iamge"));
    }
}
