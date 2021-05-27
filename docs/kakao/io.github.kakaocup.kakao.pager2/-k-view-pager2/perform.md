//[kakao](../../../index.md)/[io.github.kakaocup.kakao.pager2](../index.md)/[KViewPager2](index.md)/[perform](perform.md)



# perform  
[androidJvm]  
Content  
infix fun [perform](perform.md)(function: [KViewPager2](index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [KViewPager2](index.md)  
More info  


Infix function for invoking lambda on your view



Sometimes instance of view is a result of a function or constructor. In this specific case you can't call invoke() since it will be considered as tail lambda of your fun/constructor. In such cases please use this function.



#### Return  


This object



## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.pager2/KViewPager2/perform/#kotlin.Function1[io.github.kakaocup.kakao.pager2.KViewPager2,kotlin.Unit]/PointingToDeclaration/"></a>function| <a name="io.github.kakaocup.kakao.pager2/KViewPager2/perform/#kotlin.Function1[io.github.kakaocup.kakao.pager2.KViewPager2,kotlin.Unit]/PointingToDeclaration/"></a><br><br>Tail lambda with receiver which is your view<br><br>|
  
  



