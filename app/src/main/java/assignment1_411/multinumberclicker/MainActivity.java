package assignment1_411.multinumberclicker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Zarco on 11/3/2019.
 */

public class MainActivity extends AppCompatActivity{
    LinearLayout _root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.clicker_list);

        _root = (LinearLayout)findViewById(R.id.clicker_list);

        ArrayList<Counter> counterList = counterKeeper.getInstance().getCounterList();
        for (int i=0; i<counterList.size(); i++) {
            Counter p = counterList.get(i);




            LayoutInflater inflater = LayoutInflater.from(this);
            View row_view = inflater.inflate(R.layout.clicker_row, _root, false);




            ((TextView) row_view.findViewById(R.id.int_count)).setText(p.getTally());
            _root.addView(row_view);
        }

    }
}
