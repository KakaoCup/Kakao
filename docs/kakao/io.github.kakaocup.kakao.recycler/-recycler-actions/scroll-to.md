//[kakao](../../../index.md)/[io.github.kakaocup.kakao.recycler](../index.md)/[RecyclerActions](index.md)/[scrollTo](scroll-to.md)



# scrollTo  
[androidJvm]  
Content  
open override fun [scrollTo](scroll-to.md)(position: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  
More info  


Scrolls to the specific position of the view



## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.recycler/RecyclerActions/scrollTo/#kotlin.Int/PointingToDeclaration/"></a>position| <a name="io.github.kakaocup.kakao.recycler/RecyclerActions/scrollTo/#kotlin.Int/PointingToDeclaration/"></a><br><br>Scrolling destination<br><br>|
  
  


[androidJvm]  
Content  
open fun [scrollTo](scroll-to.md)(matcher: Matcher<[View](https://developer.android.com/reference/kotlin/android/view/View.html)>)  
More info  


Scrolls to specific view holder that matches given matcher



## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.recycler/RecyclerActions/scrollTo/#org.hamcrest.Matcher[android.view.View]/PointingToDeclaration/"></a>matcher| <a name="io.github.kakaocup.kakao.recycler/RecyclerActions/scrollTo/#org.hamcrest.Matcher[android.view.View]/PointingToDeclaration/"></a><br><br>Matcher for view holder, which is scroll destination<br><br>|
  
  


[androidJvm]  
Content  
open fun [scrollTo](scroll-to.md)(viewBuilder: [ViewBuilder](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  
More info  


Scrolls to specific view holder that matches given matcher



## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.recycler/RecyclerActions/scrollTo/#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a>viewBuilder| <a name="io.github.kakaocup.kakao.recycler/RecyclerActions/scrollTo/#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a><br><br>Builder that will be used to match view to scroll<br><br>|
  
  



