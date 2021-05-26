[kakao](../../index.md) / [io.github.kakaoandroid.kakao.list](../index.md) / [KListView](./index.md)

# KListView

`class KListView : `[`ScrollViewActions`](../-scroll-view-actions/index.md)`, `[`BaseAssertions`](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/index.md)`, `[`ListViewAdapterAssertions`](../-list-view-adapter-assertions/index.md)

View with ScrollViewActions and BaseAssertions. Gives access to it's children

**See Also**

[ScrollViewActions](../-scroll-view-actions/index.md)

[BaseAssertions](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/index.md)

[KAdapterItem](../-k-adapter-item/index.md)

[KAdapterItemTypeBuilder](../-k-adapter-item-type-builder/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `KListView(builder: `[`ViewBuilder`](../../io.github.kakaoandroid.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`, itemTypeBuilder: `[`KAdapterItemTypeBuilder`](../-k-adapter-item-type-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>Constructs view class with view interaction from given ViewBuilder`KListView(parent: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>, builder: `[`ViewBuilder`](../../io.github.kakaoandroid.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`, itemTypeBuilder: `[`KAdapterItemTypeBuilder`](../-k-adapter-item-type-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>`KListView(parent: DataInteraction, builder: `[`ViewBuilder`](../../io.github.kakaoandroid.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`, itemTypeBuilder: `[`KAdapterItemTypeBuilder`](../-k-adapter-item-type-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>Constructs view class with parent and view interaction from given ViewBuilder |

### Properties

| Name | Summary |
|---|---|
| [itemTypes](item-types.md) | `val itemTypes: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<out `[`KAdapterItem`](../-k-adapter-item/index.md)`<*>>, `[`KAdapterItemType`](../-k-adapter-item-type/index.md)`<`[`KAdapterItem`](../-k-adapter-item/index.md)`<*>>>` |
| [matcher](matcher.md) | `val matcher: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>` |
| [root](root.md) | `var root: Matcher<Root>` |
| [view](view.md) | `val view: ViewInteraction` |

### Functions

| Name | Summary |
|---|---|
| [childAt](child-at.md) | `fun <T : `[`KAdapterItem`](../-k-adapter-item/index.md)`<*>> childAt(position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, function: `[`T`](child-at.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs given actions/assertion on child at given position |
| [childWith](child-with.md) | `fun <T : `[`KAdapterItem`](../-k-adapter-item/index.md)`<*>> childWith(childMatcher: `[`DataBuilder`](../-data-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`T`](child-with.md#T)<br>Performs given actions/assertion on child that matches given matcher |
| [children](children.md) | `fun <T : `[`KAdapterItem`](../-k-adapter-item/index.md)`<*>> children(function: `[`T`](children.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs given actions/assertion on all children in adapter |
| [emptyChildAt](empty-child-at.md) | `fun emptyChildAt(position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, tail: `[`KEmptyAdapterItem`](../-k-empty-adapter-item/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Calls childAt() on your view with base child |
| [emptyChildWith](empty-child-with.md) | `fun emptyChildWith(builder: `[`DataBuilder`](../-data-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`KEmptyAdapterItem`](../-k-empty-adapter-item/index.md)<br>Calls childWith() on your view with base child |
| [emptyFirstChild](empty-first-child.md) | `fun emptyFirstChild(tail: `[`KEmptyAdapterItem`](../-k-empty-adapter-item/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Calls firstChild() on your view with base child |
| [emptyLastChild](empty-last-child.md) | `fun emptyLastChild(tail: `[`KEmptyAdapterItem`](../-k-empty-adapter-item/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Calls lastChild() on your view with base child |
| [firstChild](first-child.md) | `fun <T : `[`KAdapterItem`](../-k-adapter-item/index.md)`<*>> firstChild(function: `[`T`](first-child.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs given actions/assertion on first child in adapter |
| [invoke](invoke.md) | `operator fun invoke(function: `[`KListView`](./index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Operator that allows usage of DSL style |
| [lastChild](last-child.md) | `fun <T : `[`KAdapterItem`](../-k-adapter-item/index.md)`<*>> lastChild(function: `[`T`](last-child.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs given actions/assertion on last child in adapter |
| [perform](perform.md) | `infix fun perform(function: `[`KListView`](./index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`KListView`](./index.md)<br>Infix function for invoking lambda on your view |

### Inherited Functions

| Name | Summary |
|---|---|
| [assert](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/assert.md) | `open fun assert(function: () -> ViewAssertion): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check the view with the given custom assertion |
| [doesNotExist](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/does-not-exist.md) | `open fun doesNotExist(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the matched view does not exist |
| [getSize](../-scroll-view-actions/get-size.md) | `open fun getSize(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Returns the size of ScrollView |
| [hasAnyTag](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/has-any-tag.md) | `open fun hasAnyTag(vararg tags: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has at least one of the given tags |
| [hasBackgroundColor](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/has-background-color.md) | `open fun hasBackgroundColor(resId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`open fun hasBackgroundColor(colorCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given background color |
| [hasDescendant](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/has-descendant.md) | `open fun hasDescendant(function: `[`ViewBuilder`](../../io.github.kakaoandroid.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given descendant |
| [hasNotDescendant](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/has-not-descendant.md) | `open fun hasNotDescendant(function: `[`ViewBuilder`](../../io.github.kakaoandroid.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has not given descendant |
| [hasNotSibling](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/has-not-sibling.md) | `open fun hasNotSibling(function: `[`ViewBuilder`](../../io.github.kakaoandroid.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has not given sibling |
| [hasSibling](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/has-sibling.md) | `open fun hasSibling(function: `[`ViewBuilder`](../../io.github.kakaoandroid.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given sibling |
| [hasSize](../-list-view-adapter-assertions/has-size.md) | `open fun hasSize(size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check size of recycler view |
| [hasTag](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/has-tag.md) | `open fun hasTag(tag: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given tag |
| [inRoot](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/in-root.md) | `open fun inRoot(function: `[`RootBuilder`](../../io.github.kakaoandroid.kakao.common.builders/-root-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check if the view is in given root |
| [isClickable](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/is-clickable.md) | `open fun isClickable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is clickable |
| [isCompletelyDisplayed](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/is-completely-displayed.md) | `open fun isCompletelyDisplayed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is completely displayed |
| [isDisabled](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/is-disabled.md) | `open fun isDisabled(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is disabled |
| [isDisplayed](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/is-displayed.md) | `open fun isDisplayed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is displayed |
| [isEnabled](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/is-enabled.md) | `open fun isEnabled(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is enabled |
| [isFocusable](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/is-focusable.md) | `open fun isFocusable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is focusable |
| [isFocused](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/is-focused.md) | `open fun isFocused(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is focused |
| [isGone](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/is-gone.md) | `open fun isGone(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has GONE visibility |
| [isInvisible](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/is-invisible.md) | `open fun isInvisible(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has INVISIBLE visibility |
| [isNotClickable](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/is-not-clickable.md) | `open fun isNotClickable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not clickable |
| [isNotCompletelyDisplayed](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/is-not-completely-displayed.md) | `open fun isNotCompletelyDisplayed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not completely displayed |
| [isNotDisplayed](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/is-not-displayed.md) | `open fun isNotDisplayed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not displayed |
| [isNotFocusable](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/is-not-focusable.md) | `open fun isNotFocusable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not focusable |
| [isNotFocused](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/is-not-focused.md) | `open fun isNotFocused(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not focused |
| [isNotSelected](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/is-not-selected.md) | `open fun isNotSelected(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not selected |
| [isSelected](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/is-selected.md) | `open fun isSelected(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is selected |
| [isVisible](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/is-visible.md) | `open fun isVisible(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has VISIBLE visibility |
| [matches](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/matches.md) | `open fun matches(function: `[`ViewBuilder`](../../io.github.kakaoandroid.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check if the view matches given matcher |
| [notMatches](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/not-matches.md) | `open fun notMatches(function: `[`ViewBuilder`](../../io.github.kakaoandroid.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check if the view does not match given matcher |
| [scrollTo](../-scroll-view-actions/scroll-to.md) | `open fun scrollTo(position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the specific position of the view |
| [scrollToEnd](../-scroll-view-actions/scroll-to-end.md) | `open fun scrollToEnd(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the last position of the view |
| [scrollToStart](../-scroll-view-actions/scroll-to-start.md) | `open fun scrollToStart(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the starting position of the view |
