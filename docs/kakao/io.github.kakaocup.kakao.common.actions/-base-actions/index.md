//[kakao](../../../index.md)/[io.github.kakaocup.kakao.common.actions](../index.md)/[BaseActions](index.md)



# BaseActions  
 [androidJvm] interface [BaseActions](index.md)

Base interface for performing actions on view



Provides a lot of basic action methods, such as click(), scrollTo(), etc.

   


## See also  
  
androidJvm  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.common.actions/BaseActions///PointingToDeclaration/"></a>[io.github.kakaocup.kakao.edit.EditableActions](../../io.github.kakaocup.kakao.edit/-editable-actions/index.md)| <a name="io.github.kakaocup.kakao.common.actions/BaseActions///PointingToDeclaration/"></a>|
| <a name="io.github.kakaocup.kakao.common.actions/BaseActions///PointingToDeclaration/"></a>[io.github.kakaocup.kakao.common.actions.SwipeableActions](../-swipeable-actions/index.md)| <a name="io.github.kakaocup.kakao.common.actions/BaseActions///PointingToDeclaration/"></a>|
| <a name="io.github.kakaocup.kakao.common.actions/BaseActions///PointingToDeclaration/"></a>[io.github.kakaocup.kakao.common.actions.ScrollableActions](../-scrollable-actions/index.md)| <a name="io.github.kakaocup.kakao.common.actions/BaseActions///PointingToDeclaration/"></a>|
| <a name="io.github.kakaocup.kakao.common.actions/BaseActions///PointingToDeclaration/"></a>[io.github.kakaocup.kakao.check.CheckableActions](../../io.github.kakaocup.kakao.check/-checkable-actions/index.md)| <a name="io.github.kakaocup.kakao.common.actions/BaseActions///PointingToDeclaration/"></a>|
  


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/act/#kotlin.Function0[androidx.test.espresso.ViewAction]/PointingToDeclaration/"></a>[act](act.md)| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/act/#kotlin.Function0[androidx.test.espresso.ViewAction]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [act](act.md)(function: () -> ViewAction)  <br>More info  <br>Performs custom action on a view  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/click/#androidx.test.espresso.action.GeneralLocation/PointingToDeclaration/"></a>[click](click.md)| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/click/#androidx.test.espresso.action.GeneralLocation/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [click](click.md)(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER)  <br>More info  <br>Performs click on view  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/doubleClick/#androidx.test.espresso.action.GeneralLocation/PointingToDeclaration/"></a>[doubleClick](double-click.md)| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/doubleClick/#androidx.test.espresso.action.GeneralLocation/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [doubleClick](double-click.md)(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER)  <br>More info  <br>Performs double click on view  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/longClick/#androidx.test.espresso.action.GeneralLocation/PointingToDeclaration/"></a>[longClick](long-click.md)| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/longClick/#androidx.test.espresso.action.GeneralLocation/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [longClick](long-click.md)(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER)  <br>More info  <br>Performs long click on view  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/onFailure/#kotlin.Function2[kotlin.Throwable,org.hamcrest.Matcher[android.view.View],kotlin.Unit]/PointingToDeclaration/"></a>[onFailure](on-failure.md)| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/onFailure/#kotlin.Function2[kotlin.Throwable,org.hamcrest.Matcher[android.view.View],kotlin.Unit]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [onFailure](on-failure.md)(function: (error: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html), matcher: Matcher<[View](https://developer.android.com/reference/kotlin/android/view/View.html)>) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  <br>More info  <br>Adds failure handler to the view  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/pressImeAction/#/PointingToDeclaration/"></a>[pressImeAction](press-ime-action.md)| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/pressImeAction/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [pressImeAction](press-ime-action.md)()  <br>More info  <br>Presses IME action, if supported view is in focus  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/repeatUntil/#kotlin.Int#kotlin.Function0[androidx.test.espresso.ViewAction]#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a>[repeatUntil](repeat-until.md)| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/repeatUntil/#kotlin.Int#kotlin.Function0[androidx.test.espresso.ViewAction]#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [repeatUntil](repeat-until.md)(maxAttempts: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 1, action: () -> ViewAction, matcher: [ViewBuilder](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  <br>More info  <br>Repeats given action on the view until this view will match the given matcher  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/scrollTo/#/PointingToDeclaration/"></a>[scrollTo](scroll-to.md)| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/scrollTo/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [scrollTo](scroll-to.md)()  <br>More info  <br>Scrolls to the view, if possible  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/view/#/PointingToDeclaration/"></a>[view](view.md)| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/view/#/PointingToDeclaration/"></a> [androidJvm] abstract val [view](view.md): [ViewInteractionDelegate](../../io.github.kakaocup.kakao.delegate/-view-interaction-delegate/index.md)   <br>|


## Inheritors  
  
|  Name | 
|---|
| <a name="io.github.kakaocup.kakao.bottomnav/BottomNavigationViewActions///PointingToDeclaration/"></a>[BottomNavigationViewActions](../../io.github.kakaocup.kakao.bottomnav/-bottom-navigation-view-actions/index.md)|
| <a name="io.github.kakaocup.kakao.check/CheckableActions///PointingToDeclaration/"></a>[CheckableActions](../../io.github.kakaocup.kakao.check/-checkable-actions/index.md)|
| <a name="io.github.kakaocup.kakao.chipgroup/ChipGroupActions///PointingToDeclaration/"></a>[ChipGroupActions](../../io.github.kakaocup.kakao.chipgroup/-chip-group-actions/index.md)|
| <a name="io.github.kakaocup.kakao.common.actions/ScrollableActions///PointingToDeclaration/"></a>[ScrollableActions](../-scrollable-actions/index.md)|
| <a name="io.github.kakaocup.kakao.common.actions/SwipeableActions///PointingToDeclaration/"></a>[SwipeableActions](../-swipeable-actions/index.md)|
| <a name="io.github.kakaocup.kakao.common.views/KBaseView///PointingToDeclaration/"></a>[KBaseView](../../io.github.kakaocup.kakao.common.views/-k-base-view/index.md)|
| <a name="io.github.kakaocup.kakao.drawer/DrawerActions///PointingToDeclaration/"></a>[DrawerActions](../../io.github.kakaocup.kakao.drawer/-drawer-actions/index.md)|
| <a name="io.github.kakaocup.kakao.edit/EditableActions///PointingToDeclaration/"></a>[EditableActions](../../io.github.kakaocup.kakao.edit/-editable-actions/index.md)|
| <a name="io.github.kakaocup.kakao.list/KAdapterItem///PointingToDeclaration/"></a>[KAdapterItem](../../io.github.kakaocup.kakao.list/-k-adapter-item/index.md)|
| <a name="io.github.kakaocup.kakao.navigation/NavigationViewActions///PointingToDeclaration/"></a>[NavigationViewActions](../../io.github.kakaocup.kakao.navigation/-navigation-view-actions/index.md)|
| <a name="io.github.kakaocup.kakao.pager2/KViewPagerItem///PointingToDeclaration/"></a>[KViewPagerItem](../../io.github.kakaocup.kakao.pager2/-k-view-pager-item/index.md)|
| <a name="io.github.kakaocup.kakao.picker.date/DatePickerAction///PointingToDeclaration/"></a>[DatePickerAction](../../io.github.kakaocup.kakao.picker.date/-date-picker-action/index.md)|
| <a name="io.github.kakaocup.kakao.picker.date/DatePickerAssertion///PointingToDeclaration/"></a>[DatePickerAssertion](../../io.github.kakaocup.kakao.picker.date/-date-picker-assertion/index.md)|
| <a name="io.github.kakaocup.kakao.picker.time/TimePickerAction///PointingToDeclaration/"></a>[TimePickerAction](../../io.github.kakaocup.kakao.picker.time/-time-picker-action/index.md)|
| <a name="io.github.kakaocup.kakao.picker.time/TimePickerAssertion///PointingToDeclaration/"></a>[TimePickerAssertion](../../io.github.kakaocup.kakao.picker.time/-time-picker-assertion/index.md)|
| <a name="io.github.kakaocup.kakao.progress/ProgressBarActions///PointingToDeclaration/"></a>[ProgressBarActions](../../io.github.kakaocup.kakao.progress/-progress-bar-actions/index.md)|
| <a name="io.github.kakaocup.kakao.rating/RatingBarActions///PointingToDeclaration/"></a>[RatingBarActions](../../io.github.kakaocup.kakao.rating/-rating-bar-actions/index.md)|
| <a name="io.github.kakaocup.kakao.recycler/KRecyclerItem///PointingToDeclaration/"></a>[KRecyclerItem](../../io.github.kakaocup.kakao.recycler/-k-recycler-item/index.md)|
| <a name="io.github.kakaocup.kakao.searchview/SearchViewActions///PointingToDeclaration/"></a>[SearchViewActions](../../io.github.kakaocup.kakao.searchview/-search-view-actions/index.md)|
| <a name="io.github.kakaocup.kakao.slider/SliderActions///PointingToDeclaration/"></a>[SliderActions](../../io.github.kakaocup.kakao.slider/-slider-actions/index.md)|
| <a name="io.github.kakaocup.kakao.switch/SwitchableActions///PointingToDeclaration/"></a>[SwitchableActions](../../io.github.kakaocup.kakao.switch/-switchable-actions/index.md)|
| <a name="io.github.kakaocup.kakao.tabs/TabLayoutActions///PointingToDeclaration/"></a>[TabLayoutActions](../../io.github.kakaocup.kakao.tabs/-tab-layout-actions/index.md)|
| <a name="io.github.kakaocup.kakao.text/TextViewActions///PointingToDeclaration/"></a>[TextViewActions](../../io.github.kakaocup.kakao.text/-text-view-actions/index.md)|
| <a name="io.github.kakaocup.kakao.toolbar/ToolbarViewActions///PointingToDeclaration/"></a>[ToolbarViewActions](../../io.github.kakaocup.kakao.toolbar/-toolbar-view-actions/index.md)|

