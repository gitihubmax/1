package in.tejas.login;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class ExpandAdapter extends BaseExpandableListAdapter {

    Context context;
    ArrayList<ParentList> arrayList;
    LayoutInflater inflater;

    public ExpandAdapter(ExpandListActivity expandListActivity, ArrayList<ParentList> arrayParentLists) {
        this.context=expandListActivity;
        arrayList=arrayParentLists;
        inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getGroupCount() {
        return arrayList.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return arrayList.get(groupPosition).getArrayChild().size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return arrayList.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return arrayList.get(groupPosition).getArrayChild().get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        convertView= inflater.inflate(R.layout.custom_list,null);
        ImageView imageView=convertView.findViewById(R.id.custom_list_image);
        TextView textView=convertView.findViewById(R.id.custom_list_text);
        textView.setText(arrayList.get(groupPosition).getName());
        imageView.setImageResource(arrayList.get(groupPosition ).getImage());
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        convertView= inflater.inflate(R.layout.custom_chld,null);
        TextView textView=convertView.findViewById(R.id.custom_child_name);
        textView.setText(arrayList.get(groupPosition).getArrayChild().get(childPosition).getChildName());
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
