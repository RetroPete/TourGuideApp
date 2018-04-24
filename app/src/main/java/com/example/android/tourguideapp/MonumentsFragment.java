package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MonumentsFragment extends Fragment {

    public MonumentsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_attractions_list, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.the_giles_statue, R.string.the_giles_statue_overview, R.drawable.the_giles_statue));
        attractions.add(new Attraction(R.string.cardinal_thomas_wolsey_statue, R.string.cardinal_thomas_wolsey_statue_overview, R.drawable.cardinal_thomas_wolsey_statue));
        attractions.add(new Attraction(R.string.the_major_statue, R.string.the_major_statue_overview, R.drawable.the_major_statue));
        attractions.add(new Attraction(R.string.prince_alexander_obolensky_statue, R.string.prince_alexander_obolensky_statue_overview, R.drawable.prince_alexander_obolensky_statue));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_monuments);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
