[kakao](../../index.md) / [io.github.kakaoandroid.kakao.scroll](../index.md) / [ScrollViewActions](./index.md)

# ScrollViewActions

`interface ScrollViewActions : `[`ScrollableActions`](../../io.github.kakaoandroid.kakao.common.actions/-scrollable-actions/index.md)`, `[`SwipeableActions`](../../io.github.kakaoandroid.kakao.common.actions/-swipeable-actions/index.md)

Provides ScrollableActions implementation for ScrollView

**See Also**

[ScrollableActions](../../io.github.kakaoandroid.kakao.common.actions/-scrollable-actions/index.md)

[SwipeableActions](../../io.github.kakaoandroid.kakao.common.actions/-swipeable-actions/index.md)

[ScrollView](https://developer.android.com/reference/android/widget/ScrollView.html)

### Functions

| Name | Summary |
|---|---|
| [scrollTo](scroll-to.md) | `open fun scrollTo(position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the specific position of the view |
| [scrollToEnd](scroll-to-end.md) | `open fun scrollToEnd(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the last position of the view |
| [scrollToStart](scroll-to-start.md) | `open fun scrollToStart(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the starting position of the view |

### Inherited Functions

| Name | Summary |
|---|---|
| [swipeDown](../../io.github.kakaoandroid.kakao.common.actions/-swipeable-actions/swipe-down.md) | `open fun swipeDown(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Swipes down on the view |
| [swipeLeft](../../io.github.kakaoandroid.kakao.common.actions/-swipeable-actions/swipe-left.md) | `open fun swipeLeft(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Swipes left on the view |
| [swipeRight](../../io.github.kakaoandroid.kakao.common.actions/-swipeable-actions/swipe-right.md) | `open fun swipeRight(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Swipes right on the view |
| [swipeUp](../../io.github.kakaoandroid.kakao.common.actions/-swipeable-actions/swipe-up.md) | `open fun swipeUp(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Swipes up on the view |

### Inheritors

| Name | Summary |
|---|---|
| [KAbsListView](../../io.github.kakaoandroid.kakao.list/-k-abs-list-view/index.md) | `class KAbsListView : `[`ScrollViewActions`](./index.md)`, `[`AbsListViewAdapterActions`](../../io.github.kakaoandroid.kakao.list/-abs-list-view-adapter-actions/index.md)`, `[`BaseAssertions`](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/index.md)`, `[`AbsListViewAdapterAssertions`](../../io.github.kakaoandroid.kakao.list/-abs-list-view-adapter-assertions/index.md)<br>View with ScrollViewActions and BaseAssertions. Gives access to it's children |
| [KScrollView](../-k-scroll-view/index.md) | `class KScrollView : `[`KBaseView`](../../io.github.kakaoandroid.kakao.common.views/-k-base-view/index.md)`<`[`KScrollView`](../-k-scroll-view/index.md)`>, `[`ScrollViewActions`](./index.md)`, `[`BaseAssertions`](../../io.github.kakaoandroid.kakao.common.assertions/-base-assertions/index.md)<br>View with ScrollViewActions and BaseAssertions |
