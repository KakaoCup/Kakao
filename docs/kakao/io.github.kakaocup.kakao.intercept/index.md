//[kakao](../../index.md)/[io.github.kakaocup.kakao.intercept](index.md)



# Package io.github.kakaocup.kakao.intercept  


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.intercept/Interceptable///PointingToDeclaration/"></a>[Interceptable](-interceptable/index.md)| <a name="io.github.kakaocup.kakao.intercept/Interceptable///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>interface [Interceptable](-interceptable/index.md)<[INTERACTION](-interceptable/index.md), [ASSERTION](-interceptable/index.md), [ACTION](-interceptable/index.md)>  <br><br><br>|
| <a name="io.github.kakaocup.kakao.intercept/Interception///PointingToDeclaration/"></a>[Interception](-interception/index.md)| <a name="io.github.kakaocup.kakao.intercept/Interception///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>data class [Interception](-interception/index.md)<[T](-interception/index.md)>(**isOverride**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **interceptor**: [T](-interception/index.md))  <br><br><br>|
| <a name="io.github.kakaocup.kakao.intercept/Interceptor///PointingToDeclaration/"></a>[Interceptor](-interceptor/index.md)| <a name="io.github.kakaocup.kakao.intercept/Interceptor///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>class [Interceptor](-interceptor/index.md)<[INTERACTION](-interceptor/index.md), [ASSERTION](-interceptor/index.md), [ACTION](-interceptor/index.md)>(**onCheck**: [Interception](-interception/index.md)<([INTERACTION](-interceptor/index.md), [ASSERTION](-interceptor/index.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)>?, **onPerform**: [Interception](-interception/index.md)<([INTERACTION](-interceptor/index.md), [ACTION](-interceptor/index.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)>?, **onAll**: [Interception](-interception/index.md)<([INTERACTION](-interceptor/index.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)>?)  <br>More info  <br>Base class for intercepting the call chain from Kakao to Espresso.  <br><br><br>|

