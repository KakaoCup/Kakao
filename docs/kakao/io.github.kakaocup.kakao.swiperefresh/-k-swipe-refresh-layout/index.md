[kakao](../../index.md) / [io.github.kakaocup.kakao.swiperefresh](../index.md) / [KSwipeRefreshLayout](./index.md)

# KSwipeRefreshLayout

`class KSwipeRefreshLayout : `[`KBaseView`](../../io.github.kakaocup.kakao.common.views/-k-base-view/index.md)`<`[`KSwipeRefreshLayout`](./index.md)`>, `[`SwipeRefreshLayoutActions`](../-swipe-refresh-layout-actions/index.md)`, `[`SwipeRefreshLayoutAssertions`](../-swipe-refresh-layout-assertions/index.md)

View with SwipeRefreshLayoutActions and SwipeRefreshLayoutAssertions

**See Also**

[SwipeRefreshLayoutActions](../-swipe-refresh-layout-actions/index.md)

[SwipeRefreshLayoutAssertions](../-swipe-refresh-layout-assertions/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `KSwipeRefreshLayout(function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>`KSwipeRefreshLayout(parent: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>, function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>`KSwipeRefreshLayout(parent: DataInteraction, function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)` |

### Inherited Properties

| Name | Summary |
|---|---|
| [root](../../io.github.kakaocup.kakao.common.views/-k-base-view/root.md) | `open var root: Matcher<Root>` |
| [view](../../io.github.kakaocup.kakao.common.views/-k-base-view/view.md) | `open val view: `[`ViewInteractionDelegate`](../../io.github.kakaocup.kakao.delegate/-view-interaction-delegate/index.md) |

### Inherited Functions

| Name | Summary |
|---|---|
| [invoke](../../io.github.kakaocup.kakao.common.views/-k-base-view/invoke.md) | `operator fun invoke(function: `[`T`](../../io.github.kakaocup.kakao.common.views/-k-base-view/index.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Operator that allows usage of DSL style |
| [isNotRefreshing](../-swipe-refresh-layout-assertions/is-not-refreshing.md) | `open fun isNotRefreshing(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the SwipeRefreshLayout is not refreshing |
| [isRefreshing](../-swipe-refresh-layout-assertions/is-refreshing.md) | `open fun isRefreshing(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the SwipeRefreshLayout is refreshing |
| [perform](../../io.github.kakaocup.kakao.common.views/-k-base-view/perform.md) | `infix fun perform(function: `[`T`](../../io.github.kakaocup.kakao.common.views/-k-base-view/index.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`T`](../../io.github.kakaocup.kakao.common.views/-k-base-view/index.md#T)<br>Infix function for invoking lambda on your view |
| [setRefreshing](../-swipe-refresh-layout-actions/set-refreshing.md) | `open fun setRefreshing(refreshing: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Sets the refreshing state of SwipeRefreshLayout |
