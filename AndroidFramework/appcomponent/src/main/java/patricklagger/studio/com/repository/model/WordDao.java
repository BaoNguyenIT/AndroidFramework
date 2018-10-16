package patricklagger.studio.com.repository.model;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import patricklagger.studio.com.repository.model.Word;

/**
 * *****************************************************************
 *
 * @Project: LocationNativeCore
 * @Created: Bao NQ 2018/10/15
 * @Description: ...
 * All Right Reserved.
 * *******************************************************************
 */
@Dao
public interface WordDao {
    @Insert
    void insert(Word word);

    @Query("DELETE FROM word_table")
    public void deleteAlls();

    @Query("SELECT * FROM word_table ORDER BY word ASC")
    LiveData<List<Word>> getAllWords();
}
