package myqy.yztc.com.myqy.config.storeConfig;

import android.view.View;

/**
 * Created by My on 2016/9/24.
 */
//recyclerView的点击事件接口
public interface OnItemClickListener {
    public void onItemClick(View view, int position);
    public void onItemLongClick(View view, int position);
}
