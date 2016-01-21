package layout;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.toquescript.eligebienpe_beta.R;


public class LoginFragment extends Fragment {

    View v;

    Button btn_entrar, btn_crear, btn_contrasena, btn_invitado;

    EventsLogin eventsLogin;

    public interface EventsLogin {
        void onClikEntrar();

        void onClickCrear();

        void onClickInvitado();

        void onClickContrasena();
    }


    public LoginFragment() {
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            eventsLogin = (EventsLogin) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " must implement OnHeadlineSelectedListener");
        }
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_login, container, false);
        btn_entrar = (Button)v.findViewById(R.id.btn_entrar);
        btn_crear = (Button)v.findViewById(R.id.btn_crear);
        btn_contrasena = (Button)v.findViewById(R.id.btn_contrasena);
        btn_invitado = (Button)v.findViewById(R.id.btn_invitado);

        btn_entrar.setOnClickListener(onClickListener);
        btn_crear.setOnClickListener(onClickListener);
        btn_contrasena.setOnClickListener(onClickListener);
        btn_invitado.setOnClickListener(onClickListener);

        return v;
    }


    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btn_entrar:
                    eventsLogin.onClikEntrar();
                    break;
                case R.id.btn_crear:
                    eventsLogin.onClickCrear();
                    break;
                case R.id.btn_contrasena:
                    eventsLogin.onClickContrasena();
                    break;
                case R.id.btn_invitado:
                    eventsLogin.onClickInvitado();
                    break;
            }
        }
    };


}