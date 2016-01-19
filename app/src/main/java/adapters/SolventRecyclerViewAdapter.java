package adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.toquescript.eligebienpe_beta.R;

import java.util.List;

import holders.SolventViewHolders;
import models.Candidates;

/**
 * Created by BALAREZO on 17/01/2016.
 */
public class SolventRecyclerViewAdapter  extends RecyclerView.Adapter<SolventViewHolders> {

    private List<Candidates> itemList;

    public SolventRecyclerViewAdapter(List<Candidates> itemList) {
        this.itemList = itemList;
    }

    @Override
    public SolventViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.candidate_item, null);
        SolventViewHolders rcv = new SolventViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(SolventViewHolders holder, int position) {
        holder.countryPhoto.setImageResource(itemList.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}
