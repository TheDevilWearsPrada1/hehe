package com.example.heheweather;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

import com.zonst.heheweather.R;
import com.example.heheweather.adapter.GridCityMAdapter;
import com.example.heheweather.bean.CityManagerBean;

public class CityManagerActivity extends Activity {

	private GridView mgridview;
	private List<CityManagerBean> mcmb;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gridview_activity);
		mcmb = new ArrayList<CityManagerBean>();
//		CityManagerBean F = FragmentHomeContent.cmb;
//		mcmb.add(F);
		mgridview = (GridView) findViewById(R.id.gridview);
		mgridview.setNumColumns(3);
		mgridview.setBackgroundResource(R.drawable.bg_homepager_blur);
		mgridview.setAdapter(new GridCityMAdapter(this, mcmb));
	}
}
