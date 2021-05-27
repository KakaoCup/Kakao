//[kakao](../../../index.md)/[io.github.kakaocup.kakao.spinner](../index.md)/[KSpinner](index.md)/[childWith](child-with.md)



# childWith  
[androidJvm]  
Content  
inline fun <[T](child-with.md) : [KAdapterItem](../../io.github.kakaocup.kakao.list/-k-adapter-item/index.md)<*>> [childWith](child-with.md)(childMatcher: [DataBuilder](../../io.github.kakaocup.kakao.list/-data-builder/index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [T](child-with.md)  
More info  


Performs given actions/assertion on child that matches given matcher



#### Return  


Item with type T. To make actions/assertions on it immediately, use perform() infix function.



## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.spinner/KSpinner/childWith/#kotlin.Function1[io.github.kakaocup.kakao.list.DataBuilder,kotlin.Unit]/PointingToDeclaration/"></a>T| <a name="io.github.kakaocup.kakao.spinner/KSpinner/childWith/#kotlin.Function1[io.github.kakaocup.kakao.list.DataBuilder,kotlin.Unit]/PointingToDeclaration/"></a><br><br>Type of item at given position. Must be registered via constructor.<br><br>|
| <a name="io.github.kakaocup.kakao.spinner/KSpinner/childWith/#kotlin.Function1[io.github.kakaocup.kakao.list.DataBuilder,kotlin.Unit]/PointingToDeclaration/"></a>childMatcher| <a name="io.github.kakaocup.kakao.spinner/KSpinner/childWith/#kotlin.Function1[io.github.kakaocup.kakao.list.DataBuilder,kotlin.Unit]/PointingToDeclaration/"></a><br><br>Matcher for item in adapter<br><br>|
  
  



