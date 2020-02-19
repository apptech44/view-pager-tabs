package com.example.tabswithviewpager.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import com.example.tabswithviewpager.R;

import java.util.ArrayList;
import java.util.List;

public class KotlinFragment extends ListFragment {

    private List<String> stringList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_kotlin, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        stringList = new ArrayList<>();
        stringList = getPosts();
        ArrayAdapter<String> adapter = new
                ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1
                , stringList);
        setListAdapter(adapter);
    }

    private List<String> getPosts() {

        List<String> list = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            list.add("Kotlin New Version Basic Example " + i);
        }
        return list;
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        String listItem = (String) l.getItemAtPosition(position);
        Toast.makeText(getActivity(), listItem, Toast.LENGTH_LONG).show();
    }
}
