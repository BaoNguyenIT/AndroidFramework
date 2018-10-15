package patricklagger.studio.com.repository.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * *****************************************************************
 *
 * @Project: appcomponent
 * @Created: Bao NQ 2018/10/15
 * @Description: ...
 * All Right Reserved.
 * *******************************************************************
 */
@Entity(tableName = "word_table")
public class Word {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "word")
    private String mWord;

    public Word(@NonNull String mWord) {
        this.mWord = mWord;
    }

    public String getmWord() {
        return mWord;
    }
}
