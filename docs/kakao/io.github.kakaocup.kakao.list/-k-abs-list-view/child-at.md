//[kakao](../../../index.md)/[io.github.kakaocup.kakao.list](../index.md)/[KAbsListView](index.md)/[childAt](child-at.md)



# childAt  
[androidJvm]  
Content  
inline fun <[T](child-at.md) : [KAdapterItem](../-k-adapter-item/index.md)<*>> [childAt](child-at.md)(position: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), function: [T](child-at.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  
More info  


Performs given actions/assertion on child at given position



## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.list/KAbsListView/childAt/#kotlin.Int#kotlin.Function1[TypeParam(bounds=[io.github.kakaocup.kakao.list.KAdapterItem[*]]),kotlin.Unit]/PointingToDeclaration/"></a>T| <a name="io.github.kakaocup.kakao.list/KAbsListView/childAt/#kotlin.Int#kotlin.Function1[TypeParam(bounds=[io.github.kakaocup.kakao.list.KAdapterItem[*]]),kotlin.Unit]/PointingToDeclaration/"></a><br><br>Type of item at given position. Must be registered via constructor.<br><br>|
| <a name="io.github.kakaocup.kakao.list/KAbsListView/childAt/#kotlin.Int#kotlin.Function1[TypeParam(bounds=[io.github.kakaocup.kakao.list.KAdapterItem[*]]),kotlin.Unit]/PointingToDeclaration/"></a>position| <a name="io.github.kakaocup.kakao.list/KAbsListView/childAt/#kotlin.Int#kotlin.Function1[TypeParam(bounds=[io.github.kakaocup.kakao.list.KAdapterItem[*]]),kotlin.Unit]/PointingToDeclaration/"></a><br><br>Position of item in adapter<br><br>|
| <a name="io.github.kakaocup.kakao.list/KAbsListView/childAt/#kotlin.Int#kotlin.Function1[TypeParam(bounds=[io.github.kakaocup.kakao.list.KAdapterItem[*]]),kotlin.Unit]/PointingToDeclaration/"></a>function| <a name="io.github.kakaocup.kakao.list/KAbsListView/childAt/#kotlin.Int#kotlin.Function1[TypeParam(bounds=[io.github.kakaocup.kakao.list.KAdapterItem[*]]),kotlin.Unit]/PointingToDeclaration/"></a><br><br>Tail lambda which receiver will be matched item with given type T<br><br>|
  
  



