/**
 * Author Mateusz Mlodawski
 */
package com.mmlodawski.grapple;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        TextView textView = (TextView) root.findViewById(R.id.tv_info);
        textView.append(Urls.SERVER_URL);

        if (BuildConfig.LOG_HTTP_REQUESTS) {
            textView.append(" Logging HTTP requests is enabled.");
        }

        return root;
    }
}
