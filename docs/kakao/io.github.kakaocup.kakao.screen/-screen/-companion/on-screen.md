//[kakao](../../../../index.md)/[io.github.kakaocup.kakao.screen](../../index.md)/[Screen](../index.md)/[Companion](index.md)/[onScreen](on-screen.md)



# onScreen  
[androidJvm]  
Content  
inline fun <[T](on-screen.md) : [Screen](../index.md)<[T](on-screen.md)>> [onScreen](on-screen.md)(noinline function: [T](on-screen.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [T](on-screen.md)  
More info  


Initializes instance of the screen class provided and invokes given tail lambda on it.



This approach helps to reduce boilerplate code and avoid have a screen instance stored in a properties of you tests classes.



In order to use this function, your [Screen](../index.md) class must have an empty primary constructor.



## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.screen/Screen.Companion/onScreen/#kotlin.Function1[TypeParam(bounds=[io.github.kakaocup.kakao.screen.Screen[^]]),kotlin.Unit]/PointingToDeclaration/"></a>function| <a name="io.github.kakaocup.kakao.screen/Screen.Companion/onScreen/#kotlin.Function1[TypeParam(bounds=[io.github.kakaocup.kakao.screen.Screen[^]]),kotlin.Unit]/PointingToDeclaration/"></a><br><br>Tail lambda to be invoked on the created instance of screen.<br><br>|
  
  



