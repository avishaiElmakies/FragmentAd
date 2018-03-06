package com.example.android.fragmentad;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Android on 3/6/2018.
 */

public class Fragment1 extends Fragment {
    private Button[] btn=new Button[4];
    private static int a=0;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_1,container,false);
        for( int i=0;i<btn.length-1;i++){
            String str="button"+i;
            btn[i]=v.findViewById(getResources().getIdentifier(str,"id",getActivity().getPackageName()));

            btn[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    for(int i=0;i<btn.length-1;i++) {
                        if(v.getId()==btn[i].getId()) {
                            Toast.makeText(getActivity(), "going to " + (i + 1), Toast.LENGTH_SHORT).show();
                            ((MainActivity) getActivity()).setViewPager(i);
                        }
                    }
                }
            });
        }
        btn[3]=v.findViewById(R.id.button3);
        btn[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),secondActivity.class);
                startActivity(intent);
            }
        });
        a = 0;
        return v;
    }
}
