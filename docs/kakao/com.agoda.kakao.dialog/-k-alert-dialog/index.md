[kakao](../../index.md) / [io.github.kakaoandroid.kakao.dialog](../index.md) / [KAlertDialog](./index.md)

# KAlertDialog

`class KAlertDialog : `[`KBaseView`](../../io.github.kakaoandroid.kakao.common.views/-k-base-view/index.md)`<`[`KAlertDialog`](./index.md)`>`

View for interact with default alert dialog

**See Also**

[AlertDialog](https://developer.android.com/reference/android/app/AlertDialog.html)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `KAlertDialog()`<br>View for interact with default alert dialog |

### Properties

| Name | Summary |
|---|---|
| [icon](icon.md) | `val icon: `[`KImageView`](../../io.github.kakaoandroid.kakao.image/-k-image-view/index.md) |
| [message](message.md) | `val message: `[`KTextView`](../../io.github.kakaoandroid.kakao.text/-k-text-view/index.md) |
| [negativeButton](negative-button.md) | `val negativeButton: `[`KButton`](../../io.github.kakaoandroid.kakao.text/-k-button/index.md) |
| [neutralButton](neutral-button.md) | `val neutralButton: `[`KButton`](../../io.github.kakaoandroid.kakao.text/-k-button/index.md) |
| [positiveButton](positive-button.md) | `val positiveButton: `[`KButton`](../../io.github.kakaoandroid.kakao.text/-k-button/index.md) |
| [title](title.md) | `val title: `[`KTextView`](../../io.github.kakaoandroid.kakao.text/-k-text-view/index.md) |

### Inherited Properties

| Name | Summary |
|---|---|
| [root](../../io.github.kakaoandroid.kakao.common.views/-k-base-view/root.md) | `open var root: Matcher<Root>` |
| [view](../../io.github.kakaoandroid.kakao.common.views/-k-base-view/view.md) | `open val view: `[`ViewInteractionDelegate`](../../io.github.kakaoandroid.kakao.delegate/-view-interaction-delegate/index.md) |

### Inherited Functions

| Name | Summary |
|---|---|
| [invoke](../../io.github.kakaoandroid.kakao.common.views/-k-base-view/invoke.md) | `operator fun invoke(function: `[`T`](../../io.github.kakaoandroid.kakao.common.views/-k-base-view/index.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Operator that allows usage of DSL style |
| [perform](../../io.github.kakaoandroid.kakao.common.views/-k-base-view/perform.md) | `infix fun perform(function: `[`T`](../../io.github.kakaoandroid.kakao.common.views/-k-base-view/index.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`T`](../../io.github.kakaoandroid.kakao.common.views/-k-base-view/index.md#T)<br>Infix function for invoking lambda on your view |
