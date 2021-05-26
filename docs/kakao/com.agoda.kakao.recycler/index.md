[kakao](../index.md) / [io.github.kakaoandroid.kakao.recycler](./index.md)

## Package io.github.kakaoandroid.kakao.recycler

### Types

| Name | Summary |
|---|---|
| [KEmptyRecyclerItem](-k-empty-recycler-item/index.md) | `class KEmptyRecyclerItem : `[`KRecyclerItem`](-k-recycler-item/index.md)`<`[`KEmptyRecyclerItem`](-k-empty-recycler-item/index.md)`>`<br>Empty implementation of KRecyclerItem |
| [KRecyclerItem](-k-recycler-item/index.md) | `open class KRecyclerItem<out T> : `[`BaseActions`](../io.github.kakaoandroid.kakao.common.actions/-base-actions/index.md)`, `[`BaseAssertions`](../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/index.md)`, `[`Interceptable`](../io.github.kakaoandroid.kakao.intercept/-interceptable/index.md)`<ViewInteraction, ViewAssertion, ViewAction>`<br>Base class for KRecyclerView adapter items |
| [KRecyclerItemType](-k-recycler-item-type/index.md) | `class KRecyclerItemType<out T : `[`KRecyclerItem`](-k-recycler-item/index.md)`<*>>`<br>For internal use. Don't use manually. |
| [KRecyclerItemTypeBuilder](-k-recycler-item-type-builder/index.md) | `class KRecyclerItemTypeBuilder`<br>Class that maps types to providing functions |
| [KRecyclerView](-k-recycler-view/index.md) | `class KRecyclerView : `[`RecyclerActions`](-recycler-actions/index.md)`, `[`BaseAssertions`](../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/index.md)`, `[`RecyclerAdapterAssertions`](-recycler-adapter-assertions/index.md)<br>View with RecyclerActions, BaseAssertions and RecyclerAdapterAssertions. Gives access to it's children |
| [RecyclerActions](-recycler-actions/index.md) | `interface RecyclerActions : `[`ScrollableActions`](../io.github.kakaoandroid.kakao.common.actions/-scrollable-actions/index.md)`, `[`SwipeableActions`](../io.github.kakaoandroid.kakao.common.actions/-swipeable-actions/index.md)<br>Provides ScrollableActions implementation for RecyclerView |
| [RecyclerAdapterAssertions](-recycler-adapter-assertions/index.md) | `interface RecyclerAdapterAssertions : `[`AdapterAssertions`](../io.github.kakaoandroid.kakao.common.assertions/-adapter-assertions/index.md)<br>Provides assertions for recyclerView adapter |
