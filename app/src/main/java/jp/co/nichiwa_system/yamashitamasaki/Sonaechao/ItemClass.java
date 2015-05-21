package jp.co.nichiwa_system.yamashitamasaki.Sonaechao;

import android.app.Activity;

/**
 * Created by yamashita.masaki on 2015/05/15.
 */
public class ItemClass {
    String ItemName;            //�A�C�e���̖��O
    String prefName;            //�v���t�@�����X��
    int Drawable_Location;   //�摜�̏ꏊ
    String Unit;                //�P�ʐ�
    boolean Calendar_flag;   //�t���O
    Activity act;               //�A�N�e�B�r�e�B
    int Drawable_Icon;        //�A�C�R��

    public ItemClass() {}

    public  ItemClass(String ItemName, String prefName, int Drawable_Location, boolean Calendar_flag,Activity act ) {
        this.ItemName = ItemName;
        this.prefName = prefName;
        this.Drawable_Location = Drawable_Location;
        this.Calendar_flag = Calendar_flag;
        this.act = act;
    }

    public ItemClass(String ItemName, String prefName, int Drawable_Location, boolean Calendar_flag, String Unit, Activity act ) {
        this.ItemName = ItemName;
        this.prefName = prefName;
        this.Drawable_Location = Drawable_Location;
        this.Unit = Unit;
        this.Calendar_flag = Calendar_flag;
        this.act = act;
    }

    public void setIcon( int Drawable_Icon ) {
        this.Drawable_Icon = Drawable_Icon;
    }

    public int getIcon() {
        return Drawable_Icon;
    }
}