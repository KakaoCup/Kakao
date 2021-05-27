[kakao](../../index.md) / [io.github.kakaocup.kakao.common.assertions](../index.md) / [BaseAssertions](./index.md)

# BaseAssertions

`interface BaseAssertions`

Base interface for asserting views

Provides basic assertions that can be performed on any view

**See Also**

[io.github.kakaocup.kakao.text.TextViewAssertions](../../io.github.kakaocup.kakao.text/-text-view-assertions/index.md)

[io.github.kakaocup.kakao.check.CheckableAssertions](../../io.github.kakaocup.kakao.check/-checkable-assertions/index.md)

[io.github.kakaocup.kakao.pager.ViewPagerAssertions](../../io.github.kakaocup.kakao.pager/-view-pager-assertions/index.md)

[io.github.kakaocup.kakao.image.ImageViewAssertions](../../io.github.kakaocup.kakao.image/-image-view-assertions/index.md)

### Properties

| Name | Summary |
|---|---|
| [root](root.md) | `abstract var root: Matcher<Root>` |
| [view](view.md) | `abstract val view: `[`ViewInteractionDelegate`](../../io.github.kakaocup.kakao.delegate/-view-interaction-delegate/index.md) |

### Functions

| Name | Summary |
|---|---|
| [assert](assert.md) | `open fun assert(function: () -> ViewAssertion): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check the view with the given custom assertion |
| [doesNotExist](does-not-exist.md) | `open fun doesNotExist(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the matched view does not exist |
| [hasAnyTag](has-any-tag.md) | `open fun hasAnyTag(vararg tags: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has at least one of the given tags |
| [hasBackgroundColor](has-background-color.md) | `open fun hasBackgroundColor(resId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`open fun hasBackgroundColor(colorCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given background color |
| [hasDescendant](has-descendant.md) | `open fun hasDescendant(function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given descendant |
| [hasNotDescendant](has-not-descendant.md) | `open fun hasNotDescendant(function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has not given descendant |
| [hasNotSibling](has-not-sibling.md) | `open fun hasNotSibling(function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has not given sibling |
| [hasSibling](has-sibling.md) | `open fun hasSibling(function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given sibling |
| [hasTag](has-tag.md) | `open fun hasTag(tag: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given tag |
| [inRoot](in-root.md) | `open fun inRoot(function: `[`RootBuilder`](../../io.github.kakaocup.kakao.common.builders/-root-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check if the view is in given root |
| [isClickable](is-clickable.md) | `open fun isClickable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is clickable |
| [isCompletelyAbove](is-completely-above.md) | `open fun isCompletelyAbove(function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view displayed is completely above of the view matching the given matcher. |
| [isCompletelyBelow](is-completely-below.md) | `open fun isCompletelyBelow(function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view displayed is completely below of the view matching the given matcher. |
| [isCompletelyDisplayed](is-completely-displayed.md) | `open fun isCompletelyDisplayed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is completely displayed |
| [isCompletelyLeftOf](is-completely-left-of.md) | `open fun isCompletelyLeftOf(function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view displayed is completely right of the view matching the given matcher. |
| [isCompletelyRightOf](is-completely-right-of.md) | `open fun isCompletelyRightOf(function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view displayed is completely right of the view matching the given matcher. |
| [isDisabled](is-disabled.md) | `open fun isDisabled(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is disabled |
| [isDisplayed](is-displayed.md) | `open fun isDisplayed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is displayed |
| [isEnabled](is-enabled.md) | `open fun isEnabled(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is enabled |
| [isFocusable](is-focusable.md) | `open fun isFocusable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is focusable |
| [isFocused](is-focused.md) | `open fun isFocused(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is focused |
| [isGone](is-gone.md) | `open fun isGone(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has GONE visibility |
| [isInvisible](is-invisible.md) | `open fun isInvisible(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has INVISIBLE visibility |
| [isNotClickable](is-not-clickable.md) | `open fun isNotClickable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not clickable |
| [isNotCompletelyDisplayed](is-not-completely-displayed.md) | `open fun isNotCompletelyDisplayed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not completely displayed |
| [isNotDisplayed](is-not-displayed.md) | `open fun isNotDisplayed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not displayed |
| [isNotFocusable](is-not-focusable.md) | `open fun isNotFocusable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not focusable |
| [isNotFocused](is-not-focused.md) | `open fun isNotFocused(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not focused |
| [isNotSelected](is-not-selected.md) | `open fun isNotSelected(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not selected |
| [isSelected](is-selected.md) | `open fun isSelected(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is selected |
| [isVisible](is-visible.md) | `open fun isVisible(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has VISIBLE visibility |
| [matches](matches.md) | `open fun matches(function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check if the view matches given matcher |
| [notMatches](not-matches.md) | `open fun notMatches(function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check if the view does not match given matcher |

### Inheritors

| Name | Summary |
|---|---|
| [BottomNavigationViewAssertions](../../io.github.kakaocup.kakao.bottomnav/-bottom-navigation-view-assertions/index.md) | `interface BottomNavigationViewAssertions : `[`BaseAssertions`](./index.md)<br>Provides assertion for BottomNavigationview |
| [CheckableAssertions](../../io.github.kakaocup.kakao.check/-checkable-assertions/index.md) | `interface CheckableAssertions : `[`BaseAssertions`](./index.md)<br>Provides checkable based assertions for views |
| [ChipGroupAssertions](../../io.github.kakaocup.kakao.chipgroup/-chip-group-assertions/index.md) | `interface ChipGroupAssertions : `[`BaseAssertions`](./index.md)<br>Provides assertions for a ChipGroup |
| [ImageViewAssertions](../../io.github.kakaocup.kakao.image/-image-view-assertions/index.md) | `interface ImageViewAssertions : `[`BaseAssertions`](./index.md)<br>Provides assertion for image views |
| [KAbsListView](../../io.github.kakaocup.kakao.list/-k-abs-list-view/index.md) | `class KAbsListView : `[`ScrollViewActions`](../../io.github.kakaocup.kakao.scroll/-scroll-view-actions/index.md)`, `[`AbsListViewAdapterActions`](../../io.github.kakaocup.kakao.list/-abs-list-view-adapter-actions/index.md)`, `[`BaseAssertions`](./index.md)`, `[`AbsListViewAdapterAssertions`](../../io.github.kakaocup.kakao.list/-abs-list-view-adapter-assertions/index.md)<br>View with ScrollViewActions and BaseAssertions. Gives access to it's children |
| [KAdapterItem](../../io.github.kakaocup.kakao.list/-k-adapter-item/index.md) | `open class KAdapterItem<out T> : `[`BaseActions`](../../io.github.kakaocup.kakao.common.actions/-base-actions/index.md)`, `[`BaseAssertions`](./index.md)`, `[`Interceptable`](../../io.github.kakaocup.kakao.intercept/-interceptable/index.md)`<ViewInteraction, ViewAssertion, ViewAction>`<br>Base class for KAbsListView adapter items |
| [KBaseView](../../io.github.kakaocup.kakao.common.views/-k-base-view/index.md) | `open class KBaseView<out T> : `[`BaseActions`](../../io.github.kakaocup.kakao.common.actions/-base-actions/index.md)`, `[`BaseAssertions`](./index.md)`, `[`Interceptable`](../../io.github.kakaocup.kakao.intercept/-interceptable/index.md)`<ViewInteraction, ViewAssertion, ViewAction>`<br>Base class for all Kakao views |
| [KRecyclerItem](../../io.github.kakaocup.kakao.recycler/-k-recycler-item/index.md) | `open class KRecyclerItem<out T> : `[`BaseActions`](../../io.github.kakaocup.kakao.common.actions/-base-actions/index.md)`, `[`BaseAssertions`](./index.md)`, `[`Interceptable`](../../io.github.kakaocup.kakao.intercept/-interceptable/index.md)`<ViewInteraction, ViewAssertion, ViewAction>`<br>Base class for KRecyclerView adapter items |
| [KRecyclerView](../../io.github.kakaocup.kakao.recycler/-k-recycler-view/index.md) | `class KRecyclerView : `[`RecyclerActions`](../../io.github.kakaocup.kakao.recycler/-recycler-actions/index.md)`, `[`BaseAssertions`](./index.md)`, `[`RecyclerAdapterAssertions`](../../io.github.kakaocup.kakao.recycler/-recycler-adapter-assertions/index.md)<br>View with RecyclerActions, BaseAssertions and RecyclerAdapterAssertions. Gives access to it's children |
| [KScrollView](../../io.github.kakaocup.kakao.scroll/-k-scroll-view/index.md) | `class KScrollView : `[`KBaseView`](../../io.github.kakaocup.kakao.common.views/-k-base-view/index.md)`<`[`KScrollView`](../../io.github.kakaocup.kakao.scroll/-k-scroll-view/index.md)`>, `[`ScrollViewActions`](../../io.github.kakaocup.kakao.scroll/-scroll-view-actions/index.md)`, `[`BaseAssertions`](./index.md)<br>View with ScrollViewActions and BaseAssertions |
| [KSpinner](../../io.github.kakaocup.kakao.spinner/-k-spinner/index.md) | `class KSpinner : `[`SpinnerAdapterActions`](../../io.github.kakaocup.kakao.spinner/-spinner-adapter-actions/index.md)`, `[`SpinnerAdapterAssertions`](../../io.github.kakaocup.kakao.spinner/-spinner-adapter-assertions/index.md)`, `[`BaseAssertions`](./index.md) |
| [KViewPager2](../../io.github.kakaocup.kakao.pager2/-k-view-pager2/index.md) | `class KViewPager2 : `[`ViewPager2Actions`](../../io.github.kakaocup.kakao.pager2/-view-pager2-actions/index.md)`, `[`ViewPager2AdapterAssertions`](../../io.github.kakaocup.kakao.pager2/-view-pager2-adapter-assertions/index.md)`, `[`SwipeableActions`](../../io.github.kakaocup.kakao.common.actions/-swipeable-actions/index.md)`, `[`BaseAssertions`](./index.md)<br>View with SwipeableActions and ViewPager2Assertions |
| [KViewPagerItem](../../io.github.kakaocup.kakao.pager2/-k-view-pager-item/index.md) | `open class KViewPagerItem<out T> : `[`BaseActions`](../../io.github.kakaocup.kakao.common.actions/-base-actions/index.md)`, `[`BaseAssertions`](./index.md)`, `[`Interceptable`](../../io.github.kakaocup.kakao.intercept/-interceptable/index.md)`<ViewInteraction, ViewAssertion, ViewAction>`<br>Base class for KViewPager2 adapter items |
| [NavigationViewAssertions](../../io.github.kakaocup.kakao.navigation/-navigation-view-assertions/index.md) | `interface NavigationViewAssertions : `[`BaseAssertions`](./index.md)<br>Provides assertions for NavigationView |
| [ProgressBarAssertions](../../io.github.kakaocup.kakao.progress/-progress-bar-assertions/index.md) | `interface ProgressBarAssertions : `[`BaseAssertions`](./index.md)<br>Provides assertions for progress bar |
| [RatingBarAssertions](../../io.github.kakaocup.kakao.rating/-rating-bar-assertions/index.md) | `interface RatingBarAssertions : `[`BaseAssertions`](./index.md)<br>Provides assertions for RatingBar |
| [SearchViewAssertions](../../io.github.kakaocup.kakao.searchview/-search-view-assertions/index.md) | `interface SearchViewAssertions : `[`BaseAssertions`](./index.md) |
| [SliderAssertions](../../io.github.kakaocup.kakao.slider/-slider-assertions/index.md) | `interface SliderAssertions : `[`BaseAssertions`](./index.md) |
| [SwipeRefreshLayoutAssertions](../../io.github.kakaocup.kakao.swiperefresh/-swipe-refresh-layout-assertions/index.md) | `interface SwipeRefreshLayoutAssertions : `[`BaseAssertions`](./index.md)<br>Provides assertion for SwipeRefreshLayout |
| [TabLayoutAssertions](../../io.github.kakaocup.kakao.tabs/-tab-layout-assertions/index.md) | `interface TabLayoutAssertions : `[`BaseAssertions`](./index.md)<br>Provides assertions for TabLayout |
| [TextInputLayoutAssertions](../../io.github.kakaocup.kakao.edit/-text-input-layout-assertions/index.md) | `interface TextInputLayoutAssertions : `[`BaseAssertions`](./index.md)<br>Provides assertions for TextInputLayout |
| [TextViewAssertions](../../io.github.kakaocup.kakao.text/-text-view-assertions/index.md) | `interface TextViewAssertions : `[`BaseAssertions`](./index.md)<br>Provides text based assertions for views |
| [ToolbarViewAssertions](../../io.github.kakaocup.kakao.toolbar/-toolbar-view-assertions/index.md) | `interface ToolbarViewAssertions : `[`BaseAssertions`](./index.md)<br>Provides assertion for Toolbar |
| [ViewPagerAssertions](../../io.github.kakaocup.kakao.pager/-view-pager-assertions/index.md) | `interface ViewPagerAssertions : `[`BaseAssertions`](./index.md)<br>Provides assertions for view pagers |
