//[kakao](../../../index.md)/[io.github.kakaocup.kakao.common.actions](../index.md)/[SwipeableActions](index.md)



# SwipeableActions  
 [androidJvm] interface [SwipeableActions](index.md) : [BaseActions](../-base-actions/index.md)

Provides swipe actions for views

   


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/act/#kotlin.Function0[androidx.test.espresso.ViewAction]/PointingToDeclaration/"></a>[act](../-base-actions/act.md)| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/act/#kotlin.Function0[androidx.test.espresso.ViewAction]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [act](../-base-actions/act.md)(function: () -> ViewAction)  <br>More info  <br>Performs custom action on a view  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/click/#androidx.test.espresso.action.GeneralLocation/PointingToDeclaration/"></a>[click](../-base-actions/click.md)| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/click/#androidx.test.espresso.action.GeneralLocation/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [click](../-base-actions/click.md)(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER)  <br>More info  <br>Performs click on view  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/doubleClick/#androidx.test.espresso.action.GeneralLocation/PointingToDeclaration/"></a>[doubleClick](../-base-actions/double-click.md)| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/doubleClick/#androidx.test.espresso.action.GeneralLocation/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [doubleClick](../-base-actions/double-click.md)(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER)  <br>More info  <br>Performs double click on view  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/longClick/#androidx.test.espresso.action.GeneralLocation/PointingToDeclaration/"></a>[longClick](../-base-actions/long-click.md)| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/longClick/#androidx.test.espresso.action.GeneralLocation/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [longClick](../-base-actions/long-click.md)(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER)  <br>More info  <br>Performs long click on view  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/onFailure/#kotlin.Function2[kotlin.Throwable,org.hamcrest.Matcher[android.view.View],kotlin.Unit]/PointingToDeclaration/"></a>[onFailure](../-base-actions/on-failure.md)| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/onFailure/#kotlin.Function2[kotlin.Throwable,org.hamcrest.Matcher[android.view.View],kotlin.Unit]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [onFailure](../-base-actions/on-failure.md)(function: (error: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html), matcher: Matcher<[View](https://developer.android.com/reference/kotlin/android/view/View.html)>) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  <br>More info  <br>Adds failure handler to the view  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/pressImeAction/#/PointingToDeclaration/"></a>[pressImeAction](../-base-actions/press-ime-action.md)| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/pressImeAction/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [pressImeAction](../-base-actions/press-ime-action.md)()  <br>More info  <br>Presses IME action, if supported view is in focus  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/repeatUntil/#kotlin.Int#kotlin.Function0[androidx.test.espresso.ViewAction]#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a>[repeatUntil](../-base-actions/repeat-until.md)| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/repeatUntil/#kotlin.Int#kotlin.Function0[androidx.test.espresso.ViewAction]#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [repeatUntil](../-base-actions/repeat-until.md)(maxAttempts: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 1, action: () -> ViewAction, matcher: [ViewBuilder](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  <br>More info  <br>Repeats given action on the view until this view will match the given matcher  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/scrollTo/#/PointingToDeclaration/"></a>[scrollTo](../-base-actions/scroll-to.md)| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/scrollTo/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [scrollTo](../-base-actions/scroll-to.md)()  <br>More info  <br>Scrolls to the view, if possible  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.actions/SwipeableActions/swipeDown/#/PointingToDeclaration/"></a>[swipeDown](swipe-down.md)| <a name="io.github.kakaocup.kakao.common.actions/SwipeableActions/swipeDown/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [swipeDown](swipe-down.md)()  <br>More info  <br>Swipes down on the view  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.actions/SwipeableActions/swipeLeft/#/PointingToDeclaration/"></a>[swipeLeft](swipe-left.md)| <a name="io.github.kakaocup.kakao.common.actions/SwipeableActions/swipeLeft/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [swipeLeft](swipe-left.md)()  <br>More info  <br>Swipes left on the view  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.actions/SwipeableActions/swipeRight/#/PointingToDeclaration/"></a>[swipeRight](swipe-right.md)| <a name="io.github.kakaocup.kakao.common.actions/SwipeableActions/swipeRight/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [swipeRight](swipe-right.md)()  <br>More info  <br>Swipes right on the view  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.actions/SwipeableActions/swipeUp/#/PointingToDeclaration/"></a>[swipeUp](swipe-up.md)| <a name="io.github.kakaocup.kakao.common.actions/SwipeableActions/swipeUp/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [swipeUp](swipe-up.md)()  <br>More info  <br>Swipes up on the view  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.common.actions/SwipeableActions/view/#/PointingToDeclaration/"></a>[view](index.md#573027436%2FProperties%2F34310170)| <a name="io.github.kakaocup.kakao.common.actions/SwipeableActions/view/#/PointingToDeclaration/"></a> [androidJvm] abstract val [view](index.md#573027436%2FProperties%2F34310170): [ViewInteractionDelegate](../../io.github.kakaocup.kakao.delegate/-view-interaction-delegate/index.md)   <br>|


## Inheritors  
  
|  Name | 
|---|
| <a name="io.github.kakaocup.kakao.common.views/KSwipeView///PointingToDeclaration/"></a>[KSwipeView](../../io.github.kakaocup.kakao.common.views/-k-swipe-view/index.md)|
| <a name="io.github.kakaocup.kakao.pager/KViewPager///PointingToDeclaration/"></a>[KViewPager](../../io.github.kakaocup.kakao.pager/-k-view-pager/index.md)|
| <a name="io.github.kakaocup.kakao.pager2/KViewPager2///PointingToDeclaration/"></a>[KViewPager2](../../io.github.kakaocup.kakao.pager2/-k-view-pager2/index.md)|
| <a name="io.github.kakaocup.kakao.pager2/ViewPager2Actions///PointingToDeclaration/"></a>[ViewPager2Actions](../../io.github.kakaocup.kakao.pager2/-view-pager2-actions/index.md)|
| <a name="io.github.kakaocup.kakao.recycler/RecyclerActions///PointingToDeclaration/"></a>[RecyclerActions](../../io.github.kakaocup.kakao.recycler/-recycler-actions/index.md)|
| <a name="io.github.kakaocup.kakao.scroll/ScrollViewActions///PointingToDeclaration/"></a>[ScrollViewActions](../../io.github.kakaocup.kakao.scroll/-scroll-view-actions/index.md)|
| <a name="io.github.kakaocup.kakao.swiperefresh/SwipeRefreshLayoutActions///PointingToDeclaration/"></a>[SwipeRefreshLayoutActions](../../io.github.kakaocup.kakao.swiperefresh/-swipe-refresh-layout-actions/index.md)|

