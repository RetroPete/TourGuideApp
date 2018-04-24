package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class NightlifeFragment extends Fragment {

    public NightlifeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_attractions_list, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.unit_17, R.string.unit_17_overview, R.drawable.unit_17));
        attractions.add(new Attraction(R.string.bowmans, R.string.bowmans_overview, R.drawable.bowmans));
        attractions.add(new Attraction(R.string.briarbank_brewing_company, R.string.briarbank_brewing_company_overview, R.drawable.briarbank_brewing_company));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_nightlife);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
