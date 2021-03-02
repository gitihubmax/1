package in.tejas.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView email,password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().setTitle("Home");
        email=findViewById(R.id.home_email);
        password=findViewById(R.id.home_password);

        Bundle bundle=getIntent().getExtras();
        String semail=bundle.getString("emailid");
        String spassword=bundle.getString("password");

        email.setText(semail);
        password.setText(spassword);

    }
}
