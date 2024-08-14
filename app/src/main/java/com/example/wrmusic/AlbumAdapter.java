package com.example.wrmusic;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.AlbumHolder> {

    private ArrayList<SetterGetter> listData;

    public AlbumAdapter(ArrayList<SetterGetter> listData) {
        this.listData = listData;
    }

    @NonNull
    @Override
    public AlbumHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dashboard, parent, false);
        AlbumHolder holder = new AlbumHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull AlbumHolder holder, int position) {
        final SetterGetter getData = listData.get(position);
        String album_img = getData.getAlbum_img();
        String album_name = getData.getAlbum_name();
        String artist_name = getData.getArtist_name();
        String album_desc = getData.getAlbum_desc();

        if(album_img.equals("album_img1")) {
            holder.album_img_menu.setImageResource(R.drawable.nav_home);
        } else if(album_img.equals("album_img2")) {
            holder.album_img_menu.setImageResource(R.drawable.nav_home);
        } else if(album_img.equals("album_img3")) {
            holder.album_img_menu.setImageResource(R.drawable.nav_home);
        } else if(album_img.equals("album_img4")) {
            holder.album_img_menu.setImageResource(R.drawable.nav_home);
        } else if(album_img.equals("album_img5")) {
            holder.album_img_menu.setImageResource(R.drawable.nav_home);
        } else if(album_img.equals("album_img6")) {
            holder.album_img_menu.setImageResource(R.drawable.nav_home);
        } else if(album_img.equals("album_img7")) {
            holder.album_img_menu.setImageResource(R.drawable.nav_home);
        } else if(album_img.equals("album_img8")) {
            holder.album_img_menu.setImageResource(R.drawable.nav_home);
        }

        holder.album_name_menu.setText(album_name);
        holder.artist_name_menu.setText(artist_name);
        holder.album_desc_menu.setText(album_desc);
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class AlbumHolder extends RecyclerView.ViewHolder {

        ImageView album_img_menu;
        TextView album_name_menu;
        TextView artist_name_menu;
        TextView album_desc_menu;

        public AlbumHolder(@NonNull View itemView) {
            super(itemView);

            album_img_menu = itemView.findViewById(R.id.album_img);
            album_name_menu = itemView.findViewById(R.id.album_name);
            artist_name_menu = itemView.findViewById(R.id.artist_name);
            album_desc_menu = itemView.findViewById(R.id.album_desc);
        }
    }
}
