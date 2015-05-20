package jp.co.nichiwa_system.yamashitamasaki.Sonaechao;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.View;
import android.widget.TextView;

/**
 * �P�Ƀ_�C�A���O��\��������N���X
  Created by yamashita.masaki on 2015/05/15.
 */
public class DialogClass extends AlertDialog.Builder{

    TextView tv;

    //�R���X�g���N�^
    public DialogClass(String TitleName, String Message, Activity act)
    {
        super(act);
        setTitle(TitleName);

        //�������������
        tv = new TextView(act);//�e�L�X�g�p
        tv.setText(Message);

        //TextView���_�C�A���O�ŕ\��������
        setView(tv);
    }

    public DialogClass(Activity act) {
        super(act);
        tv = new TextView(act);
    }

    public void setText(String str) {
        setMessage(str);
    }

    public void Diarog_show() {
        // �A���[�g�_�C�A���O�̃L�����Z�����\���ǂ�����ݒ肵�܂�
        setCancelable(true);
        AlertDialog alertDialog = create();
        // �A���[�g�_�C�A���O��\�����܂�
        alertDialog.show();
    }

}
