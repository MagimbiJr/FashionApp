package com.tana.fashionapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AppAdapter extends RecyclerView.Adapter<AppAdapter.AppViewHolder> {
    final Context mContext;
    final ArrayList<FashionItems> mFashionItems;

    public AppAdapter(Context context, ArrayList<FashionItems> fashionItems) {
        mContext = context;
        mFashionItems = fashionItems;
    }

    @NonNull
    @Override
    public AppViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.grid_items, parent,false);
        return new AppViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AppViewHolder holder, int position) {
        FashionItems fashionItems = mFashionItems.get(position);
        holder.mItemImage.setImageResource(fashionItems.getImg());
        holder.mMainInfo.setText(fashionItems.getItemInfo());
        holder.mSubInfo.setText(fashionItems.getItemSubInfo());
        holder.mPrice.setText(fashionItems.getPrice());

    }

    @Override
    public int getItemCount() {
        return mFashionItems.size();
    }

    public static class AppViewHolder extends RecyclerView.ViewHolder {
        public ImageView mItemImage;
        public TextView mMainInfo, mSubInfo, mPrice;

        public AppViewHolder(@NonNull View itemView) {
            super(itemView);
            mItemImage = (ImageView) itemView.findViewById(R.id.gvMainImage);
            mMainInfo = (TextView) itemView.findViewById(R.id.tvMainInfo);
            mSubInfo = (TextView) itemView.findViewById(R.id.tvSubInfo);
            mPrice = (TextView) itemView.findViewById(R.id.tvPrice);
        }
    }
}
