[kakao](../../index.md) / [io.github.kakaoandroid.kakao.intercept](../index.md) / [Interceptor](./index.md)

# Interceptor

`class Interceptor<INTERACTION, ASSERTION, ACTION>`

Base class for intercepting the call chain from Kakao to Espresso.

Interceptors can be provided through [Kakao](../../io.github.kakaoandroid.kakao/-kakao/index.md) runtime,
different [Screens](../../io.github.kakaoandroid.kakao.screen/-screen/index.md) as well as [KViews](../../io.github.kakaoandroid.kakao.common.views/-k-base-view/index.md).

Interceptors are stacked during the runtime for any Kakao-Espresso `check` and `perform` operations.
The stack ordering is following: KView interceptor -&gt; Screen interceptors -&gt; Kakao interceptor.

Any of the interceptors in the chain can break the chain call by setting `isOverride` to true
in [onCheck](-builder/on-check.md), [onPerform](-builder/on-perform.md) or [onAll](-builder/on-all.md) interception
functions during the configuration. Doing this will not only prevent underlying
interceptors from being invoked, but prevents Kakao from executing the operation. In that case,
responsibility for actually making Espresso call lies on developer.

For each operation the interceptor invocation cycle will be as follows:

```
// For check operation
onAll?.invoke()
onCheck?.invoke()

// For perform operation
onAll?.invoke()
onPerform?.invoke()
```

**See Also**

[io.github.kakaoandroid.kakao.Kakao](../../io.github.kakaoandroid.kakao/-kakao/index.md)

[io.github.kakaoandroid.kakao.screen.Screen](../../io.github.kakaoandroid.kakao.screen/-screen/index.md)

[io.github.kakaoandroid.kakao.common.views.KBaseView](../../io.github.kakaoandroid.kakao.common.views/-k-base-view/index.md)

### Types

| Name | Summary |
|---|---|
| [Builder](-builder/index.md) | `class Builder<INTERACTION, ASSERTION, ACTION>`<br>Builder class that is used to build a single instance of [Interceptor](./index.md). |
| [Configuration](-configuration/index.md) | `data class Configuration` |
| [Configurator](-configurator/index.md) | `class Configurator`<br>Configuration class that is used for building interceptors on the [Kakao](../../io.github.kakaoandroid.kakao/-kakao/index.md) runtime and [Screen](../../io.github.kakaoandroid.kakao.screen/-screen/index.md) levels. |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Interceptor(onCheck: `[`Interception`](../-interception/index.md)`<(`[`INTERACTION`](index.md#INTERACTION)`, `[`ASSERTION`](index.md#ASSERTION)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>?, onPerform: `[`Interception`](../-interception/index.md)`<(`[`INTERACTION`](index.md#INTERACTION)`, `[`ACTION`](index.md#ACTION)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>?, onAll: `[`Interception`](../-interception/index.md)`<(`[`INTERACTION`](index.md#INTERACTION)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>?)`<br>Base class for intercepting the call chain from Kakao to Espresso. |

### Properties

| Name | Summary |
|---|---|
| [onAll](on-all.md) | `val onAll: `[`Interception`](../-interception/index.md)`<(`[`INTERACTION`](index.md#INTERACTION)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>?` |
| [onCheck](on-check.md) | `val onCheck: `[`Interception`](../-interception/index.md)`<(`[`INTERACTION`](index.md#INTERACTION)`, `[`ASSERTION`](index.md#ASSERTION)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>?` |
| [onPerform](on-perform.md) | `val onPerform: `[`Interception`](../-interception/index.md)`<(`[`INTERACTION`](index.md#INTERACTION)`, `[`ACTION`](index.md#ACTION)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>?` |
