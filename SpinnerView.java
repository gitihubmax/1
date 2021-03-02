package in.tejas.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.GridView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Spinner;

import java.util.ArrayList;

public class SpinnerView extends AppCompatActivity {


    //    String[] technology={"Android","Flutter","React Native","Express JS","Mongo DB","Node JS","Angular JS","ASP.net","CSS","HTML 5","PHP","Python"};
    ArrayList<String> arrayList;

    Spinner spinner;

    AutoCompleteTextView autoCompleteTextView;

    MultiAutoCompleteTextView multiAutoCompleteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_view);



        arrayList=new ArrayList<>();
        arrayList.add("Android");
        arrayList.add("Flutter");
        arrayList.add("React Native");
        arrayList.add("Express JS");
        arrayList.add("Node Js");
        arrayList.add("Mongo DB");
        arrayList.add("angular JS");
        arrayList.add("CSS");
        arrayList.add("HTML");
        arrayList.add("Python");
        arrayList.add("Asp.net");
        arrayList.add("PHP");



        spinner=findViewById(R.id.list_spinner);
        ArrayAdapter spinneradapter= new ArrayAdapter(SpinnerView.this,android.R.layout.simple_list_item_checked,arrayList);
        spinner.setAdapter(spinneradapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                new ToastIntentClass(SpinnerView.this,arrayList.get(position));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        autoCompleteTextView=findViewById(R.id.list_autocomplete);
        ArrayAdapter autoadapter= new ArrayAdapter(SpinnerView.this,android.R.layout.simple_list_item_1,arrayList);
        autoCompleteTextView.setThreshold(1);
        autoCompleteTextView.setAdapter(autoadapter);


        multiAutoCompleteTextView=findViewById(R.id.list_multiautocomplete);
        ArrayAdapter multiautoadapter= new ArrayAdapter(SpinnerView.this,android.R.layout.simple_list_item_1,arrayList);
        multiAutoCompleteTextView.setThreshold(1);
        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
        multiAutoCompleteTextView.setAdapter(multiautoadapter);


    }
}
