package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class BarsFragment extends Fragment {

    public BarsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_attractions_list, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.the_fat_cat, R.string.the_fat_cat_overview, R.drawable.the_fat_cat));
        attractions.add(new Attraction(R.string.the_dove_street_inn, R.string.the_dove_street_inn_overview, R.drawable.the_dove_street_inn));
        attractions.add(new Attraction(R.string.the_steamboat_tavern, R.string.the_steamboat_tavern_overview, R.drawable.the_steamboat_tavern));
        attractions.add(new Attraction(R.string.the_mulberry_tree, R.string.the_mulberry_tree_overview, R.drawable.the_mulberry_tree));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_bars);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
