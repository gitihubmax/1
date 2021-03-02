package in.tejas.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    Button login;
    //Context context = this;

    EditText email,password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        login = findViewById(R.id.main_login);
        email = findViewById(R.id.main_email);
        password = findViewById(R.id.main_password);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(email.getText().toString().trim().equals("")){
                    email.setError("Email Id Required");
                }
                else if(password.getText().toString().trim().equals("")){
                    password.setError("Password Required");
                }
                else {
                    if(email.getText().toString().equals("admin@gmail.com") && password.getText().toString().equalsIgnoreCase("Admin")) {
                        Log.d("Login", "login successful");
                        Log.e("Login", "Login successfully");
                        //(1)Toast.makeText(getApplicationContext())
                        //(2)Toast.makeText(this)
                        //(3)Toast.makeText(context)
                        //Toast.makeText(MainActivity.this,"Login Successfully", Toast.LENGTH_SHORT).show();
                        new ToastIntentClass(MainActivity.this, "Login Successfully");
                        Snackbar.make(view, "Login successful", Snackbar.LENGTH_LONG).show();
                        Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                        Bundle bundle=new Bundle();
                        bundle.putString("emailid",email.getText().toString());
                        bundle.putString("password",password.getText().toString());
                        intent.putExtras(bundle);
                        startActivity(intent);
//                        new ToastIntentClass(MainActivity.this,HomeActivity.class);

                    }
                    else{
                        new ToastIntentClass(MainActivity.this,"Login Unsuccessfully");
                    }
                }
            }
        });
    }
}
