package in.tejas.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    ImageView imageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();

        imageView=findViewById(R.id.splash_iv);

        AlphaAnimation animation=new AlphaAnimation(0,1);
//        animation.setRepeatCount(4);
        animation.setDuration(2700);
        imageView.startAnimation(animation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
//                new ToastIntentClass(SplashActivity.this,ActivityToFragmentActivity.class);
//                new ToastIntentClass(SplashActivity.this,SqliteDatabaseActivity.class);
                new ToastIntentClass(SplashActivity.this,SplashNext.class);
                finish();
            }
        },3000);
    }
}
