[kakao](../../index.md) / [io.github.kakaocup.kakao.slider](../index.md) / [SliderActions](index.md) / [dragValueTo](./drag-value-to.md)

# dragValueTo

`open fun dragValueTo(value: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Drags slider to defined position.
Please note that this dragging is emulated via Espresso's swipe action
and might not be accurate, if progress max value is too high or device's
density is too low.

### Parameters

`value` - of slider to drag to

**See Also**

[GeneralSwipeAction](#)

