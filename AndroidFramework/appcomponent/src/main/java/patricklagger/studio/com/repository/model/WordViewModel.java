package patricklagger.studio.com.repository.model;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import java.util.List;

import patricklagger.studio.com.repository.WordRepository;

/**
 * *****************************************************************
 *
 * @Project: LocationNativeCore
 * @Created: Bao NQ 2018/10/16
 * @Description: ...
 * All Right Reserved.
 * *******************************************************************
 */
public class WordViewModel extends AndroidViewModel {
    private WordRepository mRepository;
    private LiveData<List<Word>> mAllWords;
    public WordViewModel(@NonNull Application application) {
        super(application);
        mRepository = new WordRepository(application);
        mAllWords = mRepository.getAllWords();
    }

    public LiveData<List<Word>> getmAllWords() {
        return mAllWords;
    }

    public void insert(Word word) {
        mRepository.insert(word);
    }
}
