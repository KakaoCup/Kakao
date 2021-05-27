[kakao](../../index.md) / [io.github.kakaocup.kakao.common.actions](../index.md) / [BaseActions](./index.md)

# BaseActions

`interface BaseActions`

Base interface for performing actions on view

Provides a lot of basic action methods, such as click(), scrollTo(), etc.

**See Also**

[io.github.kakaocup.kakao.edit.EditableActions](../../io.github.kakaocup.kakao.edit/-editable-actions/index.md)

[io.github.kakaocup.kakao.common.actions.SwipeableActions](../-swipeable-actions/index.md)

[io.github.kakaocup.kakao.common.actions.ScrollableActions](../-scrollable-actions/index.md)

[io.github.kakaocup.kakao.check.CheckableActions](../../io.github.kakaocup.kakao.check/-checkable-actions/index.md)

### Properties

| Name | Summary |
|---|---|
| [view](view.md) | `abstract val view: `[`ViewInteractionDelegate`](../../io.github.kakaocup.kakao.delegate/-view-interaction-delegate/index.md) |

### Functions

| Name | Summary |
|---|---|
| [act](act.md) | `open fun act(function: () -> ViewAction): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs custom action on a view |
| [click](click.md) | `open fun click(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs click on view |
| [doubleClick](double-click.md) | `open fun doubleClick(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs double click on view |
| [longClick](long-click.md) | `open fun longClick(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs long click on view |
| [onFailure](on-failure.md) | `open fun onFailure(function: (error: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, matcher: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Adds failure handler to the view |
| [pressImeAction](press-ime-action.md) | `open fun pressImeAction(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Presses IME action, if supported view is in focus |
| [repeatUntil](repeat-until.md) | `open fun repeatUntil(maxAttempts: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 1, action: () -> ViewAction, matcher: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Repeats given action on the view until this view will match the given matcher |
| [scrollTo](scroll-to.md) | `open fun scrollTo(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the view, if possible |

### Inheritors

| Name | Summary |
|---|---|
| [BottomNavigationViewActions](../../io.github.kakaocup.kakao.bottomnav/-bottom-navigation-view-actions/index.md) | `interface BottomNavigationViewActions : `[`BaseActions`](./index.md)<br>Provides actions for BottomNavigationView |
| [CheckableActions](../../io.github.kakaocup.kakao.check/-checkable-actions/index.md) | `interface CheckableActions : `[`BaseActions`](./index.md)<br>Provides action for checking views |
| [ChipGroupActions](../../io.github.kakaocup.kakao.chipgroup/-chip-group-actions/index.md) | `interface ChipGroupActions : `[`BaseActions`](./index.md) |
| [DatePickerAction](../../io.github.kakaocup.kakao.picker.date/-date-picker-action/index.md) | `interface DatePickerAction : `[`BaseActions`](./index.md)<br>Provides actions for date picker |
| [DatePickerAssertion](../../io.github.kakaocup.kakao.picker.date/-date-picker-assertion/index.md) | `interface DatePickerAssertion : `[`BaseActions`](./index.md)<br>Provides assertions for date picker |
| [DrawerActions](../../io.github.kakaocup.kakao.drawer/-drawer-actions/index.md) | `interface DrawerActions : `[`BaseActions`](./index.md)<br>Provides actions for navigation drawer |
| [EditableActions](../../io.github.kakaocup.kakao.edit/-editable-actions/index.md) | `interface EditableActions : `[`BaseActions`](./index.md)<br>Provides editable actions for views |
| [KAdapterItem](../../io.github.kakaocup.kakao.list/-k-adapter-item/index.md) | `open class KAdapterItem<out T> : `[`BaseActions`](./index.md)`, `[`BaseAssertions`](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/index.md)`, `[`Interceptable`](../../io.github.kakaocup.kakao.intercept/-interceptable/index.md)`<ViewInteraction, ViewAssertion, ViewAction>`<br>Base class for KAbsListView adapter items |
| [KBaseView](../../io.github.kakaocup.kakao.common.views/-k-base-view/index.md) | `open class KBaseView<out T> : `[`BaseActions`](./index.md)`, `[`BaseAssertions`](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/index.md)`, `[`Interceptable`](../../io.github.kakaocup.kakao.intercept/-interceptable/index.md)`<ViewInteraction, ViewAssertion, ViewAction>`<br>Base class for all Kakao views |
| [KRecyclerItem](../../io.github.kakaocup.kakao.recycler/-k-recycler-item/index.md) | `open class KRecyclerItem<out T> : `[`BaseActions`](./index.md)`, `[`BaseAssertions`](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/index.md)`, `[`Interceptable`](../../io.github.kakaocup.kakao.intercept/-interceptable/index.md)`<ViewInteraction, ViewAssertion, ViewAction>`<br>Base class for KRecyclerView adapter items |
| [KViewPagerItem](../../io.github.kakaocup.kakao.pager2/-k-view-pager-item/index.md) | `open class KViewPagerItem<out T> : `[`BaseActions`](./index.md)`, `[`BaseAssertions`](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/index.md)`, `[`Interceptable`](../../io.github.kakaocup.kakao.intercept/-interceptable/index.md)`<ViewInteraction, ViewAssertion, ViewAction>`<br>Base class for KViewPager2 adapter items |
| [NavigationViewActions](../../io.github.kakaocup.kakao.navigation/-navigation-view-actions/index.md) | `interface NavigationViewActions : `[`BaseActions`](./index.md)<br>Provides actions for navigation view |
| [ProgressBarActions](../../io.github.kakaocup.kakao.progress/-progress-bar-actions/index.md) | `interface ProgressBarActions : `[`BaseActions`](./index.md)<br>Provides action for ProgressBar |
| [RatingBarActions](../../io.github.kakaocup.kakao.rating/-rating-bar-actions/index.md) | `interface RatingBarActions : `[`BaseActions`](./index.md)<br>Provides action for RatingBar |
| [ScrollableActions](../-scrollable-actions/index.md) | `interface ScrollableActions : `[`BaseActions`](./index.md)<br>Provides scrolling actions for view |
| [SearchViewActions](../../io.github.kakaocup.kakao.searchview/-search-view-actions/index.md) | `interface SearchViewActions : `[`BaseActions`](./index.md) |
| [SliderActions](../../io.github.kakaocup.kakao.slider/-slider-actions/index.md) | `interface SliderActions : `[`BaseActions`](./index.md)<br>Provides action for Slider |
| [SwipeableActions](../-swipeable-actions/index.md) | `interface SwipeableActions : `[`BaseActions`](./index.md)<br>Provides swipe actions for views |
| [SwitchableActions](../../io.github.kakaocup.kakao.switch/-switchable-actions/index.md) | `interface SwitchableActions : `[`BaseActions`](./index.md)<br>Provides action for actions on Switch |
| [TabLayoutActions](../../io.github.kakaocup.kakao.tabs/-tab-layout-actions/index.md) | `interface TabLayoutActions : `[`BaseActions`](./index.md)<br>Provides action for TabLayout |
| [TextViewActions](../../io.github.kakaocup.kakao.text/-text-view-actions/index.md) | `interface TextViewActions : `[`BaseActions`](./index.md)<br>Provides actions for TextViews |
| [TimePickerAction](../../io.github.kakaocup.kakao.picker.time/-time-picker-action/index.md) | `interface TimePickerAction : `[`BaseActions`](./index.md)<br>Provides actions for time picker |
| [TimePickerAssertion](../../io.github.kakaocup.kakao.picker.time/-time-picker-assertion/index.md) | `interface TimePickerAssertion : `[`BaseActions`](./index.md)<br>Provides assertions for time picker |
| [ToolbarViewActions](../../io.github.kakaocup.kakao.toolbar/-toolbar-view-actions.md) | `interface ToolbarViewActions : `[`BaseActions`](./index.md)<br>Provides actions for Toolbar |
