package com.example.roomexample;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {
    private Button BnAddUser;
    FragmentTransaction myTransaction;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        BnAddUser = view.findViewById(R.id.bn_add_user);
        BnAddUser.setOnClickListener(this);

        myTransaction = MainActivity.fragmentManager.beginTransaction();


        return view;



    }

    @Override
    public void onClick(View v) {
        switch (getView().getId()){
            case R.id.bn_add_user:
                /*MainActivity.fragmentManager.beginTransaction().
                        replace(R.id.fragment_container, new AddUserFragment()).
                        addToBackStack(null).commit();*/
                myTransaction.replace(R.id.fragment_container, new AddUserFragment());
                myTransaction.commit();

                break;
        }

    }
}
