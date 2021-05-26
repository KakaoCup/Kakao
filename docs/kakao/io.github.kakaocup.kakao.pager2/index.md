[kakao](../index.md) / [io.github.kakaocup.kakao.pager2](./index.md)

## Package io.github.kakaocup.kakao.pager2

### Types

| Name | Summary |
|---|---|
| [KEmptyViewPagerItem](-k-empty-view-pager-item/index.md) | `class KEmptyViewPagerItem : `[`KViewPagerItem`](-k-view-pager-item/index.md)`<`[`KEmptyViewPagerItem`](-k-empty-view-pager-item/index.md)`>`<br>Empty implementation of KViewPagerItem |
| [KViewPager2](-k-view-pager2/index.md) | `class KViewPager2 : `[`ViewPager2Actions`](-view-pager2-actions/index.md)`, `[`ViewPager2AdapterAssertions`](-view-pager2-adapter-assertions/index.md)`, `[`SwipeableActions`](../io.github.kakaocup.kakao.common.actions/-swipeable-actions/index.md)`, `[`BaseAssertions`](../io.github.kakaocup.kakao.common.assertions/-base-assertions/index.md)<br>View with SwipeableActions and ViewPager2Assertions |
| [KViewPagerItem](-k-view-pager-item/index.md) | `open class KViewPagerItem<out T> : `[`BaseActions`](../io.github.kakaocup.kakao.common.actions/-base-actions/index.md)`, `[`BaseAssertions`](../io.github.kakaocup.kakao.common.assertions/-base-assertions/index.md)`, `[`Interceptable`](../io.github.kakaocup.kakao.intercept/-interceptable/index.md)`<ViewInteraction, ViewAssertion, ViewAction>`<br>Base class for KViewPager2 adapter items |
| [KViewPagerItemType](-k-view-pager-item-type/index.md) | `class KViewPagerItemType<out T : `[`KViewPagerItem`](-k-view-pager-item/index.md)`<*>>`<br>For internal use. Don't use manually. |
| [KViewPagerItemTypeBuilder](-k-view-pager-item-type-builder/index.md) | `class KViewPagerItemTypeBuilder`<br>Class that maps types to providing functions |
| [ViewPager2Actions](-view-pager2-actions/index.md) | `interface ViewPager2Actions : `[`ScrollableActions`](../io.github.kakaocup.kakao.common.actions/-scrollable-actions/index.md)`, `[`SwipeableActions`](../io.github.kakaocup.kakao.common.actions/-swipeable-actions/index.md)<br>Provides ScrollableActions implementation for ViewPager2 |
| [ViewPager2AdapterAssertions](-view-pager2-adapter-assertions/index.md) | `interface ViewPager2AdapterAssertions : `[`AdapterAssertions`](../io.github.kakaocup.kakao.common.assertions/-adapter-assertions/index.md)<br>Provides assertions for viewpager2 adapter |
