package holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.toquescript.eligebienpe_beta.R;

/**
 * Created by BALAREZO on 17/01/2016.
 */
public class SolventViewHolders extends RecyclerView.ViewHolder {

    public ImageView countryPhoto;

    public SolventViewHolders(View itemView) {
        super(itemView);
        countryPhoto = (ImageView) itemView.findViewById(R.id.candidate_imageview);
    }
}
