package in.tejas.login;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class Recycleadapter extends RecyclerView.Adapter<Recycleadapter.Myholder> {

    Context context;
    ArrayList<RecycleList> arrayList;

    public Recycleadapter(RecyclerViewDemoActivity recyclerViewDemoActivity, ArrayList<RecycleList> arraylist)
    {
        this.context=recyclerViewDemoActivity;
        this.arrayList=arraylist;
    }

    @NonNull
    @Override
    public Myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_recycle,parent,false);
        return new Recycleadapter.Myholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Myholder holder, int position) {
        holder.name.setText(arrayList.get(position).getName());
        holder.iv.setImageResource(arrayList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class Myholder extends RecyclerView.ViewHolder {
        TextView name;
        ImageView iv;
        public Myholder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.custom_recycle_name);
            iv=itemView.findViewById(R.id.custom_recycle_iv);
        }
    }
}
