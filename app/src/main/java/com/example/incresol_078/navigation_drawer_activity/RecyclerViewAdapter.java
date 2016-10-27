package com.example.incresol_078.navigation_drawer_activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Incresol-078 on 16-09-2016.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private static ArrayList<String> mDataset;



public RecyclerViewAdapter(){
    super();
}



    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView textView_description;
        public RelativeLayout rowlayout_main;
        private final Context context;

        public ViewHolder(View itemView) {
            super(itemView);
            textView_description=(TextView)itemView.findViewById(R.id.textView_description);
            rowlayout_main=(RelativeLayout)itemView.findViewById(R.id.rowlayout_main);
            itemView.setOnClickListener(this);
            context = itemView.getContext();

        }

        @Override
        public void onClick(View v) {
            Intent intent=null;
            switch (getPosition()){
                case 0:
                    intent =  new Intent(context, SubNotification.class);
                    break;
                default:
                    break;

            }
            context.startActivity(intent);
        }

    }

    public void add(int position, String item){
        mDataset.add(position,item);
        notifyItemInserted(position);
    }

    public void remove(String item){
        int position=mDataset.indexOf(item);
        mDataset.remove(position);
        notifyItemRemoved(position);
    }


    public RecyclerViewAdapter(ArrayList<String> myDataSet){
        mDataset=myDataSet;
    }

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.rowlayout,parent,false);
        ViewHolder viewHolder=new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final String name=mDataset.get(position);
        holder.textView_description.setText(mDataset.get(position));

    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
