package com.soulpatch.uielementsexample.myapplicationexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.soulpatch.uielementsexample.uielementsexample.IListItem;
import com.soulpatch.uielementsexample.uielementsexample.ListArrayAdapter;

import java.util.ArrayList;

/**
 * @author Akshay Viswanathan.
 */
public class MainFragment extends Fragment {

	@Nullable
	@Override
	public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
		final LinearLayout linearLayout = (LinearLayout) inflater.inflate(R.layout.fragment_main, container, false);
		final ListView listView = (ListView) linearLayout.findViewById(R.id.fragment_list);
		final ArrayList<IListItem> mCurItems = new ArrayList<>();
		final ListArrayAdapter arrayAdapter = new ListArrayAdapter(getActivity(), mCurItems);
		listView.setAdapter(arrayAdapter);
		return linearLayout;
	}
}
