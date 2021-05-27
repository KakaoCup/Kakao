//[kakao](../../../../index.md)/[io.github.kakaocup.kakao.intercept](../../index.md)/[Interceptor](../index.md)/[Builder](index.md)



# Builder  
 [androidJvm] class [Builder](index.md)<[INTERACTION](index.md), [ASSERTION](index.md), [ACTION](index.md)>

Builder class that is used to build a single instance of [Interceptor](../index.md).

   


## See also  
  
androidJvm  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.intercept/Interceptor.Builder///PointingToDeclaration/"></a>[io.github.kakaocup.kakao.intercept.Interceptor](../index.md)| <a name="io.github.kakaocup.kakao.intercept/Interceptor.Builder///PointingToDeclaration/"></a>|
  


## Constructors  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.intercept/Interceptor.Builder/Builder/#/PointingToDeclaration/"></a>[Builder](-builder.md)| <a name="io.github.kakaocup.kakao.intercept/Interceptor.Builder/Builder/#/PointingToDeclaration/"></a> [androidJvm] fun [Builder](-builder.md)()   <br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.intercept/Interceptor.Builder/onAll/#kotlin.Boolean#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),kotlin.Unit]/PointingToDeclaration/"></a>[onAll](on-all.md)| <a name="io.github.kakaocup.kakao.intercept/Interceptor.Builder/onAll/#kotlin.Boolean#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),kotlin.Unit]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [onAll](on-all.md)(isOverride: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, interceptor: ([INTERACTION](index.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  <br>More info  <br>Sets the interceptor for the check and perform operations for a given interaction.  <br><br><br>|
| <a name="io.github.kakaocup.kakao.intercept/Interceptor.Builder/onCheck/#kotlin.Boolean#kotlin.Function2[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?]),kotlin.Unit]/PointingToDeclaration/"></a>[onCheck](on-check.md)| <a name="io.github.kakaocup.kakao.intercept/Interceptor.Builder/onCheck/#kotlin.Boolean#kotlin.Function2[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?]),kotlin.Unit]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [onCheck](on-check.md)(isOverride: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, interceptor: ([INTERACTION](index.md), [ASSERTION](index.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  <br>More info  <br>Sets the interceptor for the check operation for a given interaction.  <br><br><br>|
| <a name="io.github.kakaocup.kakao.intercept/Interceptor.Builder/onPerform/#kotlin.Boolean#kotlin.Function2[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?]),kotlin.Unit]/PointingToDeclaration/"></a>[onPerform](on-perform.md)| <a name="io.github.kakaocup.kakao.intercept/Interceptor.Builder/onPerform/#kotlin.Boolean#kotlin.Function2[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?]),kotlin.Unit]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [onPerform](on-perform.md)(isOverride: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, interceptor: ([INTERACTION](index.md), [ACTION](index.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  <br>More info  <br>Sets the interceptor for the perform operation for a given interaction.  <br><br><br>|

