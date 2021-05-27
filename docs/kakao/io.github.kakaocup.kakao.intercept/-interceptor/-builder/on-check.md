//[kakao](../../../../index.md)/[io.github.kakaocup.kakao.intercept](../../index.md)/[Interceptor](../index.md)/[Builder](index.md)/[onCheck](on-check.md)



# onCheck  
[androidJvm]  
Content  
fun [onCheck](on-check.md)(isOverride: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, interceptor: ([INTERACTION](index.md), [ASSERTION](index.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  
More info  


Sets the interceptor for the check operation for a given interaction. If overridden, breaks the call chain of operation and transfers the responsibility to invoke the Espresso on the developer.



## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.intercept/Interceptor.Builder/onCheck/#kotlin.Boolean#kotlin.Function2[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?]),kotlin.Unit]/PointingToDeclaration/"></a>isOverride| <a name="io.github.kakaocup.kakao.intercept/Interceptor.Builder/onCheck/#kotlin.Boolean#kotlin.Function2[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?]),kotlin.Unit]/PointingToDeclaration/"></a><br><br>if true - breaks the call chain, false otherwise<br><br>|
| <a name="io.github.kakaocup.kakao.intercept/Interceptor.Builder/onCheck/#kotlin.Boolean#kotlin.Function2[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?]),kotlin.Unit]/PointingToDeclaration/"></a>interceptor| <a name="io.github.kakaocup.kakao.intercept/Interceptor.Builder/onCheck/#kotlin.Boolean#kotlin.Function2[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?]),kotlin.Unit]/PointingToDeclaration/"></a><br><br>lambda with intercepting logic<br><br>|
  
  



