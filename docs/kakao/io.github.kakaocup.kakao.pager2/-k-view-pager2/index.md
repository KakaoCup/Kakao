[kakao](../../index.md) / [io.github.kakaocup.kakao.pager2](../index.md) / [KViewPager2](./index.md)

# KViewPager2

`class KViewPager2 : `[`ViewPager2Actions`](../-view-pager2-actions/index.md)`, `[`ViewPager2AdapterAssertions`](../-view-pager2-adapter-assertions/index.md)`, `[`SwipeableActions`](../../io.github.kakaocup.kakao.common.actions/-swipeable-actions/index.md)`, `[`BaseAssertions`](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/index.md)

View with SwipeableActions and ViewPager2Assertions

**See Also**

[SwipeableActions](../../io.github.kakaocup.kakao.common.actions/-swipeable-actions/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `KViewPager2(builder: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`, itemTypeBuilder: `[`KViewPagerItemTypeBuilder`](../-k-view-pager-item-type-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>Constructs view class with view interaction from given ViewBuilder`KViewPager2(parent: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>, builder: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`, itemTypeBuilder: `[`KViewPagerItemTypeBuilder`](../-k-view-pager-item-type-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>`KViewPager2(parent: DataInteraction, builder: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`, itemTypeBuilder: `[`KViewPagerItemTypeBuilder`](../-k-view-pager-item-type-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>Constructs view class with parent and view interaction from given ViewBuilder |

### Properties

| Name | Summary |
|---|---|
| [itemTypes](item-types.md) | `val itemTypes: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<out `[`KViewPagerItem`](../-k-view-pager-item/index.md)`<*>>, `[`KViewPagerItemType`](../-k-view-pager-item-type/index.md)`<`[`KViewPagerItem`](../-k-view-pager-item/index.md)`<*>>>` |
| [matcher](matcher.md) | `val matcher: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>` |
| [root](root.md) | `var root: Matcher<Root>` |
| [view](view.md) | `val view: `[`ViewInteractionDelegate`](../../io.github.kakaocup.kakao.delegate/-view-interaction-delegate/index.md) |

### Functions

| Name | Summary |
|---|---|
| [childAt](child-at.md) | `fun <T : `[`KViewPagerItem`](../-k-view-pager-item/index.md)`<*>> childAt(position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, function: `[`T`](child-at.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs given actions/assertion on child at given position |
| [invoke](invoke.md) | `operator fun invoke(function: `[`KViewPager2`](./index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Operator that allows usage of DSL style |
| [perform](perform.md) | `infix fun perform(function: `[`KViewPager2`](./index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`KViewPager2`](./index.md)<br>Infix function for invoking lambda on your view |

### Inherited Functions

| Name | Summary |
|---|---|
| [assert](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/assert.md) | `open fun assert(function: () -> ViewAssertion): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check the view with the given custom assertion |
| [doesNotExist](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/does-not-exist.md) | `open fun doesNotExist(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the matched view does not exist |
| [getSize](../-view-pager2-actions/get-size.md) | `open fun getSize(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Returns the size of ViewPager2 |
| [hasAnyTag](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/has-any-tag.md) | `open fun hasAnyTag(vararg tags: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has at least one of the given tags |
| [hasBackgroundColor](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/has-background-color.md) | `open fun hasBackgroundColor(resId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`open fun hasBackgroundColor(colorCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given background color |
| [hasDescendant](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/has-descendant.md) | `open fun hasDescendant(function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given descendant |
| [hasNotDescendant](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/has-not-descendant.md) | `open fun hasNotDescendant(function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has not given descendant |
| [hasNotSibling](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/has-not-sibling.md) | `open fun hasNotSibling(function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has not given sibling |
| [hasSibling](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/has-sibling.md) | `open fun hasSibling(function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given sibling |
| [hasSize](../-view-pager2-adapter-assertions/has-size.md) | `open fun hasSize(size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check size of view pager 2 view |
| [hasTag](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/has-tag.md) | `open fun hasTag(tag: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given tag |
| [inRoot](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/in-root.md) | `open fun inRoot(function: `[`RootBuilder`](../../io.github.kakaocup.kakao.common.builders/-root-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check if the view is in given root |
| [isClickable](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-clickable.md) | `open fun isClickable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is clickable |
| [isCompletelyAbove](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-completely-above.md) | `open fun isCompletelyAbove(function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view displayed is completely above of the view matching the given matcher. |
| [isCompletelyBelow](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-completely-below.md) | `open fun isCompletelyBelow(function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view displayed is completely below of the view matching the given matcher. |
| [isCompletelyDisplayed](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-completely-displayed.md) | `open fun isCompletelyDisplayed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is completely displayed |
| [isCompletelyLeftOf](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-completely-left-of.md) | `open fun isCompletelyLeftOf(function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view displayed is completely right of the view matching the given matcher. |
| [isCompletelyRightOf](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-completely-right-of.md) | `open fun isCompletelyRightOf(function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view displayed is completely right of the view matching the given matcher. |
| [isDisabled](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-disabled.md) | `open fun isDisabled(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is disabled |
| [isDisplayed](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-displayed.md) | `open fun isDisplayed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is displayed |
| [isEnabled](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-enabled.md) | `open fun isEnabled(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is enabled |
| [isFocusable](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-focusable.md) | `open fun isFocusable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is focusable |
| [isFocused](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-focused.md) | `open fun isFocused(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is focused |
| [isGone](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-gone.md) | `open fun isGone(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has GONE visibility |
| [isInvisible](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-invisible.md) | `open fun isInvisible(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has INVISIBLE visibility |
| [isNotClickable](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-not-clickable.md) | `open fun isNotClickable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not clickable |
| [isNotCompletelyDisplayed](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-not-completely-displayed.md) | `open fun isNotCompletelyDisplayed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not completely displayed |
| [isNotDisplayed](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-not-displayed.md) | `open fun isNotDisplayed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not displayed |
| [isNotFocusable](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-not-focusable.md) | `open fun isNotFocusable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not focusable |
| [isNotFocused](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-not-focused.md) | `open fun isNotFocused(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not focused |
| [isNotSelected](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-not-selected.md) | `open fun isNotSelected(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not selected |
| [isSelected](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-selected.md) | `open fun isSelected(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is selected |
| [isVisible](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-visible.md) | `open fun isVisible(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has VISIBLE visibility |
| [matches](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/matches.md) | `open fun matches(function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check if the view matches given matcher |
| [notMatches](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/not-matches.md) | `open fun notMatches(function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check if the view does not match given matcher |
| [scrollTo](../-view-pager2-actions/scroll-to.md) | `open fun scrollTo(position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the specific position of the view |
| [scrollToEnd](../-view-pager2-actions/scroll-to-end.md) | `open fun scrollToEnd(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the last position of the view |
| [scrollToStart](../-view-pager2-actions/scroll-to-start.md) | `open fun scrollToStart(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the starting position of the view |