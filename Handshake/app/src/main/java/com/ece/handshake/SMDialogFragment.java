package com.ece.handshake;


import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SMDialogFragment extends DialogFragment {
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView.Adapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.add_new_account_dialog, container, false);
        mRecyclerView = (RecyclerView) v.findViewById(R.id.social_media_type_list);

        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        //FIXME: Remove hard coded values later
        String[] supportedSites = {"Facebook"};

        mAdapter = new NewSMAccountAdapter(supportedSites, getActivity());
        mRecyclerView.setAdapter(mAdapter);

        getDialog().setTitle("Add new account");
        return v;
    }
}