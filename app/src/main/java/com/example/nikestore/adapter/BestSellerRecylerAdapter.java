package com.example.nikestore.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nikestore.DetailsActivity;
import com.example.nikestore.R;
import com.example.nikestore.model.BestSeller;

import java.util.List;

public class BestSellerRecylerAdapter extends RecyclerView.Adapter<BestSellerRecylerAdapter.BestSellerHolder> {
    private Context context;
    private List<BestSeller> bestSellers;

    public BestSellerRecylerAdapter(Context context, List<BestSeller> bestSellers) {
        this.context = context;
        this.bestSellers = bestSellers;
    }

    @Override
    public BestSellerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        view = layoutInflater.inflate(R.layout.best_seller_recycler,parent,false);
        final BestSellerHolder bestSellerHolder = new BestSellerHolder(view);
        return bestSellerHolder;






    }

    @Override
    public void onBindViewHolder(@NonNull BestSellerRecylerAdapter.BestSellerHolder holder, final int position) {
        holder.bstname.setText(bestSellers.get(position).getName());
        holder.bstprice.setText(bestSellers.get(position).getPrice());
        holder.bstrating.setText(bestSellers.get(position).getRating());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailsActivity.class);
                intent.putExtra("name",bestSellers.get(position).getName());
                intent.putExtra("rating",bestSellers.get(position).getRating());
                context.startActivity(intent);
            }
        });

    }



    @Override
    public int getItemCount() {
        return bestSellers.size();
    }

    public static class BestSellerHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView bestimage;
        TextView bstprice,bstname,bstrating;
        LinearLayout linearLayout;
        public BestSellerHolder(@NonNull View itemView) {
            super(itemView);
            linearLayout = itemView.findViewById(R.id.line2);
            bestimage = itemView.findViewById(R.id.bestshoe);
            bstrating = itemView.findViewById(R.id.bstrating);
            bstprice = itemView.findViewById(R.id.bstprice);
            bstname = itemView.findViewById(R.id.bstname);






        }

        @Override
        public void onClick(View view) {

        }

    }
}
