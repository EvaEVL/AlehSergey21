package com.example.a1.alehsergey2;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {





    @Override
    public MenuInflater getMenuInflater() {
        return super.getMenuInflater();
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);




        TabLayout tabs = (TabLayout) findViewById(R.id.tabs);

        tabs.setupWithViewPager(viewPager);

        final FloatingActionButton floatList = (FloatingActionButton)findViewById(R.id.listFloat);

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case  0 :
                        floatList.show();
                        break;
                    case 2 :
                        floatList.hide();
                        break;
                    case 1 :
                        floatList.hide();
                        break;
                    default :
                        floatList.hide();
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });



        floatList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });



    }

    private void setupViewPager(ViewPager viewPager) {

            Adapter adapter = new Adapter(getSupportFragmentManager());

            adapter.addFragment(new ListSG(), "Словечки");

            adapter.addFragment(new Translater(), "Переводчик");

            adapter.addFragment(new SomethingTrash(), "Я не знаю =(");

            viewPager.setAdapter(adapter);

        }

        static class Adapter extends FragmentPagerAdapter {

            private final List<Fragment> mFragmentList = new ArrayList<>();

            private final List<String> mFragmentTitleList = new ArrayList<>();


            public Adapter(FragmentManager manager) {

                super(manager);

            }

            @Override

            public Fragment getItem(int position) {

                return mFragmentList.get(position);

            }


            @Override

            public int getCount() {

                return mFragmentList.size();

            }


            public void addFragment(Fragment fragment, String title) {

                mFragmentList.add(fragment);

                mFragmentTitleList.add(title);

            }


            @Override

            public CharSequence getPageTitle(int position) {

                return mFragmentTitleList.get(position);

            }

        }

    }
