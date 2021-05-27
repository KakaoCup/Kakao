[kakao](../../index.md) / [io.github.kakaocup.kakao.delegate](../index.md) / [ViewInteractionDelegate](./index.md)

# ViewInteractionDelegate

`class ViewInteractionDelegate : `[`Delegate`](../-delegate/index.md)`<ViewInteraction, ViewAssertion, ViewAction>`

Delegation class for [ViewInteraction](#).
Wraps all available public calls and intercepts [check](check.md) and [perform](perform.md).

**See Also**

[Delegate](../-delegate/index.md)

[Interceptor](../../io.github.kakaocup.kakao.intercept/-interceptor/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ViewInteractionDelegate(interaction: ViewInteraction)`<br>Delegation class for [ViewInteraction](#). Wraps all available public calls and intercepts [check](check.md) and [perform](perform.md). |

### Properties

| Name | Summary |
|---|---|
| [interaction](interaction.md) | `var interaction: ViewInteraction` |
| [interceptor](interceptor.md) | `var interceptor: `[`Interceptor`](../../io.github.kakaocup.kakao.intercept/-interceptor/index.md)`<ViewInteraction, ViewAssertion, ViewAction>?` |

### Functions

| Name | Summary |
|---|---|
| [check](check.md) | `fun check(viewAssert: ViewAssertion): <ERROR CLASS>` |
| [inRoot](in-root.md) | `fun inRoot(rootMatcher: Matcher<Root>): <ERROR CLASS>` |
| [kakaoInterceptor](kakao-interceptor.md) | `fun kakaoInterceptor(): `[`Interceptor`](../../io.github.kakaocup.kakao.intercept/-interceptor/index.md)`<ViewInteraction, ViewAssertion, ViewAction>?` |
| [noActivity](no-activity.md) | `fun noActivity(): <ERROR CLASS>` |
| [perform](perform.md) | `fun perform(vararg viewActions: ViewAction): <ERROR CLASS>` |
| [screenInterceptors](screen-interceptors.md) | `fun screenInterceptors(): `[`Deque`](https://developer.android.com/reference/java/util/Deque.html)`<`[`Interceptor`](../../io.github.kakaocup.kakao.intercept/-interceptor/index.md)`<ViewInteraction, ViewAssertion, ViewAction>>` |
| [withFailureHandler](with-failure-handler.md) | `fun withFailureHandler(failureHandler: FailureHandler): <ERROR CLASS>` |

### Inherited Functions

| Name | Summary |
|---|---|
| [interceptCheck](../-delegate/intercept-check.md) | `open fun interceptCheck(assertion: `[`ASSERTION`](../-delegate/index.md#ASSERTION)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Runs the interceptors available for the given delegate during the `check` operation. |
| [interceptPerform](../-delegate/intercept-perform.md) | `open fun interceptPerform(action: `[`ACTION`](../-delegate/index.md#ACTION)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Runs the interceptors available for the given delegate during the `perform` operation. |
