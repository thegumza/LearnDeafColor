package talktodeaf.learndeafcolor.colorlearn;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.VideoView;

import com.cengalabs.flatui.views.FlatTextView;

import talktodeaf.learndeafcolor.R;

public class ColorDetail extends ActionBarActivity {

    private VideoView actionVideo,speakVideo;
    private String TAG = "COLOR_DETAIL";
    private FlatTextView colorTitle,colorName,colorType,colorDescription,colorExample;
    private ImageView imageView;
    private RadioButton btnTH,btnEN,btnAction,btnSpeak;
    private int position = ColorList.getColorPosition();
    private Typeface typeface;
    private String[] color = {"สีแดง","สีม่วง","สีน้ำเงิน","สีฟ้า","สีเขียว","สีเหลือง","สีส้ม","สีน้ำตาล","สีดำ","สีขาว"};
    private String type ="คำนาม";
    private String[] description = {"สีมีความถี่ของแสงที่ต่ำที่สุด ที่ตามนุษย์สามารถแยกแยะได้ สีแดงเป็นสีอย่างสีเลือดหรือสีชาด ใช้ประกอบสิ่งต่างๆ บางอย่างโดยอนุโลมตามลักษณะสี เป็นชื่อเรียกเฉพาะ เช่น มดแดง ผ้าแดง",
                                    "เป็นสีที่ผสมระหว่างสีน้ำเงินและสีแดง โดยปกติสีจะมีอยู่สองโทน คือ สีโทนร้อน และ สีโทนเย็น แต่สีม่วงเป็นสีที่อยู่ตรงกลางระหว่าง สีโทนร้อน และ สีโทนเย็น",
                                    "เป็นหนึ่งในแม่สี ทั้งแม่สีทางแสง และทางวัตถุธาตุ เป็นแม่สีที่มีความยาวคลื่นต่ำที่สุด เป็นสีที่ใกล้เคียงกับสีฟ้าและสีกรมท่า และถือเป็น 1 ในแม่สีร่วมกับ สีแดง และสีเหลือง",
                                    "ชื่อสีเหมือนสีของท้องฟ้า",
                                    "เป็นสีสีหนึ่งบนคลื่นที่ตามองเห็น ตั้งอยู่ระหว่างสีน้ำเงินและสีเหลือง",
                                    "เป็น 1 ใน 3 แม่สี ร่วมกับสีแดง และสีน้ำเงิน โดยปกติสีจะมีอยู่สองโทน คือ สีโทนร้อน และ สีโทนเย็น แต่สีเหลืองเป็นสีที่อยู่ตรงกลางระหว่าง สีโทนร้อน และ สีโทนเย็น จึงสามารถเลือกใช้สีเหลืองเข้าไปผสมผสานได้กับสีทั้งสองโทน",
                                    "เป็นหนึ่งในกลุ่มสีโทนร้อน",
                                    "เป็นสีชนิดหนึ่งที่คล้ายกับสีของลำต้นของต้นไม้ ออกสีส้มแก่ๆ ผสมกับสีเขียวไปด้วย พบเห็นได้ทั่วไป เช่น กิ่งและลำต้นของต้นไม้ เป็นต้น เป็นสีที่ไม่ค่อยจะสะท้อนแสงเท่าไรนัก จัดอยู่ในกลุ่มจำพวกสีเย็น",
                                    "เป็นสีของวัตถุที่ไม่สะท้อนแสงที่สเปกตรัมสะท้อนออกมา วัตถุสีดำจะดูดกลืนทุกสีในสเปกตรัม จึงไม่สะท้อนสีใด ๆ ออกมาเลย",
                                    "โทนสี หรือ การรับรู้ที่เกิดจากแสงไปกระตุ้นเซลล์สีรูปกรวยทั้ง 3 แบบในดวงตาของมนุษย์ในปริมาณที่เกือบจะเท่ากันและมีความสว่างสูงสุดเมื่อเทียบกับสิ่งแวดล้อมรอบข้าง"
                                    };
    private String[] Example = {
                                "สตอเบอรี่มีสีแดง",
                                "องุ่นมีสีม่วง",
                                "รองเท้าคู่นี้มีสีน้ำเงิน",
                                "กางเกงตัวนี้สีฟ้า",
                                "ผักต้นหอมมีใบสีเขียว",
                                "กล้วยมีสีเหลือง",
                                "แครอทสีส้ม",
                                "เห็ดสีน้ำตาล",
                                "หมวกใบนี้สีดำ",
                                "ชุดแต่งงานสีขาว"};
    private int[] colorImage = new int[]{
                                        R.drawable.ic_strawberry,
                                        R.drawable.ic_grape,
                                        R.drawable.ic_shoes_blue,
                                        R.drawable.ic_pant_sky_blue,
                                        R.drawable.ic_onion,
                                        R.drawable.ic_banana,
                                        R.drawable.ic_carrot,
                                        R.drawable.ic_mushroom_brown,
                                        R.drawable.ic_hat_black,
                                        R.drawable.ic_dress_white,};



    int[] bgColors = {
            Color.rgb(244, 67, 54),
            Color.rgb(103,58,183),
            Color.rgb(63,81,181),
            Color.rgb(3,169,244),
            Color.rgb(76,175,80),
            Color.rgb(255, 235, 59),
            Color.rgb(255,87,34),
            Color.rgb(121, 85, 72),
            Color.BLACK,
            Color.WHITE};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.color_detail);
        //VideoView
        actionVideo = (VideoView)findViewById(R.id.actionVideo);
        speakVideo = (VideoView)findViewById(R.id.actionVideo);
        //RadioButton
        btnTH = (RadioButton)findViewById(R.id.btnTH);
        btnEN = (RadioButton)findViewById(R.id.btnEN);
        btnAction = (RadioButton)findViewById(R.id.btnAction);
        btnSpeak = (RadioButton)findViewById(R.id.btnSpeak);
        //View
        colorTitle = (FlatTextView)findViewById(R.id.color_title);
        colorName = (FlatTextView)findViewById(R.id.color_name);
        colorType = (FlatTextView)findViewById(R.id.color_type);
        colorExample = (FlatTextView)findViewById(R.id.color_exam);
        colorDescription = (FlatTextView)findViewById(R.id.color_des);
        imageView = (ImageView)findViewById(R.id.imageView);
        typeface = Typeface.createFromAsset(getAssets(), "fonts/ThaiSansNeue_regular.ttf");
        btnTH.setTypeface(typeface);
        btnEN.setTypeface(typeface);
        btnAction.setTypeface(typeface);
        btnSpeak.setTypeface(typeface);

        switch (position){
            case 0 :
                SetView(position);
                break;
            case 1 :
                SetView(position);
                break;
            case 2 :
                SetView(position);
                break;
            case 3 :
                SetView(position);
                break;
            case 4 :
                SetView(position);
                break;
            case 5 :
                SetView(position);
                break;
            case 6 :
                SetView(position);
                break;
            case 7 :
                SetView(position);
                break;
            case 8 :
                SetView(position);
                break;
            case 9 :
                SetView(position);
                break;
        }
        btnAction.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(btnAction.isChecked()){

                }
            }
        });

        btnSpeak.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(btnSpeak.isChecked()){

                }
            }
        });


    }

        private void SetView(int position) {

        colorTitle.setBackgroundColor(bgColors[position]);
        switch (position){
            case 8:{
                colorTitle.setTextColor(Color.WHITE);
                break;
            }
            case 9:{
                colorTitle.setTextColor(Color.BLACK);
                break;
            }
            }
        colorTitle.setText(""+color[position]);
        colorName.setText("คำศัพท์: "+color[position]);
        colorType.setText("ประเภท: "+type);
        colorExample.setText("ตัวอย่าง: "+Example[position]);
        colorDescription.setText("ความหมาย: " + description[position]);
        imageView.setImageResource(colorImage[position]);

    }


}
