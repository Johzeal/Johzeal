package com.example.zhujiaxiang.i;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;

/**
 * Created by zhujiaxiang on 17/4/19.
 */

public class SkipActivity extends MainActivity {
    private ViewPager mTabPager;
    private ImageView mTabSchool, mTabFind, mTabMy;
    private int currIndex = 0;// 当前页卡编号

    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_skip);
//        mTabPager = (ViewPager) findViewById(R.id.tabpager);
//        mTabPager.setOnPageChangeListener(new MyOnPageChangeListener());
//
//        mTabSchool = (ImageView) findViewById(R.id.img_school);
//        mTabFind = (ImageView) findViewById(R.id.img_find);
//        mTabMy = (ImageView) findViewById(R.id.img_my);
//        mTabSchool.setOnClickListener(new MyOnClickListener(0));
//        mTabFind.setOnClickListener(new MyOnClickListener(1));
//        mTabMy.setOnClickListener(new MyOnClickListener(2));
//
////        mTabPager.setOnTouchListener(new View.OnTouchListener() {
////            private boolean moved;
////            @Override
////            public boolean onTouch(View view, MotionEvent motionEvent) {
////
////                return false;
////            }
////        });
//
//        //将要分页显示的View装入数组中
//        LayoutInflater mLi = LayoutInflater.from(this);
//        View viewFoot = mLi.inflate(R.layout.activity_school, null);
//        View viewMessage = mLi.inflate(R.layout.activity_find, null);
//        View viewSetting = mLi.inflate(R.layout.activity_my, null);
//
//        //每个页面的view数据
//        final ArrayList<View> views = new ArrayList<View>();
//        views.add(viewFoot);
//        views.add(viewMessage);
//        views.add(viewSetting);
//        //填充ViewPager的数据适配器
//        PagerAdapter mPagerAdapter = new PagerAdapter() {
//            @Override
//            public boolean isViewFromObject(View arg0, Object arg1) {
//                return arg0 == arg1;
//            }
//
//            @Override
//            public int getCount() {
//                return views.size();
//            }
//
//            @Override
//            public void destroyItem(View container, int position, Object object) {
//                ((ViewPager) container).removeView(views.get(position));
//            }
//
//            @Override
//            public Object instantiateItem(View container, int position) {
//                ((ViewPager) container).addView(views.get(position));
//                return views.get(position);
//            }
//        };
//        mTabPager.setAdapter(mPagerAdapter);
//    }
//
//    /**
//     * 头标点击监听
//     */
//    public class MyOnClickListener implements View.OnClickListener {
//        private int index = 0;
//
//        public MyOnClickListener(int i) {
//            index = i;
//        }
//
//        @Override
//        public void onClick(View v) {
//            mTabPager.setCurrentItem(index);
//        }
//    }
//
//
//    ;
//
//    /**
//     * 页卡切换监听
//     */
//    public class MyOnPageChangeListener implements ViewPager.OnPageChangeListener {
//        @Override
//        public void onPageSelected(int arg0) {
//            switch (arg0) {
//                case 0: {
//                    mTabSchool.setImageDrawable(getResources().getDrawable(R.mipmap.school_blue));
//                    if (currIndex == 1) {
//                        mTabFind.setImageDrawable(getResources().getDrawable(R.mipmap.find_gray));
//                    } else if (currIndex == 2) {
//                        mTabMy.setImageDrawable(getResources().getDrawable(R.mipmap.my_gray));
//                    }
//                    break;
//                }
//                case 1: {
//                    mTabFind.setImageDrawable(getResources().getDrawable(R.mipmap.find_blue));
//                    if (currIndex == 0) {
//                        mTabSchool.setImageDrawable(getResources().getDrawable(R.mipmap.school_gray));
//                    } else if (currIndex == 2) {
//                        mTabMy.setImageDrawable(getResources().getDrawable(R.mipmap.my_gray));
//                    }
//                    break;
//                }
//                case 2: {
//                    mTabMy.setImageDrawable(getResources().getDrawable(R.mipmap.my_blue));
//                    if (currIndex == 0) {
//                        mTabSchool.setImageDrawable(getResources().getDrawable(R.mipmap.school_gray));
//                    } else if (currIndex == 1) {
//                        mTabFind.setImageDrawable(getResources().getDrawable(R.mipmap.find_gray));
//                    }
//                    break;
//                }
//            }
//            currIndex = arg0;
//        }
//
//        @Override
//        public void onPageScrollStateChanged(int arg0) {
//            // TODO Auto-generated method stub
//
//        }
//
//        @Override
//        public void onPageScrolled(int arg0, float arg1, int arg2) {
//            // TODO Auto-generated method stub
//
//        }
    }
}

