package layout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.toquescript.eligebienpe_beta.R;

import adapters.ViewPagerAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailsCandiateFragment extends Fragment {


    //<editor-fold desc="Views">
    View view;
//    ViewPager viewPager;
    //</editor-fold>

    public DetailsCandiateFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_details_candiate, container, false);

//        viewPager = (ViewPager) view.findViewById(R.id.viewpager);
//        setupViewPager(viewPager);
        return view;

    }

//    private void setupViewPager(ViewPager viewPager){
//        ViewPagerAdapter adapter = new ViewPagerAdapter(getChildFragmentManager());
//        adapter.addFragment(new CVFragment(), "CV");
//        adapter.addFragment(new ProposalsFragment(), "Propuestas");
//        adapter.addFragment(new BenchPresidentialFragment(), "Bancada Presidencial");
//        adapter.addFragment(new ActivitiesFragment(), "Actividades");
//        viewPager.setAdapter(adapter);
//    }

}
