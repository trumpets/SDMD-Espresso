package gr.academic.city.sdmd.espresso;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class AdapterActivity extends AppCompatActivity {

    // KIDS.... DON'T DO THIS AT HOME! :)
    // FOR DEMO PURPOSES ONLY
    private static final String[] WORDS = new String[] {
            "Paladin",
            "Mage",
            "Rogue",
            "Warrior",
            "Priest",
            "Warlock",
            "Shaman",
            "Druid"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);

        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, WORDS);

        ListView lvWords = (ListView) findViewById(R.id.lv_words);
        lvWords.setAdapter(adapter);
        lvWords.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ((TextView) findViewById(R.id.tv_result)).setText(WORDS[position]);
            }
        });
    }
}
