package com.example.xk.opengltest;

import android.content.Context;
import android.opengl.GLSurfaceView;

/**
 * Created by XK on 2018/4/9.
 */

public class MyGLSurfaceView extends GLSurfaceView {
    private final TriggerRender mRenderer;

    public MyGLSurfaceView(Context context) {
        super(context);
        // 创建OpenGL ES 2.0的上下文
        setEGLContextClientVersion(2);

        mRenderer = new TriggerRender();

        //设置Renderer用于绘图
        setRenderer(mRenderer);

        //只有在绘制数据改变时才绘制view，可以防止GLSurfaceView帧重绘
        setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
    }

}
