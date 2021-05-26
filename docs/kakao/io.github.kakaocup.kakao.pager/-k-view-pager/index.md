[kakao](../../index.md) / [io.github.kakaocup.kakao.pager](../index.md) / [KViewPager](./index.md)

# KViewPager

`class KViewPager : `[`KBaseView`](../../io.github.kakaocup.kakao.common.views/-k-base-view/index.md)`<`[`KViewPager`](./index.md)`>, `[`SwipeableActions`](../../io.github.kakaocup.kakao.common.actions/-swipeable-actions/index.md)`, `[`ViewPagerAssertions`](../-view-pager-assertions/index.md)

View with SwipeableActions and ViewPagerAssertions

**See Also**

[SwipeableActions](../../io.github.kakaocup.kakao.common.actions/-swipeable-actions/index.md)

[ViewPagerAssertions](../-view-pager-assertions/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `KViewPager(function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>`KViewPager(parent: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>, function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>`KViewPager(parent: DataInteraction, function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)` |

### Inherited Properties

| Name | Summary |
|---|---|
| [root](../../io.github.kakaocup.kakao.common.views/-k-base-view/root.md) | `open var root: Matcher<Root>` |
| [view](../../io.github.kakaocup.kakao.common.views/-k-base-view/view.md) | `open val view: `[`ViewInteractionDelegate`](../../io.github.kakaocup.kakao.delegate/-view-interaction-delegate/index.md) |

### Inherited Functions

| Name | Summary |
|---|---|
| [invoke](../../io.github.kakaocup.kakao.common.views/-k-base-view/invoke.md) | `operator fun invoke(function: `[`T`](../../io.github.kakaocup.kakao.common.views/-k-base-view/index.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Operator that allows usage of DSL style |
| [isAtPage](../-view-pager-assertions/is-at-page.md) | `open fun isAtPage(index: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is currently at given page |
| [perform](../../io.github.kakaocup.kakao.common.views/-k-base-view/perform.md) | `infix fun perform(function: `[`T`](../../io.github.kakaocup.kakao.common.views/-k-base-view/index.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`T`](../../io.github.kakaocup.kakao.common.views/-k-base-view/index.md#T)<br>Infix function for invoking lambda on your view |
| [swipeDown](../../io.github.kakaocup.kakao.common.actions/-swipeable-actions/swipe-down.md) | `open fun swipeDown(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Swipes down on the view |
| [swipeLeft](../../io.github.kakaocup.kakao.common.actions/-swipeable-actions/swipe-left.md) | `open fun swipeLeft(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Swipes left on the view |
| [swipeRight](../../io.github.kakaocup.kakao.common.actions/-swipeable-actions/swipe-right.md) | `open fun swipeRight(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Swipes right on the view |
| [swipeUp](../../io.github.kakaocup.kakao.common.actions/-swipeable-actions/swipe-up.md) | `open fun swipeUp(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Swipes up on the view |
