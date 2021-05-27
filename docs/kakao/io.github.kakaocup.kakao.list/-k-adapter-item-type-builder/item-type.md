//[kakao](../../../index.md)/[io.github.kakaocup.kakao.list](../index.md)/[KAdapterItemTypeBuilder](index.md)/[itemType](item-type.md)



# itemType  
[androidJvm]  
Content  
inline fun <[T](item-type.md) : [KAdapterItem](../-k-adapter-item/index.md)<*>> [itemType](item-type.md)(noinline provideItem: (DataInteraction) -> [T](item-type.md))  
More info  


Adds entry that helps KListView to automatically build child views



To make it work, you need to pass here function (lambda, constructor), that takes matcher and returns instance of your item type. In this case, matcher actually matches your KListView and additional matchers that were used (in firstChild(), childAt(), etc.)



## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.list/KAdapterItemTypeBuilder/itemType/#kotlin.Function1[androidx.test.espresso.DataInteraction,TypeParam(bounds=[io.github.kakaocup.kakao.list.KAdapterItem[*]])]/PointingToDeclaration/"></a>provideItem| <a name="io.github.kakaocup.kakao.list/KAdapterItemTypeBuilder/itemType/#kotlin.Function1[androidx.test.espresso.DataInteraction,TypeParam(bounds=[io.github.kakaocup.kakao.list.KAdapterItem[*]])]/PointingToDeclaration/"></a><br><br>Function that takes data interaction of list view and returns instance of item view<br><br>|
  
  



