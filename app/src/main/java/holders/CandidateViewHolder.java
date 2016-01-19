package holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.toquescript.eligebienpe_beta.R;

/**
 * Created by BALAREZO on 19/01/2016.
 */
public class CandidateViewHolder extends RecyclerView.ViewHolder {

    public ImageView imageView_candidate;
    public TextView textView_name_candidate, textView_political_party;
    public Button button_like, button_proposals;

    public CandidateViewHolder(View itemView) {
        super(itemView);

        imageView_candidate = (ImageView)itemView.findViewById(R.id.img_candidate_principal);
        textView_name_candidate = (TextView)itemView.findViewById(R.id.txt_name_candidate);
        textView_political_party = (TextView)itemView.findViewById(R.id.txt_political_party);

    }
}
