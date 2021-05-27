//[kakao](../../../../index.md)/[io.github.kakaocup.kakao.intercept](../../index.md)/[Interceptor](../index.md)/[Builder](index.md)/[onAll](on-all.md)



# onAll  
[androidJvm]  
Content  
fun [onAll](on-all.md)(isOverride: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, interceptor: ([INTERACTION](index.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  
More info  


Sets the interceptor for the check and perform operations for a given interaction. If overridden, breaks the call chain of operation and transfers the responsibility to invoke the Espresso on the developer.



This interceptor is prioritized and is being invoked first for both operations.



## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.intercept/Interceptor.Builder/onAll/#kotlin.Boolean#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),kotlin.Unit]/PointingToDeclaration/"></a>isOverride| <a name="io.github.kakaocup.kakao.intercept/Interceptor.Builder/onAll/#kotlin.Boolean#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),kotlin.Unit]/PointingToDeclaration/"></a><br><br>if true - breaks the call chain, false otherwise<br><br>|
| <a name="io.github.kakaocup.kakao.intercept/Interceptor.Builder/onAll/#kotlin.Boolean#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),kotlin.Unit]/PointingToDeclaration/"></a>interceptor| <a name="io.github.kakaocup.kakao.intercept/Interceptor.Builder/onAll/#kotlin.Boolean#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),kotlin.Unit]/PointingToDeclaration/"></a><br><br>lambda with intercepting logic<br><br>|
  
  



