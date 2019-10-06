package com.example.studykuy;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ClassroomFragment extends Fragment {
    private RecyclerView rvSchedule;
    private ArrayList<Schedule> listSchedule = new ArrayList<>();

    public ClassroomFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_classroom, container, false);

        rvSchedule = view.findViewById(R.id.rv_schedule);
        rvSchedule.setHasFixedSize(true);

        listSchedule.addAll(ScheduleData.getListData());
        showRecyclerCardView();


        return view;
    }

    private void showRecyclerCardView(){
        rvSchedule.setLayoutManager(new LinearLayoutManager(getContext()));
        CardViewClassAdapter cardViewClassAdapter = new CardViewClassAdapter(listSchedule);
        rvSchedule.setAdapter(cardViewClassAdapter);
    }
}
