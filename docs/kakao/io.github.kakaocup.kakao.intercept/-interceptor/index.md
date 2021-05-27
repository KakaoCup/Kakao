//[kakao](../../../index.md)/[io.github.kakaocup.kakao.intercept](../index.md)/[Interceptor](index.md)



# Interceptor  
 [androidJvm] class [Interceptor](index.md)<[INTERACTION](index.md), [ASSERTION](index.md), [ACTION](index.md)>(**onCheck**: [Interception](../-interception/index.md)<([INTERACTION](index.md), [ASSERTION](index.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)>?, **onPerform**: [Interception](../-interception/index.md)<([INTERACTION](index.md), [ACTION](index.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)>?, **onAll**: [Interception](../-interception/index.md)<([INTERACTION](index.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)>?)

Base class for intercepting the call chain from Kakao to Espresso.



Interceptors can be provided through [Kakao](../../io.github.kakaocup.kakao/-kakao/index.md) runtime, different [Screens](../../io.github.kakaocup.kakao.screen/-screen/index.md) as well as [KViews](../../io.github.kakaocup.kakao.common.views/-k-base-view/index.md).



Interceptors are stacked during the runtime for any Kakao-Espresso check and perform operations. The stack ordering is following: KView interceptor -> Screen interceptors -> Kakao interceptor.



Any of the interceptors in the chain can break the chain call by setting isOverride to true in [onCheck](-builder/on-check.md), [onPerform](-builder/on-perform.md) or [onAll](-builder/on-all.md) interception functions during the configuration. Doing this will not only prevent underlying interceptors from being invoked, but prevents Kakao from executing the operation. In that case, responsibility for actually making Espresso call lies on developer.



For each operation the interceptor invocation cycle will be as follows:

// For check operation  
onAll?.invoke()  
onCheck?.invoke()  
  
// For perform operation  
onAll?.invoke()  
onPerform?.invoke()   


## See also  
  
androidJvm  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.intercept/Interceptor///PointingToDeclaration/"></a>[io.github.kakaocup.kakao.Kakao](../../io.github.kakaocup.kakao/-kakao/index.md)| <a name="io.github.kakaocup.kakao.intercept/Interceptor///PointingToDeclaration/"></a>|
| <a name="io.github.kakaocup.kakao.intercept/Interceptor///PointingToDeclaration/"></a>[io.github.kakaocup.kakao.screen.Screen](../../io.github.kakaocup.kakao.screen/-screen/index.md)| <a name="io.github.kakaocup.kakao.intercept/Interceptor///PointingToDeclaration/"></a>|
| <a name="io.github.kakaocup.kakao.intercept/Interceptor///PointingToDeclaration/"></a>[io.github.kakaocup.kakao.common.views.KBaseView](../../io.github.kakaocup.kakao.common.views/-k-base-view/index.md)| <a name="io.github.kakaocup.kakao.intercept/Interceptor///PointingToDeclaration/"></a>|
  


## Constructors  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.intercept/Interceptor/Interceptor/#io.github.kakaocup.kakao.intercept.Interception[kotlin.Function2[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?]),kotlin.Unit]]?#io.github.kakaocup.kakao.intercept.Interception[kotlin.Function2[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?]),kotlin.Unit]]?#io.github.kakaocup.kakao.intercept.Interception[kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),kotlin.Unit]]?/PointingToDeclaration/"></a>[Interceptor](-interceptor.md)| <a name="io.github.kakaocup.kakao.intercept/Interceptor/Interceptor/#io.github.kakaocup.kakao.intercept.Interception[kotlin.Function2[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?]),kotlin.Unit]]?#io.github.kakaocup.kakao.intercept.Interception[kotlin.Function2[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?]),kotlin.Unit]]?#io.github.kakaocup.kakao.intercept.Interception[kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),kotlin.Unit]]?/PointingToDeclaration/"></a> [androidJvm] fun <[INTERACTION](index.md), [ASSERTION](index.md), [ACTION](index.md)> [Interceptor](-interceptor.md)(onCheck: [Interception](../-interception/index.md)<([INTERACTION](index.md), [ASSERTION](index.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)>?, onPerform: [Interception](../-interception/index.md)<([INTERACTION](index.md), [ACTION](index.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)>?, onAll: [Interception](../-interception/index.md)<([INTERACTION](index.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)>?)   <br>|


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.intercept/Interceptor.Builder///PointingToDeclaration/"></a>[Builder](-builder/index.md)| <a name="io.github.kakaocup.kakao.intercept/Interceptor.Builder///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>class [Builder](-builder/index.md)<[INTERACTION](-builder/index.md), [ASSERTION](-builder/index.md), [ACTION](-builder/index.md)>  <br>More info  <br>Builder class that is used to build a single instance of [Interceptor](index.md).  <br><br><br>|
| <a name="io.github.kakaocup.kakao.intercept/Interceptor.Configuration///PointingToDeclaration/"></a>[Configuration](-configuration/index.md)| <a name="io.github.kakaocup.kakao.intercept/Interceptor.Configuration///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>data class [Configuration](-configuration/index.md)(**viewInterceptor**: [Interceptor](index.md)<ViewInteraction, ViewAssertion, ViewAction>?, **dataInterceptor**: [Interceptor](index.md)<DataInteraction, ViewAssertion, ViewAction>?, **webInterceptor**: [Interceptor](index.md)<Web.WebInteraction<*>, WebAssertion<*>, Atom<*>>?)  <br><br><br>|
| <a name="io.github.kakaocup.kakao.intercept/Interceptor.Configurator///PointingToDeclaration/"></a>[Configurator](-configurator/index.md)| <a name="io.github.kakaocup.kakao.intercept/Interceptor.Configurator///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>class [Configurator](-configurator/index.md)  <br>More info  <br>Configuration class that is used for building interceptors on the [Kakao](../../io.github.kakaocup.kakao/-kakao/index.md) runtime and [Screen](../../io.github.kakaocup.kakao.screen/-screen/index.md) levels.  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.intercept/Interceptor/onAll/#/PointingToDeclaration/"></a>[onAll](on-all.md)| <a name="io.github.kakaocup.kakao.intercept/Interceptor/onAll/#/PointingToDeclaration/"></a> [androidJvm] val [onAll](on-all.md): [Interception](../-interception/index.md)<([INTERACTION](index.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)>?   <br>|
| <a name="io.github.kakaocup.kakao.intercept/Interceptor/onCheck/#/PointingToDeclaration/"></a>[onCheck](on-check.md)| <a name="io.github.kakaocup.kakao.intercept/Interceptor/onCheck/#/PointingToDeclaration/"></a> [androidJvm] val [onCheck](on-check.md): [Interception](../-interception/index.md)<([INTERACTION](index.md), [ASSERTION](index.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)>?   <br>|
| <a name="io.github.kakaocup.kakao.intercept/Interceptor/onPerform/#/PointingToDeclaration/"></a>[onPerform](on-perform.md)| <a name="io.github.kakaocup.kakao.intercept/Interceptor/onPerform/#/PointingToDeclaration/"></a> [androidJvm] val [onPerform](on-perform.md): [Interception](../-interception/index.md)<([INTERACTION](index.md), [ACTION](index.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)>?   <br>|

