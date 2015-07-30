package talktodeaf.learndeafcolor.colorlearn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

import talktodeaf.learndeafcolor.R;
import talktodeaf.learndeafcolor.model.Color_Model;
import talktodeaf.learndeafcolor.ui.ColorListAdapter;


public class ColorList extends AppCompatActivity {
    GridView gridView;
    private List<Color_Model> colorList;
    private String[] color = {"สีแดง","สีม่วง","สีน้ำเงิน","สีฟ้า","สีเขียว","สีเหลือง","สีส้ม","สีน้ำตาล","สีดำ","สีขาว"};
    ColorListAdapter ca;
    public static int colorPosition;
    Intent colorDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.color_list);

        gridView = (GridView)findViewById(R.id.gridView);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                colorPosition = position;
                colorDetail = new Intent(ColorList.this, ColorDetail.class);
                startActivity(colorDetail);
            }
        });

        colorList = new ArrayList<Color_Model>();
        for(int i =0;i<color.length;i++){
            Color_Model item = new Color_Model(color[i]);
            colorList.add(item);
        }
        ca = new ColorListAdapter(this,colorList);
        gridView.setAdapter(ca);
    }

    public static int getColorPosition() {
        return colorPosition;
    }
}
