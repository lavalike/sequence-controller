# sequence-controller
> A controller to keep tasks be executed in order.

[![Platform](https://img.shields.io/badge/Platform-Android-00CC00.svg?style=flat)](https://www.android.com)
[![](https://jitpack.io/v/lavalike/sequence-controller.svg)](https://jitpack.io/#lavalike/sequence-controller)


### 依赖导入

项目根目录

``` gradle
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

模块目录

``` gradle
dependencies {
	implementation 'com.github.lavalike:sequence-controller:0.0.1'
}
```

### 代码示例

创建task

``` java
public class OneTask extends SequenceTask {
    @Override
    public void run() {
        controller().proceed();
    }
}
```

顺序入队并执行

``` java
SequenceController controller = new SequenceControllerImpl(this);
controller.enqueue(new OneTask());
controller.enqueue(new TwoTask());
controller.enqueue(new ThreeTask());
controller.proceed();
```