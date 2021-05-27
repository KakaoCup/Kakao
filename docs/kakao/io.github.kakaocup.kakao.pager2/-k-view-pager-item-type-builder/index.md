//[kakao](../../../index.md)/[io.github.kakaocup.kakao.pager2](../index.md)/[KViewPagerItemTypeBuilder](index.md)



# KViewPagerItemTypeBuilder  
 [androidJvm] class [KViewPagerItemTypeBuilder](index.md)

Class that maps types to providing functions



To be able to support different item types in KViewPager2, this class adds support for mapping item type classes to functions that provide them. KEmptyViewPagerItem is added by default.

   


## See also  
  
androidJvm  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.pager2/KViewPagerItemTypeBuilder///PointingToDeclaration/"></a>[io.github.kakaocup.kakao.pager2.KViewPagerItemTypeBuilder](item-type.md)| <a name="io.github.kakaocup.kakao.pager2/KViewPagerItemTypeBuilder///PointingToDeclaration/"></a>|
| <a name="io.github.kakaocup.kakao.pager2/KViewPagerItemTypeBuilder///PointingToDeclaration/"></a>[io.github.kakaocup.kakao.pager2.KEmptyViewPagerItem](../-k-empty-view-pager-item/index.md)| <a name="io.github.kakaocup.kakao.pager2/KViewPagerItemTypeBuilder///PointingToDeclaration/"></a>|
  


## Constructors  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.pager2/KViewPagerItemTypeBuilder/KViewPagerItemTypeBuilder/#/PointingToDeclaration/"></a>[KViewPagerItemTypeBuilder](-k-view-pager-item-type-builder.md)| <a name="io.github.kakaocup.kakao.pager2/KViewPagerItemTypeBuilder/KViewPagerItemTypeBuilder/#/PointingToDeclaration/"></a> [androidJvm] fun [KViewPagerItemTypeBuilder](-k-view-pager-item-type-builder.md)()   <br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.pager2/KViewPagerItemTypeBuilder/itemType/#kotlin.Function1[org.hamcrest.Matcher[android.view.View],TypeParam(bounds=[io.github.kakaocup.kakao.pager2.KViewPagerItem[*]])]/PointingToDeclaration/"></a>[itemType](item-type.md)| <a name="io.github.kakaocup.kakao.pager2/KViewPagerItemTypeBuilder/itemType/#kotlin.Function1[org.hamcrest.Matcher[android.view.View],TypeParam(bounds=[io.github.kakaocup.kakao.pager2.KViewPagerItem[*]])]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>inline fun <[T](item-type.md) : [KViewPagerItem](../-k-view-pager-item/index.md)<*>> [itemType](item-type.md)(noinline provideItem: (Matcher<[View](https://developer.android.com/reference/kotlin/android/view/View.html)>) -> [T](item-type.md))  <br>More info  <br>Adds entry that helps KViewPager2 to automatically build child viewsTo make it work, you need to pass here function (lambda, constructor), that takes matcher and returns instance of your item type.  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.pager2/KViewPagerItemTypeBuilder/itemTypes/#/PointingToDeclaration/"></a>[itemTypes](item-types.md)| <a name="io.github.kakaocup.kakao.pager2/KViewPagerItemTypeBuilder/itemTypes/#/PointingToDeclaration/"></a> [androidJvm] val [itemTypes](item-types.md): [MutableMap](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)<[KClass](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)<out [KViewPagerItem](../-k-view-pager-item/index.md)<*>>, [KViewPagerItemType](../-k-view-pager-item-type/index.md)<[KViewPagerItem](../-k-view-pager-item/index.md)<*>>>   <br>|

