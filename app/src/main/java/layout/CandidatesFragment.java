package layout;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.toquescript.eligebienpe_beta.MainActivityPrincipal;
import com.toquescript.eligebienpe_beta.R;

import java.util.ArrayList;
import java.util.List;

import adapters.CandidateRecycleViewAdapters;
import interfaces.ItemClickListener;
import models.Candidates;

/**
 * A simple {@link Fragment} subclass.
 */
public class CandidatesFragment extends Fragment {

    View view;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    EventsCandidates eventsCandidates;
    Toolbar toolbar;
    AppCompatActivity activity;

    public interface EventsCandidates {
        void onBackPressedCandidates();
        void onClickItem();
    }

    public CandidatesFragment() {

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            eventsCandidates = (EventsCandidates) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " must implement OnHeadlineSelectedListener");
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_candidates, container, false);

        activity = (AppCompatActivity) getActivity();

        toolbar = (Toolbar) view.findViewById(R.id.appbar);
        activity.setSupportActionBar(toolbar);
        activity.getSupportActionBar().setTitle("Candidatos Presidenciales");
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eventsCandidates.onBackPressedCandidates();
            }
        });

        layoutManager = new LinearLayoutManager(getActivity().getApplicationContext());

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_candidates);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        List<Candidates> gaggeredList = getListItemData();

        adapter = new CandidateRecycleViewAdapters(getActivity(), gaggeredList, new ItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(getActivity().getApplicationContext(), "salio ctmr", Toast.LENGTH_SHORT).show();
                eventsCandidates.onClickItem();
            }
        });
        recyclerView.setAdapter(adapter);

        return view;
    }

    private List<Candidates> getListItemData() {
        List<Candidates> listViewItems = new ArrayList<>();
        listViewItems.add(new Candidates(R.drawable.one, "ALguno ", "Grupo"));
        listViewItems.add(new Candidates(R.drawable.one, "ALguno ", "Grupo"));
        listViewItems.add(new Candidates(R.drawable.one, "ALguno ", "Grupo"));
        listViewItems.add(new Candidates(R.drawable.one, "ALguno ", "Grupo"));
        listViewItems.add(new Candidates(R.drawable.one, "ALguno ", "Grupo"));
        listViewItems.add(new Candidates(R.drawable.one, "ALguno ", "Grupo"));
        listViewItems.add(new Candidates(R.drawable.one, "ALguno ", "Grupo"));
        listViewItems.add(new Candidates(R.drawable.one, "ALguno ", "Grupo"));
        listViewItems.add(new Candidates(R.drawable.one, "ALguno ", "Grupo"));
        listViewItems.add(new Candidates(R.drawable.one, "ALguno ", "Grupo"));
        listViewItems.add(new Candidates(R.drawable.one, "ALguno ", "Grupo"));
        listViewItems.add(new Candidates(R.drawable.one, "ALguno ", "Grupo"));
        listViewItems.add(new Candidates(R.drawable.one, "ALguno ", "Grupo"));
        listViewItems.add(new Candidates(R.drawable.one, "ALguno ", "Grupo"));
        listViewItems.add(new Candidates(R.drawable.one, "ALguno ", "Grupo"));
        listViewItems.add(new Candidates(R.drawable.one, "ALguno ", "Grupo"));
        listViewItems.add(new Candidates(R.drawable.one, "ALguno ", "Grupo"));
        listViewItems.add(new Candidates(R.drawable.one, "ALguno ", "Grupo"));
        listViewItems.add(new Candidates(R.drawable.one, "ALguno ", "Grupo"));

        return listViewItems;
    }

}
