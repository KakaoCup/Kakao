//[kakao](../../../index.md)/[io.github.kakaocup.kakao.delegate](../index.md)/[Delegate](index.md)



# Delegate  
 [androidJvm] interface [Delegate](index.md)<[INTERACTION](index.md), [ASSERTION](index.md), [ACTION](index.md)>

Base delegate interface.



Provides functionality of aggregating interceptors and invoking them on check and perform invocations.

   


## See also  
  
androidJvm  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.delegate/Delegate///PointingToDeclaration/"></a>[io.github.kakaocup.kakao.intercept.Interceptor](../../io.github.kakaocup.kakao.intercept/-interceptor/index.md)| <a name="io.github.kakaocup.kakao.delegate/Delegate///PointingToDeclaration/"></a>|
  


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.delegate/Delegate/interceptCheck/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[interceptCheck](intercept-check.md)| <a name="io.github.kakaocup.kakao.delegate/Delegate/interceptCheck/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [interceptCheck](intercept-check.md)(assertion: [ASSERTION](index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br>More info  <br>Runs the interceptors available for the given delegate during the check operation.  <br><br><br>|
| <a name="io.github.kakaocup.kakao.delegate/Delegate/interceptPerform/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[interceptPerform](intercept-perform.md)| <a name="io.github.kakaocup.kakao.delegate/Delegate/interceptPerform/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [interceptPerform](intercept-perform.md)(action: [ACTION](index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br>More info  <br>Runs the interceptors available for the given delegate during the perform operation.  <br><br><br>|
| <a name="io.github.kakaocup.kakao.delegate/Delegate/kakaoInterceptor/#/PointingToDeclaration/"></a>[kakaoInterceptor](kakao-interceptor.md)| <a name="io.github.kakaocup.kakao.delegate/Delegate/kakaoInterceptor/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [kakaoInterceptor](kakao-interceptor.md)(): [Interceptor](../../io.github.kakaocup.kakao.intercept/-interceptor/index.md)<[INTERACTION](index.md), [ASSERTION](index.md), [ACTION](index.md)>?  <br><br><br>|
| <a name="io.github.kakaocup.kakao.delegate/Delegate/screenInterceptors/#/PointingToDeclaration/"></a>[screenInterceptors](screen-interceptors.md)| <a name="io.github.kakaocup.kakao.delegate/Delegate/screenInterceptors/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [screenInterceptors](screen-interceptors.md)(): [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)<[Interceptor](../../io.github.kakaocup.kakao.intercept/-interceptor/index.md)<[INTERACTION](index.md), [ASSERTION](index.md), [ACTION](index.md)>>  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.delegate/Delegate/interaction/#/PointingToDeclaration/"></a>[interaction](interaction.md)| <a name="io.github.kakaocup.kakao.delegate/Delegate/interaction/#/PointingToDeclaration/"></a> [androidJvm] abstract var [interaction](interaction.md): [INTERACTION](index.md)   <br>|
| <a name="io.github.kakaocup.kakao.delegate/Delegate/interceptor/#/PointingToDeclaration/"></a>[interceptor](interceptor.md)| <a name="io.github.kakaocup.kakao.delegate/Delegate/interceptor/#/PointingToDeclaration/"></a> [androidJvm] abstract var [interceptor](interceptor.md): [Interceptor](../../io.github.kakaocup.kakao.intercept/-interceptor/index.md)<[INTERACTION](index.md), [ASSERTION](index.md), [ACTION](index.md)>?   <br>|


## Inheritors  
  
|  Name | 
|---|
| <a name="io.github.kakaocup.kakao.delegate/DataInteractionDelegate///PointingToDeclaration/"></a>[DataInteractionDelegate](../-data-interaction-delegate/index.md)|
| <a name="io.github.kakaocup.kakao.delegate/ViewInteractionDelegate///PointingToDeclaration/"></a>[ViewInteractionDelegate](../-view-interaction-delegate/index.md)|
| <a name="io.github.kakaocup.kakao.delegate/WebInteractionDelegate///PointingToDeclaration/"></a>[WebInteractionDelegate](../-web-interaction-delegate/index.md)|

