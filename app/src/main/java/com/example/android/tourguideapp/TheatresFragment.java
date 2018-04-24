package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class TheatresFragment extends Fragment {

    public TheatresFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_attractions_list, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.new_wolsey_theatre, R.string.new_wolsey_theatre_overview, R.drawable.new_wolsey_theatre));
        attractions.add(new Attraction(R.string.regent_theatre, R.string.regent_theatre_overview, R.drawable.regent_theatre));
        attractions.add(new Attraction(R.string.sir_john_mills_theatre, R.string.sir_john_mills_theatre_overview, R.drawable.sir_john_mills_theatre));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_theatres);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
