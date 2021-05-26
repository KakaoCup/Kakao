[kakao](../../index.md) / [io.github.kakaoandroid.kakao.list](../index.md) / [AbsListViewAdapterAssertions](./index.md)

# AbsListViewAdapterAssertions

`interface AbsListViewAdapterAssertions : `[`AdapterAssertions`](../../io.github.kakaoandroid.kakao.common.assertions/-adapter-assertions/index.md)

Provides assertions for AbsListView adapter

### Inherited Properties

| Name | Summary |
|---|---|
| [view](../../io.github.kakaoandroid.kakao.common.assertions/-adapter-assertions/view.md) | `abstract val view: `[`ViewInteractionDelegate`](../../io.github.kakaoandroid.kakao.delegate/-view-interaction-delegate/index.md) |

### Functions

| Name | Summary |
|---|---|
| [hasSize](has-size.md) | `open fun hasSize(size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check size of AbsListView |

### Inheritors

| Name | Summary |
|---|---|
| [KAbsListView](../-k-abs-list-view/index.md) | `class KAbsListView : `[`ScrollViewActions`](../../io.github.kakaoandroid.kakao.scroll/-scroll-view-actions/index.md)`, `[`AbsListViewAdapterActions`](../-abs-list-view-adapter-actions/index.md)`, `[`BaseAssertions`](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/index.md)`, `[`AbsListViewAdapterAssertions`](./index.md)<br>View with ScrollViewActions and BaseAssertions. Gives access to it's children |
