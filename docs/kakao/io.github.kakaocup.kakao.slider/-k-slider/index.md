[kakao](../../index.md) / [io.github.kakaocup.kakao.slider](../index.md) / [KSlider](./index.md)

# KSlider

`class KSlider : `[`KBaseView`](../../io.github.kakaocup.kakao.common.views/-k-base-view/index.md)`<`[`KSlider`](./index.md)`>, `[`SliderActions`](../-slider-actions/index.md)`, `[`SliderAssertions`](../-slider-assertions/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `KSlider(function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>`KSlider(parent: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>, function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>`KSlider(parent: DataInteraction, function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)` |

### Inherited Properties

| Name | Summary |
|---|---|
| [root](../../io.github.kakaocup.kakao.common.views/-k-base-view/root.md) | `open var root: Matcher<Root>` |
| [view](../../io.github.kakaocup.kakao.common.views/-k-base-view/view.md) | `open val view: `[`ViewInteractionDelegate`](../../io.github.kakaocup.kakao.delegate/-view-interaction-delegate/index.md) |

### Inherited Functions

| Name | Summary |
|---|---|
| [dragValueTo](../-slider-actions/drag-value-to.md) | `open fun dragValueTo(value: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Drags slider to defined position. Please note that this dragging is emulated via Espresso's swipe action and might not be accurate, if progress max value is too high or device's density is too low. |
| [hasValue](../-slider-assertions/has-value.md) | `open fun hasValue(value: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [invoke](../../io.github.kakaocup.kakao.common.views/-k-base-view/invoke.md) | `operator fun invoke(function: `[`T`](../../io.github.kakaocup.kakao.common.views/-k-base-view/index.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Operator that allows usage of DSL style |
| [perform](../../io.github.kakaocup.kakao.common.views/-k-base-view/perform.md) | `infix fun perform(function: `[`T`](../../io.github.kakaocup.kakao.common.views/-k-base-view/index.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`T`](../../io.github.kakaocup.kakao.common.views/-k-base-view/index.md#T)<br>Infix function for invoking lambda on your view |
| [setValue](../-slider-actions/set-value.md) | `open fun setValue(value: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Set value for Slider |
