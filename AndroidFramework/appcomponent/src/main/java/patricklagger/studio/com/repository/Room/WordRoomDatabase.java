package patricklagger.studio.com.repository.Room;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import patricklagger.studio.com.repository.model.Word;
import patricklagger.studio.com.repository.model.WordDao;

/**
 * *****************************************************************
 *
 * @Project: LocationNativeCore
 * @Created: Bao NQ 2018/10/15
 * @Description: ...
 * All Right Reserved.
 * *******************************************************************
 */
@Database(entities = {Word.class}, version = 1)
public abstract class WordRoomDatabase extends RoomDatabase {
    private static volatile WordRoomDatabase INSTANCE;
    public static WordRoomDatabase getDatabase(final Context context){
        if(INSTANCE == null){
            synchronized (WordRoomDatabase.class){
                if(INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(), WordRoomDatabase.class, "word_database").build();
                }
            }
        }
        return INSTANCE;
    }
    public abstract WordDao wordDao();

}
