package talktodeaf.learndeafcolor.ui;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.amulyakhare.textdrawable.TextDrawable;
import com.cengalabs.flatui.views.FlatTextView;

import java.util.List;

import talktodeaf.learndeafcolor.R;
import talktodeaf.learndeafcolor.model.Color_Model;

/**
 * Created by Wiwat on 15/4/2558.
 */
public class ColorListAdapter extends BaseAdapter {
    Context context;
    List<Color_Model> ColorList;
    public ColorListAdapter(Context context,List<Color_Model> ct) {
        ColorList = ct;
        this.context = context;
    }
    @Override
    public int getCount() {
        return ColorList.size();
    }

    @Override
    public Object getItem(int position) {
        return ColorList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    private class ViewHolder {
        FlatTextView colorName;
        ImageView imageView;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder  holder;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(convertView == null){
            convertView = inflater.inflate(R.layout.color_list_column, parent,false);
            holder = new ViewHolder();
            holder.colorName = (FlatTextView)convertView.findViewById(R.id.colorName);
            holder.imageView = (ImageView)convertView.findViewById(R.id.imageView);
            convertView.setTag(holder);
        }else{
            holder=(ViewHolder)convertView.getTag();
        }
        Color_Model cl = ColorList.get(position);
        Typeface type = Typeface.createFromAsset(context.getAssets(), "fonts/ThaiSansNeue_regular.ttf");
        int[] colors = {
                        Color.rgb(244,67,54),
                        Color.rgb(103,58,183),
                        Color.rgb(63,81,181),
                        Color.rgb(3,169,244),
                        Color.rgb(76,175,80),
                        Color.rgb(255, 235, 59),
                        Color.rgb(255,87,34),
                        Color.rgb(121, 85, 72),
                        Color.BLACK,
                        Color.WHITE};
        TextDrawable drawable = TextDrawable.builder()
                .buildRound("", colors[position]);
        holder.colorName.setText(""+cl.getColor());
        holder.imageView.setImageDrawable(drawable);
    return convertView;
}
}


