package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ParksFragment extends Fragment {

    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_attractions_list, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.christchurch_park, R.string.christchurch_park_overview, R.drawable.christchurch_park));
        attractions.add(new Attraction(R.string.holywells_park, R.string.holywells_park_overview, R.drawable.holywells_park));
        attractions.add(new Attraction(R.string.chantry_park, R.string.chantry_park_overview, R.drawable.chantry_park));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_parks);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
