//[kakao](../../../index.md)/[io.github.kakaocup.kakao.recycler](../index.md)/[KRecyclerItemTypeBuilder](index.md)



# KRecyclerItemTypeBuilder  
 [androidJvm] class [KRecyclerItemTypeBuilder](index.md)

Class that maps types to providing functions



To be able to support different item types in KRecyclerView, this class adds support for mapping item type classes to functions that provide them. KEmptyRecyclerItem is added by default.

   


## See also  
  
androidJvm  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.recycler/KRecyclerItemTypeBuilder///PointingToDeclaration/"></a>[io.github.kakaocup.kakao.recycler.KRecyclerItemTypeBuilder](item-type.md)| <a name="io.github.kakaocup.kakao.recycler/KRecyclerItemTypeBuilder///PointingToDeclaration/"></a>|
| <a name="io.github.kakaocup.kakao.recycler/KRecyclerItemTypeBuilder///PointingToDeclaration/"></a>[io.github.kakaocup.kakao.recycler.KEmptyRecyclerItem](../-k-empty-recycler-item/index.md)| <a name="io.github.kakaocup.kakao.recycler/KRecyclerItemTypeBuilder///PointingToDeclaration/"></a>|
  


## Constructors  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.recycler/KRecyclerItemTypeBuilder/KRecyclerItemTypeBuilder/#/PointingToDeclaration/"></a>[KRecyclerItemTypeBuilder](-k-recycler-item-type-builder.md)| <a name="io.github.kakaocup.kakao.recycler/KRecyclerItemTypeBuilder/KRecyclerItemTypeBuilder/#/PointingToDeclaration/"></a> [androidJvm] fun [KRecyclerItemTypeBuilder](-k-recycler-item-type-builder.md)()   <br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.recycler/KRecyclerItemTypeBuilder/itemType/#kotlin.Function1[org.hamcrest.Matcher[android.view.View],TypeParam(bounds=[io.github.kakaocup.kakao.recycler.KRecyclerItem[*]])]/PointingToDeclaration/"></a>[itemType](item-type.md)| <a name="io.github.kakaocup.kakao.recycler/KRecyclerItemTypeBuilder/itemType/#kotlin.Function1[org.hamcrest.Matcher[android.view.View],TypeParam(bounds=[io.github.kakaocup.kakao.recycler.KRecyclerItem[*]])]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>inline fun <[T](item-type.md) : [KRecyclerItem](../-k-recycler-item/index.md)<*>> [itemType](item-type.md)(noinline provideItem: (Matcher<[View](https://developer.android.com/reference/kotlin/android/view/View.html)>) -> [T](item-type.md))  <br>More info  <br>Adds entry that helps KRecyclerView to automatically build child viewsTo make it work, you need to pass here function (lambda, constructor), that takes matcher and returns instance of your item type.  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.recycler/KRecyclerItemTypeBuilder/itemTypes/#/PointingToDeclaration/"></a>[itemTypes](item-types.md)| <a name="io.github.kakaocup.kakao.recycler/KRecyclerItemTypeBuilder/itemTypes/#/PointingToDeclaration/"></a> [androidJvm] val [itemTypes](item-types.md): [MutableMap](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)<[KClass](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)<out [KRecyclerItem](../-k-recycler-item/index.md)<*>>, [KRecyclerItemType](../-k-recycler-item-type/index.md)<[KRecyclerItem](../-k-recycler-item/index.md)<*>>>   <br>|

