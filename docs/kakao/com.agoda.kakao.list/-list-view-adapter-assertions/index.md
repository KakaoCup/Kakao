[kakao](../../index.md) / [io.github.kakaoandroid.kakao.list](../index.md) / [ListViewAdapterAssertions](./index.md)

# ListViewAdapterAssertions

`interface ListViewAdapterAssertions : `[`AdapterAssertions`](../../io.github.kakaoandroid.kakao.common.assertions/-adapter-assertions/index.md)

Provides assertions for listView adapter

### Inherited Properties

| Name | Summary |
|---|---|
| [view](../../io.github.kakaoandroid.kakao.common.assertions/-adapter-assertions/view.md) | `abstract val view: ViewInteraction` |

### Functions

| Name | Summary |
|---|---|
| [hasSize](has-size.md) | `open fun hasSize(size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check size of recycler view |

### Inheritors

| Name | Summary |
|---|---|
| [KListView](../-k-list-view/index.md) | `class KListView : `[`ScrollViewActions`](../-scroll-view-actions/index.md)`, `[`BaseAssertions`](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/index.md)`, `[`ListViewAdapterAssertions`](./index.md)<br>View with ScrollViewActions and BaseAssertions. Gives access to it's children |
