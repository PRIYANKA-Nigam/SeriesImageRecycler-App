package com.example.seriesimagerecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;ArrayList<MainModel> mainModels;MainAdapter mainAdapter;@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); setContentView(R.layout.activity_main); recyclerView=(RecyclerView)findViewById(R.id.rec);
        Integer[] num= {R.drawable.ic_baseline_filter_1_24, R.drawable.ic_baseline_filter_2_24, R.drawable.ic_baseline_filter_3_24,
                R.drawable.ic_baseline_filter_4_24, R.drawable.ic_baseline_filter_5_24, R.drawable.ic_baseline_filter_6_24,
                R.drawable.ic_baseline_filter_7_24, R.drawable.ic_baseline_filter_8_24, R.drawable.ic_baseline_filter_9_24,
                R.drawable.ic_baseline_airplanemode_active_24, R.drawable.ic_baseline_alternate_email_24, R.drawable.ic_baseline_3d_rotation_24,
                R.drawable.ic_baseline_access_alarm_24,
                R.drawable.ic_baseline_arrow_left_24, R.drawable.ic_baseline_arrow_right_24, R.drawable.ic_baseline_android_24, R.drawable.ic_baseline_attach_file_24,
                R.drawable.ic_baseline_add_24, R.drawable.ic_baseline_block_24, R.drawable.ic_baseline_bluetooth_24, R.drawable.ic_baseline_crop_rotate_24,
                R.drawable.ic_baseline_data_usage_24,
                R.drawable.ic_baseline_delete_24,R.drawable.ic_baseline_fingerprint_24,R.drawable.ic_baseline_fireplace_24,R.drawable.ic_baseline_fullscreen_24,
                R.drawable.ic_baseline_fullscreen_exit_24,R.drawable.ic_baseline_get_app_24,R.drawable.ic_baseline_insert_link_24,R.drawable.ic_baseline_headset_24,
                R.drawable.ic_baseline_keyboard_voice_24,R.drawable.ic_baseline_local_dining_24,R.drawable.ic_baseline_local_printshop_24,R.drawable.ic_baseline_location_on_24,
                R.drawable.ic_baseline_music_note_24,R.drawable.ic_baseline_pause_24,R.drawable.ic_baseline_photo_24,R.drawable.ic_baseline_priority_high_24,
                R.drawable.ic_baseline_reply_all_24,R.drawable.ic_baseline_search_24,R.drawable.ic_baseline_send_24,R.drawable.ic_baseline_signal_wifi_4_bar_24,
                R.drawable.ic_baseline_slideshow_24,R.drawable.ic_baseline_slow_motion_video_24,R.drawable.ic_baseline_sms_24,R.drawable.ic_baseline_sms_failed_24,
                R.drawable.ic_baseline_space_bar_24,R.drawable.ic_baseline_sync_24,R.drawable.ic_baseline_volume_mute_24,R.drawable.ic_baseline_volume_off_24,
                R.drawable.ic_baseline_warning_24,R.drawable.ic_baseline_wifi_tethering_24,R.drawable.ic_baseline_zoom_out_24};
        String[] numWords={ "One","Two","Three","Four","Five","Six","Seven","Eight","Nine","AirPlane Mode","Alternate Email","3d Rotation","Alarm","Left Arrow","Right Arrow",
        "Android","Attach File","Add","Block","Bluetooth","Crop","Data Usage","Delete","FingerPrint","Fireplace","Fullscreen Mode","Fullscreen Exit","Get App","Insert Link",
        "HeadSet","KeyBoard Voice","Dining","Printshop","Location On","Music","Pause","Photo","High Priority","Reply All","Search","Send","WiFi","SlideShow","Motion Video",
        "SMS","SMS Failed","Space Bar","Sync","Volume Mute","Volume Off","Warning","Wifi tethering","Zoom Out"};
          mainModels=new ArrayList<>();
          for(int i=0;i<num.length;i++){
              MainModel mainModel=new MainModel(num[i],numWords[i]);
              this.mainModels.add(mainModel);
          }
          RecyclerView.LayoutManager layoutManager=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
          recyclerView.setLayoutManager(layoutManager);
          recyclerView.setItemAnimator(new DefaultItemAnimator());
          mainAdapter=new MainAdapter(MainActivity.this,mainModels);
          recyclerView.setAdapter(mainAdapter);
    }
}