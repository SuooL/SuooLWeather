SuooLWeather
==============
SuooLWeather
## About

<br> 开源的天气应用软件,仅用于学习交流之用.
<br> 各项功能有待完善.
<br> 敬请期待.
练习之作，主要使用Android方面最新的IDE，计划着逐步采用新的技术、新特性，以及一些流行的开源库快速开发一个不错的REST Client，教你如何Make A Good App! 

##版本
目前还是最原始的初版
## 导入运行

如果你是直接导入Studio，则应该不会有问题，只需要检查你本地的gradle版本即可。如果你要导入eclipse，则AndroidAnnotations可能会不起作用，需要参考[这里](https://github.com/excilys/androidannotations/wiki)做一些配置。

有些library是通过gradle直接引用的，具体参见app/build.gradle。

## 预览

<br>![SuooLWeather](https://github.com/SuooL/SuooLWeather/blob/master/art/1.jpg)
<br>![SuooLWeather](https://github.com/SuooL/SuooLWeather/blob/master/art/2.jpg)
<br>![SuooLWeather](https://github.com/SuooL/SuooLWeather/blob/master/art/3.jpg)

## 开发工具

Android Studio(0.8.6) + Gradle(1.12)

作为一名潮人，怎能不使用最新的IDE来开发呢？

支持命令行进行Gradle编译:（不知道什么是Gradle？见这篇博客[Android Gradle](http://stormzhang.github.io/android/2014/02/28/android-gradle/)）

    gradle clean
    gradle build

## 用到的开源库
目前用到的一些开源库，会持续更新。
* [Gson](https://github.com/eatnumber1/google-gson) json解析

##计划使用和学习的开源库
* [Volley](https://android.googlesource.com/platform/frameworks/volley) Google I/O 2013推出的官方网络请求库，请求快速，使用方便，易于扩展，而且支持图片异步加载。

* [SwipeRefreshLayout](http://stormzhang.github.io/android/2014/03/29/android-swiperefreshlayout/) Google最近推出的下拉刷新组件，原来下拉刷新可以如此简单，如此酷炫！

* [SwipeBackLayout](https://github.com/Issacw0ng/SwipeBackLayout) 你的App还没有支持手势滑动返回么？那就有点Out了。

* [AndroidAnnotations](https://github.com/excilys/androidannotations/wiki) 是不是很烦各种findViewById, 那么这个库正是你需要的，轻量级View注入框架，从此你的代码不再那么臃肿。

* [Crouton](https://github.com/keyboardsurfer/Crouton) 一个友好的提示效果

* [JazzyListView](https://github.com/twotoasters/JazzyListView) 让你的ListView更容易地加入动画

* [JazzyViewPager](https://github.com/jfeinstein10/JazzyViewPager) 让你的ViewPager实现3D翻转

* [Titanic](https://github.com/RomainPiel/Titanic) 不好表达，自己进去看吧

License
============

    Copyright 2014 SuooL

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
