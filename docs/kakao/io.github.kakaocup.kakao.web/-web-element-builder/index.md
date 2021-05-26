[kakao](../../index.md) / [io.github.kakaocup.kakao.web](../index.md) / [WebElementBuilder](./index.md)

# WebElementBuilder

`class WebElementBuilder : `[`Interceptable`](../../io.github.kakaocup.kakao.intercept/-interceptable/index.md)`<WebInteraction<*>, WebAssertion<*>, Atom<*>>`

Class for building WebView element matchers

### Parameters

`web` - WebInteraction where elements should be matched

### Types

| Name | Summary |
|---|---|
| [KWebInteraction](-k-web-interaction/index.md) | `inner class KWebInteraction : `[`WebActions`](../-web-actions/index.md)`, `[`WebAssertions`](../-web-assertions/index.md) |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `WebElementBuilder(view: `[`WebInteractionDelegate`](../../io.github.kakaocup.kakao.delegate/-web-interaction-delegate/index.md)`)`<br>Class for building WebView element matchers |

### Properties

| Name | Summary |
|---|---|
| [view](view.md) | `val view: `[`WebInteractionDelegate`](../../io.github.kakaocup.kakao.delegate/-web-interaction-delegate/index.md) |

### Functions

| Name | Summary |
|---|---|
| [withElement](with-element.md) | `fun withElement(locator: Locator, value: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, interaction: `[`WebElementBuilder.KWebInteraction`](-k-web-interaction/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Looks up web view element and performs actions/assertions on it |

### Inherited Functions

| Name | Summary |
|---|---|
| [intercept](../../io.github.kakaocup.kakao.intercept/-interceptable/intercept.md) | `open fun intercept(builder: `[`Interceptor.Builder`](../../io.github.kakaocup.kakao.intercept/-interceptor/-builder/index.md)`<`[`INTERACTION`](../../io.github.kakaocup.kakao.intercept/-interceptable/index.md#INTERACTION)`, `[`ASSERTION`](../../io.github.kakaocup.kakao.intercept/-interceptable/index.md#ASSERTION)`, `[`ACTION`](../../io.github.kakaocup.kakao.intercept/-interceptable/index.md#ACTION)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Sets the interceptors for the instance. Interceptors will be invoked on the interaction with the KView. |
| [reset](../../io.github.kakaocup.kakao.intercept/-interceptable/reset.md) | `open fun reset(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Removes the interceptors from the instance. |
