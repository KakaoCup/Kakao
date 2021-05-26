[kakao](../../index.md) / [io.github.kakaocup.kakao.progress](../index.md) / [KSeekBar](./index.md)

# KSeekBar

`class KSeekBar : `[`KBaseView`](../../io.github.kakaocup.kakao.common.views/-k-base-view/index.md)`<`[`KSeekBar`](./index.md)`>, `[`SeekBarActions`](../-seek-bar-actions/index.md)`, `[`ProgressBarAssertions`](../-progress-bar-assertions/index.md)

View with SeekBarActions and ProgressBarAssertions

**See Also**

[SeekBarActions](../-seek-bar-actions/index.md)

[ProgressBarAssertions](../-progress-bar-assertions/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `KSeekBar(function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>`KSeekBar(parent: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>, function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>`KSeekBar(parent: DataInteraction, function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)` |

### Inherited Properties

| Name | Summary |
|---|---|
| [root](../../io.github.kakaocup.kakao.common.views/-k-base-view/root.md) | `open var root: Matcher<Root>` |
| [view](../../io.github.kakaocup.kakao.common.views/-k-base-view/view.md) | `open val view: `[`ViewInteractionDelegate`](../../io.github.kakaocup.kakao.delegate/-view-interaction-delegate/index.md) |

### Inherited Functions

| Name | Summary |
|---|---|
| [dragProgressTo](../-seek-bar-actions/drag-progress-to.md) | `open fun dragProgressTo(number: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Drags progress to defined position. Please note that this dragging is emulated via Espresso's swipe action and might not be accurate, if progress max value is too high or device's density is too low. |
| [hasProgress](../-progress-bar-assertions/has-progress.md) | `open fun hasProgress(number: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if view has number of progress as expected |
| [invoke](../../io.github.kakaocup.kakao.common.views/-k-base-view/invoke.md) | `operator fun invoke(function: `[`T`](../../io.github.kakaocup.kakao.common.views/-k-base-view/index.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Operator that allows usage of DSL style |
| [perform](../../io.github.kakaocup.kakao.common.views/-k-base-view/perform.md) | `infix fun perform(function: `[`T`](../../io.github.kakaocup.kakao.common.views/-k-base-view/index.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`T`](../../io.github.kakaocup.kakao.common.views/-k-base-view/index.md#T)<br>Infix function for invoking lambda on your view |
