package com.we_love_crazy_quote.bmi_calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class senior_citizen_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senior_citizen);
        setupList();
    }
    private void setupList()
    {
        BucketListEntry[] seniorCitizen={
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
        RecyclerView recyclerView =findViewById(R.id.recycler_view_seniorCitizen);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(seniorCitizen);
        recyclerView.setAdapter(adapter);

    }
}

