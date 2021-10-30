package com.we_love_crazy_quote.bmi_calculator;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BucketListEntryAdapter extends RecyclerView.Adapter<BucketListEntryAdapter.BucketListEntryViewHolder> {

BucketListEntry[] entries;

    public BucketListEntryAdapter(BucketListEntry[] entries) {
        this.entries = entries;
    }

    @Override
    public int getItemCount() {
        return entries.length;
    }

    @NonNull
    @Override
    public BucketListEntryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bucket_list,parent,false);
        return new BucketListEntryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BucketListEntryViewHolder holder, int position) {
holder.bind(entries[position],position );
    }


    static class BucketListEntryViewHolder extends RecyclerView.ViewHolder{

        private ImageView image;
        private TextView headertext;
        private TextView descriptionText;
        private RatingBar ratingBar;

        public BucketListEntryViewHolder(@NonNull View itemView){
            super(itemView);
            image = itemView.findViewById(R.id.cerelac_image);
            headertext=itemView.findViewById(R.id.text_view_heading);
            descriptionText=itemView.findViewById(R.id.text_view_description);
            ratingBar = itemView.findViewById(R.id.rating_bar);
        }


        public void bind(BucketListEntry entry,int position){
            image.setImageResource(entry.image);
            String headerString = position + 1 +". "+entry.heading;
            headertext.setText(headerString);
            descriptionText.setText(entry.description);
            ratingBar.setRating(entry.rating);

        }
    }
}
