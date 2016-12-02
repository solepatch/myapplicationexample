package com.soulpatch.uielementsexample.myapplicationexample;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final FragmentTransaction fragTrans = getSupportFragmentManager().beginTransaction();
		fragTrans.replace(R.id.container, new MainFragment(), MainFragment.class.getName());
		fragTrans.commit();
	}
}
