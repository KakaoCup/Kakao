[kakao](../../index.md) / [io.github.kakaocup.kakao.searchview](../index.md) / [KSearchView](./index.md)

# KSearchView

`class KSearchView : `[`KBaseView`](../../io.github.kakaocup.kakao.common.views/-k-base-view/index.md)`<`[`KSearchView`](./index.md)`>, `[`SearchViewActions`](../-search-view-actions/index.md)`, `[`SearchViewAssertions`](../-search-view-assertions/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `KSearchView(function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>`KSearchView(parent: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>, function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>`KSearchView(parent: DataInteraction, function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)` |

### Inherited Properties

| Name | Summary |
|---|---|
| [root](../../io.github.kakaocup.kakao.common.views/-k-base-view/root.md) | `open var root: Matcher<Root>` |
| [view](../../io.github.kakaocup.kakao.common.views/-k-base-view/view.md) | `open val view: `[`ViewInteractionDelegate`](../../io.github.kakaocup.kakao.delegate/-view-interaction-delegate/index.md) |

### Inherited Functions

| Name | Summary |
|---|---|
| [appendQuery](../-search-view-actions/append-query.md) | `open fun appendQuery(query: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [hasHint](../-search-view-assertions/has-hint.md) | `open fun hasHint(hint: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>`<br>`open fun hasHint(queryHintId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>` |
| [hasQuery](../-search-view-assertions/has-query.md) | `open fun hasQuery(query: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>` |
| [invoke](../../io.github.kakaocup.kakao.common.views/-k-base-view/invoke.md) | `operator fun invoke(function: `[`T`](../../io.github.kakaocup.kakao.common.views/-k-base-view/index.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Operator that allows usage of DSL style |
| [perform](../../io.github.kakaocup.kakao.common.views/-k-base-view/perform.md) | `infix fun perform(function: `[`T`](../../io.github.kakaocup.kakao.common.views/-k-base-view/index.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`T`](../../io.github.kakaocup.kakao.common.views/-k-base-view/index.md#T)<br>Infix function for invoking lambda on your view |
| [typeQuery](../-search-view-actions/type-query.md) | `open fun typeQuery(query: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
