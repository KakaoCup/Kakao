[kakao](../../index.md) / [io.github.kakaoandroid.kakao.list](../index.md) / [KAdapterItem](./index.md)

# KAdapterItem

`open class KAdapterItem<out T> : `[`BaseActions`](../../io.github.kakaoandroid.kakao.common.actions/-base-actions/index.md)`, `[`BaseAssertions`](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/index.md)`, `[`Interceptable`](../../io.github.kakaoandroid.kakao.intercept/-interceptable/index.md)`<ViewInteraction, ViewAssertion, ViewAction>`

Base class for KAbsListView adapter items

Please extend this class to provide custom recycler view item types

### Parameters

`T` - type of your item. Used to enable invoke() and perform() on descendants

`interaction` - Data interaction of item. Can be used as parent for all views inside item.

**See Also**

[KAdapterItemTypeBuilder](../-k-adapter-item-type-builder/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `KAdapterItem(interaction: DataInteraction)`<br>Base class for KAbsListView adapter items |

### Properties

| Name | Summary |
|---|---|
| [root](root.md) | `open var root: Matcher<Root!>!` |
| [view](view.md) | `open val view: `[`ViewInteractionDelegate`](../../io.github.kakaoandroid.kakao.delegate/-view-interaction-delegate/index.md) |

### Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | `operator fun invoke(function: `[`T`](index.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Operator that allows usage of DSL style |
| [perform](perform.md) | `infix fun perform(function: `[`T`](index.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`T`](index.md#T)<br>Infix function for invoking lambda on your view |

### Inherited Functions

| Name | Summary |
|---|---|
| [act](../../io.github.kakaoandroid.kakao.common.actions/-base-actions/act.md) | `open fun act(function: () -> ViewAction): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs custom action on a view |
| [assert](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/assert.md) | `open fun assert(function: () -> ViewAssertion): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check the view with the given custom assertion |
| [click](../../io.github.kakaoandroid.kakao.common.actions/-base-actions/click.md) | `open fun click(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs click on view |
| [doesNotExist](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/does-not-exist.md) | `open fun doesNotExist(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the matched view does not exist |
| [doubleClick](../../io.github.kakaoandroid.kakao.common.actions/-base-actions/double-click.md) | `open fun doubleClick(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs double click on view |
| [hasAnyTag](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/has-any-tag.md) | `open fun hasAnyTag(vararg tags: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has at least one of the given tags |
| [hasBackgroundColor](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/has-background-color.md) | `open fun hasBackgroundColor(resId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`open fun hasBackgroundColor(colorCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given background color |
| [hasDescendant](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/has-descendant.md) | `open fun hasDescendant(function: `[`ViewBuilder`](../../io.github.kakaoandroid.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given descendant |
| [hasNotDescendant](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/has-not-descendant.md) | `open fun hasNotDescendant(function: `[`ViewBuilder`](../../io.github.kakaoandroid.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has not given descendant |
| [hasNotSibling](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/has-not-sibling.md) | `open fun hasNotSibling(function: `[`ViewBuilder`](../../io.github.kakaoandroid.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has not given sibling |
| [hasSibling](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/has-sibling.md) | `open fun hasSibling(function: `[`ViewBuilder`](../../io.github.kakaoandroid.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given sibling |
| [hasTag](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/has-tag.md) | `open fun hasTag(tag: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given tag |
| [inRoot](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/in-root.md) | `open fun inRoot(function: `[`RootBuilder`](../../io.github.kakaoandroid.kakao.common.builders/-root-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check if the view is in given root |
| [intercept](../../io.github.kakaoandroid.kakao.intercept/-interceptable/intercept.md) | `open fun intercept(builder: `[`Interceptor.Builder`](../../io.github.kakaoandroid.kakao.intercept/-interceptor/-builder/index.md)`<`[`INTERACTION`](../../io.github.kakaoandroid.kakao.intercept/-interceptable/index.md#INTERACTION)`, `[`ASSERTION`](../../io.github.kakaoandroid.kakao.intercept/-interceptable/index.md#ASSERTION)`, `[`ACTION`](../../io.github.kakaoandroid.kakao.intercept/-interceptable/index.md#ACTION)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Sets the interceptors for the instance. Interceptors will be invoked on the interaction with the KView. |
| [isClickable](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/is-clickable.md) | `open fun isClickable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is clickable |
| [isCompletelyAbove](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/is-completely-above.md) | `open fun isCompletelyAbove(function: `[`ViewBuilder`](../../io.github.kakaoandroid.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view displayed is completely above of the view matching the given matcher. |
| [isCompletelyBelow](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/is-completely-below.md) | `open fun isCompletelyBelow(function: `[`ViewBuilder`](../../io.github.kakaoandroid.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view displayed is completely below of the view matching the given matcher. |
| [isCompletelyDisplayed](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/is-completely-displayed.md) | `open fun isCompletelyDisplayed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is completely displayed |
| [isCompletelyLeftOf](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/is-completely-left-of.md) | `open fun isCompletelyLeftOf(function: `[`ViewBuilder`](../../io.github.kakaoandroid.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view displayed is completely right of the view matching the given matcher. |
| [isCompletelyRightOf](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/is-completely-right-of.md) | `open fun isCompletelyRightOf(function: `[`ViewBuilder`](../../io.github.kakaoandroid.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view displayed is completely right of the view matching the given matcher. |
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
| [longClick](../../io.github.kakaoandroid.kakao.common.actions/-base-actions/long-click.md) | `open fun longClick(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs long click on view |
| [matches](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/matches.md) | `open fun matches(function: `[`ViewBuilder`](../../io.github.kakaoandroid.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check if the view matches given matcher |
| [notMatches](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/not-matches.md) | `open fun notMatches(function: `[`ViewBuilder`](../../io.github.kakaoandroid.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check if the view does not match given matcher |
| [onFailure](../../io.github.kakaoandroid.kakao.common.actions/-base-actions/on-failure.md) | `open fun onFailure(function: (error: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, matcher: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Adds failure handler to the view |
| [pressImeAction](../../io.github.kakaoandroid.kakao.common.actions/-base-actions/press-ime-action.md) | `open fun pressImeAction(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Presses IME action, if supported view is in focus |
| [repeatUntil](../../io.github.kakaoandroid.kakao.common.actions/-base-actions/repeat-until.md) | `open fun repeatUntil(maxAttempts: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 1, action: () -> ViewAction, matcher: `[`ViewBuilder`](../../io.github.kakaoandroid.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Repeats given action on the view until this view will match the given matcher |
| [reset](../../io.github.kakaoandroid.kakao.intercept/-interceptable/reset.md) | `open fun reset(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Removes the interceptors from the instance. |
| [scrollTo](../../io.github.kakaoandroid.kakao.common.actions/-base-actions/scroll-to.md) | `open fun scrollTo(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the view, if possible |

### Inheritors

| Name | Summary |
|---|---|
| [KEmptyAdapterItem](../-k-empty-adapter-item/index.md) | `class KEmptyAdapterItem : `[`KAdapterItem`](./index.md)`<`[`KEmptyAdapterItem`](../-k-empty-adapter-item/index.md)`>`<br>Empty implementation of KAdapterItem |
| [KSpinnerItem](../../io.github.kakaoandroid.kakao.spinner/-k-spinner-item/index.md) | `class KSpinnerItem : `[`KAdapterItem`](./index.md)`<`[`KTextView`](../../io.github.kakaoandroid.kakao.text/-k-text-view/index.md)`>, `[`TextViewAssertions`](../../io.github.kakaoandroid.kakao.text/-text-view-assertions/index.md)<br>KTextView implementation of KAdapterItem |
