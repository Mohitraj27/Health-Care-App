package com.we_love_crazy_quote.bmi_calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class preganat_women_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preganat_women);
        setupList();
    }
    private void setupList()
    {
        BucketListEntry[] PreganantWomen={
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
        RecyclerView recyclerView =findViewById(R.id.recycler_view_PreganantWomen);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(PreganantWomen);
        recyclerView.setAdapter(adapter);

    }
}
