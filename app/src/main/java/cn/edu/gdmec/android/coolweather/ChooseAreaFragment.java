package cn.edu.gdmec.android.coolweather;

import android.app.ProgressDialog;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import cn.edu.gdmec.android.coolweather.db.City;
import cn.edu.gdmec.android.coolweather.db.Country;
import cn.edu.gdmec.android.coolweather.db.Provience;

public class ChooseAreaFragment extends Fragment implements View.OnClickListener {
    public static final int LEVEL_PROVIENCE=0;
    public static final int LEVEL_CITY=1;
    public static final int LEVEL_COUNTRY=2;
    private ProgressDialog progressDialog;

    private TextView titleText;
    private Button backButton;
    private ListView listView;
    private ArrayAdapter<String> adapter;
    private List<String> dataList=new ArrayList<>();
    //省列表
    private List<Provience> provienceList;
    private List<City> cityList;
    private List<Country> countryList;
    //选中的省
    private Provience selectedProvience;
    private City selectedCity;
    private Country selectedCountry;
    //当前选中的级别
    private int currentLevel;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.choose_area,container,false);
        titleText = (TextView) view.findViewById(R.id.title_text);
        backButton= view.findViewById(R.id.back_button);
        listView = (ListView) view.findViewById(R.id.list_view);
        adapter=new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1,dataList);
        listView.setAdapter(adapter);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back_button:
                //TODO implement
                break;
        }
    }
}
