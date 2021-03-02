package in.tejas.login;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ToastIntentClass {

    ToastIntentClass(Context context,String message){
        Toast.makeText(context,message, Toast.LENGTH_SHORT).show();
    }

    ToastIntentClass(Context context,Class<?> seconsClass) {
        Intent intent = new Intent(context, seconsClass);
        context.startActivity(intent);
    }

}
