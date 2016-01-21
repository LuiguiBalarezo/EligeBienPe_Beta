package adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.toquescript.eligebienpe_beta.R;

import java.util.List;

import holders.CandidateViewHolder;
import interfaces.ItemClickListener;
import models.Candidates;

/**
 * Created by BALAREZO on 19/01/2016.
 */
public class CandidateRecycleViewAdapters extends RecyclerView.Adapter<CandidateViewHolder> {

    private List<Candidates> itemList;
    private Context mContext;
    ItemClickListener listener;

    public CandidateRecycleViewAdapters(Context context, List<Candidates> itemList, ItemClickListener listener) {
        this.itemList = itemList;
        this.mContext = context;
        this.listener = listener;

    }

    @Override
    public CandidateViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.candidate_item_2, parent, false);
        final CandidateViewHolder rcv = new CandidateViewHolder(view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemClick(view, rcv.getPosition());
            }
        });
        return rcv;
    }

    @Override
    public void onBindViewHolder(CandidateViewHolder holder, int position) {
        holder.imageView_candidate.setImageResource(itemList.get(position).getImg());
        holder.textView_name_candidate.setText(itemList.get(position).getName_candidate());
        holder.textView_political_party.setText(itemList.get(position).getPolitical_party());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}
