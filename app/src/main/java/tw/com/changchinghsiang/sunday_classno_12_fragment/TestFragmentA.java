package tw.com.changchinghsiang.sunday_classno_12_fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class TestFragmentA extends Fragment {

    private String tag_name = "Frank_Test";

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        Log.d(tag_name, "onAttach: 01");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(tag_name, "onCreate: 02");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(tag_name, "onCreateView: 03");

        return inflater.inflate(R.layout.fragment_test, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        Log.d(tag_name, "onStart: 04");
    }

    @Override
    public void onResume() {
        super.onResume();

        Log.d(tag_name, "onResume: 05");
    }

    @Override
    public void onPause() {
        super.onPause();

        Log.d(tag_name, "onPause: 06");
    }

    @Override
    public void onStop() {
        super.onStop();

        Log.d(tag_name, "onStop: 07");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        Log.d(tag_name, "onDestroyView: 08");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Log.d(tag_name, "onDestroy: 09");
    }

    @Override
    public void onDetach() {
        super.onDetach();

        Log.d(tag_name, "onDetach: 10");
    }
}
