package in.tejas.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class CustomListAdapter extends BaseAdapter {

    Context context;
//    String[] technology;
//    int [] images;

    ArrayList<CustomList>   arrayList;

//    public CustomListAdapter(CustomListViewActivity customListViewActivity, String[] technology, int[] images) {
public CustomListAdapter(CustomListViewActivity customListViewActivity, ArrayList<CustomList> arrayList ) {

    this.context=customListViewActivity;
//        this.technology=technology ;
//        this.images=images;
    this.arrayList=arrayList;
    }


    @Override
    public int getCount() {
//        return technology.length;
        return arrayList.size();
    }


    @Override
    public Object getItem(int position) {
//        return technology[position];
        return arrayList.get(position);
    }


    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView= inflater.inflate(R.layout.custom_list,null);
        ImageView imageView=convertView.findViewById(R.id.custom_list_image);
        TextView textView=convertView.findViewById(R.id.custom_list_text);

//        textView.setText(technology[position]);
//        imageView.setImageResource(images[position]);

        textView.setText(arrayList.get(position).getName());
        imageView.setImageResource(arrayList.get(position).getTechImage());

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sn=arrayList.get(position).getName();
                int si=arrayList.get(position).getTechImage();
//                new ToastIntentClass(context,s);
                Intent intent= new Intent(context,DetailsActivity.class);
                Bundle bundle=new Bundle();
                bundle.putString("list_name",sn);
                bundle.putInt("list_iamge",si);
                intent.putExtras(bundle);
                context.startActivity(intent);
            }
        });

        //Picaso
        //Glide
        return convertView;
    }
}
