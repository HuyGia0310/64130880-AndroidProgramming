package ntu.huy.ngdngmenunhhng;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ListView lvDSMonAn = (ListView) findViewById(R.id.lvDSMonAn);
        ArrayList<MonAn> dsMonAn = new ArrayList<MonAn>();
        dsMonAn.add(new MonAn("Cơm Tấm Sườn",25000,"mô tả ở đây",R.drawable.cts));
        dsMonAn.add(new MonAn("Cơm Sườn Trứng",27000,"mô tả ở đây",R.drawable.cst));
        dsMonAn.add(new MonAn("Cơm Gà",30000,"mô tả ở đây",R.drawable.cg));
        dsMonAn.add(new MonAn("Cơm Tấm Sườn Bì Chả",35000,"mô tả ở đây",R.drawable.sbc));
        dsMonAn.add(new MonAn("Cơm Tấm Đặc Biệt",45000,"mô tả ở đây",R.drawable.ctdb));

        MonAnAdapter adapter = new MonAnAdapter(this,dsMonAn);
        lvDSMonAn.setAdapter(adapter);

        lvDSMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                MonAn monAnchon = dsMonAn.get(i);
                Toast.makeText(MainActivity.this,monAnchon.getTenMonAn(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}