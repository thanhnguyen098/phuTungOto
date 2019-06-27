package com.thanhnguyen.CarAccessories.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.thanhnguyen.CarAccessories.R;

public class RcvSlidingMenuAdapter extends RecyclerView.Adapter<RcvSlidingMenuAdapter.ItemViewHolder> {


    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_rcv_sliding_menu, null);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {
        ImageView imgSlidingIcon;
        TextView txtSlidingContent;
        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            imgSlidingIcon = itemView.findViewById(R.id.img_item_slidingMenu);
            txtSlidingContent = itemView.findViewById(R.id.txt_content);
        }
    }
}
