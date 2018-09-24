package com.android.patrickstudio.myapplication;

import android.os.Handler;

import java.net.URL;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by PATRICKLAGGER on 7/13/2017.
 */
// lớp quản lí toàn bộ thread trong ứng dụng
public class ThreadManager {

    // những hàng chỉ trạng download của ứng dụng
    static final int DOWNLOAD_FAILED = -1;
    static final int DOWNLOAD_STARTED = 1;
    static final int DOWNLOAD_COMPLETE = 2;
    static final int DECODE_STARTED = 3;
    static final int TASK_COMPLETE = 4;

    // cài đặt kích thước của nơi lưu trữ hình ảnh
    private static final int IMAGE_CACHE_SIZE = 1024 * 1024 * 4;

    // thời gian rỗi của 1 thread trong chờ đợi nhận tác vụ
    private static final int KEEP_ALIVE_TIME = 1;

    // Đơn vị thời gian
    private static final TimeUnit KEEP_ALIVE_TIME_UNIT = TimeUnit.SECONDS;

    // độ lớn của threadpool
    private static final int CORE_POOL_SIZE = 8;

    // kích thước tối đa của threadpool
    private static final int MAXIMUM_POOL_SIZE = 8;

    private static int NUMBER_OF_CORES = Runtime.getRuntime().availableProcessors();


    // Hàng đợi thread cho việc download hình ảnh.
    private final BlockingQueue<Runnable> mDownloadWorkQueue;

    // A queue of Runnables for the image decoding pool
    private final BlockingQueue<Runnable> mDecodeWorkQueue;

    // A queue of PhotoManager tasks. Tasks are handed to a ThreadPool.
    private final Queue<PhotoTask> mPhotoTaskWorkQueue;

    // A managed pool of background download threads
    private final ThreadPoolExecutor mDownloadThreadPool;

    // A managed pool of background decoder threads
    private final ThreadPoolExecutor mDecodeThreadPool;

    // An object that manages Messages in a Thread
    private Handler mHandler;
}
