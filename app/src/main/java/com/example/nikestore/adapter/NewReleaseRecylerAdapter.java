package com.example.nikestore.adapter;

import android.content.Context;
import android.content.Intent;
import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nikestore.DetailsActivity;
import com.example.nikestore.R;
import com.example.nikestore.model.NewRelease;

import java.util.List;

public class NewReleaseRecylerAdapter extends RecyclerView.Adapter<NewReleaseRecylerAdapter.NewReleaseViewHolder> {
    private Context context;
    private List<NewRelease> newReleaseList;

    public NewReleaseRecylerAdapter(Context context, List<NewRelease> newReleaseList){
        this.context = context;
        this.newReleaseList = newReleaseList;
    }




    @Override
    public NewReleaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        view = layoutInflater.inflate(R.layout.new_release_recycler,parent,false);
        final NewReleaseViewHolder  viewholder = new NewReleaseViewHolder (view);
        return  viewholder;

    }


    public void onBindViewHolder(@NonNull NewReleaseRecylerAdapter.NewReleaseViewHolder holder, final int position) {
        holder.itemName.setText(newReleaseList.get(position).getName());
        holder.gender.setText(newReleaseList.get(position).getGender());
        holder.price.setText(newReleaseList.get(position).getPrice());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailsActivity.class);
                intent.putExtra("name",newReleaseList.get(position).getName());
                intent.putExtra("price",newReleaseList.get(position).getPrice());
                context.startActivity(intent);
            }
        });



    }

    @Override
    public int getItemCount() {
        return newReleaseList.size();
    }

    public static class NewReleaseViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView itemImage;
        TextView price,gender,itemName;
        LinearLayout linearLayout_new_release;

        public NewReleaseViewHolder(@NonNull View itemView) {
            super(itemView);
            linearLayout_new_release = itemView.findViewById(R.id.line1_new_release);
            itemImage = itemView.findViewById(R.id.imageView);
            price = itemView.findViewById(R.id.price);
            gender = itemView.findViewById(R.id.gender);
            itemName =itemView.findViewById(R.id.shoename);
        }

        @Override
        public void onClick(View view) {

        }
    }
}
