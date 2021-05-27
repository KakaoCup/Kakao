//[kakao](../../../index.md)/[io.github.kakaocup.kakao.list](../index.md)/[KAdapterItemTypeBuilder](index.md)



# KAdapterItemTypeBuilder  
 [androidJvm] class [KAdapterItemTypeBuilder](index.md)

Class that maps types to providing functions



To be able to support different item types in KListView, this class adds support for mapping item type classes to functions that provide them. KEmptyAdapterItem is added by default.

   


## See also  
  
androidJvm  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.list/KAdapterItemTypeBuilder///PointingToDeclaration/"></a>[io.github.kakaocup.kakao.list.KAdapterItemTypeBuilder](item-type.md)| <a name="io.github.kakaocup.kakao.list/KAdapterItemTypeBuilder///PointingToDeclaration/"></a>|
| <a name="io.github.kakaocup.kakao.list/KAdapterItemTypeBuilder///PointingToDeclaration/"></a>[io.github.kakaocup.kakao.list.KEmptyAdapterItem](../-k-empty-adapter-item/index.md)| <a name="io.github.kakaocup.kakao.list/KAdapterItemTypeBuilder///PointingToDeclaration/"></a>|
  


## Constructors  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.list/KAdapterItemTypeBuilder/KAdapterItemTypeBuilder/#/PointingToDeclaration/"></a>[KAdapterItemTypeBuilder](-k-adapter-item-type-builder.md)| <a name="io.github.kakaocup.kakao.list/KAdapterItemTypeBuilder/KAdapterItemTypeBuilder/#/PointingToDeclaration/"></a> [androidJvm] fun [KAdapterItemTypeBuilder](-k-adapter-item-type-builder.md)()   <br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.list/KAdapterItemTypeBuilder/itemType/#kotlin.Function1[androidx.test.espresso.DataInteraction,TypeParam(bounds=[io.github.kakaocup.kakao.list.KAdapterItem[*]])]/PointingToDeclaration/"></a>[itemType](item-type.md)| <a name="io.github.kakaocup.kakao.list/KAdapterItemTypeBuilder/itemType/#kotlin.Function1[androidx.test.espresso.DataInteraction,TypeParam(bounds=[io.github.kakaocup.kakao.list.KAdapterItem[*]])]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>inline fun <[T](item-type.md) : [KAdapterItem](../-k-adapter-item/index.md)<*>> [itemType](item-type.md)(noinline provideItem: (DataInteraction) -> [T](item-type.md))  <br>More info  <br>Adds entry that helps KListView to automatically build child viewsTo make it work, you need to pass here function (lambda, constructor), that takes matcher and returns instance of your item type.  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.list/KAdapterItemTypeBuilder/itemTypes/#/PointingToDeclaration/"></a>[itemTypes](item-types.md)| <a name="io.github.kakaocup.kakao.list/KAdapterItemTypeBuilder/itemTypes/#/PointingToDeclaration/"></a> [androidJvm] val [itemTypes](item-types.md): [MutableMap](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)<[KClass](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)<out [KAdapterItem](../-k-adapter-item/index.md)<*>>, [KAdapterItemType](../-k-adapter-item-type/index.md)<[KAdapterItem](../-k-adapter-item/index.md)<*>>>   <br>|

