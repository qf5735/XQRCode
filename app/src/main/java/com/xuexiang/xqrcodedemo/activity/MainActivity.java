/*
 * Copyright (C) 2018 xuexiangjys(xuexiangjys@163.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.xuexiang.xqrcodedemo.activity;

import android.graphics.PixelFormat;
import android.os.Bundle;

import com.xuexiang.xpage.base.BaseActivity;
import com.xuexiang.xqrcodedemo.fragment.MainFragment;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //为了解决fragment里面放surfaceview，第一次黑屏的问题
        getWindow().setFormat(PixelFormat.TRANSLUCENT);
        openPage(MainFragment.class);
    }

}
