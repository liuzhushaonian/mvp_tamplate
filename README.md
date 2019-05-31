# mvp_tamplate
Android mvp tamplate

Android的MVP模板

## 添加依赖

```
allprojects {
  repositories {
    maven { url 'https://jitpack.io' }
  }
}

```

```
dependencies {
  implementation 'com.github.liuzhushaonian:mvp_tamplate:0.3'
}
```

## Activity
需要用presenter的Activity就继承BasePresenterActivity，创建新的presenter继承BasePresenter

然后创建新的接口去连接二者。

## Fragment

需要使用presenter的Fragment继承BasePresenterFragment，创建新的presenter继承BasePresenter

然后创建新的接口去连接二者。

## BaseAdapter

适用于RecyclerView的BaseAdapter，继承后即可使用。

