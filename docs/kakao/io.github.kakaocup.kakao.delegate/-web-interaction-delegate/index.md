[kakao](../../index.md) / [io.github.kakaocup.kakao.delegate](../index.md) / [WebInteractionDelegate](./index.md)

# WebInteractionDelegate

`class WebInteractionDelegate : `[`Delegate`](../-delegate/index.md)`<WebInteraction<*>, WebAssertion<*>, Atom<*>>`

Delegation class for [Web.WebInteraction](#).
Wraps all available public calls and intercepts [check](check.md) and [perform](perform.md).

**See Also**

[Delegate](../-delegate/index.md)

[Interceptor](../../io.github.kakaocup.kakao.intercept/-interceptor/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `WebInteractionDelegate(interaction: WebInteraction<*>)`<br>Delegation class for [Web.WebInteraction](#). Wraps all available public calls and intercepts [check](check.md) and [perform](perform.md). |

### Properties

| Name | Summary |
|---|---|
| [interaction](interaction.md) | `var interaction: WebInteraction<*>` |
| [interceptor](interceptor.md) | `var interceptor: `[`Interceptor`](../../io.github.kakaocup.kakao.intercept/-interceptor/index.md)`<WebInteraction<*>, WebAssertion<*>, Atom<*>>?` |

### Functions

| Name | Summary |
|---|---|
| [check](check.md) | `fun check(assertion: WebAssertion<*>): <ERROR CLASS>` |
| [forceJavascriptEnabled](force-javascript-enabled.md) | `fun forceJavascriptEnabled(): <ERROR CLASS>` |
| [get](get.md) | `fun get(): `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html) |
| [inWindow](in-window.md) | `fun inWindow(window: WindowReference): <ERROR CLASS>`<br>`fun inWindow(windowPicker: Atom<WindowReference>): <ERROR CLASS>` |
| [kakaoInterceptor](kakao-interceptor.md) | `fun kakaoInterceptor(): `[`Interceptor`](../../io.github.kakaocup.kakao.intercept/-interceptor/index.md)`<WebInteraction<*>, WebAssertion<*>, Atom<*>>?` |
| [perform](perform.md) | `fun perform(atom: Atom<*>): <ERROR CLASS>` |
| [reset](reset.md) | `fun reset(): <ERROR CLASS>` |
| [screenInterceptors](screen-interceptors.md) | `fun screenInterceptors(): `[`Deque`](https://developer.android.com/reference/java/util/Deque.html)`<`[`Interceptor`](../../io.github.kakaocup.kakao.intercept/-interceptor/index.md)`<WebInteraction<*>, WebAssertion<*>, Atom<*>>>` |
| [withContextualElement](with-contextual-element.md) | `fun withContextualElement(elementPicker: Atom<ElementReference>): <ERROR CLASS>` |
| [withElement](with-element.md) | `fun withElement(element: ElementReference): <ERROR CLASS>`<br>`fun withElement(elementPicker: Atom<ElementReference>): <ERROR CLASS>` |
| [withNoTimeout](with-no-timeout.md) | `fun withNoTimeout(): <ERROR CLASS>` |
| [withTimeout](with-timeout.md) | `fun withTimeout(amount: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, unit: `[`TimeUnit`](https://developer.android.com/reference/java/util/concurrent/TimeUnit.html)`): <ERROR CLASS>` |

### Inherited Functions

| Name | Summary |
|---|---|
| [interceptCheck](../-delegate/intercept-check.md) | `open fun interceptCheck(assertion: `[`ASSERTION`](../-delegate/index.md#ASSERTION)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Runs the interceptors available for the given delegate during the `check` operation. |
| [interceptPerform](../-delegate/intercept-perform.md) | `open fun interceptPerform(action: `[`ACTION`](../-delegate/index.md#ACTION)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Runs the interceptors available for the given delegate during the `perform` operation. |
