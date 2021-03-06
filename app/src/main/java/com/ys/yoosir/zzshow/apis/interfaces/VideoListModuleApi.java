package com.ys.yoosir.zzshow.apis.interfaces;

import com.ys.yoosir.zzshow.apis.listener.RequestCallBack;
import rx.Subscription;

/**
 *  视频模块
 *  @version 1.0
 *  @author  yoosir
 * Created by Yoosir on 2016/10/24 0024.
 */
public interface VideoListModuleApi<T> {

    Subscription getVideoList(RequestCallBack<T> callBack,String videoType,int startPage);
}

