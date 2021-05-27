//[kakao](../../../index.md)/[io.github.kakaocup.kakao.scroll](../index.md)/[ScrollViewActions](index.md)



# ScrollViewActions  
 [androidJvm] interface [ScrollViewActions](index.md) : [ScrollableActions](../../io.github.kakaocup.kakao.common.actions/-scrollable-actions/index.md), [SwipeableActions](../../io.github.kakaocup.kakao.common.actions/-swipeable-actions/index.md)

Provides ScrollableActions implementation for ScrollView

   


## See also  
  
androidJvm  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.scroll/ScrollViewActions///PointingToDeclaration/"></a>[io.github.kakaocup.kakao.common.actions.ScrollableActions](../../io.github.kakaocup.kakao.common.actions/-scrollable-actions/index.md)| <a name="io.github.kakaocup.kakao.scroll/ScrollViewActions///PointingToDeclaration/"></a>|
| <a name="io.github.kakaocup.kakao.scroll/ScrollViewActions///PointingToDeclaration/"></a>[io.github.kakaocup.kakao.common.actions.SwipeableActions](../../io.github.kakaocup.kakao.common.actions/-swipeable-actions/index.md)| <a name="io.github.kakaocup.kakao.scroll/ScrollViewActions///PointingToDeclaration/"></a>|
| <a name="io.github.kakaocup.kakao.scroll/ScrollViewActions///PointingToDeclaration/"></a>[android.widget.ScrollView](https://developer.android.com/reference/kotlin/android/widget/ScrollView.html)| <a name="io.github.kakaocup.kakao.scroll/ScrollViewActions///PointingToDeclaration/"></a>|
  


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/act/#kotlin.Function0[androidx.test.espresso.ViewAction]/PointingToDeclaration/"></a>[act](../../io.github.kakaocup.kakao.common.actions/-base-actions/act.md)| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/act/#kotlin.Function0[androidx.test.espresso.ViewAction]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [act](../../io.github.kakaocup.kakao.common.actions/-base-actions/act.md)(function: () -> ViewAction)  <br>More info  <br>Performs custom action on a view  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/click/#androidx.test.espresso.action.GeneralLocation/PointingToDeclaration/"></a>[click](../../io.github.kakaocup.kakao.common.actions/-base-actions/click.md)| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/click/#androidx.test.espresso.action.GeneralLocation/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [click](../../io.github.kakaocup.kakao.common.actions/-base-actions/click.md)(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER)  <br>More info  <br>Performs click on view  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/doubleClick/#androidx.test.espresso.action.GeneralLocation/PointingToDeclaration/"></a>[doubleClick](../../io.github.kakaocup.kakao.common.actions/-base-actions/double-click.md)| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/doubleClick/#androidx.test.espresso.action.GeneralLocation/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [doubleClick](../../io.github.kakaocup.kakao.common.actions/-base-actions/double-click.md)(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER)  <br>More info  <br>Performs double click on view  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/longClick/#androidx.test.espresso.action.GeneralLocation/PointingToDeclaration/"></a>[longClick](../../io.github.kakaocup.kakao.common.actions/-base-actions/long-click.md)| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/longClick/#androidx.test.espresso.action.GeneralLocation/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [longClick](../../io.github.kakaocup.kakao.common.actions/-base-actions/long-click.md)(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER)  <br>More info  <br>Performs long click on view  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/onFailure/#kotlin.Function2[kotlin.Throwable,org.hamcrest.Matcher[android.view.View],kotlin.Unit]/PointingToDeclaration/"></a>[onFailure](../../io.github.kakaocup.kakao.common.actions/-base-actions/on-failure.md)| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/onFailure/#kotlin.Function2[kotlin.Throwable,org.hamcrest.Matcher[android.view.View],kotlin.Unit]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [onFailure](../../io.github.kakaocup.kakao.common.actions/-base-actions/on-failure.md)(function: (error: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html), matcher: Matcher<[View](https://developer.android.com/reference/kotlin/android/view/View.html)>) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  <br>More info  <br>Adds failure handler to the view  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/pressImeAction/#/PointingToDeclaration/"></a>[pressImeAction](../../io.github.kakaocup.kakao.common.actions/-base-actions/press-ime-action.md)| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/pressImeAction/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [pressImeAction](../../io.github.kakaocup.kakao.common.actions/-base-actions/press-ime-action.md)()  <br>More info  <br>Presses IME action, if supported view is in focus  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/repeatUntil/#kotlin.Int#kotlin.Function0[androidx.test.espresso.ViewAction]#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a>[repeatUntil](../../io.github.kakaocup.kakao.common.actions/-base-actions/repeat-until.md)| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/repeatUntil/#kotlin.Int#kotlin.Function0[androidx.test.espresso.ViewAction]#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [repeatUntil](../../io.github.kakaocup.kakao.common.actions/-base-actions/repeat-until.md)(maxAttempts: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 1, action: () -> ViewAction, matcher: [ViewBuilder](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  <br>More info  <br>Repeats given action on the view until this view will match the given matcher  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/scrollTo/#/PointingToDeclaration/"></a>[scrollTo](../../io.github.kakaocup.kakao.common.actions/-base-actions/scroll-to.md)| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/scrollTo/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [scrollTo](../../io.github.kakaocup.kakao.common.actions/-base-actions/scroll-to.md)()  <br>More info  <br>Scrolls to the view, if possible  <br><br><br>[androidJvm]  <br>Content  <br>open override fun [scrollTo](scroll-to.md)(position: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br>More info  <br>Scrolls to the specific position of the view  <br><br><br>|
| <a name="io.github.kakaocup.kakao.scroll/ScrollViewActions/scrollToEnd/#/PointingToDeclaration/"></a>[scrollToEnd](scroll-to-end.md)| <a name="io.github.kakaocup.kakao.scroll/ScrollViewActions/scrollToEnd/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [scrollToEnd](scroll-to-end.md)()  <br>More info  <br>Scrolls to the last position of the view  <br><br><br>|
| <a name="io.github.kakaocup.kakao.scroll/ScrollViewActions/scrollToStart/#/PointingToDeclaration/"></a>[scrollToStart](scroll-to-start.md)| <a name="io.github.kakaocup.kakao.scroll/ScrollViewActions/scrollToStart/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [scrollToStart](scroll-to-start.md)()  <br>More info  <br>Scrolls to the starting position of the view  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.actions/SwipeableActions/swipeDown/#/PointingToDeclaration/"></a>[swipeDown](../../io.github.kakaocup.kakao.common.actions/-swipeable-actions/swipe-down.md)| <a name="io.github.kakaocup.kakao.common.actions/SwipeableActions/swipeDown/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [swipeDown](../../io.github.kakaocup.kakao.common.actions/-swipeable-actions/swipe-down.md)()  <br>More info  <br>Swipes down on the view  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.actions/SwipeableActions/swipeLeft/#/PointingToDeclaration/"></a>[swipeLeft](../../io.github.kakaocup.kakao.common.actions/-swipeable-actions/swipe-left.md)| <a name="io.github.kakaocup.kakao.common.actions/SwipeableActions/swipeLeft/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [swipeLeft](../../io.github.kakaocup.kakao.common.actions/-swipeable-actions/swipe-left.md)()  <br>More info  <br>Swipes left on the view  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.actions/SwipeableActions/swipeRight/#/PointingToDeclaration/"></a>[swipeRight](../../io.github.kakaocup.kakao.common.actions/-swipeable-actions/swipe-right.md)| <a name="io.github.kakaocup.kakao.common.actions/SwipeableActions/swipeRight/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [swipeRight](../../io.github.kakaocup.kakao.common.actions/-swipeable-actions/swipe-right.md)()  <br>More info  <br>Swipes right on the view  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.actions/SwipeableActions/swipeUp/#/PointingToDeclaration/"></a>[swipeUp](../../io.github.kakaocup.kakao.common.actions/-swipeable-actions/swipe-up.md)| <a name="io.github.kakaocup.kakao.common.actions/SwipeableActions/swipeUp/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [swipeUp](../../io.github.kakaocup.kakao.common.actions/-swipeable-actions/swipe-up.md)()  <br>More info  <br>Swipes up on the view  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.scroll/ScrollViewActions/view/#/PointingToDeclaration/"></a>[view](index.md#-1945816627%2FProperties%2F34310170)| <a name="io.github.kakaocup.kakao.scroll/ScrollViewActions/view/#/PointingToDeclaration/"></a> [androidJvm] abstract val [view](index.md#-1945816627%2FProperties%2F34310170): [ViewInteractionDelegate](../../io.github.kakaocup.kakao.delegate/-view-interaction-delegate/index.md)   <br>|


## Inheritors  
  
|  Name | 
|---|
| <a name="io.github.kakaocup.kakao.list/KAbsListView///PointingToDeclaration/"></a>[KAbsListView](../../io.github.kakaocup.kakao.list/-k-abs-list-view/index.md)|
| <a name="io.github.kakaocup.kakao.scroll/KScrollView///PointingToDeclaration/"></a>[KScrollView](../-k-scroll-view/index.md)|

