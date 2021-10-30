package com.we_love_crazy_quote.bmi_calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

public class Infancy_Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infancy);
      setupList();
    }
private void setupList()
{
    BucketListEntry[] infancy={
            new BucketListEntry("Moong Dal Water", "Energy - 16% Carbohydrate- 10%  Total Fat-16% Protein - 19% ",R.drawable.moong_dal_water,3.5f),
            new BucketListEntry("Mashed Potatoes", "Energy - 18% Carbohydrate- 27%  Total Fat-16% Protein - 18%",R.drawable.mashed_potatoes,4),
            new BucketListEntry("Mashed Banana", "Energy - 12% Carbohydrate- 10%  Total Fat-16% Protein - 19% ",R.drawable.cerelac_image,5),
            new BucketListEntry("Boiled and Mashed Rice", "Energy - 12% Carbohydrate- 10%  Total Fat-16% Protein - 19% ",R.drawable.boiled_mashed_rice,3.5f),
            new BucketListEntry("Pureed Pear", "Energy - 12% Carbohydrate- 18%  Total Fat-16% Protein - 14% ",R.drawable.peared_pure,4.5f),

            new BucketListEntry("Suji Upma", "Energy - 22% Carbohydrate- 23%  Total Fat-32% Protein - 28% ",R.drawable.suji_upma,5)
    };
    RecyclerView recyclerView =findViewById(R.id.recycler_view_infancy);
    BucketListEntryAdapter adapter = new BucketListEntryAdapter(infancy);
    recyclerView.setAdapter(adapter);

}
}