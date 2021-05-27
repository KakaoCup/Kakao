//[kakao](../../../index.md)/[io.github.kakaocup.kakao.recycler](../index.md)/[KRecyclerView](index.md)/[childWith](child-with.md)



# childWith  
[androidJvm]  
Content  
inline fun <[T](child-with.md) : [KRecyclerItem](../-k-recycler-item/index.md)<*>> [childWith](child-with.md)(noinline childMatcher: [ViewBuilder](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [T](child-with.md)  
More info  


Performs given actions/assertion on child that matches given matcher



#### Return  


Item with type T. To make actions/assertions on it immediately, use perform() infix function.



## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.recycler/KRecyclerView/childWith/#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a>T| <a name="io.github.kakaocup.kakao.recycler/KRecyclerView/childWith/#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a><br><br>Type of item at given position. Must be registered via constructor.<br><br>|
| <a name="io.github.kakaocup.kakao.recycler/KRecyclerView/childWith/#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a>childMatcher| <a name="io.github.kakaocup.kakao.recycler/KRecyclerView/childWith/#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a><br><br>Matcher for item in adapter<br><br>|
  
  



