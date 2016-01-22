package layout;


import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.toquescript.eligebienpe_beta.R;

import adapters.ViewPagerAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class CandidateFlexibleFragment extends Fragment implements AppBarLayout.OnOffsetChangedListener {

    private static final int PERCENTAGE_TO_SHOW_IMAGE = 20;
    private View mFab, view;
    private int mMaxScrollSize;
    private boolean mIsImageHidden;
    EventsCandidatesFlexible eventsCandidatesFlexible;
    TabLayout tabLayout;
    ViewPager viewPager;

    public interface EventsCandidatesFlexible {
        void onBackPressedFlexible();
    }

    public CandidateFlexibleFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            eventsCandidatesFlexible = (EventsCandidatesFlexible) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " must implement OnHeadlineSelectedListener");
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_candidate_flexible, container, false);
        tabLayout = (TabLayout)view.findViewById(R.id.detail_tabs);
        viewPager = (ViewPager) view.findViewById(R.id.viewpager);
        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);


//        mFab = (FloatingActionButton) view.findViewById(R.id.flexible_example_fab);
        Toolbar toolbar = (Toolbar)view.findViewById(R.id.flexible_example_toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eventsCandidatesFlexible.onBackPressedFlexible();
            }
        });

        AppBarLayout appbar = (AppBarLayout) view.findViewById(R.id.flexible_example_appbar);
        appbar.addOnOffsetChangedListener(this);

        return view;
    }

    @Override
    public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
//        if (mMaxScrollSize == 0) {
//            mMaxScrollSize = appBarLayout.getTotalScrollRange();
//        }
//
//        int currentScrollPercentage = (Math.abs(verticalOffset)) * 100 / mMaxScrollSize;
//
//        if (currentScrollPercentage >= PERCENTAGE_TO_SHOW_IMAGE) {
//            if (!mIsImageHidden) {
//                mIsImageHidden = true;
//                ViewCompat.animate(mFab).scaleY(0).scaleX(0).start();
//            }
//        }
//
//        if (currentScrollPercentage < PERCENTAGE_TO_SHOW_IMAGE) {
//            if (mIsImageHidden) {
//                mIsImageHidden = false;
//                ViewCompat.animate(mFab).scaleY(1).scaleX(1).start();
//            }
//        }

    }

    private void setupViewPager(ViewPager viewPager){
        ViewPagerAdapter adapter = new ViewPagerAdapter(getChildFragmentManager());
        adapter.addFragment(new CVFragment(), "CV");
        adapter.addFragment(new ProposalsFragment(), "Propuestas");
        adapter.addFragment(new BenchPresidentialFragment(), "Bancada Presidencial");
        adapter.addFragment(new ActivitiesFragment(), "Actividades");
        viewPager.setAdapter(adapter);
    }
}
