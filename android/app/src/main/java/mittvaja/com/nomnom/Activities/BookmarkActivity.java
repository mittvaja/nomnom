package mittvaja.com.nomnom.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import mittvaja.com.nomnom.Adapters.PlaceBookmarkAdapter;
import mittvaja.com.nomnom.Models.PlaceBookmark;
import mittvaja.com.nomnom.Models.NomNom;
import mittvaja.com.nomnom.R;

public class BookmarkActivity extends AppCompatActivity {

    public RecyclerView recyclerView;
    public PlaceBookmarkAdapter adapter;
    public List<PlaceBookmark> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookmark);

        //Initialize the Recycler View
        recyclerView  = findViewById(R.id.bookmarkRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //Get list of places from database
        list = NomNom.database.iDoa().fetchAllPlaces();

        //Add the place in Recycler View
        for (PlaceBookmark p : list) {
            p.setPlaceNAME(p.getPlaceNAME());
            p.setPlaceURL(p.getPlaceURL());
        }

        adapter = new PlaceBookmarkAdapter(list, this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
