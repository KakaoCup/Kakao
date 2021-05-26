[kakao](../../index.md) / [io.github.kakaoandroid.kakao.switch](../index.md) / [SwitchableActions](./index.md)

# SwitchableActions

`interface SwitchableActions : `[`BaseActions`](../../io.github.kakaoandroid.kakao.common.actions/-base-actions/index.md)

Provides action for actions on Switch

### Types

| Name | Summary |
|---|---|
| [Direction](-direction/index.md) | `enum class Direction` |

### Inherited Properties

| Name | Summary |
|---|---|
| [view](../../io.github.kakaoandroid.kakao.common.actions/-base-actions/view.md) | `abstract val view: `[`ViewInteractionDelegate`](../../io.github.kakaoandroid.kakao.delegate/-view-interaction-delegate/index.md) |

### Functions

| Name | Summary |
|---|---|
| [swipeSwitchThumb](swipe-switch-thumb.md) | `open fun swipeSwitchThumb(direction: `[`SwitchableActions.Direction`](-direction/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Moves the thumb of the switch to the right |

### Inherited Functions

| Name | Summary |
|---|---|
| [act](../../io.github.kakaoandroid.kakao.common.actions/-base-actions/act.md) | `open fun act(function: () -> ViewAction): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs custom action on a view |
| [click](../../io.github.kakaoandroid.kakao.common.actions/-base-actions/click.md) | `open fun click(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs click on view |
| [doubleClick](../../io.github.kakaoandroid.kakao.common.actions/-base-actions/double-click.md) | `open fun doubleClick(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs double click on view |
| [longClick](../../io.github.kakaoandroid.kakao.common.actions/-base-actions/long-click.md) | `open fun longClick(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs long click on view |
| [onFailure](../../io.github.kakaoandroid.kakao.common.actions/-base-actions/on-failure.md) | `open fun onFailure(function: (error: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, matcher: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Adds failure handler to the view |
| [pressImeAction](../../io.github.kakaoandroid.kakao.common.actions/-base-actions/press-ime-action.md) | `open fun pressImeAction(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Presses IME action, if supported view is in focus |
| [repeatUntil](../../io.github.kakaoandroid.kakao.common.actions/-base-actions/repeat-until.md) | `open fun repeatUntil(maxAttempts: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 1, action: () -> ViewAction, matcher: `[`ViewBuilder`](../../io.github.kakaoandroid.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Repeats given action on the view until this view will match the given matcher |
| [scrollTo](../../io.github.kakaoandroid.kakao.common.actions/-base-actions/scroll-to.md) | `open fun scrollTo(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the view, if possible |

### Inheritors

| Name | Summary |
|---|---|
| [KSwitch](../-k-switch/index.md) | `class KSwitch : `[`KBaseView`](../../io.github.kakaoandroid.kakao.common.views/-k-base-view/index.md)`<`[`KSwitch`](../-k-switch/index.md)`>, `[`SwitchableActions`](./index.md)`, `[`TextViewAssertions`](../../io.github.kakaoandroid.kakao.text/-text-view-assertions/index.md)`, `[`CheckableAssertions`](../../io.github.kakaoandroid.kakao.check/-checkable-assertions/index.md)<br>View with SwitchableActions, CheckableAssertions and TextViewAssertions |
