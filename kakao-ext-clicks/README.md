# Kakao custom clicks

Espresso clicks implementation sometimes causes additional problems while devices are unstable.
It could be a click that was registered as long click. Click that is not registered at all. And so on.

From the [androidx.test.espresso.action.GeneralClickAction.perform] comment:

```
 Native event injection is quite a tricky process. A tap is actually 2
 seperate motion events which need to get injected into the system. Injection
 makes an RPC call from our app under test to the Android system server, the
 system server decides which window layer to deliver the event to, the system
 server makes an RPC to that window layer, that window layer delivers the event
 to the correct UI element, activity, or window object. Now we need to repeat
 that 2x. for a simple down and up. Oh and the down event triggers timers to
 detect whether or not the event is a long vs. short press. The timers are
 removed the moment the up event is received (NOTE: the possibility of eventTime
 being in the future is totally ignored by most motion event processors).

 Phew.

 The net result of this is sometimes we'll want to do a regular tap, and for
 whatever reason the up event (last half) of the tap is delivered after long
 press timeout (depending on system load) and the long press behaviour is
 displayed (EG: show a context menu). There is no way to avoid or handle this more
 gracefully. Also the longpress behavour is app/widget specific. So if you have
 a seperate long press behaviour from your short press, you can pass in a
 'RollBack' ViewAction which when executed will undo the effects of long press.
```

If you experience unreliable tap/click in UI tests you can try our naive but sometimes more reliable implementation, that dispatches events
directly to View.

## How to use

There are multiple ways to apply custom clicks:

### Apply KakaoClicksTestRule

If you want to apply it directly to single test class the TestRule is an obvious choice.

For example:
```
@Rule
@JvmField
var chain: TestRule = RuleChain.outerRule(ActivityScenarioRule(MyActivity::class.java))
    .around(KakaoClicksTestRule())
```

### Override Kakao clicks behaviour

If you need to change it globally, you can override static variables of kakao, like that: 

```
Kakao {
    singleClickAction = KakaoSingleClick()
    doubleClickAction = KakaoDoubleClick()
    longClickAction = KakaoLongClick()
}
```

To revert this behavior you can set it back:

```
Kakao {
    singleClickAction = EspressoSingleClick()
    doubleClickAction = EspressoDoubleClick()
    longClickAction = EspressoLongClick()
}
```

To make a precise change for single click you can implement your own function and execute your test code wrapped in it:

```kotlin
fun withCustomClicks(block: () -> Unit) {
    Kakao {
        singleClickAction = KakaoSingleClick()
        doubleClickAction = KakaoDoubleClick()
        longClickAction = KakaoLongClick()
    }

    block.invoke()

    Kakao {
        singleClickAction = EspressoSingleClick()
        doubleClickAction = EspressoDoubleClick()
        longClickAction = EspressoLongClick()
    }
}

button {
    withCustomClicks {
        click() // clicked with custom mechanism
    }
    click() // clicked by espresso
}
```

## Click visualization

Click visualization is a useful debug tool. Usually it's enabled with Android option `Developer Options > Show taps`. Or using ADB:

```
adb shell settings put system show_touches 1
```

On different setups it can be impossible to set or it can simply not working.

To enable visual taps programmatically with custom clicks, use custom click constructor:

```kotlin
KakaoSingleClick(visualClicksConfig = VisualClicksConfig()) // null is the default argument
KakaoDoubleClick(visualClicksConfig = VisualClicksConfig())
KakaoLongClick(visualClicksConfig = VisualClicksConfig())
```

or if you are using TestRule:

```kotlin
KakaoClicksTestRule(visualClicksConfig = VisualClicksConfig())
```

to apply config to all types of clicks

`VisualClicksConfig` data class has some customization options: like color and radius of the tap circle.

## Global Center coordinates

There are some cases when standard espresso coordinates not working. 
For example clicking on center of the view  with applied property animations or transitions with help of `GeneralLocation.VISIBLE_CENTER`.
See explanation on why it happens [here](https://github.com/avito-tech/avito-android/pull/308).

`VisibleCenterGlobalCoordinatesProvider` to the rescue.

Pass it as a replacement for your click location like that:

```kotlin
tranformedView.click(VisibleCenterGlobalCoordinatesProvider())
```

## Customize emulator

You can also tune emulator a bit that could help with long click registration.

```
adb shell "settings put secure long_press_timeout 1500" // default can vary but usually it's 400ms
```

## Credits

Initial idea and implementation by [Avito](https://github.com/avito-tech/avito-android)
