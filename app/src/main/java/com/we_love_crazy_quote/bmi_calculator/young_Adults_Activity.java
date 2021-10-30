package com.we_love_crazy_quote.bmi_calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class young_Adults_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_young_adults);
        setupList();
    }
    private void setupList()
    {
        BucketListEntry[] youngAdults={
                new BucketListEntry("cerelac Image", "it is good for health one should have it ",R.drawable.cerelac_image,5),
                new BucketListEntry("cerelac Image", "it is good for health one should have it ",R.drawable.cerelac_image,5),
                new BucketListEntry("cerelac Image", "it is good for health one should have it ",R.drawable.cerelac_image,5),
                new BucketListEntry("cerelac Image", "it is good for health one should have it ",R.drawable.cerelac_image,5),
                new BucketListEntry("cerelac Image", "it is good for health one should have it ",R.drawable.cerelac_image,5),
                new BucketListEntry("cerelac Image", "it is good for health one should have it ",R.drawable.cerelac_image,5),
                new BucketListEntry("cerelac Image", "it is good for health one should have it ",R.drawable.cerelac_image,5),
                new BucketListEntry("cerelac Image", "it is good for health one should have it ",R.drawable.cerelac_image,5),
                new BucketListEntry("cerelac Image", "it is good for health one should have it ",R.drawable.cerelac_image,5),
                new BucketListEntry("cerelac Image", "it is good for health one should have it ",R.drawable.cerelac_image,5),
                new BucketListEntry("cerelac Image", "it is good for health one should have it ",R.drawable.cerelac_image,5),
                new BucketListEntry("cerelac Image", "it is good for health one should have it ",R.drawable.cerelac_image,5),
                new BucketListEntry("cerelac Image", "it is good for health one should have it ",R.drawable.cerelac_image,5),
                new BucketListEntry("cerelac Image", "it is good for health one should have it ",R.drawable.cerelac_image,5),
                new BucketListEntry("cerelac Image", "it is good for health one should have it ",R.drawable.cerelac_image,5),
                new BucketListEntry("cerelac Image", "it is good for health one should have it ",R.drawable.cerelac_image,5),
                new BucketListEntry("cerelac Image", "it is good for health one should have it ",R.drawable.cerelac_image,5),
                new BucketListEntry("cerelac Image", "it is good for health one should have it ",R.drawable.cerelac_image,5),
                new BucketListEntry("cerelac Image", "it is good for health one should have it ",R.drawable.cerelac_image,5),
                new BucketListEntry("cerelac Image", "it is good for health one should have it ",R.drawable.cerelac_image,5),
                new BucketListEntry("cerelac Image", "it is good for health one should have it ",R.drawable.cerelac_image,5),
                new BucketListEntry("cerelac Image", "it is good for health one should have it ",R.drawable.cerelac_image,5),
                new BucketListEntry("cerelac Image", "it is good for health one should have it ",R.drawable.cerelac_image,5),
                new BucketListEntry("cerelac Image", "it is good for health one should have it ",R.drawable.cerelac_image,5),
                new BucketListEntry("cerelac Image", "it is good for health one should have it ",R.drawable.cerelac_image,5),
                new BucketListEntry("cerelac Image", "it is good for health one should have it ",R.drawable.cerelac_image,5),

        };
        RecyclerView recyclerView =findViewById(R.id.recycler_view_young_adults);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(youngAdults);
        recyclerView.setAdapter(adapter);

    }
}
