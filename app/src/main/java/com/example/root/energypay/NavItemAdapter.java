package com.example.root.energypay;

import android.app.Application;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

/**
 * Created by root on 1/12/16.
 */
public class NavItemAdapter extends RecyclerView.Adapter<NavItemAdapter.MyViewHolder> {

    private List<NavItems> list = Collections.emptyList();
    private LayoutInflater inflater;
    Context context;

    public NavItemAdapter(List<NavItems> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.nav_rows, parent, false);
        MyViewHolder holder = new MyViewHolder(v);
        return holder;

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.title.setText(list.get(position).title);
        //holder.imageView.setImageResource(list.get(position).imageId);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView title;
        //ImageView imageView;

        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.text);
            //imageView = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }
}
