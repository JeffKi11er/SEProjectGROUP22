package com.example.uibeautifulcollection2.adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.uibeautifulcollection2.R;
import com.example.uibeautifulcollection2.item.DashBoardItem;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.List;

public class AdapterDashboard extends RecyclerView.Adapter<AdapterDashboard.DashHolder> {
    private Context context;
    private List<DashBoardItem>boardItems;

    public AdapterDashboard(Context context, List<DashBoardItem> boardItems) {
        this.context = context;
        this.boardItems = boardItems;
    }

    @NonNull
    @Override
    public DashHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_dashboard,parent,false);
        return new DashHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull DashHolder holder, final int position) {
        holder.tvDash.setText(boardItems.get(position).getTextD());
        holder.imgDash.setImageResource(boardItems.get(position).getImageD());
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return boardItems.size();
    }

    public static class DashHolder extends RecyclerView.ViewHolder{
        private TextView tvDash;
        private ImageView imgDash;
        public DashHolder(@NonNull View itemView) {
            super(itemView);
            tvDash = (TextView) itemView.findViewById(R.id.tv_dashboard);
            imgDash = (ImageView)itemView.findViewById(R.id.img_dashboard);
        }
    }
}
