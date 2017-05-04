package com.ys.zy.catchoice.content;

import android.support.annotation.NonNull;

import com.ys.zy.catchoice.constant.DataFlags;
import com.ys.zy.catchoice.model.TextOption;

/**
 * Created by Ys on 17/1/15.
 * TextCellContent
 */

public class TextCellContent implements ICellContent {

    @NonNull private TextOption mOption;

    public TextCellContent(@NonNull String txt) {
        this.mOption = new TextOption(txt);
    }

    public String getTxt() {
        return this.mOption.txt;
    }

    @Override
    public String getStringData(int flag) {
        if (DataFlags.FLAG_TITLE == flag) {
            return getTxt();
        }
        return "";
    }
}
